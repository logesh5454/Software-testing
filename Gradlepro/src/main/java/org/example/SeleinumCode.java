package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.CacheRequest;

public class SeleinumCode {

    String chrome = "chrome";
    String firefox = "firefox";

    public void WebDriverDevice(String WebDriver){



        if (WebDriver == chrome){

            WebDriver driverChrome= new ChromeDriver();

            driverChrome.get("https://www.geeksforgeeks.org/");
            driverChrome.manage().window().maximize();
            driverChrome.switchTo().newWindow(WindowType.TAB);

            driverChrome.quit();

        }


        else if (WebDriver == firefox)
        {


            WebDriver driverFireFox= new FirefoxDriver();

            driverFireFox.get("https://www.apple.com/in/ipad/");
            driverFireFox.manage().window().maximize();
            WebElement ipadProButton = driverFireFox.findElement(By.xpath("//*[@id=\"chapternav\"]/div/ul/li[1]"));


            driverFireFox.navigate().back();



           /* driverFireFox.quit();*/

        }

        else
        {
            System.out.print(" the provided web driver is not valid");
        }


    }
}

