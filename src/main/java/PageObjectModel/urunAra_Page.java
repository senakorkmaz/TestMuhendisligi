package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class urunAra_Page extends AbstractClass{
    WebDriver driver;
    public urunAra_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@class='dn-slide-deny-btn']")
    private WebElement firsatKampanyaDahaSonra;
    @FindBy(xpath = "//div[@class='btn btnBlack btnBlack-loc-info']")
    private WebElement konumTamam;
    @FindBy(xpath = "//input[@id='searchData']")
    private WebElement searchBox;
    @FindBy(xpath = "//a[@class='searchBtn']")
    private WebElement searchBtn;
    @FindBy(xpath = "//select[@id='sortingType']")
    private WebElement slc;
    @FindBy(xpath = "//input[@id='freeShippingOption']")
    private WebElement ucretsizKargoCheckBox;
    @FindBy(xpath = "//li[@class='column ']/div/div/a")
    private List<WebElement> ilkSayfaKulakliklar;
    @FindBy(xpath = "//button[@title='Sepete Ekle']")
    private WebElement sepeteEkle;
    @FindBy(xpath = "//span[@class='btn btnBlack']")
    private WebElement aydinlatmaMetniTamam;
    @FindBy(xpath = "//a[@class='myBasket ']")
    private WebElement sepet;

    @FindBy(xpath = "//div[@class='prodPrice__text']/input")
    private List<WebElement> fiyatlar;

    @FindBy(xpath = "//span[@class='spinnerUp spinnerArrow']")
    private List<WebElement> plusButtons;
    @FindBy(xpath = "//span[@id='js-buyBtn']")
    private WebElement satinAlButonu;
    @FindBy(xpath = "//a[@class='btn-continue']")
    private WebElement uyeOlmadanDevemEt;
    public void clickDahaSonra() { clickFunction(firsatKampanyaDahaSonra);}
    public void clickKonumTamam() { clickFunction(konumTamam);}

    public void sendKeysSearchBox() throws InterruptedException {
        sendKeysFunction(searchBox,"Kulaklık");
        Thread.sleep(500);
        clickFunction(searchBtn);
    }
    public void selectFromAkilliSiralama(){
        selectElementFromDropdown(slc,"Yorum sayısı");

    }
    public void checkUcretsizargo(){
        clickFunction(ucretsizKargoCheckBox);
    }

    public void ilkUrunSepeteEkle() throws InterruptedException {
        clickFunction(ilkSayfaKulakliklar.get(0));
        clickFunction(sepeteEkle);
        Thread.sleep(500);
        driver.navigate().back();
    }
    public void sonUrunSepeteEkle() throws InterruptedException {
        clickFunction(ilkSayfaKulakliklar.get(ilkSayfaKulakliklar.size()-1));
        clickFunction(sepeteEkle);
        Thread.sleep(500);
        driver.navigate().back();
    }
    public void sepeteGit(){

        clickFunction(sepet);
        clickFunction(aydinlatmaMetniTamam);
    }
    public void enUcuzuArttir(){
        float ilk=Float.parseFloat(fiyatlar.get(0).getAttribute("value").replace(',','.'));
        float son=Float.parseFloat(fiyatlar.get(1).getAttribute("value").replace(',','.'));
        if(ilk>son){
            clickFunction(plusButtons.get(1));
        }
        if (son>ilk){
            clickFunction(plusButtons.get(0));
        }

    }
    public void misafirKullaniciOdeme(){
        clickFunction(satinAlButonu);
        clickFunction(uyeOlmadanDevemEt);

    }

}
