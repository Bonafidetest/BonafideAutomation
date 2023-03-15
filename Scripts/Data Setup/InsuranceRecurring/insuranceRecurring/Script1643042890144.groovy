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

/* Click on Insurance Recurring */
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/InsuranceRecurring/a_InsuranceRecurring'))
WebUI.click(findTestObject('Object Repository/Data Setup/InsuranceRecurring/a_InsuranceRecurring'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/************************Add Insurance Recurring**************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/InsuranceRecurring/h3_header'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_Title'))
if(title == "YES" & HCPCS_CHK == "NO")
{
	WebUI.check(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_Title'))
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_Insurance'),"001278BMEDICAL", false)
	WebUI.delay(5)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_make'), make, false)
	WebUI.delay(5)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_PartNo'), partNo, false)
	WebUI.delay(5)
	
}

if(title == "NO" & HCPCS_CHK == "YES")
	{
		WebUI.check(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_HCPCS_CheckBox'))
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_Insurance'), "001278BMEDICAL", false)
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_HCPCS'), HCPCS)
		
	}
	
	WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_RecurringFreq'), recurringFreq)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_RecurringFreq'), recurringFreqType, false)
	WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_DefaultQty'), defaultQty)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_Default_Qty'), defaultQtyType, false)
	WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_Max_Recurring'), maxRecurring)
	WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_Start_After'), startAfter)
	WebUI.click(findTestObject('Object Repository/Data Setup/InsuranceRecurring/submit_Button'))
	WebUI.waitForAlert(10)
	// String alert = WebUI.getAlertText()
	// System.out.println(alert)
	//WebUI.verifyMatch(alert, "Your setup has been created successfully.", false)
	// WebUI.acceptAlert()
	
	/******************************Duplicate Checking***************************/
	WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_Title'))
	if(title == "YES" & HCPCS_CHK == "NO")
	{
		WebUI.check(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_Title'))
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_Insurance'), "001278BMEDICAL", false)
		WebUI.delay(5)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_make'), make, false)
		WebUI.delay(5)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_PartNo'), partNo, false)
		WebUI.delay(5)
	}
	
	if(title == "NO" & HCPCS_CHK == "YES")
		{
			WebUI.check(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_HCPCS_CheckBox'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_Insurance'), "001278BMEDICAL", false)
			WebUI.delay(5)
			WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_HCPCS'), HCPCS)
		}
		
		WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_RecurringFreq'), recurringFreq)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_RecurringFreq'), recurringFreqType, false)
		WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_DefaultQty'), defaultQty)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/InsuranceRecurring/select_Default_Qty'), defaultQtyType, false)
		WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_Max_Recurring'), maxRecurring)
		WebUI.setText(findTestObject('Object Repository/Data Setup/InsuranceRecurring/input_Start_After'), startAfter)
		WebUI.click(findTestObject('Object Repository/Data Setup/InsuranceRecurring/submit_Button'))
		WebUI.waitForAlert(10)
		String dalert = WebUI.getAlertText()
		System.out.println(dalert)
		String line1 = "This setup combination already exists in the database."
		String line2="There is no new record created this time."
		String duplicateAlert = line1+'\n'+ line2
		WebUI.verifyMatch(dalert, duplicateAlert, false)
		WebUI.acceptAlert()
	
	
	/**************************Delete Insurance Recurring***************************/
		//String xpath = "(//td[contains(text(),'"+insurance+"')]/following-sibling::td[contains(text(),'"+make+"')]/following-sibling::td[contains(text(),'"+partNo+"')]/following::a[text()='x'])"
	if(title == "YES" & HCPCS_CHK == "NO")
	{
		String xpath = "(//td[contains(text(),'"+insurance+"')]/following-sibling::td[contains(text(),'"+make+"')]/following-sibling::td[contains(text(),'"+partNo+"')]/following::a[text()='x'])"
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20))
			WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
	}
	if(title == "NO" & HCPCS_CHK == "YES")
	{
//		String xpath2 ="(//td[contains(text(),'"+insurance+"')]/following-sibling::td[contains(text(),'"+HCPCS+"')]/following-sibling::td/a[text()='x'])"
	//	if(WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]), 20))
		//	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]))
	}
		//WebUI.waitForAlert(5)
		//String delalert = WebUI.getAlertText()
		//System.out.println(delalert)
		//WebUI.verifyMatch(delalert, "Are you sure you want to Delete this recurring setup?", false)
		//WebUI.acceptAlert()
	