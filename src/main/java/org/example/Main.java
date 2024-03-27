package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Inclusiv Academy\\Documents\\Mahanitia Cdan8\\site\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");

        WebElement barreDeRecharche = driver.findElement(By.name("q"));
        barreDeRecharche.sendKeys("inclusiv academy");
        barreDeRecharche.submit();

        WebElement clickPremier = driver.findElement(By.xpath("//div[@id='search']//a"));
        clickPremier.click();
    }
}