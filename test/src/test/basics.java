package test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		 
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='4. Default values']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='An example that uses an edit text dialog']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Default value']")).sendKeys("Dog");
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
