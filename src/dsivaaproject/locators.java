package dsivaaproject;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions
//import org.openqa.selenium.support.ui.WebDriverWait

public class locators {
	
	/*WebDriver driver;
	 driver = WebDriverManager.chromedriver().create();*/

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\siva\\Desktop\\DSiva\\chromedriver_win32\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sivaramakrishna\\Downloads\\chromedriver_win32 (3)\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.findElement(By.className("M6CB1c rr4y5c")).click();
		driver.get("https://admin5.beta-wspbx.com");
		Thread.sleep(8000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"xusername\"]")).sendKeys("adminuser@socrates");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc@12345");
		driver.findElement(By.xpath("//*[@id=\"mainlogin\"]/div/div/input[2]")).click();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"tab3\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"deepsearch_topfrm\"]")).sendKeys("admgrpr");
		driver.findElement(By.xpath("//*[@id=\"UserMainAction\"]/input[31]")).click();
		Thread.sleep(8000);
		//driver.findElement(By.id("minimized_icon_admgrpr@socrates")).click();
		//driver.findElement(By.xpath("//*[@id=\"div_collapse_1_admgrpr@socrates\"]")).click();
	    //driver.findElement((By) ((WebElement) By.xpath("//*[@id=\"userview_admgrpr@socrates_1\"]"))).click();
		//driver.findElement(By.xpath("//*[@id=\"mainlogin\"]/div/div/input[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"mainlogin\"]/div/div/input[2]")).click();
		//*[@id="deepsearch_topfrm"]
		//driver.manage().window().minimize();
		//Thread.sleep(5000);
		//driver.close();
		//driver.findElement(By.className("gLFyf gsfi")).sendKeys("lord shiva images", Keys.ENTER);
		//driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Your-Name", Keys.ENTER);
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().getText();
        //driver.switchTo().alert().sendKeys("Text");
		//driver.findElement(By.className("gLFyf gsfi")).sendKeys("rahul");
		//driver.findElement(By.className("gLFyf gsfi")).click();
		//driver.findElement(By.xpath("//*[@id=\"input\"]")).click(); // Keep this click statement even if you are using click before clear.
		//driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("manish");
		
		driver.close();
	
       
	}

}