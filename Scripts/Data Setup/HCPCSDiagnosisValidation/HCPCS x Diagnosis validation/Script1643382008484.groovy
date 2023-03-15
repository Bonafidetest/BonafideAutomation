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

/* Click on HCPCS x Diagnosis Validation */
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/a_HCPCS x Diagnosis validation'))
WebUI.click(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/a_HCPCS x Diagnosis validation'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/************************Add HCPCS x Diagnosis Validation**************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/h3_header'))
WebUI.click(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/button_AddRuleSet'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/input_RuleName'), 20)
WebUI.setText(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/input_RuleName'), ruleName)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/selectActionRule'), action, false)
WebUI.setText(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/inputHCPCSCode'), HCPCS)
WebUI.setText(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/inputDiagnosisCode'), diagnosisCode)
//String s = HCPCS2;
//String s1 = s.substring(0,1)
Random r = new Random( System.currentTimeMillis() );
if(noOfAdd>1)
{
	for(int i=1; i<Integer.parseInt(noOfAdd); i++)
	{
		//Random r = new Random( System.currentTimeMillis() );
		String rand= 10000 + r.nextInt(20000);
		String rand2 = "A" + r.nextInt(100);
		WebUI.click(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/button_AddMore'))
		String hcpcsxpath = "(//input[@name='hcpcs"+i+"'])"
		String diagnosisxpath = "(//input[@name='diagnosis"+i+"'])"
		WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : hcpcsxpath]), 20)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : diagnosisxpath]), 20)
		WebUI.setText(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : hcpcsxpath]), rand)
		WebUI.setText(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : diagnosisxpath]), rand2)
	}
	//break
}

WebUI.click(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/button_SaveRule'))
WebUI.waitForAlert(10)
// String alert = WebUI.getAlertText()
// System.out.println(alert)
// WebUI.verifyMatch(alert, "The rule set has been saved successfully.", false)
// WebUI.acceptAlert()
String xpath = "(//td[contains(text(),'"+ruleName+"')]/following-sibling::td[contains(text(),'"+action+"')])";
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)

/************************Update HCPCS x Diagnosis Validation*******************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/a_Edit'))
WebUI.click(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/a_Edit'))
SimpleDateFormat formatter = new SimpleDateFormat('MMddyyyyHHmmss')
Date date = new Date()
String currentdate = formatter.format(date)
System.out.println(currentdate)
WebUI.delay(2)
String uruleName = ruleName + currentdate
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/input_RuleName'), 20)
WebUI.setText(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/input_RuleName'), uruleName)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/selectActionRule'), uAction, false)
if(WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/a_Delete'), FailureHandling.OPTIONAL))
{
	WebUI.click(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/a_Delete'))
	WebUI.waitForAlert(10)
	String dalert = WebUI.getAlertText()
	System.out.println(dalert)
	WebUI.verifyMatch(dalert, "Are you sure you want to Delete the entire row?", false)
	WebUI.acceptAlert()
}
if(WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/inputHCPCSCode')))
{
	//Random r = new Random( System.currentTimeMillis() );
	String rand3= 10000 + r.nextInt(20000);
	String rand4 = "A" + r.nextInt(100);
	WebUI.delay(2)
	WebUI.setText(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/inputHCPCSCode'), rand3)
	WebUI.delay(2)
	WebUI.setText(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/inputDiagnosisCode'), rand4)
	
}
WebUI.click(findTestObject('Object Repository/Data Setup/HCPCSDiagnosisValidation/button_SaveRule'))
WebUI.waitForAlert(10)
String ualert = WebUI.getAlertText()
System.out.println(ualert)
WebUI.verifyMatch(ualert, "The rule set has been saved successfully.", false)
WebUI.acceptAlert()
String uxpath = "(//td[contains(text(),'"+uruleName+"')]/following-sibling::td[contains(text(),'"+uAction+"')])";
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : uxpath]), 20)


/************************Delete HCPCS x Diagnosis Validation*******************************/
String dxpath = "(//td[contains(text(),'"+uruleName+"')]/following-sibling::td[contains(text(),'"+uAction+"')]/following-sibling::td/a[text()='x'])";
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : dxpath]), 20)
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : dxpath]))
WebUI.waitForAlert(10)
dalert = WebUI.getAlertText()
System.out.println(dalert)
WebUI.verifyMatch(dalert, "Are you sure you want to Delete this Rule Set?", false)
WebUI.acceptAlert()
