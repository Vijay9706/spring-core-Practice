package com.vh.spring.core.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vh.spring.core.beans.Writer;
public class ConstructorArgRunner {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("setter-tag.xml");
		
		              //   Writer writer   = (Writer) ctx.getBean("writer");
		                 Writer writer  = ctx.getBean(Writer.class);
		                 writer.write();
	}

}
