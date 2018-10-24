package AppiumPackage;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class AppiumTest {
    Activitys atv;
    public void main(String[] args) {

        //Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "My Phone");
        caps.setCapability("udid", "712HFCSD22BVC"); //Give Device ID of your mobile phone
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0");
        caps.setCapability("appPackage", atv.appPackage);
        caps.setCapability("appActivity", atv.appActivity);
        caps.setCapability("noReset", "true");

        //Instantiate Appium Driver
        try {
            AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

}
