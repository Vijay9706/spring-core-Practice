package com.vh.spring.core.beans;

import com.vh.spring.core.beans.interfaces.Pen;

public class Writer {
	
private Pen pen;
	
	
	public Writer(final Pen pen) {
		this.pen = pen;
	}


	public void write() {
		pen.write();
		

}}
