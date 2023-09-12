package org.example;

import java.time.LocalDate;

public class Person {

  // Change this
  public String name;
  public LocalDate birthday;

  public int getAge() {
    return LocalDate.now().getYear() - birthday.getYear();
  }
}
