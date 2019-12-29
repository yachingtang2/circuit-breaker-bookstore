package com.tang.circuitbreakerbookstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CircuitBreakerBookstoreController {

  @GetMapping("/recommended")
  public String getListing() {
    return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
  }
}
