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


/**********************Click on New Order*****************/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/activities'))

WebUI.click(findTestObject('Object Repository/dashboard/activities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/newOrder'))

WebUI.click(findTestObject('Object Repository/dashboard/newOrder'))

/******************customer search********************/
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Search/customerID'))

if(custLastName!='' && custId=='')
	{
		WebUI.setText(findTestObject('Object Repository/Customer/Search/lastName'), custLastName)
		
		WebUI.click(findTestObject('Object Repository/Customer/Search/searchButton'))
		
		String clname = ('//div[contains(text(),\'' + custLastName) + '\')]'
		
		System.out.println(clname)
		
		WebUI.verifyElementClickable(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : clname]))
		
		WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : clname]))
	}
if(custId!='' && custLastName=='')
	{
		WebUI.setText(findTestObject('Object Repository/Customer/Search/customerID'), custId)
		
		WebUI.click(findTestObject('Object Repository/Customer/Search/searchButton'))
		
		String cid = ('//div[contains(text(),\'' + custId) + '\')]'
		
		System.out.println(cid)
		
		WebUI.verifyElementClickable(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : cid]))
		
		WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : cid]))
		
	}
if(custId!='' && custLastName!='')
	{
		WebUI.setText(findTestObject('Object Repository/Customer/Search/customerID'), custId)
		
		WebUI.setText(findTestObject('Object Repository/Customer/Search/lastName'), custLastName)
		
		WebUI.click(findTestObject('Object Repository/Customer/Search/searchButton'))
		
		String cid = ('//div[contains(text(),\'' + custId) + '\')]'
		
		System.out.println(cid)
		
		WebUI.verifyElementClickable(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : cid]))
		
		WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : cid]))
	}
if(custId=='' && custLastName=='')
	{
		System.out.println("Please Enter Customer Id or Customer Last Name to Proced Further")
	}
	

WebUI.callTestCase(findTestCase('Order/CustomerInformation'), [('billing_Office') : billing_Office, ('orderedBy') : orderedBy
		, ('salesRep') : salesRep, ('fileClaim') : fileClaim], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Order/ClaimInformation'), [('ICD10_1') : ICD10_1, ('placeofService') : placeofService, ('physicianFirstName') : physicianFirstName],
	FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Order/BillandShipToInfo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Order/OrderItems'), [('SKU') : SKU], FailureHandling.STOP_ON_FAILURE)

