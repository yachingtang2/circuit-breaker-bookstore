package com.tang.circuitbreakerbookstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CircuitBreakerBookstoreApplicationTest {

	private CircuitBreakerBookstoreApplication application;

	@BeforeEach
	void setUp() {
		application = new CircuitBreakerBookstoreApplication();
	}

	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
