package ru.makeitmax;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Поехали!!!");
    }
    @After
    public void close() {
        driver.quit();
        System.out.println("Приехали!!!");
    }
}