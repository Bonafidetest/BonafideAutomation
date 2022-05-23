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

import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.util.concurrent.TimeUnit as TimeUnit

/*Click on Inventory*/
WebUI.switchToDefaultContent()

String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.click(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/inventory'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/inventory'))

/*Click on Add New Regular Inventory*/
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementPresent(findTestObject('InventoryMaintenance/inventoryHeaderTab/inventoryTab'), 60)

WebUI.mouseOver(findTestObject('InventoryMaintenance/inventoryHeaderTab/inventoryTab'))

WebUI.verifyElementVisible(findTestObject('InventoryMaintenance/inventoryHeaderTab/regularInventory'))

WebUI.click(findTestObject('InventoryMaintenance/inventoryHeaderTab/regularInventory'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/addInventory'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/InventoryMaintenance/regularInventory/showAllChoices'), 60)

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/regularInventory/showAllChoices'))

SimpleDateFormat formatter = new SimpleDateFormat('MMddyyHHMMSS')

Date date = new Date()

String currentdate = formatter.format(date)

make = "Tmake"+currentdate

partNo = "Tpartno"+currentdate

WebUI.verifyElementPresent(findTestObject('Object Repository/InventoryMaintenance/regularInventory/newMake'), 30)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/regularInventory/newMake'), make)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/regularInventory/newPartNumber'), partNo)

WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/regularInventory/itemType'), itemType, false)

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/regularInventory/submitButton'))

WebUI.delay(10)

/*Inventory Details*/
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/titleType'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/active'), active, false)

/*TITLE*/

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/keyword'), keyword)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/Hcpcs'), Hcpcs)

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/description'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/description'), description)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/equipmentType'), equipmentType)

WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/subType'), subType)

if(requiresLetterofMedicalNecessity.equals("YES"))
	WebUI.check(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/requiresLetterofMedicalNecessity'))
else
	WebUI.uncheck(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/requiresLetterofMedicalNecessity'))
	
WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/mustSerialize'), mustSerialize, false)
	

/*PHARMACY USAGE */

//WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/ndc'), ndc)

WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/rxUom'), rxUom, false)

//WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/itemType'), itemType, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/sourceType'), sourceType, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/narcoticClass'), narcoticClass, false)

if(noSubstitutionAllowed.equals("YES"))
	WebUI.check(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/noSubstitutionAllowed'))
	
//WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/awp'), awp)
//
//WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/acq'), acq)
//
//WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/mac'), mac)
//
//WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/packageSize'), packageSize)

/*GENERAL*/
if(itemType.equals("RENTAL"))

	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/onHandQty'), "1")

else
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/onHandQty'), onHandQty)

WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/onHandQtyType'), onHandQtyType, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/fileClaim'), FileClaim, false)

if(mustSerialize.equals("NO"))
{
		if(office.equals("ALL"))
			
				WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/office'), office, false)	
		else
				WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/office'), office)
}
if(mustSerialize.equals("YES"))
{
			if(office.equals("ALL"))
					System.out.println("Serialized Sale item can be added to a Single Office Only")
			else
					WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/office'), office)
}

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/shelfLocation'), shelfLocation)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/vendor'), vendor)

/*Vendor Search*/

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/vendorLink'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/pick'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/vendorId'), 20)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/vendorId'), vendorId)

WebUI.sendKeys(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/vendorId'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/vendorList'), 10)

String xpath = "(//div[contains(text(),"+vendorId+")])"

WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)

WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))

WebUI.switchToWindowIndex(0)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/expired'), expired)

//WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/modifier1'), modifier1, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/modifier2'), modifier2, FailureHandling.OPTIONAL)

//WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/modifier3'), modifier3, FailureHandling.OPTIONAL)

//WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/modifier4'), modifier4, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/consignmentLoc'), consignmentLoc)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/warranty'), warranty)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/lotNo'), lotNo)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/sellingPrice'), sellingPrice)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/leadTime'), leadTime)

//WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/serialNo'), serialNo)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/lastCost'), lastCost)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/size'), size)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/itemMemo'), itemMemo)

WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/formGroup'), formGroup)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/averageCost'), averageCost)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/color'), color)

WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/serviceGroup'), serviceGroup, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/commCost'), commcost)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/style'), style)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/replacementCost'), replacementCost)

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/maxWeightCapacity'), maxWeightCapacity)

WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/taxable'), taxable, false)

if(itemType.equals("SALE"))
{
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/minQty'), minQty)
	
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/maxQty'), maxQty)
		
	WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/reorderCode'), reorderCode, false)	
}

if(itemType.equals("RENTAL"))
	{
		WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/status'), status, false)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/monthlyRate'), monthlyRate)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/depreciationMethod'), depreciationMethod, false)
	    WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/lastDepreciation'), lastDepreciation)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/inOut'), inOut, false)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/weeklyRate'), weeklyRate)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/depreciationMonths'), depreciationMonths)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/currentReading'), currentReading)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/usedItem'), usedItem, false)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/dailyRate'), dailyRate)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/startDepreciation'), startDepreciation)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/currentValue'), currentValue)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/condition'), condition)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/minDays'), minDays)
		//WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/statusDate'), statusDate)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/minDailyPrice'), minDailyPrice)
		WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/salvage'), salvage)
	}
if(requiresRepairsOrInstalation.equals("YES"))
	WebUI.check(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/requiresRepairOrInstalation'))
	
WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InventoryDetails/confirmButton'))

WebUI.delay(15)

if(companyName.equals("MEDSOUTHTRAIN"))
{
	WebUI.waitForAlert(30)
	
	String message = WebUI.getAlertText()
	
	System.out.println(message)
	
	if(message.contains("Inventory Record has been Created Successfully."))
	{
		WebUI.verifyEqual(true, true)
		
		WebUI.dismissAlert()
	}
}
else if(companyName.equals("CHCSTRAIN"))
{
	WebUI.dismissAlert()
}
else
{
	WebUI.switchToFrame(findTestObject('Object Repository/iframe/addInventory'), 10)
	
	WebUI.verifyElementPresent(findTestObject('InventoryMaintenance/regularInventory/inventorySuccessMessage'), 10)
}
	
/*Search the created item*/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/inventory'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/inventory'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/make'))

WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/make'), make)

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/search'))

WebUI.switchToFrame(findTestObject('Object Repository/iframe/invoiceSearchResult'), 10)

if(WebUI.verifyElementPresent(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/searchResult'), 180, FailureHandling.OPTIONAL))
	System.out.print("Record created successfully")
else
	System.out.print("Record not created successfully")
