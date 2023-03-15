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
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/a_TableMaintenance'))
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/a_TableMaintenance'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/**********************Verifications********************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/h3_TABLE MAINTAIN'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/a_CustomerType'))
if(WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/td_NoCustomer'), 10, FailureHandling.OPTIONAL))
	WebUI.verifyEqual(true, true)
else
{
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/td_TypeName'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/td_TypeDesctiption'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/td_ListofExistingCustomer'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/td_FormGrop'))
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/td_CreateNewCustomerType'))

/*************************Add Customer Type**********************/
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/input_TypeName'), typeName)
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/input_Description'), description)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/select_Form_Group'), formGroup, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/select_Show_Write_Off'), showWriteOff, false)
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/button_Submit'))
WebUI.delay(5)

/*************************Already exist Message Checking**********************/
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/input_TypeName'), typeName)
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/input_Description'), description)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/select_Form_Group'), formGroup, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/select_Show_Write_Off'), showWriteOff, false)
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/button_Submit'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/td_AlreadyExistMessage'), 20)

if(formGroup !='N/A')
{
	String xpath = "(//a[contains(text(),'"+typeName+"')]/../following::a[contains(text(),'"+description+"')]/../following::a[contains(text(),'"+formGroup+"')]/../following::a[contains(text(),'"+showWriteOff+"')])"
	if(WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), FailureHandling.OPTIONAL))
		WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
	else
		WebUI.click(findTestObject('Object Repository/Data Setup/ReusableXpath/table_Element'))
}
else
{
	String xpath2 = "(//a[contains(text(),'"+typeName+"')]/../following::a[contains(text(),'"+description+"')]/../following::a[contains(text(),'NOT ASSIGNED')]/../following::a[contains(text(),'"+showWriteOff+"')])"
	if(WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]))
else
	WebUI.click(findTestObject('Object Repository/Data Setup/ReusableXpath/table_Element'))
}

/*************************Update Customer Type**********************/
WebUI.delay(2)
WebUI.switchToWindowTitle("Data Setup - Customer Type Update")
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/td_UpdateExistingCustomerType'))
SimpleDateFormat formatter = new SimpleDateFormat('MMddyyyyHHmmss')
Date date = new Date()
String currentdate = formatter.format(date)
System.out.println(currentdate)
WebUI.delay(2)
String utypeName = typeName + currentdate
String udescription = description + currentdate
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/input_TypeName'), utypeName)
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/input_Description'), udescription)

/** WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/select_Form_Group'), uformGroup, false) **/
// WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/select_Show_Write_Off'), ushowWriteOff, false)

WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/CustomerType/button_Submit'))
WebUI.delay(10)
WebUI.switchToWindowIndex(0)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*************************Delete Customer Type**********************/
if(formGroup !='N/A')
	{
		String xpath3 = "(//a[contains(text(),'"+utypeName+"')]/../following::a[contains(text(),'"+udescription+"')]/../following::a[contains(text(),'"+uformGroup+"')]/../following::a[contains(text(),'"+ushowWriteOff+"')]/../following::a[text()='x'])"
		if(WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath3]), FailureHandling.OPTIONAL))
			WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath3]))
		else
			WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/a_delete'))
	}
	else
	{
		String xpath4 = "(//a[contains(text(),'"+utypeName+"')]/../following::a[contains(text(),'"+udescription+"')]/../following::a[contains(text(),'NOT ASSIGNED')]/../following::a[contains(text(),'"+ushowWriteOff+"')]/../following::a[text()='x'])"
		if(WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath4]), FailureHandling.OPTIONAL))
			WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath4]))
		else
			WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/a_delete'))
	}
		
WebUI.waitForAlert(10)
String dalert = WebUI.getAlertText()
System.out.println(dalert)
WebUI.verifyMatch(dalert, "Are you sure you want to DELETE THIS CUSTOMER TYPE?", false)
WebUI.acceptAlert()