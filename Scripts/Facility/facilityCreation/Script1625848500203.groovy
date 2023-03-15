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

/*************************** Click on Left Hand Side Customer Maitenance *******************/
WebUI.switchToDefaultContent()
WebUI.verifyElementClickable(findTestObject('Object Repository/dashboard/customerMaintenance'))
WebUI.click(findTestObject('Object Repository/dashboard/customerMaintenance'))

/*************************** Click on Add New Facility Tab *******************/
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Search/addNewFacility'))
WebUI.click(findTestObject('Object Repository/Customer/Search/addNewFacility'))

/************Customer Information Details************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Facility/customerInformation/save'))
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/name'), name)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Facility/customerInformation/customerType'), custType, FailureHandling.OPTIONAL)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/altId'), alternateId)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/Address'), address)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/zip'), zipCode)
WebUI.click(findTestObject('Object Repository/Facility/customerInformation/zip4'))
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/zip4'), zip4)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/phone'), phone)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/cellPhone'), cellPhone)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Facility/customerInformation/cellPhoneType'), cellPhoneType, false)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/fax'), fax)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/email'), email)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Facility/customerInformation/formGroup'), formGroup, FailureHandling.OPTIONAL)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/chartNo'), chartNo)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Facility/customerInformation/riskLevel'), riskLevel, FailureHandling.OPTIONAL)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/NPI'), npi)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/taxId'), taxId)
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/directions'), directions)
//WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/'), address)

if(noMailing.equals("YES"))
	WebUI.click(findTestObject('Object Repository/Facility/customerInformation/noMailing'))
	
if(noEmail.equals("YES"))
	WebUI.click(findTestObject('Object Repository/Facility/customerInformation/noEmail'))
if(financialInfo.equals("YES"))
	WebUI.click(findTestObject('Object Repository/Facility/customerInformation/financialInfo'))
if(noSummary.equals("YES"))
	WebUI.click(findTestObject('Object Repository/Facility/customerInformation/noSummary'))
if(suppressZeroItems.equals("YES"))
	WebUI.click(findTestObject('Object Repository/Facility/customerInformation/suppressZeroItems'))
WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/directions'), directions)
if(inactive.equals("YES"))
	WebUI.click(findTestObject('Object Repository/Facility/customerInformation/inactive'));

WebUI.setText(findTestObject('Object Repository/Facility/customerInformation/alert'), alert)

/**********************************Contact Information Details****************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Facility/contactInformation/contactInformation'))
WebUI.click(findTestObject('Object Repository/Facility/contactInformation/contactInformation'))

WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/contactName'), contactName)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/department'), dept)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/phone2'), phone2)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/extention'), extention)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/title'), title)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/fax2'), fax2)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/credentials'), credentials)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/cellPhone2'), cellph2)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/email2'), email2)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/memo'),memo)
WebUI.setText(findTestObject('Object Repository/Facility/contactInformation/cashManager'), cashManager)

/***************************************Bill To Sales Person Details**********************************/
WebUI.verifyElementPresent(findTestObject('Object Repository/Facility/billToSalePerson/billToSalesPerson'), 10)
WebUI.click(findTestObject('Object Repository/Facility/billToSalePerson/billToSalesPerson'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Facility/billToSalePerson/name'))
if(sameAsShipToAddress.equals("YES"))
	WebUI.click(findTestObject('Object Repository/Facility/billToSalePerson/sameAsShipToAddress'))
else
{
	WebUI.setText(findTestObject('Object Repository/Facility/billToSalePerson/name'), billToName)
	WebUI.setText(findTestObject('Object Repository/Facility/billToSalePerson/address'), billToAddress)
	WebUI.setText(findTestObject('Object Repository/Facility/billToSalePerson/address2'),billToAddress2)
	WebUI.setText(findTestObject('Object Repository/Facility/billToSalePerson/zipCode'), billTozipCode)
	WebUI.click(findTestObject('Object Repository/Facility/billToSalePerson/phone'))
	WebUI.delay(5)
}
WebUI.setText(findTestObject('Object Repository/Facility/billToSalePerson/phone'), billTophone)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Facility/billToSalePerson/salesResp'), billTosaleResp, FailureHandling.OPTIONAL)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Facility/billToSalePerson/regSalesMang'), billToregSalesMang, FailureHandling.OPTIONAL)
WebUI.setText(findTestObject('Object Repository/Facility/billToSalePerson/sourceofBusiness'), billToSourceofBusiness)
if(billTorentalcap.equals("YES"))
	WebUI.click(findTestObject('Object Repository/Facility/billToSalePerson/rentalCap'))
if(changeBillToForAllOrders.equals("YES"))
		WebUI.click(findTestObject('Object Repository/Facility/billToSalePerson/changeBillToForAllOrders'))
/*********************************Save**************************************************/	
WebUI.click(findTestObject('Object Repository/Facility/customerInformation/save'))

WebUI.click(findTestObject('Object Repository/Facility/customerInformation/saveAnyway'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Facility/customerInformation/changeOffice'), FailureHandling.OPTIONAL)

facilityId = WebUI.getText(findTestObject('Object Repository/Facility/facilityDetails/fId'))

print("Facility created Successfully with Facility id-" +facilityId)
