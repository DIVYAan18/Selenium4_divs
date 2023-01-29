import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:/Users/ajiru/Desktop/drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.saucedemo.com/");
	     driver.navigate().to("https://www.saucedemo.com/");
	     driver.manage().window().maximize();
	}

}
