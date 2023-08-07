package module1_Registration;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MahaDbtRegistrationPage 
{
	@FindBy(xpath="//input[@id='ApplicantName']") private WebElement ApplicantName;   
	@FindBy(xpath="//input[@id='UserName']") private WebElement UName;  
	@FindBy(xpath="//input[@id='Password']") private WebElement Pwd;
	@FindBy(xpath="//input[@id='ConfirmPassword']") private WebElement CnfPwd;
	@FindBy(xpath="//input[@id='Email']") private WebElement EmailId;
	@FindBy(xpath="//button[@id='btnGetOTP_Email']") private WebElement EmailVerfyBtn;
	@FindBy(xpath="//input[@id='MobileNo']") private WebElement MobNumb;
	@FindBy(xpath="//button[@id='btnGetOTP_Mobile']") private WebElement MobVerfBtn;
	@FindBy(xpath="//span[@id='CustomCaptchaText']") private WebElement Img;
	@FindBy(xpath="//input[@id='clientCaptcha']") private WebElement CaptchaTxtBox;
	@FindBy(xpath="//input[@id='btnRefresh']") private WebElement RefreshBtn;
	@FindBy(xpath="//button[@id='Save']") private WebElement RegBtn;
	@FindBy(xpath="//button[@id='btnClear']") private WebElement ResetBtn;
	
	//step2: initialization
		public MahaDbtRegistrationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
		//step3: usage
		public void inpMahaDbtRegPageAppicantName(String AppName) 
		{
			ApplicantName.sendKeys(AppName);
		}
		
		public void inpMahaDbtRegPageUName(String username) 
		{
			UName.sendKeys(username);
		}
		
		public void inpMahaDbtRegPagePwd(String password) 
		{
			Pwd.sendKeys(password);
		}
		
		public void inpMahaDbtRegPageCnfPwd(String cnfpass) 
		{
			CnfPwd.sendKeys(cnfpass);
		}
		
		public void inpMahaDbtRegPageEmailId(String email) 
		{
			CnfPwd.sendKeys(email);
		}
		
		public void inpMahaDbtRegPageMobNumb(String mobile) 
		{
			CnfPwd.sendKeys(mobile);
		}
			
		
		}


