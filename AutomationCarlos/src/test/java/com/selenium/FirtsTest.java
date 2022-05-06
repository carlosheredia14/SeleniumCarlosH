package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirtsTest {
	
	
  @Test
  public void f() {
	  
	  ChromeOptions chromeOpt = new ChromeOptions();
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver(chromeOpt);
	  
	  driver.get("https://computer-database.gatling.io/computers");
	  
	  driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("ACE");
	  
	  driver.findElement(By.id("searchsubmit")).click();	
	  
	  String ejemplo = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a")).getText();
	  
	 // System.out.println(ejemplo);
	  
	  Assert.assertEquals(ejemplo, "ACE");
	  
	  driver.close();
  }
  
  @Test
  public void ejercicio1() {
	  ChromeOptions chromeOpt = new ChromeOptions();
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver(chromeOpt);
	  
	  driver.get("https://computer-database.gatling.io/computers");
	  
	  driver.findElement(By.id("add")).click();
	  
	  String nombre = "Carlos";
	  
	  driver.findElement(By.id("name")).sendKeys(nombre);
	  driver.findElement(By.id("introduced")).sendKeys("2012-04-05");
	  driver.findElement(By.id("discontinued")).sendKeys("2022-04-05");
	  driver.findElement(By.id("company")).click();
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"company\"]/option[2]")).click();	
	  //aqui
	  driver.findElement(By.id("company")).click();
	  /*
	  
	  driver.findElement(By.xpath("//*[@id=\"main\"]/form/div/input")).click();
	  
	  String mensaje = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]")).getText();
	  
	  Assert.assertEquals(mensaje, "Done ! Computer " +nombre +" has been created");
	  
	  */
	  
	  
	  
  }
  
}
