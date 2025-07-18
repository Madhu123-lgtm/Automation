package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		//launch the website
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//id
		driver.findElement(By.id("user-name")).sendKeys("madhu");
		//id
		driver.findElement(By.id("password")).sendKeys("456734");
		//id
		driver.findElement(By.id("login-button")).click();
		

	}

}
