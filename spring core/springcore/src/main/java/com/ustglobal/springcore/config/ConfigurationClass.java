package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration
@Import(PetConfigurationClass.class)
public class ConfigurationClass {

	@Bean(name = "hello")
	//@Scope("prototype")   //----->used for changing singleton to prototype.
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setMsg("i love python");
		return hello;
	}

	
}
