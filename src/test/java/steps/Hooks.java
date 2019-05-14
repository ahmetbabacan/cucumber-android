package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.BaseSteps;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends BaseSteps {

    private BaseSteps base;
    private String APP = "/Users/ahmetbabacan/Desktop/cucumber-example-android/src/test/java/driver/app-debug.apk";
    private String url = "http://127.0.0.1:4723/wd/hub";

    public Hooks(BaseSteps base) {
        this.base = base;
    }

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformVersion", "8.1.0");
        caps.setCapability("browserName", "Android");
        caps.setCapability("browserName", "com.dsmart.blu.android");
        caps.setCapability("appActivity", "com.dsmart.blu.android.InitActivity");
        caps.setCapability("app", APP);

        base.driver = new AndroidDriver(new URL(url), caps);
    }

    @After
    public void after() {

    }
}
