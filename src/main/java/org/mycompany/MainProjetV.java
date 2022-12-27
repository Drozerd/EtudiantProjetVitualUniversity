package org.mycompany;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.mycompany.route.CoursRoute;

public class MainProjetV  {

	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new CoursRoute());
		context.start();
		
		Thread.sleep(2*60*1000);
		context.stop();

	}

}
