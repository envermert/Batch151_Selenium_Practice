package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {

    public static void main(String[] args) {
     //System.setProperty("webdriver.chrome.driver","src/main/java/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");


        // ilk kutucuga 20 giriniz
        WebElement ilkKutucuk =driver.findElement(By.xpath("//input[@id='number1']"));
        ilkKutucuk.sendKeys("20");


        // ikinci kutucuga 30 giriniz
        WebElement ikinciKutucuk = driver.findElement(By.xpath("//input[@id='number2']"));
        ikinciKutucuk.sendKeys("30");




        // calculate'e tıklayınız
        driver.findElement(By.xpath("//input[@id='calculate']")).click();





        // sonucu yazdırınız
        WebElement sonuc = driver.findElement(By.xpath("//span[@id='answer']"));

        System.out.println("Toplama Isleminin Sonucu: " + sonuc.getText());


        // sayfayi kapatiniz
        driver.close();



        // "https://www.amazon.com/" adresine gidiniz.
        // "https://www.n11.com/" adresine gidiniz.
        // amazon adresine geri donunuz
        // n11 adresine ilerleyiniz
        // sayfayi yenileyiniz
        // pencereyi kapat
        // Konsola "HER ŞEY YOLUNDA" yazdir

        // "https://teknosa.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        // "https://medunna.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        // teknosa adresine geri donunuz
        // Sayfayı yenileyiniz
        // medunna adresine ilerleyiniz
        // Sayfayı yenileyiniz
        // pencereyi kapat

    }
}
