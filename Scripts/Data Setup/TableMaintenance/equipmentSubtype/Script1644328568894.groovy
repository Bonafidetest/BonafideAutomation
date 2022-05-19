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
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/a_EquipmentSubType'))
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/a_EquipmentSubType'))
if(WebUI.verifyElementPresent(findTestObject('Data Setup/TableMaintenance/equipmentSubType/td_NoEquipmentSubType'), 10, FailureHandling.OPTIONAL))
	WebUI.verifyEqual(true, true)
else
{
	WebUI.verifyElementVisible(findTestObject('Data Setup/TableMaintenance/equipmentSubType/td_SubtypeName'))
	//WebUI.verifyElementVisible(findTestObject('Data Setup/TableMaintenance/equipmentSubType/td_SubTypeDesctiption'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/td_ListofExistingEquipmentSubTypes'))
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/td_CreateNewEquipmentSubType'))

/*************************Add Equipment SubType**********************/
WebUI.setText(findTestObject('Data Setup/TableMaintenance/equipmentSubType/input_SubTypeName'), subtypeName)
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/input_Description'), description)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/select_Form_Group'), formGroup, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/select_ServiceGroup'), serviceGroup, false, FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/button_Submit'))
WebUI.delay(5)

/*************************Already exist Message Checking**********************/
WebUI.setText(findTestObject('Data Setup/TableMaintenance/equipmentSubType/input_SubTypeName'), subtypeName)
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/input_Description'), description)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/select_Form_Group'), formGroup, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/select_ServiceGroup'), serviceGroup, false, FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/button_Submit'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/td_AlreadyExistMessage'), 20)


String xpath = "(//a[contains(text(),'"+subtypeName+"')]/../following::a[contains(text(),'"+description+"')])"
WebUI.delay(2)
if(WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
else
	WebUI.click(findTestObject('Object Repository/Data Setup/ReusableXpath/table_Element'))


/*************************Update Equipment SubType**********************/

SimpleDateFormat formatter = new SimpleDateFormat('MMddyyyyHHmmss')
Date date = new Date()
String currentdate = formatter.format(date)
System.out.println(currentdate)
WebUI.delay(2)
String usubtypeName = subtypeName + currentdate
String udescription = description + currentdate
WebUI.setText(findTestObject('Data Setup/TableMaintenance/equipmentSubType/input_SubTypeName'), usubtypeName)
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/input_Description'), udescription)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/select_Form_Group'), uformGroup, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/select_ServiceGroup'), userviceGroup, false, FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/button_SAVEANDEXIT'))
WebUI.delay(10)

String xpath3 = "(//a[contains(text(),'"+usubtypeName+"')]/../following::a[contains(text(),'"+udescription+"')]/../following::a[text()='x'])"

		
	
	/*************************Delete Equipment SubType**********************/
if(WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath3]), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath3]))
else
	WebUI.click(findTestObject('Object Repository/Data Setup/TableMaintenance/equipmentSubType/a_delete'))	
WebUI.waitForAlert(10)
String dalert = WebUI.getAlertText()
System.out.println(dalert)
WebUI.verifyMatch(dalert, "Are you sure you want to DELETE THIS EQUIPMENT SUBTYPE?", false)
WebUI.acceptAlert()