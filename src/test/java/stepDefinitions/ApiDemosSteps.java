package stepDefinitions;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import pages.ApiDemosMainPage;
import pages.SamanyoluMainPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ApiDemosSteps {
    ApiDemosMainPage apiDemosMainPage;
    SamanyoluMainPage samanyoluMainPage;

    @Given("Kullanici ApiDemos uygulamasini acar")
    public void kullanici_api_demos_uygulamasini_acar() {

        apiDemosMainPage.apiDmosButton.click();
        apiDemosMainPage.graphicsButton.click();

        Dimension dimension = Driver.getAndroidDriver().manage().window().getSize();

        int centerX = (int) (dimension.width * 0.5);
        int startY = (int) (dimension.height * 0.9);
        int endY = (int) (dimension.height * 0.1);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, startY));
        swipe.addAction(finger.createPointerDown(0));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), centerX, endY));
        swipe.addAction(finger.createPointerUp(0));
        Driver.getAndroidDriver().perform(Arrays.asList(swipe));


    }

    @Given("Kullanici ApiDemos uygulamasibi kapatir")
    public void kullanici_api_demos_uygulamasibi_kapatir() {

    }
}
