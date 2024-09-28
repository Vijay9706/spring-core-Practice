package com.vh.spring.core.beans;


public class A {
	
private B b;

	
	
	public A(B b) {
		this.b = b;
	}


	public void m2() {
		
	b.m2();
	System.out.println("in A method m2 folder");
	System.out.println("b "+ b);
}
	}
