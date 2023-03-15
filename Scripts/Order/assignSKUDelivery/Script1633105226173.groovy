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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.switchToDefaultContent()
WebUI.refresh()
WebUI.delay(2)
WebUI.closeWindowIndex(1, FailureHandling.OPTIONAL)
WebUI.switchToWindowIndex(0, FailureHandling.OPTIONAL)
WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)

/**************Navigate to Order Inquiry Page******************/
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/activities'))
WebUI.click(findTestObject('Object Repository/dashboard/activities'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'))
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 5)

/**************************Order Search*********************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderNo'))
WebUI.setText(findTestObject('Object Repository/Order/Order Inquiry/orderNo'), GlobalVariable.orderId)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/searchbutton'))
WebUI.delay(3)
String no="(//a/u[contains(text(),'"+GlobalVariable.orderId+"')])"
if(WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : no]), 10, FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : no]))
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderAction'))
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderAction'))

/*********************Edit Order*****************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/editOrder'))
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/editOrder'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/OrderItems/saveandDelivery'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Order/New Order/OrderItems/saveandDelivery'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/New Order/OrderItems/forceSave'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Order/New Order/OrderItems/forceSave'), FailureHandling.OPTIONAL)
WebUI.delay(3)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

try {
	WebDriver driver = DriverFactory.getWebDriver()
	'Getting the text from the alert and storing it in Variable'
	String AlertText = driver.switchTo().alert().getText()
}
catch(Exception e)
{
	WebUI.delay(1)
}

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/Delivery/goToDelivery'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Order/New Order/Delivery/goToDelivery'), FailureHandling.OPTIONAL)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 5, FailureHandling.OPTIONAL)
/***************************Assign SKU********************/
if(WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/tdSKU'), FailureHandling.OPTIONAL))
{
	print("SKU already Assign")
}
else
{
	WebUI.verifyElementClickable(findTestObject('Object Repository/Order/Order Inquiry/assignSKUmagnifier'))
	WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/assignSKUmagnifier'))
	WebUI.delay(5)
	//WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/assignSKUmagnifier'), FailureHandling.OPTIONAL)
	WebUI.switchToWindowIndex(1)
	WebUI.switchToFrame(findTestObject('Object Repository/iframe/pick'), 5, FailureHandling.OPTIONAL)
	WebUI.switchToFrame(findTestObject('Object Repository/iframe/skulist'), 5, FailureHandling.OPTIONAL)
	WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/skuSelection'))
	WebUI.delay(5)
	WebUI.switchToWindowIndex(0)
	WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 5)
	WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/tdSKU'))
}

//WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/saveandConfirm'))	
//WebUI.delay(5)
//WebUI.closeWindowTitle("Delivery Ticket", FailureHandling.OPTIONAL)
//WebUI.closeWindowIndex(1, FailureHandling.OPTIONAL)
//WebUI.closeWindowIndex(2, FailureHandling.OPTIONAL)
//WebUI.switchToWindowIndex(0)
//WebUI.switchToDefaultContent()
//WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'))
//WebUI.delay(5)

//WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 5)

/*************Verify Order Shipped or Not*********************/
//WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderNo'))
//WebUI.setText(findTestObject('Object Repository/Order/Order Inquiry/orderNo'), GlobalVariable.orderId)
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/searchbutton'))

//String xpath = "(//td/a/u[text()='"+GlobalVariable.orderId+"']/following::td[contains(text(),'Shipped')])[1]"
//WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))

	