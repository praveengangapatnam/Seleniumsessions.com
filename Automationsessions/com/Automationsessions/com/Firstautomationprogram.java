package Automationsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstautomationprogram {

	public static void main(String[] args) throws InterruptedException {
		//1.To launch the browser
		WebDriverManager.firefoxdriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		//FirefoxDriver odriver=new FirefoxDriver();
		
		//2.Pass the url to open the app
		odriver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		odriver.close();
		
	}

}
