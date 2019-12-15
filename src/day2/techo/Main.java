package day2.techo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/haceryapici/Documents/SeleniumProject/src/day2/practice.html");
        WebElement text = driver.findElement(By.name("text"));
        text.sendKeys("my text");
        System.out.println(text);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password");
        System.out.println(password);
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Hello!");
        System.out.println(username);
        WebElement checkbox = driver.findElement(By.name("checkbox"));
        checkbox.click();
        List<WebElement> radio = driver.findElements(By.name("radio"));
        WebElement secondradio = radio.get(1);
        secondradio.click();
        WebElement select = driver.findElement(By.name("Options"));
        Select dropdown = new Select(select);
        dropdown.selectByIndex(3);
//        List<WebElement> option = dropdown.getOptions();
//        for (WebElement options : option ){
//            System.out.println(options.getText());
//            if(options.getText().equals("Options4"))
//                dropdown.deselectByVisibleText("Options4");
//        }
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.quit();

    }
}
