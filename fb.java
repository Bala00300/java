//Import the required packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

    public static void main(String[] args) {
        //Set the system property for the Chrome driver
        System.setProperty("webdriver.chrome.driver", "Path of the chrome driver");

        //Create a WebDriver instance for Chrome
        WebDriver driver = new ChromeDriver();

        //Navigate to the Facebook login page
        driver.get("https://www.facebook.com/");

        //Locate the web elements for email, password, and login button
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.name("login"));

        //Perform actions on the web elements
        email.sendKeys("your_email");
        password.sendKeys("your_password");
        login.click();

        //Verify and validate the login action
        //You can use assertions or other methods here
    }
}
