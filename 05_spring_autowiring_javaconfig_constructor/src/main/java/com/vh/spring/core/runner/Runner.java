package com.vh.spring.core.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vh.spring.config.SpringConfig;
import com.vh.spring.core.beans.Writer;
public class Runner {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		              //   Writer writer   = (Writer) ctx.getBean("writer");
		                 Writer writer  = ctx.getBean(Writer.class);
		                 writer.write();
	}

}
