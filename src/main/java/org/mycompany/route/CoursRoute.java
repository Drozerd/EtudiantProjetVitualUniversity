package org.mycompany.route;

import org.apache.camel.builder.RouteBuilder;
import org.mycompany.process.ProcessInsert;

public class CoursRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from ("file:ListeCours?noop=true")
		.process(new ProcessInsert());
		
	}

}
