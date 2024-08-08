package org.example.component;

import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Component("calendar")
public class CalendarService {

  public boolean isTodayThursday() {
    return LocalDate.now().getDayOfWeek() == DayOfWeek.THURSDAY;
  }

}
