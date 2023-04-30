package chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		driver.navigate().refresh();
		
		WebElement startButton1 = driver.findElement(By.xpath("//button[text()='Start']"));
		
		startButton1.click();
		
		//Explicit Wait Example
		WebElement HelloWorldText1 = driver.findElement(By.xpath("(//h4)[2]"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(HelloWorldText1));
		
		System.out.println(HelloWorldText.getText());
	}

}
