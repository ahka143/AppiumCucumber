package stepDefinitions;

import io.cucumber.java.en.*;
import pages.ApiDemosMainPage;


public class ApiDemosSteps {
    ApiDemosMainPage apiDemosMainPage;

    @Given("Kullanici ApiDemos uygulamasini acar")
    public void kullanici_api_demos_uygulamasini_acar() {
        apiDemosMainPage=new ApiDemosMainPage();
        apiDemosMainPage.apiDmosButton.click();

    }
    @Given("Kullanici ApiDemos uygulamasibi kapatir")
    public void kullanici_api_demos_uygulamasibi_kapatir() {

    }
}
