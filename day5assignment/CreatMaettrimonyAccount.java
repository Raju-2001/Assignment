package week3.day5assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatMaettrimonyAccount {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		WebElement regesteredBy = driver.findElement(By.id("REGISTERED_BY"));
		Select regesterByDropDown=new Select(regesteredBy);
		regesterByDropDown.selectByVisibleText("Myself");
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Raju");
		driver.findElement(By.xpath("//input[@id='gendermale']")).click();
		WebElement dobDay = driver.findElement(By.id("DOBDAY"));
		Select dobDayDropDown=new Select(dobDay);
		dobDayDropDown.selectByVisibleText("14");
		WebElement dobmonth = driver.findElement(By.id("DOBMONTH"));
		Select dobmonthDropDown=new Select(dobmonth);
		dobmonthDropDown.selectByVisibleText("Nov");
		WebElement dobYear = driver.findElement(By.id("DOBYEAR"));
		Select dobYearDropDown=new Select(dobYear);
		dobYearDropDown.selectByVisibleText("2001");
		WebElement religion = driver.findElement(By.id("RELIGION"));
		Select religionDropDown=new Select(religion);
		religionDropDown.selectByVisibleText("Hindu");
		WebElement motherTongue = driver.findElement(By.id("MOTHERTONGUE"));
		Select motherTongueDropDown=new Select(motherTongue);
		motherTongueDropDown.selectByVisibleText("Telugu");
		WebElement country = driver.findElement(By.id("COUNTRY"));
		Select countryDropDown=new Select(country);
		countryDropDown.selectByVisibleText("India");
		WebElement mCountryCode = driver.findElement(By.id("M_COUNTRYCODE"));
		Select mCountryCodeDropDown=new Select(mCountryCode);
		mCountryCodeDropDown.selectByVisibleText("+91");
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("7993569455");
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("daggupatiraju2001@gmail.com");
		driver.findElement(By.xpath("(//input[@id='PASSWORD'])[3]")).sendKeys("Raju@2001");
		
		
		
		
		
		
		
		
	}

}
