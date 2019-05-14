package utils;

import io.appium.java_client.android.AndroidDriver;

public class BaseSteps {

    public ConfigReader config;
    public AndroidDriver<?> driver;

    public BaseSteps() {
        config = ConfigReader.getInstance();
    }
}
