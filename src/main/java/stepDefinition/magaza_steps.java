package stepDefinition;

import PageObjectModel.magaza_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class magaza_steps {
    private WebDriver driver;
    magaza_Page magaza_Page = new magaza_Page();
    @Given("^web sitesine git$")
    public void web_sitesine_git() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Given("^konumu kapat$")
    public void konumu_kapat() throws Throwable {
        magaza_Page.clickKonumTamam();
    }

    @Given("^firsat kampanya kapat$")
    public void firsat_kampanya_kapat() throws Throwable {
        magaza_Page.clickDahaSonra();
    }
    @Given("^magzalar tikla$")
    public void magzalar_tikla() throws Throwable {
        magaza_Page.clickSpanMagzalar();

    }

    @Given("^magzalari gor tikla$")
    public void magzalari_gor_tikla() throws Throwable {
        magaza_Page.clickMagzalariGor();
    }

    @Given("^tum magzalar tikla$")
    public void tum_magzalar_tikla() throws Throwable {
        magaza_Page.clickTumMagzalar();

    }

    @Given("^a harfini sec$")
    public void a_harfini_sec() throws Throwable {
        magaza_Page.clickAharfi();

    }
    @When("^tum a magzalarini al txt yazdir$")
    public void tum_a_magzalarini_al_txt_yazdir() throws Throwable {
        magaza_Page.getAmagzaları();


    }

    @Then("^basarili mesajini yaz$")
    public void basarili_mesajini_yaz() throws Throwable {
        System.out.println("İşlemler Başarılı");

    }
}
