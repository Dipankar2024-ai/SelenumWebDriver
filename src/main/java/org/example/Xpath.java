package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        Boolean loginpage=driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
        if(loginpage==true){
            System.out.println("Login page is displayed");
        }
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password' and @type='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
        System.out.println("Logged in Successfully");





    }
}
