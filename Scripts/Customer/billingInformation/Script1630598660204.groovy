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

WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/BillingInformation/billingInformation'))
WebUI.click(findTestObject('Object Repository/Customer/Creation/BillingInformation/billingInformation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billSameAsPrimary'))

if(sameAsPrimary.equals("Y"))
	WebUI.check(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billSameAsPrimary'))
	
if(sameAsShipTo.equals("Y"))
	WebUI.check(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billSameAsShipTo'))
	
String lname = WebUI.getText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billLastName'))

if(sameAsShipTo.equals("N") && sameAsPrimary.equals("N") && lname=="")
{
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billLastName'), lastName)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billFirstName'), firstName)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billMiddleName'), middleName)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billAddress'), address)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billAddress2'), address2)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billZipCode'), zipCode)
	WebUI.click(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billPhone'))
	WebUI.delay(5)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billPhone'), phone)
}

WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billHardship'), hardship, false)
if(changeBillToInOrder.equals("Y"))
	WebUI.check(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillToInformation/billChangeBillToInOrder'))
WebUI.delay(2)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billingRate'), billingRate, false)
//WebUI.click(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billTaxable'))	
//
//String xpath =billTaxable+"/option[@value=\'"+billTaxable+"\']";
	
WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billTaxable'), billTaxable, false)

WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billRentalCapMaxDays'), billRentalCapMaxDays)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billProrate'), Integer.parseInt(billProrate))
WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billCreditLimit'), billCreditLimit)

if(bill4Weeks.equals("Y"))
	WebUI.check(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/bill4Weeks'))
	
WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billTerm'), Integer.parseInt(billTerm))
//WebUI.click(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billProrateLastBill'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billProrateLastBill'), billProrateLastBill, false)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/BillingInformation/BillingOption/billingStatement'), Integer.parseInt(billingStatement))
WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/BillingInformation/OfficeSalesPerson/SalesRep'), Integer.parseInt(salesRep))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/BillingInformation/OfficeSalesPerson/RegionalSalesManager'), Integer.parseInt(regSalesMang))
WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/OfficeSalesPerson/sourceOfBusiness'), sourceOfBusiness, FailureHandling.OPTIONAL)
if(rentalCap.equals("Y"))
	WebUI.check(findTestObject('Object Repository/Customer/Creation/BillingInformation/OfficeSalesPerson/rentalCap'))
	
WebUI.switchToDefaultContent()

String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

if(companyName.equals("MEDSOUTHTRAIN"))
	println("Payment will be through AXIA Token")
else
{
	WebUI.click(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardInformationSetup'))
	WebUI.delay(5)
	WebUI.switchToWindowIndex(1)
	WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/addNewCard'))
	WebUI.click(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/addNewCard'))
	WebUI.delay(2)
	WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditcardType'))
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditcardType'), cardType, false)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardAccountNo'), cardNo)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardFirstName'), cardFirstName)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardMiddleName'), cardMiddleName)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardLastName'), cardLastName)
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditcardYear'), cardExpYear)
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditcardMonth'), cardExpMonth)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardCVC'), cardCVC)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditcardDefault'), cardDefault, false)
	WebUI.click(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardSave'))
	
	WebUI.delay(2)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditcardAutoBill'), cardAutoBill, false)
	if(emailReceiptChkBox.equals("Y"))
	{
		WebUI.check(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardEmailReceipt'))
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardEmail'), cardEmail)
	}
	if(cardTextMessage.equals("Y"))
	{
		WebUI.check(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardSendTextMessage'))
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardCellPhone'), cardPhone)
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditcardCellPhoneType'), cardPhoneType)
		
	}
	
	WebUI.click(findTestObject('Object Repository/Customer/Creation/BillingInformation/CreditCardInformation/creditCardSavePlan'))
}
	

WebUI.delay(2)
WebUI.switchToWindowIndex(0)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)