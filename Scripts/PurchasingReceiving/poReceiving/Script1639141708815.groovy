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
import org.openqa.selenium.By as By
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.NoAlertPresentException as NoAlertPresentException

/**************Click on Purchase Order***************/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/PurchasingReceiving'))

WebUI.click(findTestObject('Object Repository/dashboard/PurchasingReceiving'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Receiving/receiving'))

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Receiving/receiving'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/******************Purcharse Order Receiving****************/
WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Receiving/quickSearch'))

WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Receiving/quickSearch'), poNumber)

// Switching to Alert
//WebDriver driver = DriverFactory.getWebDriver()
//String parentwindow = driver.getWindowHandle();
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Receiving/search'))

WebUI.delay(3)

//WebUI.acceptAlert(FailureHandling.OPTIONAL)
//WebUI.delay(2)
//Set<String> allWindowsHandels = driver.getWindowHandles();
//Iterator<String> i1=allWindowsHandels.iterator();
//while(i1.hasNext())
//{
//	String childwindow = i1.next();
//	if(!parentwindow.equalsIgnoreCase(childwindow))
//	{
//		driver.switchTo().window(childwindow);
//		
//		
//		WebUI.acceptAlert(FailureHandling.OPTIONAL)
//		WebUI.delay(2)
//		
//	}
//}
//driver.switchTo().window(parentwindow);
//WebUI.switchToWindowIndex(1, FailureHandling.OPTIONAL)
//Alert alert = driver.switchTo().alert();
//WebUI.click(findTestObject('Object Repository/DynamicXpath/button_OK'), FailureHandling.OPTIONAL)
//WebUI.click(findTestObject('Object Repository/DynamicXpath/input_OK'), FailureHandling.OPTIONAL)
//WebUI.acceptAlert(FailureHandling.OPTIONAL)
//WebUI.delay(2)
//
//
//
//
//WebUI.delay(2)
//WebUI.acceptAlert(FailureHandling.OPTIONAL)
//WebUI.delay(2)
//WebUI.switchToWindowIndex(0,FailureHandling.OPTIONAL)
//WebUI.delay(2)
//WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10, FailureHandling.OPTIONAL)
//WebUI.delay(2)
//WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Receiving/quickSearch'))
//WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Receiving/quickSearch'), poNumber)
//WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Receiving/search'))
//WebUI.delay(2)
//String xpath = "(//div[text()='"+poNumber+"'])"
//WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)
//WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
/************Step1*************/
WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Receiving/receivedDateChkBox'))

WebUI.check(findTestObject('Object Repository/PurchasingReceiving/Receiving/receivedDateChkBox'))

WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Receiving/receivedQuantity'), qtY)

//WebUI.scrollToElement(findTestObject('PurchasingReceiving/Receiving/nextStep2'), 5)

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Receiving/nextStep2'))

/**************Step2**********/
//WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Receiving/step2'))
//WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Receiving/nextStep1'))

/*************Step3*********/
//WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Receiving/step3'))

//WebUI.selectOptionByIndex(findTestObject('Object Repository/PurchasingReceiving/Receiving/transferToManifest'), manifest, FailureHandling.OPTIONAL)
//WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Receiving/confirmReceiving'))

/***********Final***************/
WebUI.delay(5)

//WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Receiving/receivingProcessComplete'))

//WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Receiving/finish'))

/***********Verify Received Purchase Order************/
WebUI.refresh()

WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/PurchasingReceiving'))

WebUI.click(findTestObject('Object Repository/dashboard/PurchasingReceiving'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/purchaseOrder'))

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/purchaseOrder'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/quickSearch'), 
    10)

WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/quickSearch'), poNumber)

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/quickSearchButton'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Receiving/poReceivedMessage'))

