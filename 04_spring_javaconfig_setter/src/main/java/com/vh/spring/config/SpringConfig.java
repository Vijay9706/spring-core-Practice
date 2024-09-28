package com.vh.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vh.spring.core.beans.BlackInk;
import com.vh.spring.core.beans.FountainPen;
import com.vh.spring.core.beans.Writer;

@Configuration
public class SpringConfig {
	
	
	@Bean
	public Writer writer(FountainPen fountainPen) {
	Writer writer1 = new Writer();
	writer1.setPen(fountainPen);
	return  writer1;
    }
	
	@Bean
	public FountainPen fountainPen (BlackInk blackInk) {
	FountainPen fountainPen = new FountainPen();
	fountainPen.setInk(blackInk);
	return fountainPen;
    }
	
	@Bean
	public BlackInk blackInk () {
	return new BlackInk();
    }
	
	
	
	
	
	
	
	

}
