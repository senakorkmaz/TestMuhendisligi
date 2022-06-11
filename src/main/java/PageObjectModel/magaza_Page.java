package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class magaza_Page extends AbstractClass{
    WebDriver driver;
    public magaza_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='dn-slide-deny-btn']")
    private WebElement firsatKampanyaDahaSonra;
    @FindBy(xpath = "//div[@class='btn btnBlack btnBlack-loc-info']")
    private WebElement konumTamam;
    @FindBy(xpath = "//span[@title='Mağazalar']")
    private WebElement spanMagzalar;

    @FindBy(xpath = "//a[@title='Mağazaları Gör']")
    private WebElement magzalariGor;

    @FindBy(xpath = "//h3[text() = 'Tüm Mağazalar']")
    private WebElement tumMagzalar;

    @FindBy(xpath = "//span[@title='A']")
    private WebElement aHarfi;

    @FindBy(xpath = "//div[2][@class='sellerListHolder']/ul/li/a")
    private List<WebElement> aMagazaları;

    @FindBy(xpath = "//input[@id='searchData']")
    private WebElement searchBox;

    @FindBy(xpath = "//a[@class='searchBtn']")
    private WebElement searchButton;
    public void clickDahaSonra() { clickFunction(firsatKampanyaDahaSonra);}
    public void clickKonumTamam() { clickFunction(konumTamam);}
    public void clickSpanMagzalar() throws InterruptedException {
        clickFunction(spanMagzalar);
        Thread.sleep(500);
    }
    public void clickMagzalariGor() { clickFunction(magzalariGor);}
    public void clickTumMagzalar() { clickFunction(tumMagzalar);}
    public void clickAharfi() throws InterruptedException {
        clickFunction(aHarfi);}

    //5000 küsür magaza oldugu için sadece ilk 10 tanesini yazdırdım
    public void getAmagzaları() {
        String magazaNames = "";
        for(int i=0;i<10;i++){
            magazaNames = magazaNames +aMagazaları.get(i).getText() + "\r\n";
        }

        try {
            FileWriter writer = new FileWriter("aMagazalari.txt", false);
            writer.write(magazaNames);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void araUrun(String value) throws InterruptedException {
        sendKeysFunction(searchBox,value);
        Thread.sleep(500);
        clickFunction(searchButton);
    }
}
