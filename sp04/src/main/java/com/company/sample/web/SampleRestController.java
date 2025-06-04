package com.company.sample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.sample.service.SampleService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class SampleRestController {
	
	private final SampleService sampleService;

	@GetMapping("/api")
	public String main() {
		sampleService.sample("");
		return "api test";
				
	}
}
