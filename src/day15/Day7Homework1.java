package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day7Homework1
{
    // repeat Task 3 for all the buttons. Success, warning, danger and info buttons.
    private WebDriver driver;

    @BeforeClass
    public void init(){
        System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
        driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html" );
    }

    @AfterClass
    public void quit() {
        driver.quit();
    }

    @Parameters({"button"})
    @Test
    public void clickButton(String button){
        driver.findElement( By.id( "normal-btn-" + button ) ).click();
        String text = driver.findElement( By.className( "alert-normal-" + button ) ).getText();
        String buttonText = driver.findElement( By.cssSelector( ".alert-normal-" + button +" > button" ) ).getText();
        String textWithoutButton = text.replaceAll( buttonText, "" );
        String textWithoutButtonAndExtraSpace = textWithoutButton.trim();
        Assert.assertEquals( textWithoutButtonAndExtraSpace, "I'm a normal "+button+" message. To close use the appropriate button." );

        driver.findElement( By.cssSelector( ".alert-normal-"+button+" > button" ) ).click();
        WebElement message = driver.findElement( By.className( "alert-normal-"+ button ) );

        Assert.assertFalse( message.isDisplayed() );

    }
}