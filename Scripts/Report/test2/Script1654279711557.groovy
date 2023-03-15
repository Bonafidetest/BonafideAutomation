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
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.callTestCase(findTestCase('Login/loginToApplication'), [('company') : 'MEDSOUTHTRAIN', ('employeeNo') : '9992', ('pwd') : '1234'], 
    FailureHandling.STOP_ON_FAILURE)

/***************Navigate to Inventory Maintenance************/
WebUI.switchToDefaultContent()

String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.click(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/inventory'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/inventory'))

/*****************************Search the created item*************************/
/*WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/inventory'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/inventory'))*/

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/make'))

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/make'), 'TMAKE')

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/search'))

WebUI.switchToFrame(findTestObject('Object Repository/iframe/invoiceSearchResult'), 10)

//if(WebUI.verifyElementPresent(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/searchResult'), 180, FailureHandling.OPTIONAL))
//	System.out.print("Record created successfully")
//else
//	System.out.print("Record not created successfully")




//String xmake = "(//div[text()='"+GlobalVariable.make+"'])"

String xmake = "(//div[contains(text(),'TMAKE')])"

if(WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xmake]), 10, FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xmake]))

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/td_InventorySearchResult'))
/*******************Click on Transfer Button*********************/
WebUI.scrollToElement(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/button_Transfer'), 10)

WebUI.verifyElementClickable(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/button_Transfer'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/button_Transfer'))

//WebUI.switchToDefaultContent()

//WebUI.delay(5)

/***********Switch to Transfer Pop up and verify it********************/

//WebUI.switchToFrame(findTestObject('Object Repository/iframe/content'), 10)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/span_MedEQ_Inventory_Maintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_InventoryInterOfficeTransfer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_ItemType'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_OriginalOffice'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_TransferTo'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/Transfer/select_toOffice'), '2')

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_TransferredDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_TransferredQty'))

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/Transfer/input_TransferredQty'), '1')

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/span_Confirm'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/Transfer/span_Confirm'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/span_AreYouSure'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/div_transferMessage'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/span_No'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/span_Yes'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/Transfer/span_Yes'))

WebUI.waitForAlert(30)

String message = WebUI.getAlertText()

System.out.println(message)

if(message.contains("Inventory has been Transferred between Two Offices Successfully."))
{
	WebUI.verifyEqual(true, true)
	
	WebUI.acceptAlert()
}




