import org.testng.annotations.Test;


public class NewTest {
	public String baseUrl = "https://www.google.com/";
	public driverPath = "C:\\chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("launching firefox browser"); 
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDrive();
  }
}
