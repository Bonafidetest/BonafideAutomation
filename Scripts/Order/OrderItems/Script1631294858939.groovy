import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

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

WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/OrderItems/orderedItems'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Order/New Order/OrderItems/orderedItems'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Order/New Order/OrderItems/orderedItems'), FailureHandling.OPTIONAL)
WebUI.delay(5)
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/New Order/OrderItems/SKU'))
WebUI.setText(findTestObject('Object Repository/Order/New Order/OrderItems/SKU'), SKU)
WebUI.sendKeys(findTestObject('Object Repository/Order/New Order/OrderItems/SKU'), Keys.chord(Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/OrderItems/searchItem'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Order/New Order/OrderItems/searchItem'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/OrderItems/editQuantity'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Order/New Order/OrderItems/editQuantity'), FailureHandling.OPTIONAL)
WebUI.scrollToElement(findTestObject('Object Repository/Order/New Order/OrderItems/submit'), 5, FailureHandling.OPTIONAL)
WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/OrderItems/submit'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Order/New Order/OrderItems/submit'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Order/New Order/OrderItems/saveandDelivery'))
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
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'))
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'))
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 5)
WebUI.delay(5)
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/newlyCreatedOrderNo'))
GlobalVariable.orderId = WebUI.getText(findTestObject('Object Repository/Order/Order Inquiry/newlyCreatedOrderNo'))
//GlobalVariable.orderId = orderId;
System.out.println(GlobalVariable.orderId)



