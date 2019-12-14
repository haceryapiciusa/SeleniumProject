package techo.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");
        Thread.sleep(6000);
        driver.quit();



    }
}
