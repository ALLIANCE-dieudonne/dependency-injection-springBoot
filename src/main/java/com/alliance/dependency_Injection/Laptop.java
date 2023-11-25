package com.alliance.dependency_Injection;

public class Laptop {
  private String name;
  private String brand;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Laptop{" +
      "name='" + name + '\'' +
      ", brand='" + brand + '\'' +
      '}';
  }
  public void compile(){
    System.out.println("Compiling...");
  }

}
