package login;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.simplesite.com/pages/service-login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("loginBox_username")).sendKeys(" YOUR USER NAME");
        driver.findElement(By.id("loginBox_password")).sendKeys("YOUR PASSWORD");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("loginBox_loginbtn")).click();
        driver.findElement(By.id("loginBox_username")).clear();
        driver.findElement(By.id("loginBox_username")).sendKeys("mihai_druta@mail.ru");
        driver.findElement(By.id("loginBox_password")).sendKeys("068269983m");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("loginBox_loginbtn")).click();
        driver.close();
    }
}