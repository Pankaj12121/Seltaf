package com.aqm.staf.library.pages.marineHull;

import com.aqm.staf.framework.core.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntVessInformPLREntity;

public class PolicyInsuredIntrestVesselInformationPLR extends BasePage{
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement insuredInterestTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement nextAttributePageTitle;

	private PageElement nextAttributePageTitle2;
	private PageElement nextAttributePageTitle3;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement saveButton;
	//HM
	//PAGE1
	private PageElement typeOfVesselsDropDropdown;
	private PageElement subTypeOfDredgerDropdown;
	private PageElement vesselSubTypeDescriptionTextarea;
	private PageElement iMONoTextarea;
	//page2
	private PageElement nameOfTheInsuredTextarea;
	private PageElement detailsOfInterestButton;
	private PageElement yearOfMakeDropdown;
	private PageElement whetherIsVesselRebuiltDropdown;
	private PageElement nameOfTheVesselTextfield;
	private PageElement assigneemortgageeTextarea;
	private PageElement portOfRegistrationAndAuthorityTextfield;
	//page3
	private PageElement gRTTextField;
	private PageElement makeTypeOfVesselDropDown;
	private PageElement engineTypeOfInlandDredgerOceanGoingDredgerDropDown;
	private PageElement tradingLimitsForInlandDredgeOceanGoingDredgerDropDown;
	//p4
	private PageElement qualificationOfMasterTextField;
	private PageElement numberOfCrewTextField;
	private PageElement sumInsuredTextField;
	private PageElement conditionsForInlandDredgersOceanGoingDredgersDropDown;
	private PageElement warrantyForInlandDredgersOceanGoingDredgersDropDown;
	private PageElement widerWarrantiesTradingLimitsDropDown;
	private PageElement iRSDiscountDropDown;
	private PageElement isAdditinalPerilCoverRequiredDropDown;
	//p5
	private PageElement specialConditionsTextarea;
	private PageElement specialWarrantiesTextarea;
	private PageElement specialWarranties2Textarea;
	private PageElement specialWarranties3Textarea;
	private PageElement specialWarranties4Textarea;
	private PageElement anyClaimExperienceForLast5YearsButton;
	private PageElement presentInsurerIfanyTextarea;
	private PageElement claimDetailButton;
	private PageElement hMDeductibleTextField;
	private PageElement isHOApprovalIsObtainedDropDown;
	private PageElement noClaimsDiscountTextField;
	private PageElement ownersDiscountTextField;
	private PageElement deTariffDiscountTextField;
	//P6
	private PageElement noOfShipsUnderFleetCategoryDropDown;
	private PageElement countryOfRegistrationTextField;
	private PageElement classClassificationCodeDropDown;
	private PageElement classAwarded1Textarea;
	private PageElement classAwarded2Textarea;
	private PageElement detailsOfEngineMachineryTextarea;
	private PageElement aggregateClaimRatioTextField;


	public PolicyInsuredIntrestVesselInformationPLR(WebDriver driver, String pageName) {
		super(driver, pageName);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Policy No.')]/following::td"), "policyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Insured InterestCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured Interest Serial No')]/following::td"), "Insured Interest Serial", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButton=new PageElement(By.name("btnSave"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//
		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//HM
		typeOfVesselsDropDropdown=new PageElement(By.xpath("//td//div[@id='Type of Vessels']/following::select"), "Type of Vessels", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		subTypeOfDredgerDropdown=new PageElement(By.xpath("//td//div[@id='Sub Type of Dredger']/following::select"), "Sub Type of Dredger", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		vesselSubTypeDescriptionTextarea=new PageElement(By.xpath("//td//div[@id='Vessel Sub Type description']/following::textarea"), "Vessel Sub Type description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		iMONoTextarea=new PageElement(By.xpath("//td//div[@id='IMO No.']/following::textarea"), "IMO No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//page2
		nameOfTheInsuredTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the insured", "textarea")), "Name of the insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfInterestButton=new PageElement(By.name(""),"", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		yearOfMakeDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Year of Make", "select")), "Year of Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherIsVesselRebuiltDropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether is Vessel Rebuilt?", "select")), "Whether is Vessel Rebuilt", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nameOfTheVesselTextfield=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Name of the Vessel", "input")), "Name of the Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		assigneemortgageeTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Assignee/Mortgagee", "textarea")), "Name of the Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		portOfRegistrationAndAuthorityTextfield=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Port of Registration and Authority", "input")), "Port of Registration and Authority", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//page3
		gRTTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("GRT", "input")), "GRT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		makeTypeOfVesselDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Make Type of Vessel", "select")), "Make Type of Vessel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		engineTypeOfInlandDredgerOceanGoingDredgerDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Engine Type of Inland Dredger/Ocean Going Dredger", "select")), "Engine Type of Inland", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		tradingLimitsForInlandDredgeOceanGoingDredgerDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Trading Limits for Inland Dredger/Ocean going Dredger", "select")), "", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//p4
		qualificationOfMasterTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Qualification of Master", "input")), "Qualification of Master", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfCrewTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Crew", "input")), "Number of Crew", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured", "input")), "Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		conditionsForInlandDredgersOceanGoingDredgersDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Conditions for Inland Dredgers(or)Ocean Going Dredgers", "select")), "Conditions for Inland", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		warrantyForInlandDredgersOceanGoingDredgersDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Warranty for Inland Dredgers(or)Ocean Going Dredgers", "select")), "Warranty for Inland", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		widerWarrantiesTradingLimitsDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Wider Warranties/Trading Limits", "select")), "Wider Warranties", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iRSDiscountDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("IRS Discount", "select")), "IRS", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isAdditinalPerilCoverRequiredDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is Additinal Peril cover required", "select")), "Is Additinal Peril", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//p5
		specialConditionsTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions", "textarea")), "Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarrantiesTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Warranties", "textarea")), "Warranties", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarranties2Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Warranties 2", "textarea")), "Warranties 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarranties3Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Warranties 3", "textarea")), "Warranties 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialWarranties4Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Warranties 4", "textarea")), "Warranties 4", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		anyClaimExperienceForLast5YearsButton=new PageElement(By.name(""),"", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		presentInsurerIfanyTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Present Insurer(If any)", "textarea")), "Present Insurer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		claimDetailButton=new PageElement(By.name(""),"", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		hMDeductibleTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("HM Deductible", "input")), "HM Deductible", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		isHOApprovalIsObtainedDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is HO Approval is Obtained", "select")), "Is HO Approval", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		noClaimsDiscountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No Claims Discount", "input")), "No Claims", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ownersDiscountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Owners Discount", "input")), "Owners Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		deTariffDiscountTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("De Tariff Discount", "input")), "De Tariff Discount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		//P6
		noOfShipsUnderFleetCategoryDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No. of Ships under Fleet Category", "select")), "No. of Ships under Fleet", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		countryOfRegistrationTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Country of Registration", "input")), "Country of Registration", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		classClassificationCodeDropDown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Class Classification Code", "select")), "Class Classification", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		classAwarded1Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Class Awarded 1", "textarea")), "Class Awarded 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		classAwarded2Textarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Class Awarded 2", "textarea")), "Class Awarded 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfEngineMachineryTextarea=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of Engine Machinery", "textarea")), "Details of Engine Machinery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		aggregateClaimRatioTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Aggregate Claim Ratio", "input")), "Aggregate Claim Ratio", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP0(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				selectValueFromList(typeOfVesselsDropDropdown, polInsIntVessInformPLREntity.getStringValueForField("TypeOfVessels"));
			}

		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP1(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//PAGE1

			
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeOfDredger")) {
				selectValueFromList(subTypeOfDredgerDropdown, polInsIntVessInformPLREntity.getStringValueForField("SubTypeOfDredger"));
			}


			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVesselSubTypeDescription")) {
				clearAndSendKeys(vesselSubTypeDescriptionTextarea, polInsIntVessInformPLREntity.getStringValueForField("VesselSubTypeDescription"));
			}


			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIMONo")) {
				clearAndSendKeys(iMONoTextarea, polInsIntVessInformPLREntity.getStringValueForField("IMONo"));
			}

		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			//PAGE1
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTypeOfVessels")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("TypeOfVessels"), fetchValueFromList(typeOfVesselsDropDropdown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSubTypeOfDredger")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SubTypeOfDredger"), fetchValueFromList(subTypeOfDredgerDropdown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigVesselSubTypeDescription")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("VesselSubTypeDescription"), fetchValueFromTextFields(vesselSubTypeDescriptionTextarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIMONo")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("IMONo"), fetchValueFromTextFields(iMONoTextarea), AssertionType.WARNING);
			}
		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP2(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//page2

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameOfTheInsured")) {
				clearAndSendKeys(nameOfTheInsuredTextarea, polInsIntVessInformPLREntity.getStringValueForField("NameOfTheInsured"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearOfMake")) {
				selectValueFromList(yearOfMakeDropdown, polInsIntVessInformPLREntity.getStringValueForField("YearOfMake"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWhetherIsVesselRebuilt")) {
				selectValueFromList(whetherIsVesselRebuiltDropdown, polInsIntVessInformPLREntity.getStringValueForField("WhetherIsVesselRebuilt"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				clearAndSendKeys(nameOfTheVesselTextfield, polInsIntVessInformPLREntity.getStringValueForField("NameOfTheVessel"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssigneemortgagee")) {
				clearAndSendKeys(assigneemortgageeTextarea, polInsIntVessInformPLREntity.getStringValueForField("Assigneemortgagee"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortOfRegistrationAndAuthority")) {
				clearAndSendKeys(portOfRegistrationAndAuthorityTextfield, polInsIntVessInformPLREntity.getStringValueForField("PortOfRegistrationAndAuthority"));
			}

		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			//page2

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameOfTheInsured")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameOfTheInsured"), fetchValueFromTextFields(nameOfTheInsuredTextarea), AssertionType.WARNING);
			}

			//detailsOfInterestButton;
	
			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigYearOfMake")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("YearOfMake"), fetchValueFromList(detailsOfInterestButton), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWhetherIsVesselRebuilt")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("WhetherIsVesselRebuilt"), fetchValueFromList(whetherIsVesselRebuiltDropdown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNameOfTheVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NameOfTheVessel"), fetchValueFromTextFields(nameOfTheVesselTextfield), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAssigneemortgagee")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("Assigneemortgagee"), fetchValueFromTextFields(assigneemortgageeTextarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPortOfRegistrationAndAuthority")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PortOfRegistrationAndAuthority"), fetchValueFromTextFields(portOfRegistrationAndAuthorityTextfield), AssertionType.WARNING);
			}
		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP3(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//page3

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigGRT")) {
				clearAndSendKeys(gRTTextField, polInsIntVessInformPLREntity.getStringValueForField("GRT"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMakeTypeOfVessel")) {
				selectValueFromList(makeTypeOfVesselDropDown, polInsIntVessInformPLREntity.getStringValueForField("MakeTypeOfVessel"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigEngineTypeOfInlandDredgerOceanGoingDredger")) {
				selectValueFromList(engineTypeOfInlandDredgerOceanGoingDredgerDropDown, polInsIntVessInformPLREntity.getStringValueForField("EngineTypeOfInlandDredgerOceanGoingDredger"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTradingLimitsForInlandDredgeOceanGoingDredger")) {
				selectValueFromList(tradingLimitsForInlandDredgeOceanGoingDredgerDropDown, polInsIntVessInformPLREntity.getStringValueForField("TradingLimitsForInlandDredgeOceanGoingDredger"));
			}

		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			//page3

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigGRT")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("GRT"), fetchValueFromTextFields(gRTTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMakeTypeOfVessel")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("MakeTypeOfVessel"), fetchValueFromList(makeTypeOfVesselDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigEngineTypeOfInlandDredgerOceanGoingDredger")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("EngineTypeOfInlandDredgerOceanGoingDredger"), fetchValueFromList(engineTypeOfInlandDredgerOceanGoingDredgerDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigTradingLimitsForInlandDredgeOceanGoingDredger")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("TradingLimitsForInlandDredgeOceanGoingDredger"), fetchValueFromList(tradingLimitsForInlandDredgeOceanGoingDredgerDropDown), AssertionType.WARNING);
			}
		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP4(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//p4

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigQualificationOfMaster")) {
				clearAndSendKeys(qualificationOfMasterTextField, polInsIntVessInformPLREntity.getStringValueForField("QualificationOfMaster"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNumberOfCrew")) {
				clearAndSendKeys(numberOfCrewTextField, polInsIntVessInformPLREntity.getStringValueForField("NumberOfCrew"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, polInsIntVessInformPLREntity.getStringValueForField("SumInsured"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigConditionsForInlandDredgersOceanGoingDredgers")) {
				selectValueFromList(conditionsForInlandDredgersOceanGoingDredgersDropDown, polInsIntVessInformPLREntity.getStringValueForField("ConditionsForInlandDredgersOceanGoingDredgers"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWarrantyForInlandDredgersOceanGoingDredgers")) {
				selectValueFromList(warrantyForInlandDredgersOceanGoingDredgersDropDown, polInsIntVessInformPLREntity.getStringValueForField("WarrantyForInlandDredgersOceanGoingDredgers"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWiderWarrantiesTradingLimits")) {
				selectValueFromList(widerWarrantiesTradingLimitsDropDown, polInsIntVessInformPLREntity.getStringValueForField("WiderWarrantiesTradingLimits"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIRSDiscount")) {
				selectValueFromList(iRSDiscountDropDown, polInsIntVessInformPLREntity.getStringValueForField("IRSDiscount"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIsAdditinalPerilCoverRequired")) {
				selectValueFromList(isAdditinalPerilCoverRequiredDropDown, polInsIntVessInformPLREntity.getStringValueForField("IsAdditinalPerilCoverRequired"));
			}

		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			//p4

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigQualificationOfMaster")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("QualificationOfMaster"), fetchValueFromTextFields(qualificationOfMasterTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNumberOfCrew")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NumberOfCrew"), fetchValueFromTextFields(numberOfCrewTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigConditionsForInlandDredgersOceanGoingDredgers")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ConditionsForInlandDredgersOceanGoingDredgers"), fetchValueFromList(conditionsForInlandDredgersOceanGoingDredgersDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWarrantyForInlandDredgersOceanGoingDredgers")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("WarrantyForInlandDredgersOceanGoingDredgers"), fetchValueFromList(warrantyForInlandDredgersOceanGoingDredgersDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigWiderWarrantiesTradingLimits")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("WiderWarrantiesTradingLimits"), fetchValueFromList(widerWarrantiesTradingLimitsDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIRSDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("IRSDiscount"), fetchValueFromList(iRSDiscountDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIsAdditinalPerilCoverRequired")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("IsAdditinalPerilCoverRequired"), fetchValueFromList(isAdditinalPerilCoverRequiredDropDown), AssertionType.WARNING);
			}
		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP5(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//p5

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextarea, polInsIntVessInformPLREntity.getStringValueForField("SpecialConditions"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties")) {
				clearAndSendKeys(specialWarrantiesTextarea, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties2")) {
				clearAndSendKeys(specialWarranties2Textarea, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties2"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties3")) {
				clearAndSendKeys(specialWarranties3Textarea, polInsIntVessInformPLREntity.getStringValueForField("Proj"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties4")) {
				clearAndSendKeys(specialWarranties4Textarea, polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties4"));
			}
			//	anyClaimExperienceForLast5YearsButton;
			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPresentInsurerIfany")) {
				clearAndSendKeys(presentInsurerIfanyTextarea, polInsIntVessInformPLREntity.getStringValueForField("PresentInsurerIfany"));
			}
			//claimDetailButton;


			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigHMDeductible")) {
				clearAndSendKeys(hMDeductibleTextField, polInsIntVessInformPLREntity.getStringValueForField("HMDeductible"));
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIsHOApprovalIsObtained")) {
				selectValueFromList(isHOApprovalIsObtainedDropDown, polInsIntVessInformPLREntity.getStringValueForField("IsHOApprovalIsObtained"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNoClaimsDiscount")) {
				clearAndSendKeys(noClaimsDiscountTextField, polInsIntVessInformPLREntity.getStringValueForField("NoClaimsDiscount"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigOwnersDiscount")) {
				clearAndSendKeys(ownersDiscountTextField, polInsIntVessInformPLREntity.getStringValueForField("OwnersDiscount"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDeTariffDiscount")) {
				clearAndSendKeys(deTariffDiscountTextField, polInsIntVessInformPLREntity.getStringValueForField("DeTariffDiscount"));
			}

		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			//p5

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties"), fetchValueFromTextFields(specialWarrantiesTextarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties2")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties2"), fetchValueFromTextFields(specialWarranties2Textarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties3")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties3"), fetchValueFromTextFields(specialWarranties3Textarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSpecialWarranties4")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("SpecialWarranties4"), fetchValueFromTextFields(specialWarranties4Textarea), AssertionType.WARNING);
			}
			//anyClaimExperienceForLast5YearsButton;


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPresentInsurerIfany")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("PresentInsurerIfany"), fetchValueFromTextFields(presentInsurerIfanyTextarea), AssertionType.WARNING);
			}
			//claimDetailButton;


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigHMDeductible")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("HMDeductible"), fetchValueFromTextFields(hMDeductibleTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigIsHOApprovalIsObtained")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("IsHOApprovalIsObtained"), fetchValueFromList(isHOApprovalIsObtainedDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNoClaimsDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NoClaimsDiscount"), fetchValueFromTextFields(noClaimsDiscountTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigOwnersDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("OwnersDiscount"), fetchValueFromTextFields(ownersDiscountTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDeTariffDiscount")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("DeTariffDiscount"), fetchValueFromTextFields(deTariffDiscountTextField), AssertionType.WARNING);
			}
		}
	}
	public void fillPolicyInsuredIntrestVesselInformationPLRP6(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("add") || polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("edit")){
			//P6

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNoOfShipsUnderFleetCategory")) {
				selectValueFromList(noOfShipsUnderFleetCategoryDropDown, polInsIntVessInformPLREntity.getStringValueForField("NoOfShipsUnderFleetCategory"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCountryOfRegistration")) {
				clearAndSendKeys(countryOfRegistrationTextField, polInsIntVessInformPLREntity.getStringValueForField("CountryOfRegistration"));
			}


			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassClassificationCode")) {
				selectValueFromList(classClassificationCodeDropDown, polInsIntVessInformPLREntity.getStringValueForField("ClassClassificationCode"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassAwarded1")) {
				clearAndSendKeys(classAwarded1Textarea, polInsIntVessInformPLREntity.getStringValueForField("ClassAwarded1"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassAwarded2")) {
				clearAndSendKeys(classAwarded2Textarea, polInsIntVessInformPLREntity.getStringValueForField("ClassAwarded2"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDetailsOfEngineMachinery")) {
				clearAndSendKeys(detailsOfEngineMachineryTextarea, polInsIntVessInformPLREntity.getStringValueForField("DetailsOfEngineMachinery"));
			}

			if(polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAggregateClaimRatio")) {
				clearAndSendKeys(aggregateClaimRatioTextField, polInsIntVessInformPLREntity.getStringValueForField("AggregateClaimRatio"));
			}

		}
		else if(polInsIntVessInformPLREntity.getAction().equalsIgnoreCase("verify")){
			//P6

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigNoOfShipsUnderFleetCategory")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("NoOfShipsUnderFleetCategory"), fetchValueFromList(noOfShipsUnderFleetCategoryDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCountryOfRegistration")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("CountryOfRegistration"), fetchValueFromTextFields(countryOfRegistrationTextField), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassClassificationCode")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ClassClassificationCode"), fetchValueFromList(classClassificationCodeDropDown), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassAwarded1")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ClassAwarded1"), fetchValueFromTextFields(classAwarded1Textarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClassAwarded2")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("ClassAwarded2"), fetchValueFromTextFields(classAwarded2Textarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDetailsOfEngineMachinery")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("DetailsOfEngineMachinery"), fetchValueFromTextFields(detailsOfEngineMachineryTextarea), AssertionType.WARNING);
			}

			if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAggregateClaimRatio")) {
				assertReference.assertEquals(polInsIntVessInformPLREntity.getStringValueForField("AggregateClaimRatio"), fetchValueFromTextFields(aggregateClaimRatioTextField), AssertionType.WARNING);
			}
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP1(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP1")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP2(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP2")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP3(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP3")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP4(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP4")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP5(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP5")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickNextButtonPolicyAttributeHMPolicyDetailsP6(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonHMP6")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(nextAttributePageTitle2);
		}
	}
	public void clickOnSaveButton(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigSaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void navigateTobackAttributePage(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCSPolicyDetailsP2(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigForwardButtonWRP2")){			
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle2);
		}
	}

	public void navigateToPolicy(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity){
		if (polInsIntVessInformPLREntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void fillandSubmitPolicyInsuredIntrestAttrubuteVesselTypeAndMHPolInfmn(PolInsIntVessInformPLREntity polInsIntVessInformPLREntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntVessInformPLREntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredIntrestVesselInformationPLRP0(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP1(polInsIntVessInformPLREntity);
			fillPolicyInsuredIntrestVesselInformationPLRP1(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP1(polInsIntVessInformPLREntity);
			fillPolicyInsuredIntrestVesselInformationPLRP2(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP2(polInsIntVessInformPLREntity);
			fillPolicyInsuredIntrestVesselInformationPLRP3(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP3(polInsIntVessInformPLREntity);
			fillPolicyInsuredIntrestVesselInformationPLRP4(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP4(polInsIntVessInformPLREntity);
			clickNextButtonPolicyAttributeHMPolicyDetailsP4(polInsIntVessInformPLREntity);
			fillPolicyInsuredIntrestVesselInformationPLRP5(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP5(polInsIntVessInformPLREntity);
			fillPolicyInsuredIntrestVesselInformationPLRP6(polInsIntVessInformPLREntity, assertReference);
			clickNextButtonPolicyAttributeHMPolicyDetailsP6(polInsIntVessInformPLREntity);
			clickOnSaveButton(polInsIntVessInformPLREntity);
			navigateTobackAttributePage(polInsIntVessInformPLREntity);
			navigateToPolicy(polInsIntVessInformPLREntity);
			navigateToAttribute(polInsIntVessInformPLREntity);
			navigateToInsuredInterest(polInsIntVessInformPLREntity);
			navigateToCoverage(polInsIntVessInformPLREntity);
			navigateToLoan(polInsIntVessInformPLREntity);
			navigateToClientDetails(polInsIntVessInformPLREntity);
			navigateToRelation(polInsIntVessInformPLREntity);
			navigateToPayment(polInsIntVessInformPLREntity);
			navigateToFollowup(polInsIntVessInformPLREntity);
			navigateToDocument(polInsIntVessInformPLREntity);
			navigateTobackAttributePage(polInsIntVessInformPLREntity);
			navigateToInsuredInterestAttributes(polInsIntVessInformPLREntity);
			navigateToInsuredInterestAttachCoverages(polInsIntVessInformPLREntity);
			navigateToInsuredInterestRelations(polInsIntVessInformPLREntity);
			navigateToInsuredInterestPayments(polInsIntVessInformPLREntity);
		}
	}
}
