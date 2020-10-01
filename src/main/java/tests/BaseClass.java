 package tests;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	
	AppiumDriver<MobileElement> driver ;
	
	
	
	@BeforeTest
	public void setup ()
	{
		
		DesiredCapabilities caps =new DesiredCapabilities();
		//caps.setCapability("platformname","ANDROID");
		//caps.setCapability(CapabilityType.PLATFORM_NAME, "ANROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		caps.setCapability(MobileCapabilityType.UDID ,"");
	//	caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");
		
		driver = new AppiumDriver<MobileElement>(url,caps);
		 
		
	}
	
	@AfterTest
	public void teardown ()
	{
		
	}
	
	
}
