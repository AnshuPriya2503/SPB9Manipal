package AnshuDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FirstTest {
	private WebDriver driver;
	
  @Test
  public void FirstTestCase() {
	  String hometitle=driver.getTitle();
	  System.out.println("title of the page "+ hometitle);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\AP\\Selenium manipal\\Project\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.google.com");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
