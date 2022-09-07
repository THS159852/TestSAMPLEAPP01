import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class TestSample {
    ChromeDriver chromeDriver;

    @BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public  void Run() throws InterruptedException {
    chromeDriver.get("https://selenium-training.herokuapp.com/");

//        Wait<WebDriver> wait = new FluentWait<WebDriver>(chromeDriver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class)

        //Signup
//        WebElement signUp = chromeDriver.findElement(By.xpath("//html/body/div[1]/div/a"));
//        signUp.click();
//        Thread.sleep(1000);
//
//        WebElement name1 = chromeDriver.findElement(By.xpath("//html/body/div/div/div/form/input[3]"));
//        Actions naMe = new Actions(chromeDriver);
//        naMe.sendKeys(name1, "Sanh").build().perform();
//        Thread.sleep(1000);
//
//        WebElement email = chromeDriver.findElement(By.name("user[email]"));
//        Actions eMail = new Actions(chromeDriver);
//        eMail.sendKeys(email, "tranhoangsanh2@gmail.com").build().perform();
//        Thread.sleep(1000);
//
//        WebElement password = chromeDriver.findElement(By.name("user[password]"));
//        Actions passWord = new Actions(chromeDriver);
//        passWord.sendKeys(password, "123456789").build().perform();
//        Thread.sleep(1000);
//
//        WebElement repassword = chromeDriver.findElement(By.name("user[password_confirmation]"));
//        Actions repassWord = new Actions(chromeDriver);
//        repassWord.sendKeys(repassword,"123456789").build().perform();
//        Thread.sleep(1000);

//        WebElement btnsubmit = chromeDriver.findElement(By.name("commit"));
//        btnsubmit.submit();
//        Thread.sleep(1000);

        //DangNhap
        WebElement login = chromeDriver.findElement(By.xpath("//nav/ul/li[3]/a"));
        login.click();
        Thread.sleep(1000);

        WebElement Email = chromeDriver.findElement(By.name("session[email]"));
        Actions EmaiL = new Actions(chromeDriver);
        EmaiL.sendKeys(Email,"tranhoangsanh2@gmail.com").build().perform();
        Thread.sleep(1000);

        WebElement Password = chromeDriver.findElement(By.name("session[password]"));
        Actions PassWord = new Actions(chromeDriver);
        PassWord.sendKeys(Password,"123456789").build().perform();
        Thread.sleep(1000);

        WebElement rememberMe = chromeDriver.findElement(By.xpath("//html/body/div/div/div/form/label[3]/input[2]"));
        rememberMe.click();
        Thread.sleep(2000);

        WebElement Login = chromeDriver.findElement(By.name("commit"));
        Login.submit();
        Thread.sleep(1000);

        //account
        WebElement account = chromeDriver.findElement(By.xpath("/html/body/header/div/nav/ul/li[4]/a"));
        account.click();
        Thread.sleep(1000);

        //DangXuat
//        WebElement logout = chromeDriver.findElement(By.xpath("//html/body/header/div/nav/ul/li[4]/ul/li[4]/a"));
//        logout.click();
//        Thread.sleep(1000);



//        //Update your profile
//
//        WebElement proFile = chromeDriver.findElement(By.xpath("//html/body/header/div/nav/ul/li[4]/ul/li/a"));
//        proFile.click();

        //Settings
        WebElement setTings = chromeDriver.findElement(By.xpath("//nav/ul/li[4]/ul/li[2]/a"));
        setTings.click();
        Thread.sleep(1000);

        WebElement name2 = chromeDriver.findElement(By.xpath("/html/body/div/div/div/form/input[4]"));
        name2.clear();
        Actions name3 = new Actions(chromeDriver);
        name3.sendKeys(name2,"Tran Hoang Sanh").build().perform();
        Thread.sleep(1000);

        WebElement email2 = chromeDriver.findElement(By.xpath("/html/body/div/div/div/form/input[5]"));
        email2.clear();
        Actions email3 = new Actions(chromeDriver);
        email3.sendKeys(email2,"tranhoangsanh3@gmail.com").build().perform();
        Thread.sleep(1000);

        WebElement birthday2 = chromeDriver.findElement(By.xpath("/html/body/div/div/div/form/input[6]"));
        birthday2.click();
        Actions birthday3 = new Actions(chromeDriver);
        birthday2.clear();
        birthday3.sendKeys(birthday2,"04/05/1999").build().perform();
        Thread.sleep(1000);

        WebElement gender2 = chromeDriver.findElement(By.xpath("/html/body/div/div/div/form/div[1]/input[1]"));
        gender2.click();

        WebElement phone2 = chromeDriver.findElement(By.xpath("/html/body/div/div/div/form/input[7]"));
        Actions phone3 = new Actions(chromeDriver);
        phone3.sendKeys(phone2,"0321321321").build().perform();
        Thread.sleep(1000);

        Select language2 = new Select(chromeDriver.findElement(By.xpath("/html/body/div/div/div/form/select")));
        language2.selectByVisibleText("English");
        Thread.sleep(1000);

        WebElement checkbox2 = chromeDriver.findElement(By.xpath("/html/body/div/div/div/form/div[2]/input"));
        checkbox2.click();
        Thread.sleep(1000);

        WebElement submit2 = chromeDriver.findElement(By.xpath("/html/body/div/div/div/form/input[8]"));
        submit2.click();



//    Thread.sleep(5000);
    }


    @AfterMethod
    public void Cleanup(){
        chromeDriver.quit();
    }

    private void sleep(int time){
        try {
                Thread.sleep(time);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
