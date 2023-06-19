package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ionut Incau <ionut.incau@8x8.com> on 19-Jun-23 at 12:00 PM
 */
@Configuration
public class ClientConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
