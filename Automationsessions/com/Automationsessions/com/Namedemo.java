package Automationsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Namedemo {

	public static void main(String[] args) throws InterruptedException {
				//1.To launch the browser
				WebDriverManager.firefoxdriver().setup();
				
				ChromeDriver odriver=new ChromeDriver();
				 
				//FirefoxDriver odriver=new FirefoxDriver();
				
				//2.Pass the url to open the app
				odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Thread.sleep(5000);
				
				//locate the web webelement
				
				odriver.findElement(By.name("username")).sendKeys("Riyansh@gmail.com");
				
				odriver.findElement(By.name("password")).sendKeys("Nellore");
				
				
				//3.close the app
				
				Thread.sleep(5000);
				
				odriver.close();

	}

}
