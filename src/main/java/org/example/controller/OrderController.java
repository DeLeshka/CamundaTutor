package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.camunda.CamundaEngine;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

  private final CamundaEngine camundaEngine;

  @PostMapping("/createOrder")
  public HttpEntity<Void> createOrder(@RequestParam("itemName") String itemName) {
    camundaEngine.startOrderProcess(itemName);
    return ResponseEntity.ok().build();
  }

}
