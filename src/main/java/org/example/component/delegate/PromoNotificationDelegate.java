package org.example.component.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("promoNotification")
public class PromoNotificationDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    System.out.println(LocalDateTime.now() + "  СЕГОДНЯ ЧЕТВЕРГ АКЦИЯ!!!");
  }

}
