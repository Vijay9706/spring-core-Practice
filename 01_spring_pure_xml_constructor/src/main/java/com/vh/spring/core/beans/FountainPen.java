package com.vh.spring.core.beans;

import com.vh.spring.core.beans.interfaces.Ink;
import com.vh.spring.core.beans.interfaces.Pen;

public class FountainPen implements Pen {
	
	private Ink ink1;
	
	

	public FountainPen( final Ink ink1) {
		
		this.ink1 = ink1;
	}


	public void write() {
		System.out.println("writing with " + ink1.getBrandName()+ " pen " + " which have " + ink1.GetColor()+ " ink");
		
	}

	
		
	}


