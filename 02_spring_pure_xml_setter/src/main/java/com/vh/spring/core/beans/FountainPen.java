package com.vh.spring.core.beans;

import com.vh.spring.core.beans.interfaces.Ink;
import com.vh.spring.core.beans.interfaces.Pen;

public class FountainPen implements Pen {
	
	private Ink ink;
	

	public Ink getInk() {
		return ink;
	}

	public void setInk(Ink ink) {
		this.ink = ink;
	}

	public void write() {
		System.out.println("writing with " + ink.getBrandName()+ " pen " + " which have " + ink.GetColor()+ " ink");
		
	}

	
		
	}


