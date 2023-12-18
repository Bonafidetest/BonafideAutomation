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
import com.kms.katalon.entity.global.GlobalVariableEntity

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import java.time.LocalDate
import java.time.format.DateTimeFormatter

/******Verfication & View Request ******************/
WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

if(WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/a_ViewRequest'), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/a_ViewRequest'))
else
	{
		WebUI.switchToDefaultContent()
		String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))		
		WebUI.click(findTestObject('Object Repository/dashboard/inventoryMaintenance'))		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/a_InterOfficeTransfer'))		
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/a_InterOfficeTransfer'))		
		WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/a_ViewRequest'))		
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/a_ViewRequest'))
	}

	/******Verfication & View Request ******************/
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/h3_InterofficeTransfer'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/legend_ViewRequestSearch'))	

/*******Obtaining current date******************/
LocalDate currentDate = LocalDate.now()
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
String curDate = currentDate.format(formatter)
System.out.println(curDate)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/td_TransferFromOffice'))
if(transferFromOffice !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/select_transferFromOffice'), transferFromOffice)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/td_TransferFromOffice'))
if(transferToOffice !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/select_transferToOffice'), transferToOffice)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/td_RequestDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/td_ProcessStatus'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/td_RequestBy'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/td_OrderNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/button_Refresh'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/button_Search'))
WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/button_Search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/td_TransferRequest'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/td_Seq'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/div_RequestDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/div_TransferFrom'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/div_TransferTo'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/div_RequestedBy'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/div_OrderNumber'))

String xpath="(//div[contains(text(),'1')]/following::div[contains(text(),'"+curDate+"')])"
WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
String xdoDlvr = "(//div[contains(text(),'1')]/following::div[contains(text(),'"+curDate+"')]/following::a[text()='DO DLVR'])"
WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xdoDlvr]))
String xVoidReq = "(//div[contains(text(),'1')]/following::div[contains(text(),'"+curDate+"')]/following::a[text()='VOID REQ'])"
WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xVoidReq]))
String xStatus = "(//div[contains(text(),'1')]/following::div[contains(text(),'"+curDate+"')]/following::div[contains(text(),'REQUEST SENT BUT ITEMS NOT SHIPPED YET')])"
WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xStatus]))
String xOrderNo = "(//div[contains(text(),'1')]/following::div[contains(text(),'"+curDate+"')]/following::a)[5]"
GlobalVariable.orderId = WebUI.getText(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xOrderNo]))

WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xVoidReq]))

WebUI.waitForAlert(10, FailureHandling.OPTIONAL)
String voidalert = WebUI.getAlertText(FailureHandling.OPTIONAL)
System.out.println(voidalert)
WebUI.delay(5)
if(voidalert.contains('Are you sure you want to Void this Interoffice Transfer?'))
	WebUI.dismissAlert()
	
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xdoDlvr]))
WebUI.waitForAlert(10, FailureHandling.OPTIONAL)
String dlvralert = WebUI.getAlertText(FailureHandling.OPTIONAL)
System.out.println(dlvralert)
if(dlvralert.contains('Are you sure you want to Start Delivery Process for this Order?'))
	WebUI.acceptAlert()
	
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
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/saveandConfirm'))
WebUI.delay(5)

/*String xOrderNo2 = "(//div[contains(text(),'1')]/following::div[contains(text(),'"+curDate+"')]/following::a[contains(text(),'"+GlobalVariable.orderId+"')])"
WebUI.verifyElementVisible((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xOrderNo2])))
String shippedStatus = "(//a[contains((.),'"+GlobalVariable.orderId+"')]/following::div[contains(text(),'"+GlobalVariable.shipedStat+"')])"
WebUI.verifyElementVisible((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : shippedStatus])))

WebUI.closeWindowIndex(1, FailureHandling.OPTIONAL)

WebUI.switchToWindowIndex(0, FailureHandling.OPTIONAL)
*/



