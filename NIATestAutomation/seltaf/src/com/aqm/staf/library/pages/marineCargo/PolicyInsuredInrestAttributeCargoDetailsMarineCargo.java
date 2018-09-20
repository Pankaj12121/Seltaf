package com.aqm.staf.library.pages.marineCargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolInsIntAttCarDetMCEntity;


public class PolicyInsuredInrestAttributeCargoDetailsMarineCargo extends BasePage {
	//DIGVIJAY  prod AT
	private PageElement annualPremiumOnTotalProvisionalAnnualSumInsuredTextField;
	private PageElement whetherFOBCoverRequiredDropDown;
	private PageElement yearTextField;
	private PageElement majorCommodityDropDown;
	private PageElement transitDetailsOpenButton;
	private PageElement limitPerAnyOneAircraftTextField;
	private PageElement limitPerAnyOneVesselTextField;
	private PageElement limitPerAnyOneRegisteredPostParcelTextField;
	private PageElement limitPerRoadVehicleRailTextField;
	private PageElement limitPerLocationTextField;
	private PageElement whetherFullVesselLoadShipmentsWillBeEffectedDropDown;
	private PageElement excessApplicableDropDown;
	private PageElement sellersContingencyInsuranceApplicableDropDown;
	//private PageElement storageApplicableDropDown;
	private PageElement shutoutCargoApplicableDropDown;
	//	private PageElement machineryDropDown;
	//private PageElement secondHandDropDown;
	private PageElement paymentFrequencyForATDropDown;
	//private PageElement specialConditionsTextArea;
	private PageElement basisOfPremiumComputationForATDropDown;
	private PageElement limitPerLocationClauseDropDown;
	private PageElement machinerySubjectToClauseDropDown;
	private PageElement detailsOfClausesApplicableOpenButton;

	private PageElement modeOfTransportsDropDown;
	private PageElement landConveyanceCodeCDropDown;
	private PageElement fromPlaceTextArea;
	private PageElement toPlaceTextArea;

	private PageElement serialNoTextFieldOfNextWindow;
	private PageElement transitTypeForATDropDownOfNextWindow;
	private PageElement riskCoveredForATDropDownOfNextWindow; 
	private PageElement cargoClauseApplicableDropDownOfNextWindow; 
	private PageElement wARSRCCClauseApplicableDropDownOfNextWindow;
	private PageElement deleteButtonOfNextWindow;
	private PageElement saveButtonOfNextWindow;
	private PageElement closeButtonOfNextWindow; 
	//DIGVIJAY  prod AN
	private PageElement declarationBookStartNoTextField;
	private PageElement declarationBookEndNoTextField;
	private PageElement whetherOverDimensionalDropDown;
	private PageElement basisOfValuationForAnnualPolicyDropDown;
	private PageElement typeOfBillDropDown;
	private PageElement billNumberTextArea;
	private PageElement billDateTextField;
	private PageElement markNumberTextArea;
	private PageElement typeOfPostDropDown;
	private PageElement typeOfCarrierDropDown;
	private PageElement carrierLimitedLiabilityDropDown;
	//DIGVIJAY Prod-SV
	private PageElement transitTypeDropDown;
	private PageElement totalLossOnlyDropDown;
	//DIGVIJAY Prod-SI
	private PageElement transporterNameTextArea;

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

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;
	//DI-rajkumar -2ND PAGE
	//private PageElement transporterNameTextArea;

	//TC /*-rajkumar-2ND PAGE

	private PageElement estateNameTextField;
	private PageElement estateAddressTextField;
	private PageElement totalCropAreaOfEstateTextField;
	private PageElement nurseryCropAreaInHectaresTextField;
	private PageElement minimumElevationTextField;
	private PageElement averageElevationTextField;
	private PageElement approxDateOfCommencementOfPluckingTextField;
	private PageElement approxDateOfTerminationOfPluckingTextField;
	private PageElement periodOfPluckingInMonthsTextField;
	private PageElement ratioOfGreenLeafToMadeTeaTextField;
	private PageElement averageMadeTeaProducedInLastThreeyearsTextField;
	private PageElement basisOfValuationForTeaCropDropDown;
	private PageElement valuePerKgForInlandTextField;
	private PageElement natureOfPackingForTeaTextArea;

	//  private PageElement deleteButtonOfNextWindow;
	//private PageElement saveButtonOfNextWindow;
	//private PageElement closeButtonOfNextWindow;
	//OP DHK
	private PageElement sRCCApplicableDropDown;
	private PageElement storageApplicableDropDown;
	private PageElement typeofStorageDropDown;
	private PageElement sRCCCargoclauseapplicableDropDown;
	private PageElement placeofStorageTextArea;
	private PageElement sRCCRateTextField;
	private PageElement storageDurationInDaysTextField;
	private PageElement storageRateTextField;
	//CC DHK
	private PageElement transitTypeforOCDropDown;
	private PageElement commodityTypeDropDown;
	private PageElement packagingDropDown;
	private PageElement consigneeTextArea;
	private PageElement commodityDescriptionTextArea;
	private PageElement otherCommodityDescriptionTextArea;
	private PageElement packagingDescriptionTextArea;
	private PageElement otherCityNameTextField;
	private PageElement exportToCityTextField;
	private PageElement exportToCountryTextField;
	private PageElement vesselCodeTextField;
	private PageElement journeyStartDateTextField;
	//Vessel Code find
	private PageElement vesselNameTextField;
	private PageElement backButtons;
	private PageElement searchButton;
	private PageElement vesselCodeClickButton;
	private PageElement vesselCodeToBeSelectedLink;
	//Export to Country Find
	private PageElement exportToCountryClickButton;
	private PageElement countrySearchTextField;
	private PageElement countrySearchToBeSelectedLink;
	private PageElement contrySearchFindButton;

	private PageElement exportToCityClickButton;
	private PageElement citySearchTextField;
	private PageElement citySearchFindButton;
	private PageElement citySearchToBeSelectedLink;


	//OC DHK
	private PageElement excessapplicableDropDown;
	private PageElement excessApplicablOnDropDown;
	private PageElement sellersContingencyApplicableDropDown;
	private PageElement storageApplicableOCDropDown;
	private PageElement shutoutcargoApplicableDropDown;
	private PageElement basisOfValuationForOCDropDown;
	private PageElement machineryDropDown;
	private PageElement secondHandDropDown;
	private PageElement whetherOverDimensionalCargotobecoveredDropDown;
	private PageElement typeOfStorageDropDown;
	private PageElement machinerysubjecttoclauseDropDown;
	private PageElement excessClaimAmountTextField;
	private PageElement excessOthersTextField;
	private PageElement excessSITextField;
	private PageElement numberOfDaysTextField;
	private PageElement storageRateOCTextField;
	private PageElement noOfdaysTextField;
	private PageElement shutoutCargoRateTextField;
	private PageElement extraTextField;
	private PageElement underInsurancepercentTextField;
	private PageElement specialConditionsTextArea;
	private PageElement detailsOfClausesApplicableOpenButtonForOC;
	private PageElement aPDAccountNoFindButtonOfOC;
	//OC OPEN BUTTON DHK
	private PageElement transitTypeforOCNextDropDown;
	private PageElement commodityTypeNextDropDown;
	private PageElement packagingNextDropDown;
	private PageElement riskCoveredforOCDropDown;
	private PageElement cargoClauseApplicableDropDown;
	private PageElement wARSRCCClauseApplicableDropDown;


	public PolicyInsuredInrestAttributeCargoDetailsMarineCargo(WebDriver driver, String pageName) {
		super(driver, pageName);
		//DIGVIJAY  prod AT
		annualPremiumOnTotalProvisionalAnnualSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Annual Premium on Total (Provisional) Annual Sum Insure')]/following::input"), "Annual Premium on Total (Provisional) Annual Sum Insure", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherFOBCoverRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether FOB cover required')]/following::select"), "Whether FOB cover required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearTextField=new PageElement(By.xpath("//td//div[contains(text(),'Year')]/following::input"), "Year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		majorCommodityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Major Commodity')]/following::select"), "Major Commodity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transitDetailsOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Transit Details')]/following::input"), "OTransit Details open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		limitPerAnyOneAircraftTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit per any one Aircraft')]/following::input"), "Limit per any one Aircraft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerAnyOneVesselTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit per any one Vessel')]/following::input"), "Limit per any one Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerAnyOneRegisteredPostParcelTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit per any one Registered Post Parcel')]/following::input"), "Limit per any one Registered Post Parcel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerRoadVehicleRailTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit per Road Vehicle/Rail')]/following::input"), "Limit per Road Vehicle/Rail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerLocationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Location')]/following::input"), "Limit Per Location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherFullVesselLoadShipmentsWillBeEffectedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether full vessel load shipment(s) will be effected?')]/following::select"), "Whether full vessel load shipment will be effected", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess applicable')]/following::select"), "Excess applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sellersContingencyInsuranceApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sellers Contingency Insurance Applicable')]/following::select"), "Sellers Contingency Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		storageApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Storage Applicable')]/following::select"), "Storage Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		shutoutCargoApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Shutout cargo Applicable')]/following::select"), "Shutout cargo Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machineryDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Machinery')]/following::select"), "Machinery", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		secondHandDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Second Hand')]/following::select"), "Second Hand", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		paymentFrequencyForATDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Payment Frequency for AT')]/following::select"), "Payment Frequency for AT", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialConditionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::textarea"), "Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basisOfPremiumComputationForATDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Premium Computation for AT')]/following::select"), "Basis of Premium Computation for AT", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitPerLocationClauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Location Clause')]/following::select"), "Limit Per Location Clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machinerySubjectToClauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Machinery subject to clause')]/following::select"), "Machinery subject to clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfClausesApplicableOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Details of Clauses Applicable')]/following::input"), "Details of Clauses Applicable", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		serialNoTextFieldOfNextWindow=new PageElement(By.name("slNo0"), "serialNoTextFieldOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		transitTypeForATDropDownOfNextWindow=new PageElement(By.name("Data_232176127082010_0"), "transitTypeForATDropDownOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskCoveredForATDropDownOfNextWindow=new PageElement(By.name("Data_232177527082010_0"), "riskCoveredForATDropDownOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cargoClauseApplicableDropDownOfNextWindow=new PageElement(By.name("Data_317445912022014_0"), "cargoClauseApplicableDropDownOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		wARSRCCClauseApplicableDropDownOfNextWindow=new PageElement(By.name("Data_317443712022014_0"), "wARSRCCClauseApplicableDropDownOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//DIGVIJAY  prod AN
		declarationBookStartNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Book Start No')]/following::input"), "Declaration Book Start No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationBookEndNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Book End No')]/following::input"), "Declaration Book End No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherOverDimensionalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether over-dimensional')]/following::select"), "Whether over-dimensional", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForAnnualPolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Valuation for Annual Policy')]/following::select"), "Basis of Valuation for Annual Policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfBillDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Bill')]/following::select"), "Type of Bill", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		billNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Bill Number')]/following::textarea"), "Bill Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		billDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Bill Date')]/following::input"), "Bill Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		markNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Mark Number')]/following::textarea"), "Mark Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfPostDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Post')]/following::select"), "Type of Post", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfCarrierDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Carrier')]/following::select"), "Type of Carrier", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		carrierLimitedLiabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Carrier Limited Liability')]/following::select"), "Carrier Limited Liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//DIGVIJAY Prod-SV
		transitTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type')]/following::select"), "Transit Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalLossOnlyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Total Loss Only')]/following::select"), "Total Loss Only", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//DIGVIJAY Prod-SI
		transporterNameTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Transporter Name')]/following::textarea"), "Transporter Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

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
		//
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
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quotation Details')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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

		//DI-rajkumar
		transporterNameTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Transporter Name')]/following::textarea"), "Transporter Name List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//TC -rajkumar-2ND PAGE

		estateNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Estate Name')]/following::textarea"), "Estate Name TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estateAddressTextField=new PageElement(By.xpath("//td//div[contains(text(),'Estate Address')]/following::textarea"), "Estate Address TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalCropAreaOfEstateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Crop Area of Estate.(In Hectares)')]/following::input"), "Total Crop Area of Estate In Hectares TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nurseryCropAreaInHectaresTextField=new PageElement(By.xpath("//td//div[contains(text(),'Nursery Crop Area(In Hectares)')]/following::input"), "Nursery Crop Area In Hectares TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		minimumElevationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Average Elevation')]/following::input"), "Minimum Elevation TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		averageElevationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Average Elevation')]/following::input"), "Average Elevation TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		approxDateOfCommencementOfPluckingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approx Date of commencement of plucking')]/following::input"), "Approx Date Of Commencement Of Plucking Date Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		approxDateOfTerminationOfPluckingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approx date of termination of plucking')]/following::input"), "Approx Date Of Termination Of Plucking Date Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);


		periodOfPluckingInMonthsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Period of plucking in months')]/following::input"), "Period Of Plucking In Months Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ratioOfGreenLeafToMadeTeaTextField=new PageElement(By.xpath("//td//div[contains(text(),'%)Ratio of green leaf to made tea.')]/following::input"), "Ratio Of Green Leaf To Made Tea Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		averageMadeTeaProducedInLastThreeyearsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Average made tea produced in last 3 years')]/following::input"), "Average Made Tea Produced In Last Three years", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForTeaCropDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Valuation for Tea Crop')]/following::select"), "Basis Of Valuation For Tea Crop List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		valuePerKgForInlandTextField=new PageElement(By.xpath("//td//div[contains(text(),'Value per kg for Inland')]/following::input"), "Value Per Kg For Inland Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		natureOfPackingForTeaTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Packing For Tea')]/following::textarea"), "Nature Of Packing For Tea Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//OP DHK
		sRCCRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'SRCC Rate(%)')]/following::input"), "SRCC Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		storageDurationInDaysTextField=new PageElement(By.xpath("//td//div[contains(text(),'Storage Duration in Days')]/following::input"), "Storage Duration in Days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		storageRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Storage Rate(%)')]/following::input"), "Storage Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sRCCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'SRCC Applicable')]/following::select"), "SRCC Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		storageApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Storage Applicable')]/following::select"), "Storage Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeofStorageDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Storage')]/following::select"), "Type of Storage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sRCCCargoclauseapplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'SRCC (Cargo) clause applicable')]/following::select"), "SRCC (Cargo) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		placeofStorageTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Place of Storage')]/following::textarea"), "Place of Storage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//27
		vesselCodeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Vessel Code')]/following::input"), "Vessel Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vesselNameTextField=new PageElement(By.name("pVesselName"), "Vessel Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButtons=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		vesselCodeClickButton=new PageElement(By.xpath("//td//div[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"), "Vessel Code Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		exportToCountryClickButton=new PageElement(By.xpath("//td//div[contains(text(),'Country')]/following::input/following::a[@name='firstFocus']"), "Export to Country Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		exportToCountryTextField= new PageElement(By.xpath("//td//div[contains(text(),'Export to Country')]/following::input"), "Export to Country", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countrySearchTextField=new PageElement(By.name("cntcty"), "Country Search Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		contrySearchFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Country Search')]/following::input/following::a[@name='firstFocus']"), "Country Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		exportToCityTextField= new PageElement(By.xpath("//td//div[contains(text(),'Export to City')]/following::input"), "Export to City", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exportToCityClickButton=new PageElement(By.xpath("//td//div[contains(text(),'City')]/following::input/following::a[@name='firstFocus']"), "Export to Country Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		citySearchTextField=new PageElement(By.name("cntcty"), "City Search Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		citySearchFindButton=new PageElement(By.xpath("//td//b[contains(text(),'City Search')]/following::input/following::a[@name='firstFocus']"), "City Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);



		//CC DHK
		transitTypeforOCDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type for OC')]/following::select"), "Transit Type for OC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Type')]/following::select"), "Commodity Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		packagingDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Packaging')]/following::select"), "Packaging", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherCityNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Other City name')]/following::input"), "Other City name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consigneeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee')]/following::textarea"), "Consignee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Description')]/following::textarea"), "Commodity Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherCommodityDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Other Commodity Description')]/following::textarea"), "Other Commodity Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Packaging Description')]/following::textarea"), "Packaging Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		journeyStartDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Journey Start Date')]/following::input"), "Journey Start Date", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//OC DHK
		excessapplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess applicable')]/following::select"), "Excess applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessApplicablOnDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess Applicable on')]/following::select"), "Excess Applicable on", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sellersContingencyApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sellers Contingency Applicable')]/following::select"), "Sellers Contingency Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		storageApplicableOCDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Storage Applicable')]/following::select"), "Storage Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		shutoutcargoApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Shutout cargo Applicable')]/following::select"), "Shutout cargo Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForOCDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Valuation for OC')]/following::select"), "Basis of Valuation for OC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machineryDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Machinery')]/following::select"), "Machinery", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		secondHandDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Second Hand')]/following::select"), "Second Hand", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherOverDimensionalCargotobecoveredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Over Dimensional cargo to be covered?')]/following::select"), "Whether Over Dimensional cargo to be covered?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machinerysubjecttoclauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Machinery subject to clause')]/following::select"), "Machinery subject to clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfStorageDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Storagee')]/following::select"), "Type of Storage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessOthersTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess(%) Others')]/following::input"), "Excess(%) Others", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessSITextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess(%) SI')]/following::input"), "Excess(%) SI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessClaimAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess(%) Claim Amount')]/following::input"), "Excess(%) Claim Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfDaysTextField=new PageElement(By.xpath("//td//div[contains(text(),'Number of Days')]/following::input"), "Number of Days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		storageRateOCTextField=new PageElement(By.xpath("//td//div[contains(text(),'Storage Rate(%)')]/following::input"), "Storage Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		shutoutCargoRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Shutout Cargo Rate(%)')]/following::input"), "Shutout Cargo Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extraTextField=new PageElement(By.xpath("//td//div[contains(text(),'% Extra')]/following::input"), "% Extra", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underInsurancepercentTextField=new PageElement(By.xpath("//td//div[contains(text(),'Under insurance percent')]/following::input"), "Under insurance percent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//aPDAccountNoFindButtonOfOC=new PageElement(By.xpath("//td//div[contains(text(),'SRCC Rate(%)')]/following::input"), "SRCC Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfdaysTextField=new PageElement(By.xpath("//td//div[contains(text(),'No of days')]/following::input"), "No of days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::input"), "Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfClausesApplicableOpenButtonForOC= new PageElement(By.name("propValues24"), "Details of Clauses Applicable", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//detailsOfClausesApplicableOpenButtonForOC 
		transitTypeforOCNextDropDown=new PageElement(By.name("Data_232182127082010_0"), "Transit Type for OC ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityTypeNextDropDown=new PageElement(By.name("Data_213906805022010_0"), "Commodity Type ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingNextDropDown=new PageElement(By.name("Data_213910205022010_0"), "Packaging ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskCoveredforOCDropDown=new PageElement(By.name("Data_232189327082010_0"), "Risk Covered for OC", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cargoClauseApplicableDropDown=new PageElement(By.name("Data_317445912022014_0"), "Cargo Clause Applicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		wARSRCCClauseApplicableDropDown=new PageElement(By.name("Data_317443712022014_0"), "WAR / SRCC Clause Applicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void fillPolicyInsuredInrestAttributeCargoDetailsMarineCargo(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("add") || polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("edit")){
			//DIGVIJAY  prod AT
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAnnualPremiumOnTotalProvisionalAnnualSumInsured")) {
				clearAndSendKeys(annualPremiumOnTotalProvisionalAnnualSumInsuredTextField, polInsIntAttCarDetMCEntity.getStringValueForField("AnnualPremiumOnTotalProvisionalAnnualSumInsured"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherFOBCoverRequired")) {
				selectValueFromList(whetherFOBCoverRequiredDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherFOBCoverRequired"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigYear")) {
				clearAndSendKeys(yearTextField, polInsIntAttCarDetMCEntity.getStringValueForField("Year"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMajorCommodity")) {
				selectValueFromList(majorCommodityDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("MajorCommodity"));
			}
			// button
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitDetails")) {
				fillTransitDetailsButton(polInsIntAttCarDetMCEntity);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneAircraft")) {
				clearAndSendKeys(limitPerAnyOneAircraftTextField, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneAircraft"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneVessel")) {
				clearAndSendKeys(limitPerAnyOneVesselTextField, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneVessel"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneRegisteredPostParcel")) {
				clearAndSendKeys(limitPerAnyOneRegisteredPostParcelTextField, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneRegisteredPostParcel"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerRoadVehicleRail")) {
				clearAndSendKeys(limitPerRoadVehicleRailTextField, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerRoadVehicleRail"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocation")) {
				clearAndSendKeys(limitPerLocationTextField, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocation"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherFullVesselLoadShipmentsWillBeEffected")) {
				selectValueFromList(whetherFullVesselLoadShipmentsWillBeEffectedDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherFullVesselLoadShipmentsWillBeEffected"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessApplicable")) {
				selectValueFromList(excessApplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSellersContingencyInsuranceApplicable")) {
				selectValueFromList(sellersContingencyInsuranceApplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("SellersContingencyInsuranceApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicable")) {
				selectValueFromList(storageApplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoApplicable")) {
				selectValueFromList(shutoutCargoApplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinery")) {
				selectValueFromList(machineryDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("Machinery"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSecondHand")) {
				selectValueFromList(secondHandDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("SecondHand"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPaymentFrequencyForAT")) {
				selectValueFromList(paymentFrequencyForATDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("PaymentFrequencyForAT"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("SpecialConditions"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfPremiumComputationForAT")) {
				selectValueFromList(basisOfPremiumComputationForATDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfPremiumComputationForAT"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocationClause")) {
				selectValueFromList(limitPerLocationClauseDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocationClause"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinerySubjectToClause")) {
				selectValueFromList(machinerySubjectToClauseDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("MachinerySubjectToClause"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicable")) {
				fillDetailsOfClausesApplicableForAT(polInsIntAttCarDetMCEntity);
			}
			//DIGVIJAY  prod AN
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeclarationBookStartNo")) {
				clearAndSendKeys(declarationBookStartNoTextField, polInsIntAttCarDetMCEntity.getStringValueForField("DeclarationBookStartNo"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeclarationBookEndNo")) {
				clearAndSendKeys(declarationBookEndNoTextField, polInsIntAttCarDetMCEntity.getStringValueForField("DeclarationBookEndNo"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherOverDimensional")) {
				selectValueFromList(whetherOverDimensionalDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherOverDimensional"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForAnnualPolicy")) {
				selectValueFromList(basisOfValuationForAnnualPolicyDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForAnnualPolicy"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfBill")) {
				selectValueFromList(typeOfBillDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfBill"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBillNumber")) {
				clearAndSendKeys(billNumberTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("BillNumber"));;
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBillDate")) {
				String billdate=RandomCodeGenerator.dateGenerator(polInsIntAttCarDetMCEntity.getStringValueForField("BillDate"));
				clearAndEnterDate(billDateTextField, billdate);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMarkNumber")) {
				clearAndSendKeys(markNumberTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("MarkNumber"));
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfPost")) {
				selectValueFromList(typeOfPostDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfPost"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfCarrier")) {
				selectValueFromList(typeOfCarrierDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfCarrier"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCarrierLimitedLiability")) {
				selectValueFromList(carrierLimitedLiabilityDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("CarrierLimitedLiability"));
			}

			//DIGVIJAY Prod-SV
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitType")) {
				selectValueFromList(transitTypeDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("TransitType"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
				selectValueFromList(totalLossOnlyDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("TotalLossOnly"));
			}
			//DIGVIJAY Prod-SI
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransporterName")) {
				clearAndSendKeys(transporterNameTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("TransporterName"));
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransporterName")) {
				clearAndSendKeys(transporterNameTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("TransporterName"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPeriodOfPluckingInMonths")) {
				clearAndSendKeys(periodOfPluckingInMonthsTextField, polInsIntAttCarDetMCEntity.getStringValueForField("PeriodOfPluckingInMonths"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRatioOfGreenLeafToMadeTea")) {
				clearAndSendKeys(ratioOfGreenLeafToMadeTeaTextField, polInsIntAttCarDetMCEntity.getStringValueForField("RatioOfGreenLeafToMadeTea"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAverageMadeTeaProducedInLastThreeyears")) {
				clearAndSendKeys(averageMadeTeaProducedInLastThreeyearsTextField, polInsIntAttCarDetMCEntity.getStringValueForField("AverageMadeTeaProducedInLastThreeyears"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForTeaCrop")) {
				selectValueFromList(basisOfValuationForTeaCropDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForTeaCrop"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigValuePerKgForInland")) {
				clearAndSendKeys(valuePerKgForInlandTextField, polInsIntAttCarDetMCEntity.getStringValueForField("ValuePerKgForInland"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNatureOfPackingForTea")) {
				clearAndSendKeys(natureOfPackingForTeaTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("NatureOfPackingForTea"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigApproxDateOfCommencementOfPlucking")) {
				String commencementOfPluckingDateField=RandomCodeGenerator.dateGenerator(polInsIntAttCarDetMCEntity.getStringValueForField("ApproxDateOfCommencementOfPlucking"));
				clearAndEnterDate(approxDateOfCommencementOfPluckingTextField, commencementOfPluckingDateField);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigApproxDateOfTerminationOfPlucking")) {
				String terminationOfPluckingDateField=RandomCodeGenerator.dateGenerator(polInsIntAttCarDetMCEntity.getStringValueForField("ApproxDateOfTerminationOfPlucking"));
				clearAndEnterDate(approxDateOfTerminationOfPluckingTextField, terminationOfPluckingDateField);
			}
			//OP
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCApplicable")) {
				selectValueFromList(sRCCApplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("SRCCApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicable")) {
				selectValueFromList(storageApplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeofStorage")) {
				selectValueFromList(typeofStorageDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("TypeofStorage"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCCargoclauseapplicable")) {
				selectValueFromList(sRCCCargoclauseapplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("SRCCCargoclauseapplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCRate")) {
				clearAndSendKeys(sRCCRateTextField, polInsIntAttCarDetMCEntity.getStringValueForField("SRCCRate"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageDurationInDays")) {
				clearAndSendKeys(storageDurationInDaysTextField, polInsIntAttCarDetMCEntity.getStringValueForField("StorageDurationInDays"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigstorageRate")) {
				clearAndSendKeys(storageRateTextField, polInsIntAttCarDetMCEntity.getStringValueForField("storageRate"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPlaceofStorage")) {
				clearAndSendKeys(placeofStorageTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("PlaceofStorage"));
			}
			//CC
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigJourneyStartDate")){
				String dateOfFirstPolicy=RandomCodeGenerator.dateGenerator(polInsIntAttCarDetMCEntity.getStringValueForField("JourneyStartDate"));
				clearAndEnterDate(journeyStartDateTextField, dateOfFirstPolicy);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitTypeforOC")) {
				selectValueFromList(transitTypeforOCDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("transitTypeforOC"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigcCommodityType")) {
				selectValueFromList(commodityTypeDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("commodityType"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackaging")) {
				selectValueFromList(packagingDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("Packaging"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherCityName")) {
				clearAndSendKeys(otherCityNameTextField, polInsIntAttCarDetMCEntity.getStringValueForField("OtherCityName"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCommodityDescription")) {
				clearAndSendKeys(commodityDescriptionTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("CommodityDescription"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherCommodityDescription")) {
				clearAndSendKeys(otherCommodityDescriptionTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("OtherCommodityDescription"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackagingDescription")) {
				clearAndSendKeys(packagingDescriptionTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("PackagingDescription"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigConsignee")) {
				clearAndSendKeys(consigneeTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("Consignee"));
			}
			//OC
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessapplicable")) {
				selectValueFromList(excessapplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("Excessapplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessApplicablOn")) {
				selectValueFromList(excessApplicablOnDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessApplicablOn"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSellersContingencyApplicable")) {
				selectValueFromList(sellersContingencyApplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("SellersContingencyApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicableOC")) {
				selectValueFromList(storageApplicableOCDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicableOC"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutcargoApplicable")) {
				selectValueFromList(shutoutcargoApplicableDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutcargoApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForOC")) {
				selectValueFromList(basisOfValuationForOCDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForOC"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinery")) {
				selectValueFromList(machineryDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("Machinery"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSecondHand")) {
				selectValueFromList(secondHandDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("SecondHand"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherOverDimensionalCargotobecovered")) {
				selectValueFromList(whetherOverDimensionalCargotobecoveredDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherOverDimensionalCargotobecovered"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinerysubjecttoclause")) {
				selectValueFromList(machinerysubjecttoclauseDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("Machinerysubjecttoclause"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfStorage")) {
				selectValueFromList(typeOfStorageDropDown, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfStorage"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessClaimAmount")) {
				clearAndSendKeys(excessClaimAmountTextField, polInsIntAttCarDetMCEntity.getStringValueForField("excessClaimAmount"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNumberOfDays")) {
				clearAndSendKeys(numberOfDaysTextField, polInsIntAttCarDetMCEntity.getStringValueForField("NumberOfDays"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigstorageRateOC")) {
				clearAndSendKeys(storageRateOCTextField, polInsIntAttCarDetMCEntity.getStringValueForField("storageRateOC"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNoOfdays")) {
				clearAndSendKeys(noOfdaysTextField, polInsIntAttCarDetMCEntity.getStringValueForField("noOfdays"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigshutoutCargoRate")) {
				clearAndSendKeys(shutoutCargoRateTextField, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoRate"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigUnderInsurancepercent")) {
				clearAndSendKeys(underInsurancepercentTextField, polInsIntAttCarDetMCEntity.getStringValueForField("UnderInsurancepercent"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherCityName")) {
				clearAndSendKeys(otherCityNameTextField, polInsIntAttCarDetMCEntity.getStringValueForField("OtherCityName"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("SpecialConditions"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExtra")) {
				clearAndSendKeys(extraTextField, polInsIntAttCarDetMCEntity.getStringValueForField("Extra"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicableOpenButtonForOC")) {
				FillDetailsOfClausesApplicableOpenButtonForOC(polInsIntAttCarDetMCEntity);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigFillVesselCodeSearch")) {
				fillVesselCodeSearch(polInsIntAttCarDetMCEntity);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCountry")) {
				fillExportToCountry(polInsIntAttCarDetMCEntity);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCity")) {
				fillExportToCity(polInsIntAttCarDetMCEntity);
			}

		}
		else if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("verify")){
			//DIGVIJAY  prod AT
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAnnualPremiumOnTotalProvisionalAnnualSumInsured")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("AnnualPremiumOnTotalProvisionalAnnualSumInsured"), fetchValueFromTextFields(annualPremiumOnTotalProvisionalAnnualSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherFOBCoverRequired")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("WhetherFOBCoverRequired"), fetchValueFromList(whetherFOBCoverRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigYear")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Year"), fetchValueFromTextFields(yearTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMajorCommodity")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("MajorCommodity"), fetchValueFromList(majorCommodityDropDown), AssertionType.WARNING);
			}
			// button
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitDetails")) {
				verifyTransitDetailsButton(polInsIntAttCarDetMCEntity, assertReference);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneAircraft")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneAircraft"), fetchValueFromTextFields(limitPerAnyOneAircraftTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneVessel")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneVessel"), fetchValueFromTextFields(limitPerAnyOneVesselTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneRegisteredPostParcel")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneRegisteredPostParcel"), fetchValueFromTextFields(limitPerAnyOneRegisteredPostParcelTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerRoadVehicleRail")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerRoadVehicleRail"), fetchValueFromTextFields(limitPerRoadVehicleRailTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocation")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocation"), fetchValueFromTextFields(limitPerLocationTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherFullVesselLoadShipmentsWillBeEffected")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("WhetherFullVesselLoadShipmentsWillBeEffected"), fetchValueFromList(whetherFullVesselLoadShipmentsWillBeEffectedDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessApplicable"), fetchValueFromList(excessApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSellersContingencyInsuranceApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SellersContingencyInsuranceApplicable"), fetchValueFromList(sellersContingencyInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicable"), fetchValueFromList(storageApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoApplicable"), fetchValueFromList(shutoutCargoApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinery")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Machinery"), fetchValueFromList(machineryDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSecondHand")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SecondHand"), fetchValueFromList(secondHandDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPaymentFrequencyForAT")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PaymentFrequencyForAT"), fetchValueFromList(paymentFrequencyForATDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfPremiumComputationForAT")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfPremiumComputationForAT"), fetchValueFromList(basisOfPremiumComputationForATDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocationClause")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocationClause"), fetchValueFromList(limitPerLocationClauseDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinerySubjectToClause")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("MachinerySubjectToClause"), fetchValueFromList(machinerySubjectToClauseDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicable")) {
				verifyDetailsOfClausesApplicableForAT(polInsIntAttCarDetMCEntity, assertReference);
			}
			//DIGVIJAY  prod AN
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeclarationBookStartNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("DeclarationBookStartNo"), fetchValueFromTextFields(declarationBookStartNoTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeclarationBookEndNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("DeclarationBookEndNo"), fetchValueFromTextFields(declarationBookEndNoTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherOverDimensional")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("WhetherOverDimensional"), fetchValueFromList(whetherOverDimensionalDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForAnnualPolicy")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForAnnualPolicy"), fetchValueFromList(basisOfValuationForAnnualPolicyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfBill")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfBill"), fetchValueFromList(typeOfBillDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBillNumber")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BillNumber"), fetchValueFromTextFields(billNumberTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBillDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttCarDetMCEntity.getStringValueForField("BillDate")) ,fetchValueFromTextFields(billDateTextField),AssertionType.WARNING);
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMarkNumber")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("MarkNumber"), fetchValueFromTextFields(markNumberTextArea), AssertionType.WARNING);
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfPost")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfPost"), fetchValueFromList(typeOfPostDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfCarrier")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfCarrier"), fetchValueFromList(typeOfCarrierDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCarrierLimitedLiability")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("CarrierLimitedLiability"), fetchValueFromList(carrierLimitedLiabilityDropDown), AssertionType.WARNING);
			}
			//DIGVIJAY Prod-SV
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitType")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TransitType"), fetchValueFromList(transitTypeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TotalLossOnly"), fetchValueFromList(totalLossOnlyDropDown), AssertionType.WARNING);
			}
			//DIGVIJAY Prod-SI
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransporterName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TransporterName"), fetchValueFromTextFields(transporterNameTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}

			/////

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigEstateName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("EstateName"), fetchValueFromTextFields(estateNameTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigEstateAddress")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("EstateAddress"), fetchValueFromTextFields(estateAddressTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTotalCropAreaOfEstate")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TotalCropAreaOfEstate"), fetchValueFromTextFields(totalCropAreaOfEstateTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNurseryCropAreaInHectares")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("NurseryCropAreaInHectares"), fetchValueFromTextFields(nurseryCropAreaInHectaresTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMinimumElevation")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("MinimumElevation"), fetchValueFromTextFields(minimumElevationTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAverageElevation")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("AverageElevation"), fetchValueFromTextFields(averageElevationTextField), AssertionType.WARNING);	
			}
			/*========*/
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPeriodOfPluckingInMonths")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PeriodOfPluckingInMonths"), fetchValueFromTextFields(periodOfPluckingInMonthsTextField), AssertionType.WARNING);	
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRatioOfGreenLeafToMadeTea")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("RatioOfGreenLeafToMadeTea"), fetchValueFromTextFields(ratioOfGreenLeafToMadeTeaTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAverageMadeTeaProducedInLastThreeyears")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("AverageMadeTeaProducedInLastThreeyears"), fetchValueFromTextFields(averageMadeTeaProducedInLastThreeyearsTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForTeaCrop")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForTeaCrop"), fetchValueFromTextFields(basisOfValuationForTeaCropDropDown), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigValuePerKgForInland")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ValuePerKgForInland"), fetchValueFromTextFields(valuePerKgForInlandTextField), AssertionType.WARNING);	
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNatureOfPackingForTea")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("NatureOfPackingForTea"), fetchValueFromTextFields(natureOfPackingForTeaTextArea), AssertionType.WARNING);	
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigApproxDateOfCommencementOfPlucking")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ApproxDateOfCommencementOfPlucking"), fetchValueFromTextFields(approxDateOfCommencementOfPluckingTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigApproxDateOfTerminationOfPlucking")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ApproxDateOfTerminationOfPlucking"), fetchValueFromTextFields(approxDateOfTerminationOfPluckingTextField), AssertionType.WARNING);
			}

			//Verify--DI-rajkumar
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransporterName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TransporterName"), fetchValueFromTextFields(transporterNameTextArea), AssertionType.WARNING);
			}
			//OP
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCRate")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SRCCRate"), fetchValueFromTextFields(sRCCRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageRate")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageRate"), fetchValueFromTextFields(storageRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageDurationInDays")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageDurationInDays"), fetchValueFromTextFields(storageDurationInDaysTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPlaceofStorage")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PlaceofStorage"), fetchValueFromTextFields(placeofStorageTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SRCCApplicable"), fetchValueFromList(sRCCApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicable"), fetchValueFromList(storageApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeofStorage")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeofStorage"), fetchValueFromList(typeofStorageDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCCargoclauseapplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("sRCCCargoclauseapplicable"), fetchValueFromList(sRCCCargoclauseapplicableDropDown), AssertionType.WARNING);
			}
			//CC
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigJourneyStartDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttCarDetMCEntity.getStringValueForField("JourneyStartDate")) ,fetchValueFromTextFields(journeyStartDateTextField),AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherCityName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("OtherCityName"), fetchValueFromTextFields(otherCityNameTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackagingDescription")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PackagingDescription"), fetchValueFromTextFields(packagingDescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCommodityDescription")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("CommodityDescription"), fetchValueFromTextFields(commodityDescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherCommodityDescription")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("OtherCommodityDescription"), fetchValueFromTextFields(otherCommodityDescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigConsignee")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Consignee"), fetchValueFromTextFields(consigneeTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitTypeforOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("transitTypeforOC"), fetchValueFromList(transitTypeforOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCommodityType")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("CommodityType"), fetchValueFromList(commodityTypeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackaging")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Packaging"), fetchValueFromList(packagingDropDown), AssertionType.WARNING);
			}
			//OC
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicableOpenButtonForOC")) {
				verifyDetailsOfClausesApplicableOpenButtonForOC(polInsIntAttCarDetMCEntity, assertReference);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessapplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Excessapplicable"), fetchValueFromList(excessapplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessApplicablOn")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessApplicablOn"), fetchValueFromList(excessApplicablOnDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSellersContingencyApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SellersContingencyApplicable"), fetchValueFromList(sellersContingencyApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicableOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicableOC"), fetchValueFromList(storageApplicableOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutcargoApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("shutoutcargoApplicableDropDown"), fetchValueFromList(shutoutcargoApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForOC"), fetchValueFromList(basisOfValuationForOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachineryn")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Machinery"), fetchValueFromList(machineryDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSecondHand")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SecondHand"), fetchValueFromList(secondHandDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherOverDimensionalCargotobecovered")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("whetherOverDimensionalCargotobecoveredDropDown"), fetchValueFromList(whetherOverDimensionalCargotobecoveredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfStorage")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfStorage"), fetchValueFromList(typeOfStorageDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinerysubjecttoclause")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Machinerysubjecttoclause"), fetchValueFromList(machinerysubjecttoclauseDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessClaimAmount")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessClaimAmount"), fetchValueFromTextFields(excessClaimAmountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessOthers")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessOthers"), fetchValueFromTextFields(excessOthersTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessSI")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessSI"), fetchValueFromTextFields(excessSITextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNumberOfDays")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("NumberOfDays"), fetchValueFromTextFields(numberOfDaysTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageRateOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageRateOC"), fetchValueFromTextFields(storageRateOCTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNoOfdays")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("NoOfdays"), fetchValueFromTextFields(noOfdaysTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoRate")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoRate"), fetchValueFromTextFields(shutoutCargoRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExtra")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Extra"), fetchValueFromTextFields(extraTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigUnderInsurancepercent")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("underInsurancepercentTextField"), fetchValueFromTextFields(underInsurancepercentTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			//CC Vessel Find
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigVesselCode")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("VesselCode"), fetchValueFromTextFields(vesselCodeTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCountry")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExportToCountry"), fetchValueFromTextFields(exportToCountryTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCity")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExportToCity"), fetchValueFromTextFields(exportToCityTextField), AssertionType.WARNING);
			}
		}
	}

	public void clickToOpenButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		//DIGVIJAY  prod AT transit details button
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitDetails")){
			click(transitDetailsOpenButton);
			try{
				switchToWindow("'Transit Details' Details");
			}
			catch(Exception e){
				switchToWindow("'Transit Details' Details");

			}
		}
		//DIGVIJAY  prod AT DetailsOfClausesApplicable button
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicable")){
			click(detailsOfClausesApplicableOpenButton);
			try{
				switchToWindow("'Details of Clauses Applicable' Details");
			}
			catch(Exception e){
				switchToWindow("'Details of Clauses Applicable' Details");
			}
		}
	}
	//**
	public void fillTransitDetailsButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttCarDetMCEntity);
		Thread.sleep(3000);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigModeOfTransports")){
			clearAndSendKeys(modeOfTransportsDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("ModeOfTransports"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLandConveyanceCodeC")){
			clearAndSendKeys(landConveyanceCodeCDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("LandConveyanceCodeC"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigFromPlace")){
			clearAndSendKeys(fromPlaceTextArea,polInsIntAttCarDetMCEntity.getStringValueForField("FromPlace"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigToPlace")){
			clearAndSendKeys(toPlaceTextArea,polInsIntAttCarDetMCEntity.getStringValueForField("ToPlace"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyTransitDetailsButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigFromPlace")){
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("FromPlace"), fetchValueFromFields(fromPlaceTextArea), AssertionType.WARNING);
			}
			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigToPlace")){
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ToPlace"), fetchValueFromFields(toPlaceTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigModeOfTransports")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ModeOfTransports"), fetchValueFromList(modeOfTransportsDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLandConveyanceCodeC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LandConveyanceCodeC"), fetchValueFromList(landConveyanceCodeCDropDown), AssertionType.WARNING);
			}

			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}			
	//**************************
	//DIGVIJAY PROD-AT
	public void fillDetailsOfClausesApplicableForAT(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttCarDetMCEntity);
		Thread.sleep(3000);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCargoClauseApplicableOfNextWindow")){
			selectValueFromList(cargoClauseApplicableDropDownOfNextWindow, polInsIntAttCarDetMCEntity.getStringValueForField("CargoClauseApplicableOfNextWindow"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARSRCCClauseApplicableOfNextWindow")){
			selectValueFromList(wARSRCCClauseApplicableDropDownOfNextWindow, polInsIntAttCarDetMCEntity.getStringValueForField("WARSRCCClauseApplicableOfNextWindow"));
		}


		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyDetailsOfClausesApplicableForAT(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSerialNoOfNextWindow")){
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SerialNoOfNextWindow"), fetchValueFromTextFields(serialNoTextFieldOfNextWindow), AssertionType.WARNING);
			}
			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitTypeForATOfNextWindow")){
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TransitTypeForATOfNextWindow"), fetchValueFromFields(transitTypeForATDropDownOfNextWindow), AssertionType.WARNING);
			}
			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRiskCoveredForATOfNextWindow")){
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("RiskCoveredForATOfNextWindow"), fetchValueFromFields(riskCoveredForATDropDownOfNextWindow), AssertionType.WARNING);
			}
			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCargoClauseApplicableOfNextWindow")){
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("CargoClauseApplicableOfNextWindow"), fetchValueFromFields(cargoClauseApplicableDropDownOfNextWindow), AssertionType.WARNING);
			}
			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARSRCCClauseApplicableOfNextWindow")){
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("WARSRCCClauseApplicableOfNextWindow"), fetchValueFromFields(wARSRCCClauseApplicableDropDownOfNextWindow), AssertionType.WARNING);
			}

			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}			

	public void navigateToPolicy(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToinsuredInterestScheduleTab(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInsuredInterestScheduleTab")) {
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateTobackAttributePage(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void clickToOpenButtonForOC(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicableOpenButtonForOC")){
			click(detailsOfClausesApplicableOpenButtonForOC);
			try{
				switchToWindow("Details of Clauses Applicable");
			}
			catch(Exception e){
				switchToWindow("Details of Clauses Applicable");

			}
		}
	}

	public void FillDetailsOfClausesApplicableOpenButtonForOC(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickToOpenButtonForOC(polInsIntAttCarDetMCEntity);
		Thread.sleep(3000);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitTypeforOCNext")){
			clearAndSendKeys(transitTypeforOCNextDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("TransitTypeforOCNext"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCommodityTypeNext")){
			clearAndSendKeys(commodityTypeNextDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("CommodityTypeNext"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackagingNext")){
			clearAndSendKeys(packagingNextDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("PackagingNext"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRiskCoveredforOC")){
			clearAndSendKeys(riskCoveredforOCDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("RiskCoveredforOC"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCargoClauseApplicable")){
			clearAndSendKeys(cargoClauseApplicableDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("CargoClauseApplicable"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARSRCCClauseApplicable")){
			clearAndSendKeys(wARSRCCClauseApplicableDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("WARSRCCClauseApplicable"));
		}

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyDetailsOfClausesApplicableOpenButtonForOC(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitTypeforOCNext")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TransitTypeforOCNext"), fetchValueFromList(transitTypeforOCNextDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCommodityTypeNext")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("CommodityTypeNext"), fetchValueFromList(commodityTypeNextDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackagingNext")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PackagingNext"), fetchValueFromList(packagingNextDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRiskCoveredforOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("RiskCoveredforOC"), fetchValueFromList(riskCoveredforOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCargoClauseApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("cargoClauseApplicable"), fetchValueFromList(cargoClauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARSRCCClauseApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("WARSRCCClauseApplicable"), fetchValueFromList(wARSRCCClauseApplicableDropDown), AssertionType.WARNING);
			}


			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}

	public void	clickNextButtonPolicyAttributeCDPolicyDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			//isElementDisplayed(policyTabTitle);
		}
	}

	public void clickOnVesselCodeFindButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigEstateCodeClickButton")){
			click(vesselCodeClickButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Vessel List");
			}catch(Exception e){
				switchToWindow("Vessel List");
			}
		}
	}
	public void fillVesselCodeSearch(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickOnVesselCodeFindButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigVesselCode")){
			Thread.sleep(3000);
			clearAndSendKeys(vesselCodeTextField,polInsIntAttCarDetMCEntity.getStringValueForField("VesselCode") );	
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigVesselName")){
			Thread.sleep(3000);
			clearAndSendKeys(vesselNameTextField,polInsIntAttCarDetMCEntity.getStringValueForField("VesselName") );	
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBackButtons")){
			click(backButtons);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSearchButton")){
			Thread.sleep(3000);
			click(searchButton);
			selectVesselCode(polInsIntAttCarDetMCEntity);
		}

	}

	public void selectVesselCode(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		vesselCodeToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttCarDetMCEntity.getStringValueForField("VesselCode")+"')]"),"Vessel Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(vesselCodeToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}

	public void clickOnExportToCountryFindButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCountryClickButton")){
			click(exportToCountryClickButton);
			switchToWindow();

		}
	}
	public void fillExportToCountry(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickOnExportToCountryFindButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCountrySearch")){
			Thread.sleep(3000);
			clearAndSendKeys(countrySearchTextField,polInsIntAttCarDetMCEntity.getStringValueForField("countrySearch") );	

		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigContrySearchFindButton")){
			Thread.sleep(3000);
			click(contrySearchFindButton);
			selectCountrySearch(polInsIntAttCarDetMCEntity);
		}

	}
	public void selectCountrySearch(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		countrySearchToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttCarDetMCEntity.getStringValueForField("countrySearchText")+"')]"),"Country Search to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(countrySearchToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}
	public void clickOnExportToCityFindButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCityClickButton")){
			click(exportToCityClickButton);
			switchToWindow();

		}
	}
	public void fillExportToCity(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickOnExportToCityFindButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCitySearch")){
			Thread.sleep(3000);
			clearAndSendKeys(citySearchTextField,polInsIntAttCarDetMCEntity.getStringValueForField("CitySearch") );	

		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCitySearchFindButton")){
			Thread.sleep(3000);
			click(citySearchFindButton);
			selectCitySearch(polInsIntAttCarDetMCEntity);
		}

	}
	public void selectCitySearch(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		citySearchToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttCarDetMCEntity.getStringValueForField("countrySearchText")+"')]"),"City Search to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(citySearchToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");	
    }
	public void fillandSubmitPolicyInsuredInrestAttributeForMArineCargo(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttCarDetMCEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredInrestAttributeCargoDetailsMarineCargo(polInsIntAttCarDetMCEntity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(polInsIntAttCarDetMCEntity);
			navigateToPolicy(polInsIntAttCarDetMCEntity);
			navigateToAttribute(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterest(polInsIntAttCarDetMCEntity);
			navigateToCoverage(polInsIntAttCarDetMCEntity);
			navigateToLoan(polInsIntAttCarDetMCEntity);
			navigateToClientDetails(polInsIntAttCarDetMCEntity);
			navigateToRelation(polInsIntAttCarDetMCEntity);
			navigateToPayment(polInsIntAttCarDetMCEntity);
			navigateToFollowup(polInsIntAttCarDetMCEntity);
			navigateToDocument(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterestAttributes(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterestRelations(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterestPayments(polInsIntAttCarDetMCEntity);



		}
	}
}
