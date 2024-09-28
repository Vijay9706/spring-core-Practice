package com.vh.spring.core.beans;

import org.springframework.stereotype.Component;

import com.vh.spring.core.beans.interfaces.Ink;
@Component
public class BlackInk implements Ink {

	public String getBrandName() {
		// TODO Auto-generated method stub
		return "Parker";
	}

	public String GetColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

}
