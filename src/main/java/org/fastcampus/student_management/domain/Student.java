package org.fastcampus.student_management.domain;

public class Student {

  private final String name;
  private final int age;
  private final String address;
  private boolean activated;

  public Student(String name, int age, String address) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("이름은 필수 입력값입니다.");
    }

    this.name = name;
    this.age = age;
    this.address = address;
    this.activated = true;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }
  public boolean isActivate() {
    return activated;
  }

  public void activate() {
    if (this.activated) {
      throw new IllegalArgumentException("이미 활성화된 학생힙니다.");
    }
    this.activated = true;
  }

  public void deactivate() {
    if (!this.activated) {
      throw new IllegalArgumentException("이미 비활성화된 학생힙니다.");
    }
    this.activated = false;
  }
}
