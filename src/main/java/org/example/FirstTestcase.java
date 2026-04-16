package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestcase {
    public static void main(String args[]){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.opencart.com/");
        String actualtitle= driver.getTitle();
        if(actualtitle.equals("My store")){
            System.out.println("Test Case Passed");
        }
        else{
            System.out.println("Test Case Failed ");
        }

        driver.quit();
    }
}
