package week3.day5assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatfacebookAccount {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:/www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raju");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Daggupati");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7993569455");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Raju@2001");
		WebElement day= driver.findElement(By.id("day"));
		Select dayDropDown=new Select(day);
		dayDropDown.selectByVisibleText("14");
		WebElement month = driver.findElement(By.id("month"));
		Select monthDropDown=new Select(month);
		monthDropDown.selectByVisibleText("Nov");
		WebElement year = driver.findElement(By.id("year"));
		Select yearDropDown=new Select(year);
		yearDropDown.selectByVisibleText("2001");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//close the browser
		driver.close();
		
	}

}
