package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ApiDemosMainPage {

    public ApiDemosMainPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public WebElement apiDmosButton;
}
