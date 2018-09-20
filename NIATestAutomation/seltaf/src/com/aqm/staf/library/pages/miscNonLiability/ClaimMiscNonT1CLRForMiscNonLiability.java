package com.aqm.staf.library.pages.miscNonLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimMNT1CLRMNLEntity;

public class ClaimMiscNonT1CLRForMiscNonLiability extends BasePage{

	private PageElement miscNonT1CLRTitle;
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
	private PageElement applicableEventCodeLabel;
	private PageElement insuredNameTextField;
	private PageElement validSumInsuredTextField;
	private PageElement nextPageTitle;
	private PageElement forwardButton;
	private PageElement backButton;
	//SK-Yogesh
	private PageElement nameOfWitnessTextField;
	private PageElement addressOfWitnessTextField;
	//HH
	private PageElement capitalSumInsuredTextField;
	private PageElement sumInsuredForTableATextField;
	private PageElement sumInsuredForTableBTextField;
	private PageElement sumInsuredForTableCTextField;
	private PageElement sumInsuredForTableDTextField;
	private PageElement typeOfCauseDropDown;
	//SK
	private PageElement totalSumInsuredTextField;
	//BI
	private PageElement firstLossRequiredDropDown;
	private PageElement firstLossPercentageTextField;

	public ClaimMiscNonT1CLRForMiscNonLiability(WebDriver driver, String pageName) {
		super(driver, pageName);

		miscNonT1CLRTitle = new PageElement(By.xpath("//div//b[contains(text(),'T1-CLR')]"), "Misc Non T1-CLR Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredNameTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Insured Name", "input")), "Insured Name TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		validSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Valid Sum Insured", "input")), "Valid Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		//SK-Yogesh
		nameOfWitnessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Name of witness ')]/following::input"), "Name of witness TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addressOfWitnessTextField=new PageElement(By.xpath("//td//div[contains(text(),'Address of witness ')]/following::input"), "Address of witness TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total sum insured", "input")), "Total sum insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//HH
		capitalSumInsuredTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Capital Sum Insured", "input")), "Capital Sum Insured TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForTableATextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Table A", "input")), "Sum Insured for Table A TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForTableBTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Table B", "input")), "Sum Insured for Table B TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForTableCTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Table C", "input")), "Sum Insured for Table C TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sumInsuredForTableDTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured for Table D", "input")), "Sum Insured for Table D TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfCauseDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Cause", "select")), "Type of Cause DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//BI
		firstLossRequiredDropDown= new PageElement(By.xpath(locatorforQuestionAnswerPanel("First Loss Required", "select")), "First Loss Required DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		firstLossPercentageTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("First Loss (Percentage)", "input")), "First Loss (Percentage) TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	public void fillClaimMiscNonT1CLRForMiscNonLiabilityDetails(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity, CustomAssert assertReference) throws InterruptedException{
		if(claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(claimMNT1CLRMNLEntity.getAction().equalsIgnoreCase("add") || claimMNT1CLRMNLEntity.getAction().equalsIgnoreCase("edit")){

				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigInsuredName")) {
					clearAndSendKeys(insuredNameTextField, claimMNT1CLRMNLEntity.getStringValueForField("InsuredName"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigValidSumInsured")) {
					clearAndSendKeys(validSumInsuredTextField, claimMNT1CLRMNLEntity.getStringValueForField("ValidSumInsured"));
				}
				//SK-Yogesh
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigNameOfWitness")) {
					clearAndSendKeys(nameOfWitnessTextField, claimMNT1CLRMNLEntity.getStringValueForField("NameOfWitness"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigAddressOfWitness")) {
					clearAndSendKeys(addressOfWitnessTextField, claimMNT1CLRMNLEntity.getStringValueForField("AddressOfWitness"));
				}
				//HH
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
					clearAndSendKeys(capitalSumInsuredTextField, claimMNT1CLRMNLEntity.getStringValueForField("CapitalSumInsured"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigSumInsuredForTableA")) {
					clearAndSendKeys(sumInsuredForTableATextField, claimMNT1CLRMNLEntity.getStringValueForField("SumInsuredForTableA"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigSumInsuredForTableB")) {
					clearAndSendKeys(sumInsuredForTableBTextField, claimMNT1CLRMNLEntity.getStringValueForField("SumInsuredForTableB"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigSumInsuredForTableC")) {
					clearAndSendKeys(sumInsuredForTableCTextField, claimMNT1CLRMNLEntity.getStringValueForField("SumInsuredForTableC"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigSumInsuredForTableD")) {
					clearAndSendKeys(sumInsuredForTableDTextField, claimMNT1CLRMNLEntity.getStringValueForField("SumInsuredForTableD"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigTypeOfCause")) {
					selectValueFromList(typeOfCauseDropDown, claimMNT1CLRMNLEntity.getStringValueForField("TypeOfCause"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
					clearAndSendKeys(totalSumInsuredTextField, claimMNT1CLRMNLEntity.getStringValueForField("TotalSumInsured"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigFirstLossRequired")) {
					selectValueFromList(firstLossRequiredDropDown, claimMNT1CLRMNLEntity.getStringValueForField("FirstLossRequired"));
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigFirstLossPercentage")) {
					clearAndSendKeys(firstLossPercentageTextField, claimMNT1CLRMNLEntity.getStringValueForField("FirstLossPercentage"));
				}
			}
			else if(claimMNT1CLRMNLEntity.getAction().equalsIgnoreCase("verify")){

				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigClaimNumber")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigPolicyNumber")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigClaimDate")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigClaimStatus")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigProductCode")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigInsuredSerialNo")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("InsuredSerialNo"),fetchValueFromFields(insuredSerialNoLabel), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigInsuredItemCode")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("InsuredItemCode"),fetchValueFromFields(insuredItemCodeLabel), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigApplicableEventCode")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigInsuredName")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("InsuredName"),fetchValueFromTextFields(insuredNameTextField), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigValidSumInsured")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("ValidSumInsured"),fetchValueFromTextFields(validSumInsuredTextField), AssertionType.WARNING);
				}
				//SK-Yogesh
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigNameOfWitness")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("NameOfWitness"),fetchValueFromTextFields(nameOfWitnessTextField), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigAddressOfWitness")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("AddressOfWitness"),fetchValueFromTextFields(addressOfWitnessTextField), AssertionType.WARNING);
				}
				//HH
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigCapitalSumInsured")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("CapitalSumInsured"),fetchValueFromTextFields(capitalSumInsuredTextField), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigSumInsuredForTableA")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("SumInsuredForTableA"),fetchValueFromTextFields(sumInsuredForTableATextField), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigSumInsuredForTableB")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("SumInsuredForTableB"),fetchValueFromTextFields(sumInsuredForTableBTextField), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigSumInsuredForTableC")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("SumInsuredForTableC"),fetchValueFromTextFields(sumInsuredForTableCTextField), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigSumInsuredForTableD")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("SumInsuredForTableD"),fetchValueFromTextFields(sumInsuredForTableDTextField), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigTypeOfCause")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("TypeOfCause"),fetchValueFromList(typeOfCauseDropDown), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigTotalSumInsured")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("TotalSumInsured"),fetchValueFromTextFields(totalSumInsuredTextField), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigFirstLossRequired")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("FirstLossRequired"),fetchValueFromList(firstLossRequiredDropDown), AssertionType.WARNING);
				}
				if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigFirstLossPercentage")) {
					assertReference.assertEquals(claimMNT1CLRMNLEntity.getStringValueForField("FirstLossPercentage"),fetchValueFromTextFields(firstLossPercentageTextField), AssertionType.WARNING);
				}
			}
		}
	}
	public void proceedNextPage(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			nextPageTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimMNT1CLRMNLEntity.getStringValueForField("NextPageTitle")+"')]"), "Next Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(nextPageTitle);
		}
	}	
	public void navigateToMainAttributePage(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}
	public void navigateToAttribute(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	public void navigateToInsuredItemDetails(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigInsuredItemDetailsTab")){		
			click(insuredItemDetailsTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemDetailsTabTitle);
		}
	}
	public void navigateTInsuredItemAttribute(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity){
		if (claimMNT1CLRMNLEntity.getBooleanValueForField("ConfigInsuredItemAttributeTab")){		
			click(insuredItemAttributeTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemAttributeTabTitle);
		}
	}
	public void fillandSubmitClaimMiscNonT1CLRForMiscNonLiabilityDetails(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimMNT1CLRMNLEntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimMiscNonT1CLRForMiscNonLiabilityDetails(claimMNT1CLRMNLEntity, assertReference);
			proceedNextPage(claimMNT1CLRMNLEntity);
			navigateToMainAttributePage(claimMNT1CLRMNLEntity);
			navigateToclaimHomePage(claimMNT1CLRMNLEntity);
			navigateToInsuredItem(claimMNT1CLRMNLEntity);
			navigateToDocument(claimMNT1CLRMNLEntity);
			navigateToParties(claimMNT1CLRMNLEntity);
			navigateToReserve(claimMNT1CLRMNLEntity);
			navigateToPayment(claimMNT1CLRMNLEntity);
			navigateToAttribute(claimMNT1CLRMNLEntity);
			navigateToInsuredItemDetails(claimMNT1CLRMNLEntity);
			navigateTInsuredItemAttribute(claimMNT1CLRMNLEntity);
		}
	}
}

