package com.vh.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vh.spring.core.beans.interfaces.Ink;
import com.vh.spring.core.beans.interfaces.Pen;

@Component
public class FountainPen implements Pen {
	
	private Ink ink;
	
	
	@Autowired
	public FountainPen( final Ink ink) {
		
		this.ink = ink;
	}


	public void write() {
		System.out.println("writing with " + ink.getBrandName()+ " pen " + " which have " + ink.GetColor()+ " ink");
		
	}

	
		
	}


