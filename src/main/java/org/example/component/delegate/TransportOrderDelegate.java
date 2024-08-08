package org.example.component.delegate;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("transportOrder")
public class TransportOrderDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    if (Math.random() > 0.5) {
      System.out.println("КУРЬЕР ПОТЕРЯЛСЯ MISSION FAILED");
      throw new BpmnError("OrderLost");
    }
    System.out.println("КУРЬЕР СПРАВИЛСЯ С ЯНДЕКС-НАВИГАТОРОМ, УРА, ДОСТАВЛЕНО");
  }

}
