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

/***************Navigate to Inventory Maintenance************/
WebUI.switchToDefaultContent()

String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.click(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/a_InterOfficeTransfer'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/a_InterOfficeTransfer'))

/******Verfication & Request Creation******************/
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/a_CreateRequest'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ViewRequest/a_ViewRequest'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/ReceiveInventory/a_ReceiveInventory'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/h3_InterofficeTransfer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/legend_CREATE_REQUEST'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/a_TransferFrom'))
if(transferFrom !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/select_transferFrom'), transferFrom)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/a_TransferTo'))
if(transferTo !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/select_transferTo'), transferTo)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_RequestDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_RequestedBy'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/span_New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/u_createReminder'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/legend_SearchAddRequestInventory'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_Make'))
if(make !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/input_make'), make)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_PartNumber'))
if(partNumber !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/input_PartNo'), partNumber)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_Sku'))
if(SKU !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/input_SKU'), SKU)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_LotNumber'))
if(lotNumber !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/input_LotNo'), lotNumber)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_description'))
if(description !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/input_Desc'), description)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/input_DisplayTitleOnly'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/input_DispalyAllItemRecords'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/input_SearchRequestFile'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/button_Search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/tr_Ln'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_Quantity'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_Uom'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/td_Remove'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/button_Search'))

WebUI.delay(5)

if(WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/a_SearchItems'), FailureHandling.OPTIONAL))
	{
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/button_Cancel'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/button_Confirm'))
		
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/button_Confirm'))
		
	}
else
	{
		/********************Switch To INTEROFFICE TRANSFER ITEM SEARCH RESULT *****************/
		WebUI.switchToWindowTitle('MedEQ Interoffice Transfer')
		
		WebUI.switchToDefaultContent()
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/h3_InterofficeTransferItemSearchResult'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/button_AddToList'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/button_Cancel'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/td_SEQ'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/td_ONHAND'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/td_QTY'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/td_OFFICE'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/td_MAKE'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/td_PARTNUMBER'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/td_DESCRIPTION'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/td_SKU'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/td_LOTNUMBER'))
		
		String xItem = "(//input[@name='chk0'])"
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xItem]))
		
		WebUI.check(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xItem]))
		
		WebUI.waitForAlert(10, FailureHandling.OPTIONAL)
		
		String alertText = WebUI.getAlertText(FailureHandling.OPTIONAL)
		
		if(alertText.contains('The request quantity is more than the item onhand quantity'))
			{
				System.out.println(alertText)
				
				System.out.println("The transfer item is not available at source office")
				
				WebUI.verifyMatch(true, false, false)
			}
		
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/ItemSearchResult/button_AddToList'))
		
		WebUI.delay(5)
		
		WebUI.switchToDefaultContent()
		
		WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
		
		WebUI.scrollToElement(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/button_Confirm'), 10)
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/button_Confirm'))
		
		WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InterOfficeTransfer/CreateRequest/button_Confirm'))
		
	}

WebUI.waitForAlert(10, FailureHandling.OPTIONAL)
	
String createAlert = WebUI.getAlertText(FailureHandling.OPTIONAL)

System.out.println(createAlert)

if(createAlert.contains('Are you sure you want to Create an Interoffice Transfer Request?'))
	{
		
		WebUI.acceptAlert()
		
		WebUI.waitForAlert(10, FailureHandling.OPTIONAL)
		
		String successAlert = WebUI.getAlertText(FailureHandling.OPTIONAL)
	
		System.out.println(successAlert)
		
		if(successAlert.contains('Interoffice Transfer Request has been Created Successfully.'))
			WebUI.acceptAlert()
	}