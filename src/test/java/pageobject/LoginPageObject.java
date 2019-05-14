package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static utils.MobileDriverUtils.sleep;


public class LoginPageObject {

    public AndroidDriver<?> browser;

    public LoginPageObject(AndroidDriver<?> browser) {
        this.browser = browser;
    }

    public void navigateTo(){
        sleep(3000);
        browser.findElement(By.id("com.dsmart.blu.android:id/tv_landing_page_continue")).click();
    }

}
