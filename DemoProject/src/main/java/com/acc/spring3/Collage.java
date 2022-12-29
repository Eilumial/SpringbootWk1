package com.acc.spring3;

import org.springframework.stereotype.Component;

@Component
public class Collage {
	private Principal principal;
	
	public Collage(Principal principal) {
		this.principal = principal;
	}
	
	public void welcome() {
		System.out.println("Hello this is the collage");
		principal.info();
	}
}
