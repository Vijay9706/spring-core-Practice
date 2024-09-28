package com.vh.spring.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.vh.spring.core.beans.B;

import com.vh.spring.core.beans.A;

@Configuration
public class SpringConfig {
	
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public A a(B b) {
		return new A(b);
    }
	
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

	public B b () {
		return new B();
    }
	
	
	
	
	
	
	
	

}
