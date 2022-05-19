import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.switchToDefaultContent()
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'))
WebUI.delay(5)
//GlobalVariable.orderId="518";
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 5)
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderNo'))
WebUI.setText(findTestObject('Object Repository/Order/Order Inquiry/orderNo'), GlobalVariable.orderId)
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/searchbutton'))
WebUI.delay(3)
String no="(//a/u[contains(text(),'"+GlobalVariable.orderId+"')])"
if(WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : no]), 10, FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : no]))

WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderAction'))
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderAction'))
if(WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderChecklist')))
{
	WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderChecklist'))
	WebUI.delay(2)
	WebUI.switchToWindowIndex(1)
	WebDriver driver = DriverFactory.getWebDriver()
	String xpath2 = "("+"//td/a[@title='Task Pending']/img"+")"
	int count = driver.findElements(By.xpath(xpath2)).size()
	print(count)
	for(int i=count; i>0; i-- )
	{
		String xpath = "("+"//td/a[@title='Task Pending']/img"+")["+i+"]"
		WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
		WebUI.delay(5)
	}
	WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderChecklistSave'))
	WebUI.switchToWindowIndex(0)
}