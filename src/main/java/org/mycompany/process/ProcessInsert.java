package org.mycompany.process;




import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.model.Cours;
import org.mycompany.model.ListeCours;
import org.mycompany.repository.ICoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





//@Service
public class ProcessInsert implements Processor {
	
	@Autowired
	ICoursRepository iCoursRepository;

	@Override
	public void process(Exchange exchange) throws Exception {
		JAXBContext context = JAXBContext.newInstance(ListeCours.class);
		Unmarshaller unmasrheller = context.createUnmarshaller();
		ListeCours listeCours = (ListeCours) unmasrheller.unmarshal(new File("ListeCours/ListeCours.xml"));
		
		for (Cours cours : listeCours.getListeCours()) {
			iCoursRepository.save(cours);
		}
		

	
		
	}

}


//public class CrashTest implements Processor {
//	@Autowired
//	ISupportCoursRepository iscr;
//
//	@Override
//	public void process(Exchange exchange) throws Exception {
//		JAXBContext context = JAXBContext.newInstance(ListeCours.class);
//		Unmarshaller unmarshaller = context.createUnmarshaller();
//		ListeCours listeCours = (ListeCours) unmarshaller.unmarshal(new File("TestTransfoListXML/ListCours.xml"));
//		
//		for (SupportCours s : listeCours.getListeCours()) {
//			iscr.save(s);
//		}
//	}
//
//}


