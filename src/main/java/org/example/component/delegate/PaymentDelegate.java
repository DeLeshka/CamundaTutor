package org.example.component.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("paymentWriteoff")
public class PaymentDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    System.out.println("ОПЛАТА ПРОШЛА");
  }

}
