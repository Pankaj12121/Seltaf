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
import com.aqm.staf.library.databin.PolAttrMarinCargoEntity;

import com.aqm.staf.library.databin.PolInsIntAttrMCargoEntity;
import com.aqm.staf.library.databin.PolAttrMarinCargoEntity;
import com.aqm.staf.library.databin.PolInsIntAttrMCargoEntity;

import com.aqm.staf.library.databin.PolicyRelationDetailEntity;


public class PolicyInsuredInrestAttributeForMArineCargo extends BasePage {
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

	//DIGVIJAY  AT
	private PageElement whetherOverDimensionalCargotoBeCoveredDropDown;
	private PageElement whetherInsuredIsaCompanyAsPerCompanyActDropDown;
	private PageElement whetherITSystemIsInPlaceDropDown;
	private PageElement whetherCapitalGoodsPlantAndMachineryToBeCoveredDropDown;
	private PageElement indigenousDomesticSalesTurnoverTextField;
	private PageElement exportSalesTurnoverTextField;
	private PageElement expectedProvisionalAnnualSalesTurnoverTextField;
	private PageElement extraForBasisOfValuationTextField;
	private PageElement totalProvisionalAnnualSumInsuredTextField;
	private PageElement commodityDetailsOpenButton;
	private PageElement warAndSRCCApplicableDropDown;
	private PageElement warAndSRCCRateTextField;
	private PageElement srccApplicableDropDown;
	private PageElement srccRateTextField;
	private PageElement detOfProviDispAndShipsDurThePolPeriodOfSEZLocationTextArea;
	private PageElement noOfTransitTypesDesiredTextField;
	private PageElement transitTypeDetailsOpenButton;
	private PageElement premiumRateTextField;
	//digvijay AT commodity details open button
	private PageElement commodityTypeDropDownOfNextWindow;
	private PageElement commodityDescriptionTextAreaOfNextWindow;
	private PageElement packagingDropDownOfNextWindow;
	private PageElement packagingDescriptionTextAreaOfNextWindow;
	private PageElement commoditySumInsuredTextFieldOfNextWindow;
	private PageElement commodityRateTextFieldOfNextWindow;
	//digvijay AT Transit Type details open button
	private PageElement transitTypeForATDropDownOfNextWindow; 
	private PageElement riskCoveredForATDropDownOfNextWindow;
	private PageElement basisOfValuationForATDropDownOfNextWindow;
	private PageElement extraTextFieldOfNextWindow;
	//DIGVIJAY  AN
	private PageElement transitTypeForMarineCargoDropDown;
	private PageElement totalLossOnlyDropDown;
	private PageElement singleCarryingLimitTextField;
	private PageElement distanceInKmTextField;
	//DIGVIJAY  SI
	private PageElement transitTypeForSIDropDown;
	//DIGVIJAY  SV SAME LIKE AN,SI

	//OCInsured dharmendra  
	private PageElement yearTextField;	
	private PageElement majorCommodityDropDown;
	private PageElement limitPerAircraftTextField;
	private PageElement limitPerVesselTextField;
	private PageElement limitPerRegisteredPostTextField;
	private PageElement limitPerLocationTextField;
	private PageElement limitPerLocationlClauseDropDown;
	private PageElement transitTypedetailsButton;
	private PageElement transitDetailsButton;
	//ocopenbutton
	private PageElement openButton;
	private PageElement serialNoTextFieldOfNextWindow;
	private PageElement deleteButtonOfNextWindow;
	private PageElement saveButtonOfNextWindow;
	private PageElement closeButtonOfNextWindow;
	private PageElement transitTypeforOCTextField;
	private PageElement commodityTypeTextField;
	//private PageElement commodityDescriptionTextArea;
	private PageElement packagingTextField;
	private PageElement packagingDescriptionTextField;
	//private PageElement commodityRateTextField;
	private PageElement riskCoveredforOCTextField;
	private PageElement warAndSRCCrateforTransitTypeTextField;
	private PageElement increasedValueRateTextField;
	private PageElement dutyRateTextField;
	private PageElement dutyRateforWarandSRCCTextField;
	//Rajkumar -- DI
	private PageElement transitTypeForDITitle;
	private PageElement transitTypeForMarineDropDown;
	//Rajkumar -- IV
	//Rajkumar -- TC
	private PageElement policyTypeForTeaCropInsuranceDropDown;
	private PageElement estateCodeClickButton;
	//Open button Field
	private PageElement estateCodeTextField;
	private PageElement estateNameTextField;
	private PageElement searchButton;
	private PageElement estateCodeToBeSelectedLink;
	private PageElement BackButtons;
	private PageElement estateCodeVerify;

	//OcInsured dharmendra 22

	private PageElement addButtonOfNextWindowButton;
	private PageElement warandSRCCrateforIncreasedValueTextField;
	private PageElement transitTypeforOCDropDown;
	private PageElement commodityTypeDropDown;
	private PageElement packagingDropDown;
	private PageElement riskCoveredforOCDropDown;
	private PageElement modeOfTransportsDropDown;
	private PageElement landConveyanceCodeCDropDown;
	private PageElement fromPlaceTextArea;
	private PageElement toPlaceTextArea;
	//CC Insured dharmendra
	private PageElement journeyStartDateDateField;
	private PageElement transitTypeforOCInsuredccDropDown;
	private PageElement commodityTypeInsuredDropDown;
	private PageElement packagingInsuredccDropDown;
	private PageElement consigneeTextArea;
	private PageElement commoditydescriptionTextArea;
	private PageElement otherCommodityDescriptionTextArea;
	private PageElement packagingDescriptionTextArea;
	//OP Insured Dharmendra

	private PageElement transportDetailsOpenButton;
	private PageElement commoditySumInsuredTextField;	
	private PageElement commodityRateOfOPTextField;	
	private PageElement seaApplicableDropDown;
	private PageElement airApplicableDropDown;
	private PageElement railRoadApplicableDropDown;
	private PageElement postApplicableDropDown;
	private PageElement courierApplicableDropDown;
	private PageElement coastalApplicableDropDown;
	private PageElement isTotalLossRiskApplicableDropDown;
	private PageElement isSVCApplicableDropDown;
	private PageElement isICCAapplicableDropDown;
	private PageElement iCCAClauseapplicableDropDown;
	private PageElement isICCBApplicableDropDown;
	private PageElement iCCBclauseApplicableDropDown;
	private PageElement isICCCApplicableDropDown;
	private PageElement iCCCclauseApplicableDropDown;
	private PageElement isICCAirApplicableDropDown;
	private PageElement iCCAirclauseApplicableDropDown;
	private PageElement isITCAApplicableDropDown;
	private PageElement iTCAClauseApplicableDropDown;
	private PageElement isITCBApplicableDropDown;
	private PageElement iTCBclauseApplicableDropDown;
	private PageElement isITCCApplicableDropDown;
	private PageElement iTCCclauseApplicableDropDown;
	private PageElement commodityRateTextField;
	private PageElement commodityDescriptionTextArea;

	private PageElement transportModeDropDown;
	private PageElement landConveyanceCodeDropDown;

	public PolicyInsuredInrestAttributeForMArineCargo(WebDriver driver, String pageName) {
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

		//DIGVIJAY  AT
		whetherOverDimensionalCargotoBeCoveredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Over Dimensional cargo to be covered?')]/following::select"), "Whether Over Dimensional cargo to be covered", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherInsuredIsaCompanyAsPerCompanyActDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Insured is a Company as per Company Act')]/following::select"), "Whether Insured is a Company as per Company Act", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherITSystemIsInPlaceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether IT System is in place?')]/following::select"), "Whether IT System is in place", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherCapitalGoodsPlantAndMachineryToBeCoveredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Capital Goods (Plant and Machinery)')]/following::select"), "Whether Capital Goods (Plant and Machinery)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		indigenousDomesticSalesTurnoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indigenous (Domestic) sales turnover')]/following::input"), "Indigenous (Domestic) sales turnover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exportSalesTurnoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Export sales turnover')]/following::input"), "Export sales turnover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expectedProvisionalAnnualSalesTurnoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Expected (Provisional) annual sales turnover')]/following::input"), "Expected (Provisional) annual sales turnover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extraForBasisOfValuationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extra for basis of valuation')]/following::input"), "Extra for basis of valuation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalProvisionalAnnualSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total (Provisional) Annual Sum Insured')]/following::input"), "Total (Provisional) Annual Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityDetailsOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Commodity Details')]/following::input"), "Open Button for Commodity Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		warAndSRCCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'WAR and SRCC Applicable')]/following::select"), "WAR and SRCC Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		warAndSRCCRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'WAR and SRCC rate')]/following::input"), "WAR and SRCC rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		srccApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'SRCC Applicable')]/following::select[2]"), "SRCC Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		srccRateTextField=new PageElement(By.xpath("//tr[15]//td//div[contains(text(),'SRCC rate')]/following::input"), "SRCC rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detOfProviDispAndShipsDurThePolPeriodOfSEZLocationTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Details of provisional dispatches and shipments during the policy period')]/following::textarea"), "Details of provisional dispatches and shipments during the policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfTransitTypesDesiredTextField=new PageElement(By.xpath("//td//div[contains(text(),'No of Transit Types Desired')]/following::input"), "No of Transit Types Desired", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitTypeDetailsOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Transit Type details')]/following::input"), "Open Button for Transit Type details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Rate')]/following::input"), "Premium Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//digvijay AT commodity details open button
		serialNoTextFieldOfNextWindow=new PageElement(By.name("slNo0"), "serialNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityTypeDropDownOfNextWindow=new PageElement(By.name("Data_213906805022010_0"), "commodityType", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityDescriptionTextAreaOfNextWindow=new PageElement(By.name("Data_213910105022010_0"), "commodityDescription", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingDropDownOfNextWindow=new PageElement(By.name("Data_213910205022010_0"), "packaging", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		packagingDescriptionTextAreaOfNextWindow=new PageElement(By.name("Data_213913805022010_0"), "ackagingDescription", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commoditySumInsuredTextFieldOfNextWindow=new PageElement(By.name("Data_213913905022010_0"), "commoditySumInsured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityRateTextFieldOfNextWindow=new PageElement(By.name("Data_213914005022010_0"), "commodityRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//digvijay AT Transit Type details open button
		transitTypeForATDropDownOfNextWindow=new PageElement(By.name("Data_232176127082010_0"), "transitTypeForATDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskCoveredForATDropDownOfNextWindow=new PageElement(By.name("Data_232177527082010_0"), "riskCoveredForATDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForATDropDownOfNextWindow=new PageElement(By.name("Data_232245127082010_0"), "basisOfValuationForATDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extraTextFieldOfNextWindow=new PageElement(By.name("Data_213916805022010_0"), "extraTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//DIGVIJAY  AN
		transitTypeForMarineCargoDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type For Marine Cargo')]/following::select"), "Transit Type For Marine Cargo", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalLossOnlyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Total Loss Only')]/following::select"), "Total Loss Only", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		singleCarryingLimitTextField=new PageElement(By.xpath("//td//div[contains(text(),'Single Carrying Limit')]/following::input"), "Single Carrying Limit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		distanceInKmTextField=new PageElement(By.xpath("//td//div[contains(text(),'Distance in Km')]/following::input"), "Distance in Km", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//DIGVIJAY  SI
		transitTypeForSIDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type For SI')]/following::select"), "Transit Type For SI", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//OCInsured
		majorCommodityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Major Commodity')]/following::select"), "Major Commodity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitPerLocationlClauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Location Clause')]/following::select"), "Limit Per Location Clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearTextField=new PageElement(By.xpath("//td//div[contains(text(),'Year')]/following::input"), "Year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerAircraftTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Aircraft')]/following::input"), "Limit Per Aircraft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerVesselTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Vessel')]/following::input"), "Limit Per Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerRegisteredPostTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Registered Post')]/following::input"), "Limit Per Registered Post", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerLocationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Location')]/following::input"), "Limit Per Location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoTextFieldOfNextWindow= new PageElement(By.name("slNo0"), "SerialNo Of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//installmentPercentageTextFieldOfNextWindow= new PageElement(By.name("Data_210784827092009_0"+rowCounts+""), "InstallmentPercentageTextField of New Window", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transitTypeForDITitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Transit Type For DI')]"), "Transit Type For DI Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitTypeForMarineDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type For Marine')]/following::select"), "Transit Type For Marine List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		//OCInsured dharmendra 22
		transitTypedetailsButton= new PageElement(By.xpath("//td//div[contains(text(),'Transit Type details')]/following::input"), "Transit Type details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transitDetailsButton= new PageElement(By.xpath("//td//div[contains(text(),'Transit Details')]/following::input"), "Transit Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addButtonOfNextWindowButton= new PageElement(By.name("btnAdd"), "AddButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoTextFieldOfNextWindow= new PageElement(By.name("slNo0"), "Serial No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingDescriptionTextField= new PageElement(By.name("Data_213913805022010_0"), "Packaging Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityRateTextField= new PageElement(By.name("Data_213914005022010_0"), "Commodity Rate(%) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		warAndSRCCrateforTransitTypeTextField= new PageElement(By.name("Data_232190427082010_0"), "War and SRCC rate for Transit Type(%) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		increasedValueRateTextField= new PageElement(By.name("Data_232184427082010_0"), "Increased Value Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dutyRateTextField= new PageElement(By.name("Data_232184327082010_0"), "Duty Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dutyRateforWarandSRCCTextField= new PageElement(By.name("Data_232184627082010_0"), "Duty Rate for War and SRCC(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityDescriptionTextArea= new PageElement(By.name("Data_213910105022010_0"), "Commodity Description ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		warandSRCCrateforIncreasedValueTextField= new PageElement(By.name("Data_232184727082010_0"), "War and SRCC rate for Increased Value(%) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitTypeforOCDropDown=new PageElement(By.name("Data_232182127082010_0"), "Transit Type for OC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityTypeDropDown=new PageElement(By.name("Data_213906805022010_0"), "Commodity Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		packagingDropDown=new PageElement(By.name("Data_213910205022010_0"), "Packaging ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskCoveredforOCDropDown=new PageElement(By.name("Data_232189327082010_0"), "Risk Covered for OC  ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fromPlaceTextArea= new PageElement(By.name("Data_213898705022010_0"), "From Place", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toPlaceTextArea= new PageElement(By.name("Data_213898805022010_0"), "To Place  ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modeOfTransportsDropDown=new PageElement(By.name("Data_232190627082010_0"), "Mode of Transports ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		landConveyanceCodeCDropDown=new PageElement(By.name("Data_232556027082010_0"), "Land Conveyance Code  ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//CC Insured dharmendra
		journeyStartDateDateField=new PageElement(By.xpath("//td//div[contains(text(),'Journey Start Date')]/following::input"), "Journey Start Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitTypeforOCInsuredccDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type for OC')]/following::select"), "Transit Type for OC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityTypeInsuredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Type')]/following::select')]/following::select"), "Commodity Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		packagingInsuredccDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Packaging')]/following::select"), "Packaging", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		consigneeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee')]/following::textarea"), "Consignee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commoditydescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Description')]/following::textarea"), "Commodity Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherCommodityDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Other Commodity Description')]/following::textarea"), "Other Commodity Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Packaging Description')]/following::textarea"), "Packaging Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//OP Insured dharmendra 
		transportDetailsOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Transport Details')]/following::input"), "Transport Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		commoditySumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Commodity Sum Insured')]/following::input"), "Commodity Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityRateOfOPTextField= new PageElement(By.xpath("//td//div[contains(text(),'Commodity Rate(%)')]/following::input"), "Commodity Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		seaApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sea Applicable')]/following::select"), "Sea Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		airApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Air Applicable')]/following::select"), "Air Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		railRoadApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Rail/Road Applicable')]/following::select"), "Rail/Road Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		postApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Post Applicable')]/following::select"), "Post Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		courierApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Courier Applicable')]/following::select"), "Courier Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coastalApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Coastal Applicable')]/following::select"), "Coastal Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isTotalLossRiskApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Total Loss Risk Applicable?')]/following::select"), "Is Total Loss Risk Applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isSVCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is SVC Applicable?')]/following::select"), "Is SVC Applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isICCAapplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ICC-A applicable?')]/following::select"), "Is ICC-A applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iCCAClauseapplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ICC (A) clause applicable')]/following::select"), "ICC (A) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isICCBApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ICC-B applicable?')]/following::select"), "Is ICC-B applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iCCBclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ICC (B) clause applicable')]/following::select"), "ICC (B) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isICCCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ICC-C applicable?')]/following::select"), "Is ICC-C applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iCCCclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ICC (C) clause applicable')]/following::select"), "ICC (C) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isICCAirApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ICC-Air applicable?')]/following::select"), "Is ICC-Air applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iCCAirclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ICC (Air) clause applicable')]/following::select"), "ICC (Air) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isITCAApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ITC-A applicable?')]/following::select"), "Is ITC-A applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iTCAClauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ITC (A) clause applicable')]/following::select"), "ITC (A) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isITCBApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ITC-B applicable?')]/following::select"), "Is ITC-B applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iTCBclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ITC (B) clause applicable')]/following::select"), "ITC (B) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isITCCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ITC-C applicable?')]/following::select"), "Is ITC-C applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iTCCclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ITC (C) clause applicable')]/following::select"), "ITC (C) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//TC--Rajkumar

		policyTypeForTeaCropInsuranceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Policy Type for Tea Crop Insurance')]/following::select"), "Policy Type For Tea Crop Insurance List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estateCodeTextField=new PageElement(By.name("pEstateCode"), "Estate Code Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estateNameTextField=new PageElement(By.name("pEstateName"), "Estate Name Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		estateCodeClickButton=new PageElement(By.xpath("//td//b[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"), "Estate Code Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		estateCodeVerify= new PageElement(By.xpath("//td//div[contains(text(),'Estate Code')]/following::input"), "Estate Code Verify", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		packagingDropDown=new PageElement(By.name("Data_232199227082010_0"), "Transport Mode ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		packagingDropDown=new PageElement(By.name("Data_232556027082010_0"), "Land Conveyance Code  ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);



	}
	public void fillPolicyInsuredInrestAttributeForMArineCargo(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("add") || polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("edit")){
			//DIGVIJAY  AT
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherOverDimensionalCargotoBeCovered")) {
				selectValueFromList(whetherOverDimensionalCargotoBeCoveredDropDown, polInsIntAttrMCargoEntity.getStringValueForField("WhetherOverDimensionalCargotoBeCovered"));
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherInsuredIsaCompanyAsPerCompanyAct")) {
				selectValueFromList(whetherInsuredIsaCompanyAsPerCompanyActDropDown, polInsIntAttrMCargoEntity.getStringValueForField("WhetherInsuredIsaCompanyAsPerCompanyAct"));
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherITSystemIsInPlace")) {
				selectValueFromList(whetherITSystemIsInPlaceDropDown, polInsIntAttrMCargoEntity.getStringValueForField("WhetherITSystemIsInPlace"));
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherCapitalGoodsPlantAndMachineryToBeCovered")) {
				selectValueFromList(whetherCapitalGoodsPlantAndMachineryToBeCoveredDropDown, polInsIntAttrMCargoEntity.getStringValueForField("WhetherCapitalGoodsPlantAndMachineryToBeCovered"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIndigenousDomesticSalesTurnover")) {
				clearAndSendKeys(indigenousDomesticSalesTurnoverTextField, polInsIntAttrMCargoEntity.getStringValueForField("IndigenousDomesticSalesTurnover"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExportSalesTurnover")) {
				clearAndSendKeys(exportSalesTurnoverTextField, polInsIntAttrMCargoEntity.getStringValueForField("ExportSalesTurnover"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExpectedProvisionalAnnualSalesTurnover")) {
				clearAndSendKeys(expectedProvisionalAnnualSalesTurnoverTextField, polInsIntAttrMCargoEntity.getStringValueForField("ExpectedProvisionalAnnualSalesTurnover"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExtraForBasisOfValuation")) {
				clearAndSendKeys(extraForBasisOfValuationTextField, polInsIntAttrMCargoEntity.getStringValueForField("ExtraForBasisOfValuation"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalProvisionalAnnualSumInsured")) {
				clearAndSendKeys(totalProvisionalAnnualSumInsuredTextField, polInsIntAttrMCargoEntity.getStringValueForField("TotalProvisionalAnnualSumInsured"));
			}
			//open COMMODITYDetails of PROD AT DIGVIJAY
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityDetails")) {
				fillCommodityDetails(polInsIntAttrMCargoEntity);
			}
			//--
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarAndSRCCApplicable")) {
				selectValueFromList(warAndSRCCApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("WarAndSRCCApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarAndSRCCRate")) {
				clearAndSendKeys(warAndSRCCRateTextField, polInsIntAttrMCargoEntity.getStringValueForField("WarAndSRCCRate"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSrccApplicable")) {
				selectValueFromList(srccApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("SrccApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSrccRate")) {
				clearAndSendKeys(srccRateTextField, polInsIntAttrMCargoEntity.getStringValueForField("SrccRate"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDetOfProviDispAndShipsDurThePolPeriodOfSEZLocation")) {
				clearAndSendKeys(detOfProviDispAndShipsDurThePolPeriodOfSEZLocationTextArea, polInsIntAttrMCargoEntity.getStringValueForField("DetOfProviDispAndShipsDurThePolPeriodOfSEZLocation"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigNoOfTransitTypesDesired")) {
				clearAndSendKeys(noOfTransitTypesDesiredTextField, polInsIntAttrMCargoEntity.getStringValueForField("NoOfTransitTypesDesired"));
			}
			//open TransitTypeDetails of PROD AT DIGVIJAY
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeDetails")) {
				fillTransitTypedetails(polInsIntAttrMCargoEntity);
			}
			//--
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPremiumRate")) {
				clearAndSendKeys(premiumRateTextField, polInsIntAttrMCargoEntity.getStringValueForField("PremiumRate"));
			}
			//cc
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigYear")) {
				clearAndSendKeys(yearTextField, polInsIntAttrMCargoEntity.getStringValueForField("year"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerAircraft")) {
				clearAndSendKeys(limitPerAircraftTextField, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerAircraft"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerVessel")) {
				clearAndSendKeys(limitPerVesselTextField, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerVessel"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerRegisteredPost")) {
				clearAndSendKeys(limitPerRegisteredPostTextField, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerRegisteredPost"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerLocation")) {
				clearAndSendKeys(limitPerLocationTextField, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerLocation"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMajorCommodity")) {
				selectValueFromList(majorCommodityDropDown, polInsIntAttrMCargoEntity.getStringValueForField("MajorCommodity"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerLocation")) {
				selectValueFromList(limitPerLocationTextField, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerLocation"));		
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForMarine")) {				
				selectValueFromList(transitTypeForMarineDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForMarine"));
			}
			//DIGVIJAY  AN
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForMarineCargo")) {
				selectValueFromList(transitTypeForMarineCargoDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForMarineCargo"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
				selectValueFromList(totalLossOnlyDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TotalLossOnly"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSingleCarryingLimit")) {
				clearAndSendKeys(singleCarryingLimitTextField, polInsIntAttrMCargoEntity.getStringValueForField("SingleCarryingLimit"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDistanceInKm")) {
				clearAndSendKeys(distanceInKmTextField, polInsIntAttrMCargoEntity.getStringValueForField("DistanceInKm"));
			}
			//DIGVIJAY  SI
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForSI")) {
				selectValueFromList(transitTypeForSIDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForSI"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommoditydescription")) {
				clearAndSendKeys(commoditydescriptionTextArea, polInsIntAttrMCargoEntity.getStringValueForField("Commoditydescription"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigOtherCommodityDescription")) {
				clearAndSendKeys(otherCommodityDescriptionTextArea, polInsIntAttrMCargoEntity.getStringValueForField("OtherCommodityDescription"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescription")) {
				clearAndSendKeys(packagingDescriptionTextArea, polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescription"));
			}
			//OP Insured dharmendra 
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommoditySumInsured")) {
				clearAndSendKeys(commoditySumInsuredTextField, polInsIntAttrMCargoEntity.getStringValueForField("CommoditySumInsured"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityRateOfOP")) {
				clearAndSendKeys(commodityRateOfOPTextField, polInsIntAttrMCargoEntity.getStringValueForField("CommodityRateOfOP"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSeaApplicable")) {
				selectValueFromList(seaApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("SeaApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigAirApplicable")) {
				selectValueFromList(airApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("AirApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRailRoadApplicable")) {
				selectValueFromList(railRoadApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("RailRoadApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPostApplicable")) {
				selectValueFromList(postApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("PostApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCourierApplicable")) {
				selectValueFromList(courierApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("CourierApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCoastalApplicable")) {
				selectValueFromList(coastalApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("CoastalApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsTotalLossRiskApplicable")) {
				selectValueFromList(isTotalLossRiskApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsTotalLossRiskApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsSVCApplicable")) {
				selectValueFromList(isSVCApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsSVCApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCAapplicable")) {
				selectValueFromList(isICCAapplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsICCAapplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCAClauseapplicable")) {
				selectValueFromList(iCCAClauseapplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ICCAClauseapplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCCApplicable")) {
				selectValueFromList(isICCCApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsICCCApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCCclauseApplicable")) {
				selectValueFromList(iCCCclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ICCCclauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCAirApplicable")) {
				selectValueFromList(isICCAirApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsICCAirApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCAirclauseApplicable")) {
				selectValueFromList(iCCAirclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ICCAirclauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCAApplicable")) {
				selectValueFromList(isITCAApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsITCAApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCAClauseApplicable")) {
				selectValueFromList(iTCAClauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ITCAClauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCBApplicable")) {
				selectValueFromList(isITCBApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsITCBApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCBclauseApplicable")) {
				selectValueFromList(iTCBclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ITCBclauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCCApplicable")) {
				selectValueFromList(isITCCApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsITCCApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCCclauseApplicable")) {
				selectValueFromList(iTCCclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ITCCclauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCBApplicable")) {
				selectValueFromList(isICCBApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsICCBApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCBclauseApplicable")) {
				selectValueFromList(iCCBclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ICCBclauseApplicable"));
			}
			//CC INsured Dharmendra
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDateOfIssuanceOfA2Certificate")) {
				String dateOfIssuanceOfA2Certificate=RandomCodeGenerator.dateGenerator(polInsIntAttrMCargoEntity.getStringValueForField("JourneyStartDateDateField"));
				clearAndEnterDate(journeyStartDateDateField, dateOfIssuanceOfA2Certificate);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeforOCInsuredcc")) {
				selectValueFromList(transitTypeforOCInsuredccDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeforOCInsuredcc"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityTypeInsured")) {
				selectValueFromList(commodityTypeInsuredDropDown, polInsIntAttrMCargoEntity.getStringValueForField("CommodityTypeInsured"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingInsuredcc")) {
				selectValueFromList(packagingInsuredccDropDown, polInsIntAttrMCargoEntity.getStringValueForField("PackagingInsuredcc"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigConsignee")) {
				clearAndSendKeys(consigneeTextArea, polInsIntAttrMCargoEntity.getStringValueForField("Consignee"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypedetailsForOP")) {
				fillTransitTypedetailsForOP(polInsIntAttrMCargoEntity);
			}
			// TC -Rajkumar
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFillestateCodeSearch")) {
				fillestateCodeSearch(polInsIntAttrMCargoEntity);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPolicyTypeForTeaCropInsurance")) {
				selectValueFromList(policyTypeForTeaCropInsuranceDropDown, polInsIntAttrMCargoEntity.getStringValueForField("PolicyTypeForTeaCropInsurance"));
			}

		}

		else if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}
			//DIGVIJAY  AT
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherOverDimensionalCargotoBeCovered")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WhetherOverDimensionalCargotoBeCovered"), fetchValueFromList(whetherOverDimensionalCargotoBeCoveredDropDown), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherInsuredIsaCompanyAsPerCompanyAct")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WhetherInsuredIsaCompanyAsPerCompanyAct"), fetchValueFromList(whetherInsuredIsaCompanyAsPerCompanyActDropDown), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherITSystemIsInPlace")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WhetherITSystemIsInPlace"), fetchValueFromList(whetherITSystemIsInPlaceDropDown), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherCapitalGoodsPlantAndMachineryToBeCovered")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WhetherCapitalGoodsPlantAndMachineryToBeCovered"), fetchValueFromList(whetherCapitalGoodsPlantAndMachineryToBeCoveredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIndigenousDomesticSalesTurnover")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IndigenousDomesticSalesTurnover"), fetchValueFromTextFields(indigenousDomesticSalesTurnoverTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExportSalesTurnover")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ExportSalesTurnover"), fetchValueFromTextFields(exportSalesTurnoverTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExpectedProvisionalAnnualSalesTurnover")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ExpectedProvisionalAnnualSalesTurnover"), fetchValueFromTextFields(expectedProvisionalAnnualSalesTurnoverTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExtraForBasisOfValuation")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ExtraForBasisOfValuation"), fetchValueFromTextFields(extraForBasisOfValuationTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalProvisionalAnnualSumInsured")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TotalProvisionalAnnualSumInsured"), fetchValueFromTextFields(totalProvisionalAnnualSumInsuredTextField), AssertionType.WARNING);
			}
			//open COMMODITYDetails of PROD AT DIGVIJAY
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityDetails")) {
				verifyCommodityDetails(polInsIntAttrMCargoEntity, assertReference);
			}
			//--
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarAndSRCCApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WarAndSRCCApplicable"), fetchValueFromList(warAndSRCCApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarAndSRCCRate")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WarAndSRCCRate"), fetchValueFromTextFields(warAndSRCCRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSrccApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SrccApplicable"), fetchValueFromList(srccApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSrccRate")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SrccRate"), fetchValueFromTextFields(srccRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDetOfProviDispAndShipsDurThePolPeriodOfSEZLocation")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("DetOfProviDispAndShipsDurThePolPeriodOfSEZLocation"), fetchValueFromTextFields(detOfProviDispAndShipsDurThePolPeriodOfSEZLocationTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigNoOfTransitTypesDesired")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("NoOfTransitTypesDesired"), fetchValueFromTextFields(noOfTransitTypesDesiredTextField), AssertionType.WARNING);
			}
			//open TransitTypeDetails of PROD AT DIGVIJAY
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeDetails")) {
				verifyTransitTypedetails(polInsIntAttrMCargoEntity, assertReference);
			}
			//--
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPremiumRate")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PremiumRate"), fetchValueFromTextFields(premiumRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigYear")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("Year"), fetchValueFromTextFields(yearTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerAircraft")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("LimitPerAircraft"), fetchValueFromTextFields(limitPerAircraftTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerVessel")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("LimitPerVessel"), fetchValueFromTextFields(limitPerVesselTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerRegisteredPost")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("LimitPerRegisteredPost"), fetchValueFromTextFields(limitPerRegisteredPostTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigYear")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("Year"), fetchValueFromTextFields(yearTextField), AssertionType.WARNING);
			}


			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMajorCommodity")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("MajorCommodity"), fetchValueFromList(majorCommodityDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfiglimitPerLocationlClause")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("LimitPerLocationlClause"), fetchValueFromList(limitPerLocationlClauseDropDown), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForDITitle")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForDITitle"), fetchValueFromFields(transitTypeForDITitle), AssertionType.WARNING);
			}			
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForMarine")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForMarine"), fetchValueFromList(transitTypeForMarineDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TotalLossOnly"), fetchValueFromList(totalLossOnlyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPolicyTypeForTeaCropInsurance")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PolicyTypeForTeaCropInsurance"), fetchValueFromList(policyTypeForTeaCropInsuranceDropDown), AssertionType.WARNING);
			}
			//DIGVIJAY  AN
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForMarineCargo")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForMarineCargo"), fetchValueFromList(transitTypeForMarineCargoDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TotalLossOnly"), fetchValueFromList(totalLossOnlyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSingleCarryingLimit")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SingleCarryingLimit"), fetchValueFromTextFields(singleCarryingLimitTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDistanceInKm")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("DistanceInKm"), fetchValueFromTextFields(distanceInKmTextField), AssertionType.WARNING);
			}
			//DIGVIJAY  SI
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForSI")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForSI"), fetchValueFromList(transitTypeForSIDropDown), AssertionType.WARNING);
			}


			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigOtherCommodityDescription")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("OtherCommodityDescription"), fetchValueFromTextFields(otherCommodityDescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescription")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescription"), fetchValueFromTextFields(packagingDescriptionTextArea), AssertionType.WARNING);
			}
			//CC Insured Dharmendra
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigJourneyStartDateDateField")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttrMCargoEntity.getStringValueForField("JourneyStartDateDateField")) ,fetchValueFromTextFields(journeyStartDateDateField),AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeforOCInsuredcc")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeforOCInsuredcc"), fetchValueFromList(transitTypeforOCInsuredccDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityTypeInsured")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommodityTypeInsured"), fetchValueFromList(commodityTypeInsuredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingInsuredcc")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingInsuredcc"), fetchValueFromList(packagingInsuredccDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigConsignee")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("Consignee"), fetchValueFromTextFields(consigneeTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommoditydescription")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("Commoditydescription"), fetchValueFromTextFields(commoditydescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigestateCodeVerify")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("estateCodeVerify"), fetchValueFromTextFields(estateCodeVerify), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCBclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ICCBclauseApplicable"), fetchValueFromList(iCCBclauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCCApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsICCCApplicable"), fetchValueFromList(isICCCApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCCclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ICCCclauseApplicable"), fetchValueFromList(iCCCclauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCAirApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsICCAirApplicable"), fetchValueFromList(isICCAirApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCAirclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ICCAirclauseApplicable"), fetchValueFromList(iCCAirclauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCAApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsITCAApplicable"), fetchValueFromList(isITCAApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCAClauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ITCAClauseApplicable"), fetchValueFromList(iTCAClauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCBApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsITCBApplicable"), fetchValueFromList(isITCBApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCBclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ITCBclauseApplicable"), fetchValueFromList(iTCBclauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCCApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsITCCApplicable"), fetchValueFromList(isITCCApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCCclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ITCCclauseApplicable"), fetchValueFromList(iTCCclauseApplicableDropDown), AssertionType.WARNING);
			}
			//
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportDetailsOpenButton")) {
				verifyTransportDetailsOpenButton(polInsIntAttrMCargoEntity, assertReference);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigVerifyTransitTypedetailsForOP")) {
				verifyTransitTypedetailsForOP(polInsIntAttrMCargoEntity, assertReference);
			}
			//OP Insured 
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommoditySumInsured")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommoditySumInsured"), fetchValueFromTextFields(commoditySumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityRateOfOP")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommodityRateOfOP"), fetchValueFromTextFields(commodityRateOfOPTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSeaApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SeaApplicable"), fetchValueFromList(seaApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigAirApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("AirApplicable"), fetchValueFromList(airApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRailRoadApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("RailRoadApplicable"), fetchValueFromList(railRoadApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPostApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PostApplicable"), fetchValueFromList(postApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCourierApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CourierApplicable"), fetchValueFromList(courierApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCoastalApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CoastalApplicable"), fetchValueFromList(coastalApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsTotalLossRiskApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsTotalLossRiskApplicable"), fetchValueFromList(isTotalLossRiskApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsSVCApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsSVCApplicable"), fetchValueFromList(isSVCApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCAapplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsICCAapplicable"), fetchValueFromList(isICCAapplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCAClauseapplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ICCAClauseapplicable"), fetchValueFromList(iCCAClauseapplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCBApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsICCBApplicable"), fetchValueFromList(isICCBApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCBclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ICCBclauseApplicable"), fetchValueFromList(iCCBclauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCCApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsICCCApplicable"), fetchValueFromList(isICCCApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCCclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ICCCclauseApplicable"), fetchValueFromList(iCCCclauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCAirApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsICCAirApplicable"), fetchValueFromList(isICCAirApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCAirclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ICCAirclauseApplicable"), fetchValueFromList(iCCAirclauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCAApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsITCAApplicable"), fetchValueFromList(isITCAApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCAClauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ITCAClauseApplicable"), fetchValueFromList(iTCAClauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCBApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsITCBApplicable"), fetchValueFromList(isITCBApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCBclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ITCBclauseApplicable"), fetchValueFromList(iTCBclauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCCApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IsITCCApplicable"), fetchValueFromList(isITCCApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCCclauseApplicable")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ITCCclauseApplicable"), fetchValueFromList(iTCCclauseApplicableDropDown), AssertionType.WARNING);
			}
			//
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportDetailsOpenButton")) {
				verifyTransportDetailsOpenButton(polInsIntAttrMCargoEntity, assertReference);
			}
		}
	}


	/*   TC --Rajkumar -Find Button Code*/
	/*===========================================*/

	public void clickOnStakeCodeFindButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigEstateCodeClickButton")){
			click(estateCodeClickButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Estate List");
			}catch(Exception e){
				switchToWindow("Estate List");
			}
		}
	}		
	public void fillestateCodeSearch(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickOnStakeCodeFindButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigEstateCode")){
			Thread.sleep(3000);
			clearAndSendKeys(estateCodeTextField,polInsIntAttrMCargoEntity.getStringValueForField("EstateCode") );	
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigEstateName")){
			Thread.sleep(3000);
			clearAndSendKeys(estateNameTextField,polInsIntAttrMCargoEntity.getStringValueForField("EstateName") );	
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSearchButton")){
			Thread.sleep(3000);
			click(searchButton);
			selectEstateCode(polInsIntAttrMCargoEntity);
		}
	}


	public void selectEstateCode(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		estateCodeToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttrMCargoEntity.getStringValueForField("EstateCode")+"')]"),"Estate Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(estateCodeToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}

	/*  TC -Rajkumar */
	/*===========================================*/
	public void clickToOpenButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityOpenButton")){
			click(commodityDetailsOpenButton);
			try{
				switchToWindow("Commodity Details");
			}
			catch(Exception e){
				switchToWindow("Commodity Details");

			}
		}

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeDetails")){
			click(transitTypeDetailsOpenButton);
			try{
				switchToWindow("Transit Type details");
			}
			catch(Exception e){
				switchToWindow("Transit Type details");
			}
		}
		//oc dharmendra 22
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypedetailsButton")){
			click(transitTypedetailsButton);
			try{
				switchToWindow("Parameter List for Transit Type details");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Transit Type details");

			}
		}

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitDetailsButton")){
			click(transitDetailsButton);
			try{
				switchToWindow("Parameter List for Transit Details");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Transit Details");
			}
		}

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportDetailsOpenButton")){
			click(transportDetailsOpenButton);
			try{
				switchToWindow("Parameter List for Transport Details");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Transport Details");
			}
		}
	}



	public void fillCommodityDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);

		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommTypeOfNextWindow")) {
			selectValueFromList(commodityTypeDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("CommTypeOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommDescOfNextWindow")) {
			clearAndSendKeys(commodityDescriptionTextAreaOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("CommDescOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingOfNextWindow")) {
			selectValueFromList(packagingDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("PackagingOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescOfNextWindow")) {
			clearAndSendKeys(packagingDescriptionTextAreaOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommSumInsOfNextWindow")) {
			clearAndSendKeys(commoditySumInsuredTextFieldOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("CommSumInsOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommRateOfNextWindow")) {
			clearAndSendKeys(commodityRateTextFieldOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("CommRateOfNextWindow"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyCommodityDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSerialNoOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SerialNoOfNextWindow"), fetchValueFromTextFields(serialNoTextFieldOfNextWindow), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommTypeOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommTypeOfNextWindow"), fetchValueFromList(commodityTypeDropDownOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommDescOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommDescOfNextWindow"), fetchValueFromTextFields(commodityDescriptionTextAreaOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingOfNextWindow"), fetchValueFromList(packagingDropDownOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescOfNextWindow"), fetchValueFromTextFields(packagingDescriptionTextAreaOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommSumInsOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommSumInsOfNextWindow"), fetchValueFromTextFields(commoditySumInsuredTextFieldOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommRateOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommRateOfNextWindow"), fetchValueFromTextFields(commodityRateTextFieldOfNextWindow), AssertionType.WARNING);
			}

			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 

	}

	//*****button 2
	public void fillTransitTypedetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);


		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForAT")) {
			selectValueFromList(transitTypeForATDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForAT"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRiskCoveredForAT")) {
			selectValueFromList(riskCoveredForATDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("RiskCoveredForAT"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBasOfValForAT")) {
			selectValueFromList(basisOfValuationForATDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("BasOfValForAT"));
		}

		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExtra")) {
			clearAndSendKeys(extraTextFieldOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("Extra"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButton")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyTransitTypedetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSerialNoOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SerialNoOfNextWindow"), fetchValueFromTextFields(serialNoTextFieldOfNextWindow), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForAT")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForAT"), fetchValueFromList(transitTypeForATDropDownOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRiskCoveredForAT")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("RiskCoveredForAT"), fetchValueFromList(riskCoveredForATDropDownOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBasOfValForAT")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("BasOfValForAT"), fetchValueFromList(basisOfValuationForATDropDownOfNextWindow), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExtra")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("Extra"), fetchValueFromTextFields(extraTextFieldOfNextWindow), AssertionType.WARNING);
			}

			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		} 
	}
	//Oc Dharmendra 22

	public void fillTransitTypedetailsForOP(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeforOC")){
			clearAndSendKeys(transitTypeforOCDropDown,polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeforOC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityType")){
			clearAndSendKeys(commodityTypeDropDown,polInsIntAttrMCargoEntity.getStringValueForField("CommodityType"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityDescription")){
			clearAndSendKeys(commodityDescriptionTextArea,polInsIntAttrMCargoEntity.getStringValueForField("CommodityDescription"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackaging")){
			clearAndSendKeys(packagingDropDown,polInsIntAttrMCargoEntity.getStringValueForField("Packaging"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescription")){
			clearAndSendKeys(packagingDescriptionTextField,polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescription"));
		}

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityRate")){
			clearAndSendKeys(commodityRateTextField,polInsIntAttrMCargoEntity.getStringValueForField("CommodityRate"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRiskCoveredforOC")){
			clearAndSendKeys(riskCoveredforOCDropDown,polInsIntAttrMCargoEntity.getStringValueForField("RiskCoveredforOC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarAndSRCCrateforTransitType")){
			clearAndSendKeys(warAndSRCCrateforTransitTypeTextField,polInsIntAttrMCargoEntity.getStringValueForField("WarAndSRCCrateforTransitType"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIncreasedValueRate")){
			clearAndSendKeys(increasedValueRateTextField,polInsIntAttrMCargoEntity.getStringValueForField("IncreasedValueRate"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarandSRCCrateforIncreasedValue")){
			clearAndSendKeys(warandSRCCrateforIncreasedValueTextField,polInsIntAttrMCargoEntity.getStringValueForField("WarandSRCCrateforIncreasedValue"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDutyRate")){
			clearAndSendKeys(dutyRateTextField,polInsIntAttrMCargoEntity.getStringValueForField("DutyRate"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDutyRateforWarandSRCC")){
			clearAndSendKeys(dutyRateforWarandSRCCTextField,polInsIntAttrMCargoEntity.getStringValueForField("DutyRateforWarandSRCC"));
		}

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyTransitTypedetailsForOP(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSerialNoOfNextWindow")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SerialNoOfNextWindow"), fetchValueFromFields(serialNoTextFieldOfNextWindow), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityDescription")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommodityDescription"), fetchValueFromTextFields(commodityDescriptionTextArea), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescription")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescription"), fetchValueFromTextFields(packagingDescriptionTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityRate")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommodityRate"), fetchValueFromTextFields(commodityRateTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarAndSRCCrateforTransitType")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WarAndSRCCrateforTransitType"), fetchValueFromTextFields(warAndSRCCrateforTransitTypeTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIncreasedValueRate")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IncreasedValueRate"), fetchValueFromTextFields(increasedValueRateTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarandSRCCrateforIncreasedValue")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WarandSRCCrateforIncreasedValue"), fetchValueFromTextFields(warandSRCCrateforIncreasedValueTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDutyRate")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("DutyRate"), fetchValueFromTextFields(dutyRateTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDutyRateforWarandSRCC")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("DutyRateforWarandSRCC"), fetchValueFromTextFields(dutyRateforWarandSRCCTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityType")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommodityType"), fetchValueFromList(commodityTypeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackaging")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("Packaging"), fetchValueFromList(packagingDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRiskCoveredforOC")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("RiskCoveredforOC"), fetchValueFromList(riskCoveredforOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeforOC")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeforOC"), fetchValueFromList(transitTypeforOCDropDown), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		} 
	}
	public void fillTransitDetailsButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigModeOfTransports")){
			clearAndSendKeys(modeOfTransportsDropDown,polInsIntAttrMCargoEntity.getStringValueForField("ModeOfTransports"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLandConveyanceCodeC")){
			clearAndSendKeys(landConveyanceCodeCDropDown,polInsIntAttrMCargoEntity.getStringValueForField("LandConveyanceCodeC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFromPlace")){
			clearAndSendKeys(fromPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("FromPlace"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigToPlace")){
			clearAndSendKeys(toPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("ToPlace"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyTransitDetailsButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFromPlace")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("FromPlace"), fetchValueFromFields(fromPlaceTextArea), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigToPlace")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ToPlace"), fetchValueFromFields(toPlaceTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigModeOfTransports")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ModeOfTransports"), fetchValueFromList(modeOfTransportsDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLandConveyanceCodeC")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("LandConveyanceCodeC"), fetchValueFromList(landConveyanceCodeCDropDown), AssertionType.WARNING);
			}

			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}
	public void fillTransportDetailsOpenButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportMode")){
			clearAndSendKeys(transportModeDropDown,polInsIntAttrMCargoEntity.getStringValueForField("TransportMode"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLandConveyanceCode")){
			clearAndSendKeys(landConveyanceCodeDropDown,polInsIntAttrMCargoEntity.getStringValueForField("LandConveyanceCode"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFromPlace")){
			clearAndSendKeys(fromPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("FromPlace"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigToPlace")){
			clearAndSendKeys(toPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("ToPlace"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyTransportDetailsOpenButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFromPlace")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("FromPlace"), fetchValueFromFields(fromPlaceTextArea), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigToPlace")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ToPlace"), fetchValueFromFields(toPlaceTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportMode")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransportMode"), fetchValueFromList(transportModeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLandConveyanceCode")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("LandConveyanceCode"), fetchValueFromList(landConveyanceCodeDropDown), AssertionType.WARNING);
			}

			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}
	public void navigateTobackAttributePage(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCDPolicyDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
			isElementDisplayed(nextAttributePageTitle);
		}
	}
	public void navigateToPolicy(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}

	public void fillandSubmitPolicyInsuredInrestAttributeForMArineCargo(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttrMCargoEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredInrestAttributeForMArineCargo(polInsIntAttrMCargoEntity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(polInsIntAttrMCargoEntity);
			navigateTobackAttributePage(polInsIntAttrMCargoEntity);
			navigateToPolicy(polInsIntAttrMCargoEntity);
			navigateToAttribute(polInsIntAttrMCargoEntity);
			navigateToInsuredInterest(polInsIntAttrMCargoEntity);
			navigateToCoverage(polInsIntAttrMCargoEntity);
			navigateToLoan(polInsIntAttrMCargoEntity);
			navigateToClientDetails(polInsIntAttrMCargoEntity);
			navigateToRelation(polInsIntAttrMCargoEntity);
			navigateToPayment(polInsIntAttrMCargoEntity);
			navigateToFollowup(polInsIntAttrMCargoEntity);
			navigateToDocument(polInsIntAttrMCargoEntity);
			//
			navigateToInsuredInterestAttributes(polInsIntAttrMCargoEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntAttrMCargoEntity);
			navigateToInsuredInterestRelations(polInsIntAttrMCargoEntity);
			navigateToInsuredInterestPayments(polInsIntAttrMCargoEntity);
		}

	}
}
