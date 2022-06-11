package stepDefinition;

import PageObjectModel.urunAra_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class urunAra_Steps {
    private WebDriver driver;
    PageObjectModel.urunAra_Page urunAra_page = new urunAra_Page();
    @Given("^web sitesine gir$")
    public void web_sitesine_gir() throws Throwable {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Given("^kapat konum$")
    public void kapat_konum() throws Throwable {
        urunAra_page.clickKonumTamam();

    }

    @Given("^kapat kampanya$")
    public void kapat_kampanya() throws Throwable {
        urunAra_page.clickDahaSonra();
    }

    @Given("^kulaklik kelimesini ara$")
    public void kulaklik_kelimesini_ara() throws Throwable {
        urunAra_page.sendKeysSearchBox();

    }

    @Given("^yorum sayisina gore sirala$")
    public void yorum_sayisina_gore_sirala() throws Throwable {
        urunAra_page.selectFromAkilliSiralama();

    }

    @Given("^ucretsiz kargo sirala$")
    public void ucretsiz_kargo_sirala() throws Throwable {
        urunAra_page.checkUcretsizargo();

    }

    @Given("^ilk urunu ekle$")
    public void ilk_urunu_ekle() throws Throwable {
        urunAra_page.ilkUrunSepeteEkle();

    }

    @Given("^son urunu ekle$")
    public void son_urunu_ekle() throws Throwable {
        urunAra_page.sonUrunSepeteEkle();

    }

    @Given("^sepete git$")
    public void sepete_git() throws Throwable {
        urunAra_page.sepeteGit();


    }

    @Given("^ucuzu arttir$")
    public void ucuzu_arttir() throws Throwable {
        urunAra_page.enUcuzuArttir();

    }

    @When("^misafir kullanici odeme adimi$")
    public void misafir_kullanici_odeme_adimi() throws Throwable {
        urunAra_page.misafirKullaniciOdeme();

    }

    @Then("^basarili mesajini$")
    public void basarili_mesajini() throws Throwable {
        System.out.println("Islemler Basarili");

    }
}
