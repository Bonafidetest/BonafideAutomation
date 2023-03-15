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


/*Click on Billing*/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/activities'))

WebUI.click(findTestObject('Object Repository/dashboard/activities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/billing'))

WebUI.click(findTestObject('Object Repository/dashboard/billing'))

WebUI.delay(20)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Billing/orderNo'), 120)

/*************************************Search by all Combination***************************************/

if(orderNumber!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/orderNo'), orderNumber)
}
if(orderOffice!='')
{
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Billing/orderOffice'), orderOffice)
}
if(billingMonthFrom!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/billingMonthFrom'), billingMonthFrom)
}
if(billingMonthTo!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/billingMonthTo'), billingMonthTo)
}
if(startBillDateFrom!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/startBillDateFrom'), startBillDateFrom)
}
if(startBillDateTo!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/startBillDateTo'), startBillDateTo)
}
if(claimFillingGroup!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/claimFillingGroup'), claimFillingGroup, false)
}	
if(patientInsurance!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/patientInsurance'), patientInsurance, false)
}
if(patientInsurance.equals('4') || patientInsurance.equals('INSURANCE NAME'))
{
	WebUI.setText(findTestObject('Object Repository/Billing/insuranceName'), patientInsuranceName)			
}
if(insuranceType!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/insuranceType'), insuranceType, false)
}
if(billToShipToPatient!='')
{
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Billing/billToShipToPatient'), billToShipToPatient)
	WebUI.delay(2)
}
if(billToShipToPatientName!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/billToShipToPatientName'), billToShipToPatientName)
}
if(billingPeriod!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/billingPeriod'), billingPeriod, false)
}
if(customerType!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/customerType'), customerType, false)
}
if(itemType!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/itemType'), itemType, false)
}
if(equipmentType!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/equipmentType'), equipmentType)
}
if(hcpcsCode!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/HCPCSCode'), hcpcsCode)
}
if(enteralOrder!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/enteralOrder'), enteralOrder, false)
}
if(oralAdmin!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/oralAdmin'), oralAdmin, false)
}
if(orderBalance!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/orderBalance'), orderBalance, false)
}
if(formBeingTracked!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/formTrack'), formBeingTracked, false)
}
if(checkListConfirm!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/checklist'), checkListConfirm, false)
}
if(billingHold!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/billingHold'), billingHold, false)
}
if(billingHoldReason!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/billingHoldReason'), billingHoldReason)
}
if(stopBillDate!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/stopBillDateOnly'), stopBillDate, false)
}
if(cutOffDate!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/cutOffDate'), cutOffDate)
}
if(lastBillDate!='')
{
	WebUI.setText(findTestObject('Object Repository/Billing/lastBillDateOnly'), lastBillDate)
}
if(noLastBillDateOnly!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/lastBillDateOnly'), noLastBillDateOnly, false)
}
if(orderSortedBy!='')
{
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Billing/orderSortedBy'), orderSortedBy)
}
if(ordersPerPage!='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Billing/orderperPage'), ordersPerPage, false)
}
WebUI.click(findTestObject('Object Repository/Billing/searchButton'))

if(WebUI.verifyElementNotPresent(findTestObject('Object Repository/Billing/noBillableItemFund'), 120))
	print("Billable Item Found")
else
	print("No Billable Item Found")