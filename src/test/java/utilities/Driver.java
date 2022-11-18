package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {


    private Driver() {

    }

    private static AndroidDriver androidDriver;
    private static IOSDriver iosDriver;


    public static AndroidDriver getAndroidDriver() {

        URL serverUrl = null;
        try {
            serverUrl = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if ( androidDriver== null) {

                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Note8");
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
                    capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
                    capabilities.setCapability(MobileCapabilityType.APP, ConfigReader.getProperty("appPath"));
                    assert serverUrl != null;

                    androidDriver = new AndroidDriver(serverUrl,capabilities);

                    androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


            }




        return androidDriver;
    }


    public static void closeAndroidDriver() {

        if (androidDriver != null) {
            androidDriver.close();
            androidDriver = null;
        }
    }


}
