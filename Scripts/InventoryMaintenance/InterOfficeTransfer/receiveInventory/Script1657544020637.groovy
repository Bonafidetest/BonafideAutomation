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

import java.time.LocalDate
import java.time.format.DateTimeFormatter

WebUI.switchToDefaultContent()


WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.click(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

// WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/a_InterOfficeTransfer'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/a_InterOfficeTransfer'))
/************Navigate to Receive Inventory************************************/
WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/Receive_Button'))

if(WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/a_ReceiveInventory'), FailureHandling.OPTIONAL))
	{
		//WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/a_ReceiveInventory'))
		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/a_ReceiveInventory'), FailureHandling.OPTIONAL)
	}
else
	{
		WebUI.switchToDefaultContent()
		String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))
		WebUI.click(findTestObject('Object Repository/dashboard/inventoryMaintenance'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/a_InterOfficeTransfer'))
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/a_InterOfficeTransfer'))
		WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/a_ReceiveInventory'))
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/a_ReceiveInventory'))
		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/a_ReceiveInventory'), FailureHandling.OPTIONAL)
	}
	
/************Verfication & Receive Inventory Operation******************/
//WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/td_ReceivableTransferRequests'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/td_Seq'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/div_ReqDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/div_TransferFrom'))
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/div_TransferTo'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/div_ReqBy'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/div_OrderNumber'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/div_Status'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/td_ReceiveSheet'))

/*******Obtaining current date******************/
LocalDate currentDate = LocalDate.now()
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
String curDate = currentDate.format(formatter)
System.out.println(curDate)

String notReceiveStatus ="//div[contains(text(),'1')]/following::div[contains(text(),'"+curDate+"')]/following::div[contains(text(),'"+GlobalVariable.orderId+"')]/following::div[contains(text(),'"+GlobalVariable.shipedStat+"')]"
WebUI.verifyElementVisible((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : notReceiveStatus])))
WebUI.click((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : notReceiveStatus])))
WebUI.waitForAlert(5)
WebUI.click((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : notReceiveStatus])))
WebUI.waitForAlert(5)
WebUI.click((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : notReceiveStatus])))
WebUI.waitForAlert(5)
String receivingAlert = WebUI.getAlertText()
System.out.println(receivingAlert)
if(receivingAlert.contains('Are you sure you want to Start Receiving Process?'))
	{
		WebUI.acceptAlert()
//	    WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/a_TrainingGuide'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/h1_purchaseReceiving'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_ConfirmReceivedItemandQuantity'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_PO'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/b_receivedDate'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/input_VendorInvoiceNumber'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_ConfirmyourPurchasingInformation'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_ConfirmyourReceivingInformation'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_Seq'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_Make'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_PartNumber'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_description'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_POQuantity'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_QuantityAlreadyReceived'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_QuantityReceivedThisTime'))
		//WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/a_InventoryReceivedAs'))
		//WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/a_EditUpdateConversion'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/input_SelectAll'))	
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/input_DeselectAll'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/input_SortbyDescription'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/button_Cancel'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/button_NextStep'))

		WebUI.check(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/input_recvdt'))

		for(int i=0;;i++)
			{
				String itemchkbox = "(//input[@name='rcvcheck"+i+"'])"
				String itemqty = "(//input[@name='rcvqty"+i+"'])"
				if(WebUI.verifyElementVisible((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : itemchkbox])), FailureHandling.OPTIONAL))
				{
					WebUI.verifyElementChecked((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : itemchkbox])), 10)
					WebUI.verifyElementAttributeValue((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : itemqty])), 'value', '1', 10)
				}
				else
					break
				
			}	
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/button_NextStep'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_receivingProcessComplete'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/td_receivingSummaryForPO'))
		String receiveDate ="(//td[contains(text(),'Received Date:') and contains(text(),'"+curDate+"')])"
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/button_finish'))
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/PurchaseReceiving/button_finish'))

		WebUI.delay(10)
		//String xreceiveOrder ="//div[contains(text(),'1')]/following::div[contains(text(),'"+curDate+"')]/following::div[contains(text(),'"+GlobalVariable.orderId+"')]"
		//WebUI.verifyElementNotPresent((findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xreceiveOrder])), 10)
		
	}