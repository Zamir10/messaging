package org.example;

import java.time.LocalDate;

public class Person {

  // Change this
  private String name;
  private LocalDate birthday;

  public Person(final String name, final LocalDate birthday) {
    this.name = name;
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(final LocalDate birthday) {
    this.birthday = birthday;
  }

  public int getAge(final LocalDate date) {
    final int year = date.getYear();
    return year - birthday.getYear();
  }
}
