package com.proj.LT;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "testBean", eager = true)
public class TestManagedBean {
   public TestManagedBean() {
      System.out.println("TestBean!");
   }
	
   public String getMessage() {
      return "Test Bean...";
   }
}