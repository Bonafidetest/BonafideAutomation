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

/* Click on Claim Filing Group */
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/a_ClaimFilingGroup'))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/a_ClaimFilingGroup'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*************************Add Claim Filing Group***********************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/h3_Header'))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/a_ClickHere'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_AddGroupName'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_AddGroupName'), groupName)
//WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/select_Available_Insurance'))
String ins1 ="(//option[text()='"+insurance1+"'])"
String ins2 ="(//option[text()='C1 CWA RN'])"
//String ins2 ="(//option[text()='"+insurance2+"'])"
if(WebUI.verifyElementNotPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ins1]), 20, FailureHandling.OPTIONAL))
	System.out.println("Insurance1 Not Available")
else
{
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ins1]))
	WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_right_arrow'))
}

if(WebUI.verifyElementNotPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ins2]), 20, FailureHandling.OPTIONAL))
	System.out.println("Insurance2 Not Available")
else
{
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ins2]))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_right_arrow'))
}
//WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/select_Added_Insurance'))
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ins2]))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_left_arrow'))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Save'))

String xpath = "(//div[text()='"+groupName+"'])"

/*************************Search Claim Filing Group***********************/
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_GroupName'), groupName)
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Search'))
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Refresh'))
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_InsuranceName'), insurance1)
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Search'))
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Refresh'))

WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_GroupName'), groupName)
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_InsuranceName'), insurance1)
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Search'))
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)

/*************************Update Claim Filing Group***********************/
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_AddGroupName'))
SimpleDateFormat formatter = new SimpleDateFormat('MMddyyyyHHmmss')
Date date = new Date()
String currentdate = formatter.format(date)
System.out.println(currentdate)
WebUI.delay(2)
String ugroupName = groupName + currentdate
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_AddGroupName'), ugroupName)
//WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/select_Added_Insurance'))
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ins1]))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_left_arrow'))
//WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/select_Available_Insurance'))
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ins2]))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_right_arrow'))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Save'))

String xpath2 = "(//div[text()='"+ugroupName+"'])"
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_GroupName'), ugroupName)
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_InsuranceName'), insurance2)
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Search'))
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]), 20)

/*************************Delete Claim Filing Group***********************/
String dxpath = "(//div[text()='"+ugroupName+"']/../..//following-sibling::td/a[text()='delete'])"
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : dxpath]))
WebUI.waitForAlert(10)
String dalert = WebUI.getAlertText()
System.out.println(dalert)
WebUI.verifyMatch(dalert, "Are you sure you want to Delete this Claim Filing Group?", false)
//WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : dxpath]))
WebUI.waitForAlert(10)
String walert = WebUI.getAlertText()
System.out.println(walert)
//WebUI.verifyMatch(walert, "This group was already assigned to insurance companies", false)
//WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_GroupName'), ugroupName)
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_InsuranceName'), insurance2)
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Search'))
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]), 20)
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]))
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ins2]))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_left_arrow'))
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Save'))

WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_GroupName'), ugroupName)
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Search'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : dxpath]))
WebUI.waitForAlert(10)
dalert = WebUI.getAlertText()
System.out.println(dalert)
WebUI.verifyMatch(dalert, "Are you sure you want to Delete this Claim Filing Group?", false)
WebUI.delay(2)
//WebUI.acceptAlert()

WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/input_Search_GroupName'), ugroupName)
WebUI.click(findTestObject('Object Repository/Data Setup/ClaimFilingGroup/button_Search'))
WebUI.delay(5)
//WebUI.verifyElementNotPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]), 20)
