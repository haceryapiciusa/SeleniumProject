package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NotTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "file:///Users/haceryapici/Documents/SeleniumProject/src/day5/resources/nth-child.html" );
        List<WebElement> elements = driver.findElements( By.cssSelector( "input:not(.required)" ) );
        for(WebElement element : elements) {
            System.out.println(element.getAttribute( "name" ));
        }

        //driver.quit();
    }
}