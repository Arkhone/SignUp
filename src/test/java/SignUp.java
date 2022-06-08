import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.makeitmax.WebDriverSettings;
import java.time.Duration;
import java.util.Random;

public class SignUp extends WebDriverSettings {
    @Test
    public void signUp() {
        driver.get("https://stage.makeitmax.ru/");
        driver.findElement(By.id("start")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("max-register-wrapper")));
        driver.findElement(By.className("mat-checkbox-inner-container")).click();
        driver.findElement(By.id("mat-select-value-3")).click();
        driver.findElement(By.className("mat-option-text")).click();
        Random random = new Random();
        int n = random.nextInt(100)+1;
        String email = ("test" + n +"@test.ru");
        System.out.println(email);
        driver.findElement(By.cssSelector("input[placeholder=\"Ваш e-mail\"]")).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder=\"Пароль\"]")));
        driver.findElement(By.cssSelector("input[placeholder=\"Пароль\"]")).sendKeys("123Test123");
        driver.findElement(By.cssSelector("input[placeholder=\"Повторите пароль\"]")).sendKeys("123Test123");
        driver.findElement(By.id("registerBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("registrationSuccess")));
    }
}
