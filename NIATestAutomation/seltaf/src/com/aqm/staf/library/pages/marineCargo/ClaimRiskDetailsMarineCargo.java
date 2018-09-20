package com.aqm.staf.library.pages.marineCargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RiskDetailsMCEntity;
import com.aqm.staf.framework.core.RandomCodeGenerator;

public class ClaimRiskDetailsMarineCargo extends BasePage {
	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement claimRiskDtls2Title;

	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement saveButton;
	//digvijay at
	private PageElement declarationTextField;
	private PageElement billNumberTextArea;
	private PageElement billDateTextField;
	private PageElement invoiceNumberTextField;
	private PageElement invoiceDateTextField;
	private PageElement markNumberTextArea;
	private PageElement typeOfBillDropDown;
	private PageElement commodityTypeDropDown;
	private PageElement declaredSumInsuredTextField;
	private PageElement balanceSumInsuredTextField;
	private PageElement consigneeNameTextArea;
	private PageElement consigneeAddressTextArea;
	private PageElement commoditySumInsuredTextField;
	private PageElement dutyValueTextField;
	private PageElement claimAmountTextField;
	//
	//OP-Yogesh
	private PageElement salvageTextField;
	private PageElement underInsuranceAmountTextField;
	private PageElement netPayableAmountTextField;
	private PageElement lossLocationAtDropDown;
	private PageElement nearestPortLocationTextField;
	private PageElement policyNoCertificateNoThreeTextField;
	private PageElement sumInsuredTextField;
	private PageElement marineCargoClaimNoThreeTextField;
	private PageElement marineCargoPolicyNoCertificateNoThreeTextField;
	private PageElement natureOfLossThreeTextArea;
	private PageElement causeOfLossThreeTextArea;
	private PageElement dateOfLossThreeTextField;	
	private PageElement commentsThreeTextArea;	
	private PageElement dateOfIntimationThreeTextField;	
	private PageElement timeOfLossThreeTextField;	
	private PageElement policyNoCertificateNoFourTextField;	
	private PageElement sumInsuredFourTextField;	
	private PageElement marineCargoClaimNoFourTextField;	
	private PageElement marineCargoPolicyNoCertificateFourTextField;	
	private PageElement natureOfLossFourTextArea;
	private PageElement causeOfLossFourTextArea;	
	private PageElement date0fLossFourTextField;	
	private PageElement commentsFourTextArea;	
	private PageElement dateOfIntimationFourTextField;
	private PageElement timeOfLossFourTextField;

	public ClaimRiskDetailsMarineCargo(WebDriver driver, String pageName,int rowCounts) {
		super(driver, pageName);
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Damage')]"), "Claim Insured InterestDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Documents Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Claim Associated Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Claim Payments Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Claim Insured InterestDamage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Insured Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		saveButton=new PageElement(By.name("btnSave"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 

		salvageTextField= new PageElement(By.xpath("//td//div[contains(text(),'Salvage')]/following::input"), "Salvage TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		underInsuranceAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Under insurance amount')]/following::input"), "Under insurance amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		netPayableAmountTextField= new PageElement(By.xpath("//td//div[contains(text(),'Net payable Amount')]/following::input"), "Net payable Amount TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		lossLocationAtDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Loss Location at ')]/following::select"), "Loss Location at  Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 30);
		nearestPortLocationTextField= new PageElement(By.xpath("//td//div[contains(text(),'Nearest Port Location ')]/following::input"), "Nearest Port Location  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		policyNoCertificateNoThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 3')]/following::input"), "Policy No Certificate No Three", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		sumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured3')]/following::input"), "Sum Insured Text ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		marineCargoClaimNoThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.3')]/following::input"), "Marine Cargo Claim No Three Text ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		marineCargoPolicyNoCertificateNoThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 3')]/following::input"), "Marine Cargo Policy No Certificate No Three Text ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		natureOfLossThreeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss3')]/following::textarea"), "Nature Of Loss Three Text Area ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		causeOfLossThreeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss3')]/following::textarea"), "Cause Of Loss Three Text Area ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		dateOfLossThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Loss3')]/following::input"), "Date Of Loss Three Date Field ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		commentsThreeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Comments3 ')]/following::textarea"), "Comments Three Text Area ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		dateOfIntimationThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation3 ')]/following::input"), "Date Of Intimation Three Date Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		timeOfLossThreeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss3 ')]/following::input"), "Time Of Loss Three Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		policyNoCertificateNoFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Policy No./Certificate No. 4')]/following::input"), "Policy No Certificate No Four Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		sumInsuredFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Sum Insured4 ')]/following::input"), "Sum Insured Four Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		marineCargoClaimNoFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Claim No.4 ')]/following::input"), "Marine Cargo Claim No Four Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		marineCargoPolicyNoCertificateFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Marine Cargo Policy No./Certificate No. 4')]/following::input"), "Marine Cargo Policy No Certificate Four Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		natureOfLossFourTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Loss4')]/following::textarea"), "Nature Of Loss Four Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		causeOfLossFourTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Cause of Loss4')]/following::textarea"), "Cause Of Loss Four Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		date0fLossFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Loss4')]/following::input"), "Date 0f Loss Four Date Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		commentsFourTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Comments4 ')]/following::textarea"), "Comments Four Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		dateOfIntimationFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Date of Intimation4 ')]/following::input"), "Date Of Intimation Four Date Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		timeOfLossFourTextField=new PageElement(By.xpath("//td//div[contains(text(),'Time of Loss4 ')]/following::input"), "Time Of Loss Four Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 30);
		//digvijay at
		declarationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Date')]/following::input"), "Declaration Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		billNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Bill Number')]/following::textarea"), "Bill Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		billDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Bill Date')]/following::input"), "Bill Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		invoiceNumberTextField=new PageElement(By.xpath("//td//div[contains(text(),'Invoice Number')]/following::input"), "Invoice Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		invoiceDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Invoice Date')]/following::input"), "Invoice Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		markNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Mark Number')]/following::textarea"), "Mark Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfBillDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Bill')]/following::select"), "Type of Bill", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Type')]/following::select"), "Commodity Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
		declaredSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declared Sum Insured')]/following::input"), "Declared Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Balance Sum Insured')]/following::input"), "Balance Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		consigneeNameTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee Name')]/following::textarea"), "Consignee Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consigneeAddressTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee Address')]/following::textarea"), "Consignee Address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		commoditySumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Sum Insured ')]/following::input"), "Commodity Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		dutyValueTextField=new PageElement(By.xpath("//td//div[contains(text(),'Duty Value')]/following::input"), "Duty Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);		
		claimAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Claim Amount')]/following::input"), "Claim Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

	}

	public void fillClaimRiskDetailsMarineCargo(RiskDetailsMCEntity riskDetailsMCEntity, CustomAssert assertReference) throws InterruptedException{
		if(riskDetailsMCEntity.getAction().equalsIgnoreCase("add") || riskDetailsMCEntity.getAction().equalsIgnoreCase("edit")){
			//OP-Yogesh
		
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigSalvage")) {
				clearAndSendKeys(salvageTextField, riskDetailsMCEntity.getStringValueForField("Salvage"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				clearAndSendKeys(underInsuranceAmountTextField, riskDetailsMCEntity.getStringValueForField("UnderInsuranceAmount"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigNetPayableAmount")) {
				clearAndSendKeys(netPayableAmountTextField, riskDetailsMCEntity.getStringValueForField("NetPayableAmount"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigLossLocationAt")) {
				selectValueFromList(lossLocationAtDropDown, riskDetailsMCEntity.getStringValueForField("LossLocationAt"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigNearestPortLocation")) {
				clearAndSendKeys(nearestPortLocationTextField, riskDetailsMCEntity.getStringValueForField("NearestPortLocation"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigPolicyNoCertificateNoThree")) {
				clearAndSendKeys(policyNoCertificateNoThreeTextField, riskDetailsMCEntity.getStringValueForField("PolicyNoCertificateNoThree"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigSumInsured")) {
				clearAndSendKeys(sumInsuredTextField, riskDetailsMCEntity.getStringValueForField("SumInsured"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoThree")) {
				clearAndSendKeys(marineCargoClaimNoThreeTextField, riskDetailsMCEntity.getStringValueForField("marineCargoClaimNoThree"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNoThree")) {
				clearAndSendKeys(marineCargoPolicyNoCertificateNoThreeTextField, riskDetailsMCEntity.getStringValueForField("MarineCargoPolicyNoCertificateNoThree"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigNatureOfLossThree")) {
				clearAndSendKeys(natureOfLossThreeTextArea, riskDetailsMCEntity.getStringValueForField("NatureOfLossThree"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCauseOfLossThree")) {
				clearAndSendKeys(causeOfLossThreeTextArea, riskDetailsMCEntity.getStringValueForField("CauseOfLossThree"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDateOfLossThree")) {
				String dateOfLossThreeDate=RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("DateOfLossThree"));
				clearAndEnterDate(dateOfLossThreeTextField, dateOfLossThreeDate);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCommentsThree")) {
				clearAndSendKeys(commentsThreeTextArea, riskDetailsMCEntity.getStringValueForField("CommentsThree"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDateOfIntimationThree")) {
				String dateOfIntimationThreeDate=RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("DateOfIntimationThree"));
				clearAndEnterDate(dateOfIntimationThreeTextField, dateOfIntimationThreeDate);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigTimeOfLossThree")) {
				clearAndSendKeys(timeOfLossThreeTextField, riskDetailsMCEntity.getStringValueForField("TimeOfLossThree"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigPolicyNoCertificateNoFour")) {
				clearAndSendKeys(policyNoCertificateNoFourTextField, riskDetailsMCEntity.getStringValueForField("PolicyNoCertificateNoFour"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigSumInsuredFour")) {
				clearAndSendKeys(sumInsuredFourTextField, riskDetailsMCEntity.getStringValueForField("SumInsuredFour"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoFour")) {
				clearAndSendKeys(marineCargoClaimNoFourTextField, riskDetailsMCEntity.getStringValueForField("MarineCargoClaimNoFour"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateFour")) {
				clearAndSendKeys(marineCargoPolicyNoCertificateFourTextField, riskDetailsMCEntity.getStringValueForField("MarineCargoPolicyNoCertificateFour"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigNatureOfLossFour")) {
				clearAndSendKeys(natureOfLossFourTextArea, riskDetailsMCEntity.getStringValueForField("natureOfLossFour"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCauseOfLossFour")) {
				clearAndSendKeys(causeOfLossFourTextArea, riskDetailsMCEntity.getStringValueForField("CauseOfLossFour"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDate0fLossFour")) {
				String date0fLossFourDateFields=RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("Date0fLossFour"));
				clearAndEnterDate(date0fLossFourTextField, date0fLossFourDateFields);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCommentsFour")) {
				clearAndSendKeys(commentsFourTextArea, riskDetailsMCEntity.getStringValueForField("CommentsFour"));
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDateOfIntimationFour")) {
				String dateOfIntimationFourDate=RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("DateOfIntimationFour"));
				clearAndEnterDate(dateOfIntimationFourTextField, dateOfIntimationFourDate);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigTimeOfLossFour")) {
				clearAndSendKeys(timeOfLossFourTextField, riskDetailsMCEntity.getStringValueForField("TimeOfLossFour"));
			}
			//digvijay at
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDeclarationDate")) {
				String declarationDate=RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("DeclarationDate"));
				clearAndEnterDate(declarationTextField, declarationDate);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigBillDate")) {
				String billDate=RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("BillDate"));
				clearAndEnterDate(billDateTextField, billDate);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigInvoiceNumber")) {
				clearAndSendKeys(invoiceNumberTextField, riskDetailsMCEntity.getStringValueForField("InvoiceNumber"));
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigInvoiceDate")) {
				String invoiceDate=RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("InvoiceDate"));
				clearAndEnterDate(invoiceDateTextField, invoiceDate);
			}								
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigTypeOfBill")) {
				selectValueFromList(typeOfBillDropDown, riskDetailsMCEntity.getStringValueForField("TypeOfBill"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCommodityType")) {
				selectValueFromList(commodityTypeDropDown, riskDetailsMCEntity.getStringValueForField("CommodityType"));
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDeclaredSumInsured")) {
				clearAndSendKeys(declaredSumInsuredTextField, riskDetailsMCEntity.getStringValueForField("DeclaredSumInsured"));
			}

			if (riskDetailsMCEntity.getBooleanValueForField("ConfigBalanceSumInsured")) {
				clearAndSendKeys(balanceSumInsuredTextField, riskDetailsMCEntity.getStringValueForField("BalanceSumInsured"));
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCommoditySumInsured")) {
				clearAndSendKeys(commoditySumInsuredTextField, riskDetailsMCEntity.getStringValueForField("CommoditySumInsured"));
			}				
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDutyValue")) {
				clearAndSendKeys(dutyValueTextField, riskDetailsMCEntity.getStringValueForField("DutyValue"));
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigClaimAmount")) {
				clearAndSendKeys(claimAmountTextField, riskDetailsMCEntity.getStringValueForField("ClaimAmount"));
			}

		}
		else if(riskDetailsMCEntity.getAction().equalsIgnoreCase("verify")){
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
			}
			//OP-yogesh
		
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigSalvage")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("Salvage"), fetchValueFromTextFields(salvageTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigUnderInsuranceAmount")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("UnderInsuranceAmount"), fetchValueFromTextFields(underInsuranceAmountTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigNetPayableAmount")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("NetPayableAmount"), fetchValueFromTextFields(netPayableAmountTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigLossLocationAt")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("LossLocationAt"), fetchValueFromList(lossLocationAtDropDown), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigNearestPortLocation")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("NearestPortLocation"), fetchValueFromTextFields(nearestPortLocationTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigPolicyNoCertificateNoThree")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("PolicyNoCertificateNoThree"), fetchValueFromTextFields(policyNoCertificateNoThreeTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigSumInsured")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("SumInsured"), fetchValueFromTextFields(sumInsuredTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoThree")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("MarineCargoClaimNoThree"), fetchValueFromTextFields(marineCargoClaimNoThreeTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateNoThree")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("MarineCargoPolicyNoCertificateNoThree"), fetchValueFromTextFields(marineCargoPolicyNoCertificateNoThreeTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigNatureOfLossThree")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("NatureOfLossThree"), fetchValueFromTextFields(natureOfLossThreeTextArea), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCauseOfLossThree")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("CauseOfLossThree"), fetchValueFromTextFields(causeOfLossThreeTextArea), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDateOfLossThree")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("DateOfLossThree"), fetchValueFromTextFields(dateOfLossThreeTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCommentsThree")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("CommentsThree"), fetchValueFromTextFields(commentsThreeTextArea), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDateOfIntimationThree")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("DateOfIntimationThree"), fetchValueFromTextFields(dateOfIntimationThreeTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigTimeOfLossThree")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("TimeOfLossThree"), fetchValueFromTextFields(timeOfLossThreeTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigPolicyNoCertificateNoFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("PolicyNoCertificateNoFour"), fetchValueFromTextFields(policyNoCertificateNoFourTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigSumInsuredFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("SumInsuredFour"), fetchValueFromTextFields(sumInsuredFourTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigMarineCargoClaimNoFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("MarineCargoClaimNoFour"), fetchValueFromTextFields(marineCargoClaimNoFourTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigMarineCargoPolicyNoCertificateFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("MarineCargoPolicyNoCertificateFour"), fetchValueFromTextFields(marineCargoPolicyNoCertificateFourTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigNatureOfLossFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("NatureOfLossFour"), fetchValueFromTextFields(natureOfLossFourTextArea), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCauseOfLossFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("CauseOfLossFour"), fetchValueFromTextFields(causeOfLossFourTextArea), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDate0fLossFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("Date0fLossFour"), fetchValueFromTextFields(date0fLossFourTextField), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCommentsFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("CommentsFour"), fetchValueFromTextFields(commentsFourTextArea), AssertionType.WARNING);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDateOfIntimationFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("DateOfIntimationFour"), fetchValueFromTextFields(dateOfIntimationFourTextField), AssertionType.WARNING);
			}	
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigTimeOfLossFour")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("TimeOfLossFour"), fetchValueFromTextFields(timeOfLossFourTextField), AssertionType.WARNING);
			}
			//digvijay at
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDeclarationDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("DeclarationDate")) ,fetchValueFromTextFields(declarationTextField),AssertionType.WARNING);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigBillNumber")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("BillNumber"), fetchValueFromTextFields(billNumberTextArea), AssertionType.WARNING);
			}				
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigBillDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("BillDate")) ,fetchValueFromTextFields(billDateTextField),AssertionType.WARNING);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigInvoiceNumber")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("InvoiceNumber"), fetchValueFromTextFields(invoiceNumberTextField), AssertionType.WARNING);
			}				
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigInvoiceDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(riskDetailsMCEntity.getStringValueForField("InvoiceDate")) ,fetchValueFromTextFields(invoiceDateTextField),AssertionType.WARNING);
			}						
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigMarkNumber")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("MarkNumber"), fetchValueFromTextFields(markNumberTextArea), AssertionType.WARNING);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigTypeOfBill")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("TypeOfBill"), fetchValueFromList(typeOfBillDropDown), AssertionType.WARNING);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCommodityType")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("CommodityType"), fetchValueFromList(commodityTypeDropDown), AssertionType.WARNING);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDeclaredSumInsured")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("DeclaredSumInsured"), fetchValueFromTextFields(declaredSumInsuredTextField), AssertionType.WARNING);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigBalanceSumInsured")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("BalanceSumInsured"), fetchValueFromTextFields(balanceSumInsuredTextField), AssertionType.WARNING);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigConsigneeName")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("ConsigneeName"), fetchValueFromTextFields(consigneeNameTextArea), AssertionType.WARNING);
			}
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigConsigneeAddress")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("ConsigneeAddress"), fetchValueFromTextFields(consigneeAddressTextArea), AssertionType.WARNING);
			}		
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigCommoditySumInsured")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("CommoditySumInsured"), fetchValueFromTextFields(commoditySumInsuredTextField), AssertionType.WARNING);
			}				
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigDutyValue")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("DutyValue"), fetchValueFromTextFields(dutyValueTextField), AssertionType.WARNING);
			}			
			if (riskDetailsMCEntity.getBooleanValueForField("ConfigClaimAmount")) {
				assertReference.assertEquals(riskDetailsMCEntity.getStringValueForField("ClaimAmount"), fetchValueFromTextFields(claimAmountTextField), AssertionType.WARNING);
			}

		}
	}
	public void navigateToMainAttributePage(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}
	public void navigateToInsuredItem(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}
	public void navigateToPayment(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttribute(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void clickOnForwardButton(RiskDetailsMCEntity riskDetailsMCEntity){
		if (riskDetailsMCEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			/* claimRiskDtls2Title= new PageElement(By.xpath("//div//b[contains(text(),'"+riskDetDeclNoMCEntity.getStringValueForField("Claim Risk Dtls-2")+"')]"), " Claim Risk Dtls-2 Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(claimRiskDtls2Title);*/
		}
	}
	public void clickOnSaveButton(RiskDetailsMCEntity riskDetDeclNoMCEntity){
		if (riskDetDeclNoMCEntity.getBooleanValueForField("ConfigsaveButton")){		
			click(saveButton);
			switchToFrame("display");
		}
	}
	public void fillandSubmitClaimRiskDetailsDeclNoMarineCargo(RiskDetailsMCEntity riskDetailsMCEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(riskDetailsMCEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimRiskDetailsMarineCargo(riskDetailsMCEntity, assertReference);
			clickOnSaveButton(riskDetailsMCEntity);
			navigateToMainAttributePage(riskDetailsMCEntity);
			navigateToclaimHomePage(riskDetailsMCEntity);
			navigateToInsuredItem(riskDetailsMCEntity);
			navigateToDocument(riskDetailsMCEntity);
			navigateToParties(riskDetailsMCEntity);
			navigateToReserve(riskDetailsMCEntity);
			navigateToPayment(riskDetailsMCEntity);
			navigateToAttribute(riskDetailsMCEntity);
			navigateToInsuredItemDetails(riskDetailsMCEntity);
			navigateTInsuredItemAttribute(riskDetailsMCEntity);
			clickOnForwardButton(riskDetailsMCEntity);
		}
	}	
}
