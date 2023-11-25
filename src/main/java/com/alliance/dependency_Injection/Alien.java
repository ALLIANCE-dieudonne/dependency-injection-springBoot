package com.alliance.dependency_Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")  by sing this spring boot will not create Alien.class object for you
public class Alien {
  @Autowired //searches in spring container by type o
  @Qualifier("lap1") // searches by name
  private Laptop laptop;

  public Laptop getLaptop() {
    return laptop;
  }

  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
  }

  public Alien(){
    System.out.println("object created...");
  }
  private int aid;
  private String name;

  public int getAid() {
    return aid;
  }

  public void setAid(int aid) {
    this.aid = aid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTech() {
    return tech;
  }

  public void setTech(String tech) {
    this.tech = tech;
  }

  private String tech;
  public void show(){
    laptop.compile();
  }
}
