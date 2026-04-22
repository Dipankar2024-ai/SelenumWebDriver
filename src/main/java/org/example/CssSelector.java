package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().fullscreen();
        //tag[attribute='value']
        driver.findElement(By.cssSelector("a[class='btn btn-black navbar-btn']")).click();
        //tag.classname[attribute="value"]
        driver.findElement(By.cssSelector("input.form-control[name=newsletter]")).sendKeys("dip@123gmail.com");
        //tag.classname
        driver.findElement(By.cssSelector("button.btn")).click();
        Thread.sleep(2000);
        //tag#id
        driver.findElement(By.cssSelector("input#mc-embedded-subscribe")).click();
        // driver.quit();
    }
}
