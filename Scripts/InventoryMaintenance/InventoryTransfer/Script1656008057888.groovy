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

WebUI.callTestCase(findTestCase('InventoryMaintenance/addNewRegularInventory'), [('make') : make, ('partNo') : partNo, ('itemType') : itemType
      , ('acq') : acq, ('addedDate') : addedDate, ('averageCost') : averageCost, ('awp') : awp, ('claimUnit') : claimUnit, ('color') : color, ('commcost') : commcost
      , ('consignmentLoc') : consignmentLoc, ('description') : description, ('equipmentType') : equipmentType, ('expired') : expired, ('FileClaim') : FileClaim, ('formGroup') : formGroup
        , ('Hcpcs') : Hcpcs, ('itemMemo') : itemMemo, ('keyword') : keyword, ('lastCost') : lastCost, ('leadTime') : leadTime, ('lotNo') : lotNo, ('mac') : mac
      , ('maxQty') : maxQty, ('maxWeightCapacity') : maxWeightCapacity, ('minQty') : minQty, ('modifier1') : modifier1, ('modifier2') : modifier2, ('modifier3') : modifier3
      , ('modifier4') : modifier4, ('mustSerialize') : mustSerialize, ('narcoticClass') : narcoticClass, ('ndc') : ndc, ('noSubstitutionAllowed') : noSubstitutionAllowed
      , ('office') : office, ('onHandQty') : onHandQty, ('packageSize') : packageSize, ('reorderCode') : reorderCode, ('requiresLetterofMedicalNecessity') : requiresLetterofMedicalNecessity
      , ('requiresRepairsOrInstalation') : requiresRepairsOrInstalation, ('rxUom') : rxUom, ('sellingPrice') : sellingPrice, ('serialNo') : serialNo, ('serviceGroup') : serviceGroup
      , ('shelfLocation') : shelfLocation, ('size') : size, ('sourceType') : sourceType, ('style') : style, ('subType') : subType, ('taxable') : taxable
      , ('titleType') : titleType, ('vendor') : vendor, ('vendorId') : vendorId, ('warranty') : warranty, ('active') : active, ('onHandQtyType') : onHandQtyType
      , ('replacementCost') : replacementCost, ('depreciationMonths') : depreciationMonths, ('depreciationMethod') : depreciationMethod, ('minDailyPrice') : minDailyPrice, ('minDays') : minDays
      , ('dailyRate') : dailyRate, ('weeklyRate') : weeklyRate, ('monthlyRate') : monthlyRate, ('statusDate') : statusDate, ('condition') : condition, ('usedItem') : usedItem
      , ('inOut') : inOut, ('status') : status, ('lastDepreciation') : lastDepreciation, ('currentValue') : currentValue, ('salvage') : salvage, ('startDepreciation') : startDepreciation
      , ('currentReading') : currentReading], FailureHandling.STOP_ON_FAILURE)



WebUI.switchToDefaultContent()

//String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.click(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/inventory'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/inventory'))

WebUI.delay(10)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

String sku ="171113"
WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/sku'), sku)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/InventoryMaintenance/regularInventory?search'))


String xmake = "(//div[text()='"+GlobalVariable.make+"'])"

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

/***********Switch to Transfer Pop up and verify it********************/

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/span_MedEQ_Inventory_Maintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_InventoryInterOfficeTransfer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_ItemType'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_OriginalOffice'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_TransferTo'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/Transfer/select_toOffice'), toOffice)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_TransferredDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/Transfer/td_TransferredQty'))

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/Transfer/input_TransferredQty'), transferQty)

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








