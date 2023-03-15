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

/***************Click on Purchase Order**************/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/PurchasingReceiving'))

WebUI.click(findTestObject('Object Repository/dashboard/PurchasingReceiving'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/purchaseOrder'))

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/purchaseOrder'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

//if(WebUI.verifyElementNotVisible(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/searchCriteria'), FailureHandling.OPTIONAL))
	
/**************************Search by all Combination****************/
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/openSearchFields'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/poOffice'), 30)
	
if(poOffice !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/poOffice'), Integer.parseInt(poOffice))
if(orderNo !='')
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/orderNo'), orderNo)
if(referenceNo !='')
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/referenceNo'), referenceNo)
if(poVendor !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/poVendor'), Integer.parseInt(poVendor))
if(poStatus !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/poStatus'), poStatus, false)
if(poType !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/poType'), poType, false)
if(createdUser !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/createdUser'), createdUser, false)
if(requestDateFrom !='' && requestDateTo !='')
{
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/requestDateFrom'), requestDateFrom)
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/requestDateTo'), requestDateTo)
}
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/searchButton'))

WebUI.delay(5)

if(WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/searchResult'), 60, FailureHandling.OPTIONAL))
	System.out.println("Search Result Found")
else
	println("Search Result not Found")

	
