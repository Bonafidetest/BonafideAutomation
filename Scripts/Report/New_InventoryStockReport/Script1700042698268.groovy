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

WebUI.click(findTestObject('Object Repository/Report/InventoryStockReport/Page_/a_Reports'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Report/InventoryStockReport/Page_/a_Inventory Stock Report'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Report/InventoryStockReport/Page_/input_txtSku'), '180516')

WebUI.scrollToElement(findTestObject('Report/InventoryStockReport/Page_/button_Print'), 0)

WebUI.click(findTestObject('Object Repository/Report/InventoryStockReport/Page_/button_Print'))

WebUI.navigateToUrl('https://medsqa-alb.bonafide.com/meds/rep/inventory/invstockreport_print.jsp')

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('Object Repository/Report/InventoryStockReport/Page_Bonafide DME Software (Inventory Stock_e9791c/td_INVENTORY STOCK REPORT'), 
    'INVENTORY STOCK REPORT')

