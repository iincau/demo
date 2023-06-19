package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ionut Incau <ionut.incau@8x8.com> on 19-Jun-23 at 11:49 AM
 */
@RestController
@RequestMapping("/api")
public class TestDeserialization {

	private static final String URL = "https://storage-oci-int.acceptance.cloud.8x8.com/api/v3/objects/b9568510-abfa-434b-a4cb-7e1fcbe54058/metadata?customerId=qm_pilot_customer_id_1";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public Metadata run() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("AUTHORIZATION", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMDkxNTY2OTA3MTgzMjI5NDA1ODY5NDU0MTQyMDMwIiwiY3N0IjoiYWRtaW4iLCJsaWQiOiJRQVJVSSIsImlzcyI6InNzby44eDhwaWxvdC5jb20iLCJ0eXAiOiJhY2Nlc3MiLCJhdWQiOiJyZWNvcmRpbmdfc3RvcmFnZSIsInNjZCI6ImFueSIsInNjb3BlIjpbImlkX3Rva2VuIiwiYW55Iiwic3NvIl0sImV4cCI6MTY4NzE2NzU5NiwiaWF0IjoxNjg3MTY1Nzk2LCJqdGkiOiI3YTFjZDg0Mi01MWRiLTQ4M2ItYTdjOC0zNmM2M2JmZWZiN2YiLCJicm8iOmZhbHNlLCJjaWQiOiIxMDk1MDI2ODM5ODE4MjAzMjk2MDE5ODU0MTQyMDM0IiwicGZ0IjoiQ1JNIn0.YnD4GroldRv7HdYLb6qBOWqn-qYbuXHEh2-UMjLPhT4q5k9jRu5TzMXYpqzHXmSRCo1rjwBAQAS_wODuNBDeCQkkTGvv76NmKmlpK6xgQSyZyOwNf6q_TkOg0QEQdeqgulJ_yiyiwmYM78GRry6uPSSarvf0sqe6Oyo3lUu5YPPYwcKNmhDZgkOG-XPuKqv1GGdUqzwVkTMRfLgnZhZjVu8-q9voNbKKz27JWw0Bvgt1F3kvZMrVTk-xKB4PyDh5B5DyHuay0x843GUamJyIFH27ce7lB5fkxIwjuQZ8DJk3pTGX03fJCzfLyFo3ei10VIDSt90YViaPSpNldSQo5Q");
		HttpEntity requestEntity = new HttpEntity<>(headers);

		return restTemplate.exchange(URL, HttpMethod.GET, requestEntity, Metadata.class)
				.getBody();
	}
}
