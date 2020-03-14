import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium code
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println("This is GitX change");
		System.out.println("This is GitX change2");
		System.out.println("This is GitX change3");
		System.out.println("This is GitX change4");
		System.out.println("This is GitX change5");
		System.out.println("This is GitX change6");
		

	}

}
