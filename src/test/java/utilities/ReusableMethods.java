package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ReusableMethods {

    // javascript executer methodlari
    public static void scroolOfBottomOfPage() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getAndroidDriver();
        jse.executeScript("window.scrollBy(0,250)");
    }
    public static void scrooltoWebelement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getAndroidDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public static void scroolDowntoPixel(int pixel) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getAndroidDriver();
        jse.executeScript("scroll(0, " + pixel + ");");
    }
    public static void jsClick(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getAndroidDriver();
        jse.executeScript("arguments[0].click();", element);
    }
}
