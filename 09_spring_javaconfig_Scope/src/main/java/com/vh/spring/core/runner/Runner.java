package com.vh.spring.core.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vh.spring.config.SpringConfig;
import com.vh.spring.core.beans.A;
import com.vh.spring.core.beans.B;
public class Runner {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		                 A a  = ctx.getBean(A.class);
		                 a.m2();
		                 System.out.println("A "+a);
		                 
		                 
		                 A a1  = ctx.getBean(A.class);
		                 System.out.println("A1 "+a1);
		                 
		                 A a2  = ctx.getBean(A.class);
		                 a2.m2();
		              
		                 
		                 B b1 = ctx.getBean(B.class);
		                 System.out.println("B1 "+b1);

		                 
		                 


		                 
		                 
	}

}
