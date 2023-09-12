package org.example;

import java.time.LocalDate;
import java.util.Calendar;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    person.name = "Zamir";
    person.birthday = LocalDate.of(1992, Calendar.OCTOBER, 15);

    System.out.printf("%s is %s years old", person.name, person.getAge());
  }
}