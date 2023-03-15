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

import groovy.ui.SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/********************Click on Inventory*****************/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.click(findTestObject('Object Repository/dashboard/inventoryMaintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InventoryMaintenance/inventory'))

WebUI.click(findTestObject('Object Repository/InventoryMaintenance/inventory'))

//WebUI.delay(10)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/office'), 30)

/******************Search By all Combinations***********/
if(office != '')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/office'), office)
if(type !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/type'), type, false)
if(type !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/titletype'), titletype, false)
if(SKU != '')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/SKU'), SKU)
if(quantity != '')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/quantity'), quantity, false)
if(make !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/make'), make)
if(partno !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/partno'), partno)
if(keyword !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/keyword'), keyword)
if(description != '')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/description'), description)
if(memo !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/memo'), memo)
if(lotno !='' )
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/lotno'), lotno)
if(equipmentType !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/equipmentType'), equipmentType)
if(serialno !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/serialno'), serialno)
WebUI.delay(2)
if(subtype != '')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/subType'), subtype)
if(hcpcs !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/hcpcs'), hcpcs)
if(vendor !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/vendor'), vendor)
if(reorder !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/reorder'), reorder, false)
if(status !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/status'), status, false)
if(size !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/size'), size)
if(color !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/color'), color)
if(style !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/style'), style)
if(consignmentLocation !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/consignmentLocation'), consignmentLocation)
if(catalogNumber !='')
	WebUI.setText(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/catalogNumber'), catalogNumber)
if(active !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/active'), active, false)
	
WebUI.click(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/search'))

WebUI.switchToFrame(findTestObject('Object Repository/iframe/invoiceSearchResult'), 10)

if(WebUI.verifyElementPresent(findTestObject('Object Repository/InventoryMaintenance/InventorySearch/searchResult'), 180, FailureHandling.OPTIONAL))
    System.out.print("Record Found")
else
	System.out.print("No record found")
	
