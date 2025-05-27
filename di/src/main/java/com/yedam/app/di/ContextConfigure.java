package com.yedam.app.di;

import org.springframework.context.annotation.Bean;

public class ContextConfigure {
	
	@Bean
	public TV tv() {
		return new SamsungTV();
	}
}
