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

WebUI.click(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/guarantor'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorSameasPatient'))	

if(Insurance1.equals("PRIMARY"))
{
	if(SameasPatient.equals("Y"))
		WebUI.click(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorSameasPatient'))
	else
		{
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorLastNameCompany'), LastName)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorFirstName'), FirstName)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorMiddleName'), MiddleInitial)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorSuffix'), Suffix, false)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorDob'), DateOfBirth)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorGender'), Gender, false)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorSSN'), SSN)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorPatientRel'), PatientRelationship, false)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorEmail'), Email)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorAddress'), Address1)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorAddress2'), Address2)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorZipCode'), Zip)
			WebUI.click(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorPhone'))
			WebUI.delay(5)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorPhone'), Phone)
		}
	
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorInsCarrier'), Integer.parseInt(InsuranceCarrier))
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/medicareSecondaryType'), medicareSecondaryType1, FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorPatMemberNo'), PatientMemberNumber)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorMBI'), MBI)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorGroupName'), GroupName)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorGroupNo'), GroupNumber)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorDeductible'), Deductible)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorMemberNo'), MemberNumber)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorParcentgeOfPatResp'), PatientResponsibility)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorInsPay'), InsurancePay)
	
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorExt'), Extension)
	WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorEmployerSchool'), Employer)
	
		if(EffectiveDateCheck.equals("Y"))
		{
			WebUI.check(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorEffectiveDateChkbx'))
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorEffectiveDate'), EffectiveDate)
		}
		if(ExpiryDateCheck.equals("Y"))
		{
			WebUI.check(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorExpDateChkbx'))
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Primary/guarantorExpDate'), ExpiryDate)
		}
		
}
	
	
if(Insurance2.equals("SECONDARY"))
{
	WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorInsuranceType'), Insurance2, false)
	WebUI.delay(5)
	if(SameasPatient2.equals("Y"))
		WebUI.click(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorSameasPatient'))
	else
	{
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorLastNameCompany'), LastName2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorFirstName'), FirstName2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorMiddleName'), MiddleInitial2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorSuffix'), Suffix2, false)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorDob'), DateOfBirth2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorGender'), Gender2, false)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorSSN'), SSN2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorPatientRel'), PatientRelationship2, false)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorEmail'), Email2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorAddress'), Address12)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorAddress2'), Address22)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorZipCode'), Zip2)
		WebUI.click(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorPhone'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorPhone'), Phone2)
	}
	   
		WebUI.click(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorInsCarrier'))
		WebUI.delay(5)
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorInsCarrier'), Integer.parseInt(InsuranceCarrier2))
		WebUI.delay(5)
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/medicareSecondaryType'), medicareSecondaryType2, FailureHandling.OPTIONAL)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorPatMemberNo'), PatientMemberNumber2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorMBI'), MBI2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorGroupName'), GroupName2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorGroupNo'), GroupNumber2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorDeductible'), Deductible2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorMemberNo'), MemberNumber2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorParcentgeOfPatResp'), PatientResponsibility2)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorInsPay'), InsurancePay2)
		
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorExt'), Extension2, FailureHandling.OPTIONAL)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorEmployerSchool'), Employer2)
	
			if(EffectiveDateCheck2.equals("Y"))
			{
				WebUI.check(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorEffectiveDateChkbx'))
				WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorEffectiveDate'), EffectiveDate2)
			}
			if(ExpiryDateCheck2.equals("Y"))
			{
				WebUI.check(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorExpDateChkbx'))
				WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Secondary/guarantorExpDate'), ExpiryDate2)
			}
}		
		
if(Insurance3.equals("TERTIARY"))
{
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorInsuranceType'), Insurance3, false)
	WebUI.delay(10)
	if(SameasPatient3.equals("Y"))
		WebUI.click(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorSameasPatient'))
	else
		{
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorLastNameCompany'), LastName3)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorFirstName'), FirstName3)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorMiddleName'), MiddleInitial3)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorSuffix'), Suffix3, false)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorDob'), DateOfBirth3)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorGender'), Gender3, false)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorSSN'), SSN3)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorPatientRel'), PatientRelationship3, false)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorEmail'), Email3)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorAddress'), Address13)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorAddress2'), Address23)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorZipCode'), Zip3)
			WebUI.click(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorPhone'))
			WebUI.delay(5)
			WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorPhone'), Phone3)
		}
		
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorInsCarrier'), Integer.parseInt(InsuranceCarrier3))
		WebUI.delay(5)
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/medicareSecondaryType'), medicareSecondaryType3, FailureHandling.OPTIONAL)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorPatMemberNo'), PatientMemberNumber3)
		
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorMBI'), MBI3)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorGroupName'), GroupName3)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorGroupNo'), GroupNumber3)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorDeductible'), Deductible3)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorMemberNo'), MemberNumber3)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorParcentgeOfPatResp'), PatientResponsibility3)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorInsPay'), InsurancePay3)
		
		
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorExt'), Extension3)
		WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorEmployerSchool'), Employer3)
		
		
		if(EffectiveDateCheck3.equals("Y"))
			{
				WebUI.check(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorEffectiveDateChkbx'))
				WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorEffectiveDate'), EffectiveDate3)
			}
		if(ExpiryDateCheck3.equals("Y"))
			{
				WebUI.check(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorExpDateChkbx'))
				WebUI.setText(findTestObject('Object Repository/Customer/Creation/GuarantorInformation/Tertiary/guarantorExpDate'), ExpiryDate3)
			}
}


