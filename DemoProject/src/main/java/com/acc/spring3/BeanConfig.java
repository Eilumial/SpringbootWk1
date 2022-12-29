package com.acc.spring3;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@ComponentScan(basePackages = "com.acc.spring3")
@Configuration
public class BeanConfig {
	@Bean()
	public Address addressBean() {
		Address address = new Address();
		return address;
	}

	@Bean("principal")
	public Principal principalBeanDefinition() {
		Principal principal = new Principal();
		return principal;
	}
	
	@Bean("collageAlias")
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public Collage collageBeanDefinition() {
		return new Collage(principalBeanDefinition());
	}

}
