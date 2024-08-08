package org.example.component.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("customerNotification")
public class CustomerNotificationDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    boolean orderSuccess = (boolean) delegateExecution.getVariable("orderSuccess");
    System.out.println(LocalDateTime.now() + "  ЧУВАК, ТВОЙ ЗАКАЗ %S".formatted(
        orderSuccess ? "ДОСТАВЛЕН, ПРОВЕРЯЙ <3" : "ПОТЕРЯЛСЯ, СОРЯН ;("
    ));
  }

}
