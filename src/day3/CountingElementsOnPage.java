package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingElementsOnPage {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "file:///Users/haceryapici/Documents/SeleniumProject/src/day3/form.html" );

        List<String> tagsForTesting = new ArrayList<>( Arrays.asList( "h1", "h2", "h3", "p", "input", "option", "br", "select" ) );
        for(String tag : tagsForTesting) {
            printNumberOfElementsOnAPage( driver, tag );
        }
       // List<String> list = new ArrayList<>();


        driver.quit();
    }

    static void printNumberOfElementsOnAPage(WebDriver driver, String tagName) {
        List<WebElement> elements = driver.findElements( By.tagName( tagName ) );
        System.out.println( "There is(are) " + elements.size() + " " + tagName + " tag(s) on page!" );
    }
}

