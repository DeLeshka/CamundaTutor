package org.example.camunda;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class CamundaEngine {

  private final RuntimeService runtimeService;

  public void startOrderProcess(String itemName) {
    runtimeService.createProcessInstanceByKey("ComplexProcess")
        .businessKey(UUID.randomUUID().toString())
        .setVariable("itemName", itemName)
        .execute();
  }

}
