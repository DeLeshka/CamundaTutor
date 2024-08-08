package org.example.component.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("returnMoney")
public class ReturnMoneyDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    System.out.println("ВЕРНУЛИ СОТКУ");
  }

}
