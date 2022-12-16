package week3.day5assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegesterUIBankAccount {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/");
		driver.findElement(By.xpath("//small[text()='Register For Account']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Raju");
		WebElement title = driver.findElement(By.id("title"));
		Select titleDropDown=new Select(title);
		titleDropDown.selectByVisibleText("Mr");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Daggupati");
		WebElement sex = driver.findElement(By.id("sex"));
		Select sexDropDown=new Select(sex);
		sexDropDown.selectByVisibleText("Male");
		WebElement employmentStatus = driver.findElement(By.id("employmentStatus"));
		Select employmentStatusDropDown=new Select(employmentStatus);
		employmentStatusDropDown.selectByVisibleText("Unemployed");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("11/14/2001");
		WebElement maritalStatus = driver.findElement(By.id("maritalStatus"));
		Select maritalStatusDropDown=new Select(maritalStatus);
		maritalStatusDropDown.selectByVisibleText("Single");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Daggupati");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("daggupatiraju2001@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Raju@2001");
		
		
		//driver.close();
	}

}
