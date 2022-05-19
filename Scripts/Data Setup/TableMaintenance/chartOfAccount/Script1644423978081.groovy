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

/************************Click on Table Maintenance***************************/
WebUI.refresh()
WebUI.closeWindowIndex(1, FailureHandling.OPTIONAL)
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/a_TableMaintenance'))
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/a_TableMaintenance'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/**********************Verifications********************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/h3_TABLE MAINTAIN'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/a_chartofAccount'))
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/a_chartofAccount'))
if(WebUI.verifyElementPresent(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/td_NoAccount'), 10, FailureHandling.OPTIONAL))
	WebUI.verifyEqual(true, true)
else
{
//	WebUI.verifyElementVisible(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/td_AcctNumber'))
//	WebUI.verifyElementVisible(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/td_AcctDesctiption'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/td_ListofExistingCustomer'))
	WebUI.verifyElementVisible(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/td_Export'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/td_StaticInfo'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/td_StaticInfo2'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/td_StaticInfo3'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/td_SetupDefaultAccount'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/a_Click'))
	WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/a_Click'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/td_PleaseSetUp'))
	WebUI.scrollToElement(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/button_SaveAndExist'), 5)
	WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/button_SaveAndExist'))
	
}

WebUI.verifyElementVisible(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/td_CreateNewAccount'))

/*************************Add Chart Of Account**********************/
WebUI.setText(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/input_AccountNumber'), acctName)
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/input_Description'), description)
WebUI.selectOptionByLabel(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/select_Export'), export, false)
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/button_Submit'))
WebUI.delay(10)

/*************************Already exist Message Checking**********************/
WebUI.setText(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/input_AccountNumber'), acctName)
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/input_Description'), description)
WebUI.selectOptionByLabel(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/select_Export'), export, false)
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/button_Submit'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/td_AlreadyExistMessage'), 20)


String xpath = "(//a[contains(text(),'"+acctName+"')]/../following::a[contains(text(),'"+description+"')]/../following::a[contains(text(),'"+export+"')])"
WebUI.delay(2)
if(WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
else
	WebUI.click(findTestObject('Object Repository/Data Setup/ReusableXpath/table_Element'))

/*************************Update Chart Of Account**********************/
WebUI.delay(7)
WebUI.switchToWindowTitle("Data Setup - Chart of Account Update")
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/td_UpdateExistingCustomerType'))
SimpleDateFormat formatter = new SimpleDateFormat('MMddyyyyHHmmss')
Date date = new Date()
String currentdate = formatter.format(date)
System.out.println(currentdate)
WebUI.delay(2)
String uacctName = acctName + currentdate
String udescription = description + currentdate
WebUI.setText(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/input_AccountNumber'), uacctName)
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/input_Description'), udescription)
WebUI.selectOptionByLabel(findTestObject('Data Setup/TableMaintenance/ChartOfAccount/select_Export'), uexport, false)
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/ChartOfAccount/button_SaveAndExist'))
WebUI.delay(10)
WebUI.switchToWindowIndex(0)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*************************Delete Chart Of Account**********************/
String xpath3 = "(//a[contains(text(),'"+uacctName+"')]/../following::a[contains(text(),'"+udescription+"')]/../following::a[contains(text(),'"+uexport+"')]/../following::a[text()='x'])"
if(WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath3]), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath3]))
else
	WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/a_delete'))
		
WebUI.waitForAlert(10)
String dalert = WebUI.getAlertText()
System.out.println(dalert)
WebUI.verifyMatch(dalert, "Are you sure you want to DELETE THIS ACCOUNT NUMBER?", false)
WebUI.acceptAlert()