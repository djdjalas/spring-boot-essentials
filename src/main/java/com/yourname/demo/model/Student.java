package com.yourname.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class Student {

  private UUID id;
  private Integer age;
  private String firstName;
  private String lastName;
  private String course;

  public Student(){
  }

  public Student(
      UUID id,
      Integer age,
      String firstName,
      String lastName,
      String course) {
    this.id = id;
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
    this.course = course;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Integer getAge() {
    return age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCourse() {
    return course;
  }

}
