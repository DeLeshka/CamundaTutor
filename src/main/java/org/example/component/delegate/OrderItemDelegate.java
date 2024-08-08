package org.example.component.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("orderItem")
public class OrderItemDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    String itemForRefill = (String) delegateExecution.getVariable("itemForRefill");
    System.out.println("ЗАЗЫВАЕМ ДОП %S НА СКЛАД".formatted(itemForRefill));
    delegateExecution.setVariable("orderedRefilling", true);
  }

}
