package com.aqm.staf.library.pages.personalAccident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.ClaimPolPropertyTCLMEntity;
import com.aqm.staf.library.databin.ClaimPolPropertyTCLMEntity;

public class ClaimAttrPolicyPropertyT1CLMPage extends BasePage {
	private PageElement policyPropertyTCLMTitle;
	private PageElement claimTitle;
	private PageElement memberTitle;
	private PageElement documentTitle;
	private PageElement partiesTitle;
	private PageElement reserveTitle;
	private PageElement paymentTitle;
	private PageElement attributesTitle;
	private PageElement claimDetailsTitlePage;
	private PageElement claimMemberDamageTitlePage;
	private PageElement claimDocumentsTitlePage;
	private PageElement claimAssociatedPartiesTitlePage;
	private PageElement claimReserveTitlePage;
	private PageElement claimPaymentsTitlePage;
	private PageElement claimPropertyTitlePage;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement applicableEventCodeLabel;
	private PageElement amountClaimedTextField;
	private PageElement amountPaidTextField;
	private PageElement balanceSumInsuredBeforeTheCurrentClaimTextArea;
	private PageElement nextArrowButton;
	private PageElement saveButton;
	private PageElement backButton;

	public ClaimAttrPolicyPropertyT1CLMPage(WebDriver driver,String pageName) {
		super(driver, pageName);
		policyPropertyTCLMTitle = new PageElement(By.xpath("//div//b[contains(text(),'Policy Property T1-CLM')]"), "Policy Property T1-CLM Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimTitle = new PageElement(By.xpath("//b//div[contains(text(),'Claim')]"),"Claim Page", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10 );
		//insuredItemTitle = new PageElement(By.xpath("//div[contains(text(),'Insured Item')]"), "Insured Item Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		memberTitle = new PageElement(By.linkText("Member"), "Member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTitle = new PageElement(By.xpath("//a[@title='Document']/*"), "Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTitle = new PageElement(By.linkText("Parties"), "Parties Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTitle = new PageElement(By.linkText("Reserve"), "Reserve Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTitle = new PageElement(By.linkText("Payment"), "Payment Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle = new PageElement(By.linkText("Attributes"), "Attributes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		claimDetailsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim Details Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimMemberDamageTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'MemberDamage')]"), "Claim Member Damage Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDocumentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Documents')]"), "Claim Document Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimAssociatedPartiesTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Associated Parties')]"), "Claim Associated Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimReserveTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Parties Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimPaymentsTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Payments')]"), "Claim Payments Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimPropertyTitlePage = new PageElement(By.xpath("//div//b[contains(text(),'Claim Property')]"),"Claim Property Title Page", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "number")), "Claim number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Product Code")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel = new PageElement(By.xpath(genericLocatorforLabel("S0201", " Applicable Event Code")), " Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		amountClaimedTextField = new PageElement(By.xpath("//td//div[contains(text(),'Amount Claimed')]/following::input[1]"), "Amount Claimed TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		amountPaidTextField = new PageElement(By.xpath("//td//div[contains(text(),'Amount Paid')]/following::input[1]"), "Amount Paid TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		balanceSumInsuredBeforeTheCurrentClaimTextArea = new PageElement(By.xpath("//td//div[contains(text(),'Balance Sum Insured before the Current Claim')]/following::input[1]"), "Balance Sum Insured before the Current Claim TextArea", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextArrowButton = new PageElement(By.name("Next1"), "Next Arrow Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton = new PageElement(By.name("btnBack"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
	}
	//SERVICES//

	public void fillClaimAttrPolicyPropertyT1CLMPage(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity, CustomAssert assertReference){

		if(claimPolPropertyTCLMEntity.getAction().equalsIgnoreCase("add") || claimPolPropertyTCLMEntity.getAction().equalsIgnoreCase("edit")){
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigAmountClaimed")) {
				clearAndSendKeys(amountClaimedTextField, claimPolPropertyTCLMEntity.getStringValueForField("AmountClaimed"));
			}
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigAmountPaid")) {
				clearAndSendKeys(amountPaidTextField, claimPolPropertyTCLMEntity.getStringValueForField("AmountPaid"));
			}
		}

		if(claimPolPropertyTCLMEntity.getAction().equalsIgnoreCase("verify")){

			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigClaimNo")) {
				assertReference.assertEquals(claimPolPropertyTCLMEntity.getStringValueForField("ClaimNo"),fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(claimPolPropertyTCLMEntity.getStringValueForField("PolicyNo"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(claimPolPropertyTCLMEntity.getStringValueForField("ClaimDate")),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimPolPropertyTCLMEntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimPolPropertyTCLMEntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimPolPropertyTCLMEntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigAmountClaimed")) {
				assertReference.assertEquals(claimPolPropertyTCLMEntity.getStringValueForField("AmountClaimed"),fetchValueFromFields(amountClaimedTextField), AssertionType.WARNING);
			}
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigAmountPaid")) {
				assertReference.assertEquals(claimPolPropertyTCLMEntity.getStringValueForField("AmountPaid"),fetchValueFromFields(amountPaidTextField), AssertionType.WARNING);
			}
			if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigBalanceSumInsuredBeforeCurrentClaim")) {
				assertReference.assertEquals(true, fetchValueFromTextFields(balanceSumInsuredBeforeTheCurrentClaimTextArea).contains(claimPolPropertyTCLMEntity.getStringValueForField("BalanceSumInsuredBeforeCurrentClaim")), AssertionType.WARNING);
			}
		}
	}

	public void navigateToClaim(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity){
		if(claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigClaimTab")){
			click(claimTitle);
			switchToFrame("display");
			isElementDisplayed(claimDetailsTitlePage);
		}
	}
	public void navigateToMember(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity){
		if(claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			switchToFrame("display");
			isElementDisplayed(claimMemberDamageTitlePage);
		}
	}
	public void navigateToDocument(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity){
		if(claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			switchToFrame("display");
			isElementDisplayed(claimDocumentsTitlePage);
		}
	}
	public void navigateToParties(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity){
		if(claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigPartiesTab")){
			click(partiesTitle);
			switchToFrame("display");
			isElementDisplayed(claimAssociatedPartiesTitlePage);
		}
	}
	public void navigateToReserve(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity){
		if(claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigReserveTab")){
			click(reserveTitle);
			switchToFrame("display");
			isElementDisplayed(claimReserveTitlePage);
		}
	}
	public void navigateToPayment(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity){
		if(claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigPaymentTab")){
			click(paymentTitle);
			switchToFrame("display");
			isElementDisplayed(claimPaymentsTitlePage);
		}
	}
	public void navigateToAttributes(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity){
		if(claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigAttributesTab")){
			click(attributesTitle);
			switchToFrame("display");
			isElementDisplayed(claimPropertyTitlePage);
		}
	}
	public void proceedCourtMasterForAllProductDetails(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity) {
		if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigNextArrowButton")) {
			click(nextArrowButton);
		}
	}
	public void saveCourtMasterForAllProductDetails(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity) {
		if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backFromCourtMasterForAllProductDetails(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity) {
		if (claimPolPropertyTCLMEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndSubmitCourtMasterForAllProductDetails(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntity, CustomAssert assertReference) {
		if (isConfigTrue(claimPolPropertyTCLMEntity.getConfigExecute())){
			fillClaimAttrPolicyPropertyT1CLMPage(claimPolPropertyTCLMEntity, assertReference);
			navigateToClaim(claimPolPropertyTCLMEntity);
			navigateToMember(claimPolPropertyTCLMEntity);
			navigateToDocument(claimPolPropertyTCLMEntity);
			navigateToParties(claimPolPropertyTCLMEntity);
			navigateToReserve(claimPolPropertyTCLMEntity);
			navigateToPayment(claimPolPropertyTCLMEntity);
			navigateToAttributes(claimPolPropertyTCLMEntity);
			proceedCourtMasterForAllProductDetails(claimPolPropertyTCLMEntity);
			saveCourtMasterForAllProductDetails(claimPolPropertyTCLMEntity);
			//backCourtMasterForAllProductDetails(claimPolPropertyTCLMEntity);
		}
	}




}
