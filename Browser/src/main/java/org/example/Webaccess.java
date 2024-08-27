package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.desktop.QuitEvent;

public class Webaccess {
    String ChromeDriver = "ChromeDriver";
    String EdgeDriver = "EdgeDriver";

    public void Max(String WebDriver){

        if(WebDriver == ChromeDriver){
            WebDriver driverC = new ChromeDriver();
            driverC.manage().window().maximize();
            driverC.switchTo().newWindow(WindowType.TAB);
            driverC.get("https://www.royalenfield.com/in/en/motorcycles/bullet-350/");
            driverC. quit();

        }else if(WebDriver == EdgeDriver){
            WebDriver driverE = new EdgeDriver();
            driverE.manage().window().maximize();
            driverE.get("https://www.apple.com/in/ipad/?afid=p238%7CsBwJwsxZZ-dc_mtid_187079nc38483_pcrid_710708144344_pgrid_116639460627_pntwk_g_pchan__pexid__ptid_kwd-76826760_&cid=aos-IN-kwgo-ipad--slid---product-");
            driverE.findElement(By.xpath("//chapternav-items/chapternav-item chapternav-item-ipad-pro")).click();
        }
    }
}
