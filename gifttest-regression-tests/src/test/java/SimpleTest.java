import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Browser;

import java.util.concurrent.TimeUnit;

public class SimpleTest {
        public SimpleTest() {
        }

        @Test
        public void sometest() {
            WebDriver driver = Browser.launch();
            driver.get("https://o2.staging.15gifts.com");
            clickNextButton(driver, By.className("_15gifts-tab-text-wrapper"));
            clickNextButton(driver, By.id("just_need_a_sim_plan_label"));
            clickNextButton(driver, By.cssSelector(".rmq-da762c09._15gifts-button--EngineBottomNavNext"));
            clickNextButton(driver, By.id("social_media_label"));
            clickNextButton(driver, By.cssSelector(".rmq-da762c09._15gifts-button--EngineBottomNavNext"));
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement slider = driver.findElement(By.className("_15gifts-t-slider-handle"));
            slider.sendKeys(Keys.ARROW_RIGHT);
            clickNextButton(driver, By.cssSelector(".rmq-da762c09._15gifts-button--EngineBottomNavNext"));
            clickNextButton(driver, By.id("12_months_label"));
            clickNextButton(driver, By.cssSelector(".rmq-da762c09._15gifts-button--EngineBottomNavNext"));
            clickNextButton(driver, By.id("known_data_3000_label"));
            clickNextButton(driver, By.cssSelector(".rmq-da762c09._15gifts-button--EngineBottomNavNext"));
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

//            driver.quit();
        }

    private void clickNextButton(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(by).click();
    }
}


