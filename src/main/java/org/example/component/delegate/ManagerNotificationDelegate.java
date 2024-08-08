package org.example.component.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("managerNotification")
public class ManagerNotificationDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    String itemForRefill = (String) delegateExecution.getVariable("itemForRefill");
    System.out.println(LocalDateTime.now() + "  ШЕФ, ЗАКАЗАЛИ ДОП %S НА СКЛАД".formatted(itemForRefill));
  }

}
