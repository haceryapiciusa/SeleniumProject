package day3.tasks;
// https://www.seleniumeasy.com/test/basic-first-form-demo.html
// Fill in Single Input Field with text, press the button and check result

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SimpleFormTask1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement usermessage = driver.findElement(By.id("user-message"));
        String message = "Hello";
        usermessage.sendKeys(message);
        List<WebElement> button = new ArrayList<>();
        for (WebElement buttons : button) {
           // System.out.println(buttons.getText());
            if(buttons.getText().equals("Show Message")) {
                buttons.click();
            }
        }
        Thread.sleep(3000);

        WebElement checkmassage = driver.findElement(By.id("display"));
        String text = checkmassage.getText();
        Thread.sleep(3000);
        if(text.equals(message)){
            System.out.println("Success!");
        } else {
            System.out.println("Fail!");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}