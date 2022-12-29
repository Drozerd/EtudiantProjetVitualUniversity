package org.mycompany.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name="ListeCours")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListeCours {
	
	
	@XmlElement(name="Cours")
	private List<Cours> listeCours;

	public ListeCours() {
		super();
	}

	public ListeCours(List<Cours> listeCours) {
		super();
		this.listeCours = listeCours;
	}

	public List<Cours> getListeCours() {
		return listeCours;
	}

	public void setListeCours(List<Cours> listeCours) {
		this.listeCours = listeCours;
	}

	@Override
	public String toString() {
		return "ListeCours [listeCours=" + listeCours + "]";
	}

	
	

	
	
}