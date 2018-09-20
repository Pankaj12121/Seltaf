package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccountingBGOrCDSearchEntity;
import com.aqm.staf.library.databin.PolBrokerAgentTPADetEntity;

public class BrokerAgentTPAChangeDet extends BasePage {
	private PageElement partyCodeTextField;
	private PageElement partyCodeFindButton;
	private PageElement partyCodeToBeSelectedLink;
	private PageElement organizationRadioButton;
	private PageElement individualRadioButton;
	private PageElement partySearchButton;
	
	private PageElement policyNoFindButton;
	private PageElement brokerCodeFindButton;
	private PageElement sITECodeFindButton;
	private PageElement changeStakeCodeDropdown;
	private PageElement BrokerNameTextField;
	private PageElement policyNoTextField;
	private PageElement policyNosearchButton;
	private PageElement searchButton;
	private PageElement saveButton;
	public BrokerAgentTPAChangeDet(WebDriver driver, String pageName) {
		super(driver, pageName);
		organizationRadioButton = new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//following::input[@type='radio']"), "Organization Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		individualRadioButton = new PageElement(By.xpath("//td//b[contains(text(),'Individual')]//preceding::input[@type='radio']"), "Organization Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		partyCodeTextField = new PageElement(By.name("pPartyCode"), "Party Code  TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		partyCodeFindButton = new PageElement(By.xpath("//td//b[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"), "Party Code Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		partySearchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//
		policyNoFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Policy No')]/following::input/following::a[@name='firstFocus']"), "Policy No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		brokerCodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Broker Code')]/following::input/following::a[@name='firstFocus']"), "Broker Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		sITECodeFindButton=new PageElement(By.xpath("//td//b[contains(text(),'SITE Code')]/following::input/following::a[@name='firstFocus']"), "SITE Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		changeStakeCodeDropdown=new PageElement(By.xpath("//td//b[contains(text(),'Change Stake Code')]/following::select"), "Change Stake Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		BrokerNameTextField= new PageElement(By.xpath("//td//b[contains(text(),'Broker Name')]/following::input"), "Broker Name",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		
		policyNoTextField= new PageElement(By.xpath("//td//b[contains(text(),'Policy No.')]/following::input"), "Policy No",false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNosearchButton=new PageElement(By.name("Search5465"), "policy Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		searchButton = new PageElement(By.name("Search"),"Search Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		saveButton = new PageElement(By.name("Save"),"Save Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}
	public void clickOnPolicyNoFindButton(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) throws InterruptedException{
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigPolicyNo")){
			click(policyNoFindButton);
			try{
				Thread.sleep(3000);
				switchToWindow("Policy Search List");
			}catch(Exception e){
				switchToWindow("Policy Search List");
			}
		}
	}

	public void fillPolicyNoSearch(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) throws InterruptedException{
		clickOnPolicyNoFindButton(polBrokerAgentTPADetEntity);
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigPolicyNo")) {	
			Thread.sleep(3000);
			clearAndSendKeys(policyNoTextField, polBrokerAgentTPADetEntity.getStringValueForField("PolicyNo"));
		}
		
		click(policyNosearchButton);
		selectPolicyNo(polBrokerAgentTPADetEntity);
	}
	public void selectPolicyNo(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) throws InterruptedException{
		String	PolicyNoCode=polBrokerAgentTPADetEntity.getStringValueForField("PolicyNo");
		PageElement PolicyNoCodeLinkTextField=new PageElement(By.linkText(PolicyNoCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(PolicyNoCodeLinkTextField);
		switchToWindow();
		switchToFrame("display");
	}
	public void clickOnBrokerCodeFindButton(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) throws InterruptedException{
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigBrokerCode")){
			click(brokerCodeFindButton);
			try{
				Thread.sleep(3000);
				switchToWindow("Party Maintenance");
			}catch(Exception e){
				switchToWindow("Party Maintenance");
			}
		}
	}

	public void fillBrokerCodeSearch(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) throws InterruptedException{
		clickOnBrokerCodeFindButton(polBrokerAgentTPADetEntity);
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigOrganization")) {
			check(organizationRadioButton);
		}
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigIndividual")) {
			check(individualRadioButton);
		}
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigPartyCode")) {	
			Thread.sleep(3000);
			clearAndSendKeys(partyCodeTextField, polBrokerAgentTPADetEntity.getStringValueForField("PartyCode"));
		}
		
		click(partySearchButton);
		selectpartyCode(polBrokerAgentTPADetEntity);
	}
	
	public void selectpartyCode(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) throws InterruptedException{
		String	partyCode=polBrokerAgentTPADetEntity.getStringValueForField("PartyCode");
		PageElement partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(partyCodeLinkTextField);
		switchToWindow();
		switchToFrame("display");
	}
	
	public void clickOnsITECodeFindButton(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) throws InterruptedException{
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigSITECode")){
			click(sITECodeFindButton);
			try{
				Thread.sleep(3000);
				switchToWindow("Party Maintenance");
			}catch(Exception e){
				switchToWindow("Party Maintenance");
			}
		}
	}

	public void fillsITECodeSearch(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) throws InterruptedException{
		clickOnsITECodeFindButton(polBrokerAgentTPADetEntity);
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigOrganization")) {
			check(organizationRadioButton);
		}
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigIndividual")) {
			check(individualRadioButton);
		}
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigSITEPartyCode")) {	
			Thread.sleep(3000);
			clearAndSendKeys(partyCodeTextField, polBrokerAgentTPADetEntity.getStringValueForField("SITEPartyCode"));
		}
		
		click(partySearchButton);
		selectSITEpartyCode(polBrokerAgentTPADetEntity);
	}
	
	public void selectSITEpartyCode(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) throws InterruptedException{
		String	partyCode=polBrokerAgentTPADetEntity.getStringValueForField("SITEPartyCode");
		PageElement partyCodeLinkTextField=new PageElement(By.linkText(partyCode), "Party Code in Search Panel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		click(partyCodeLinkTextField);
		switchToWindow();
		switchToFrame("display");
	}
	public void fillBrokerAgentTPAChangeDet(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity, CustomAssert assertReference) throws InterruptedException{
		if(polBrokerAgentTPADetEntity.getAction().equalsIgnoreCase("add") || polBrokerAgentTPADetEntity.getAction().equalsIgnoreCase("edit")){
			if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigPolicyNo")) {
				fillPolicyNoSearch(polBrokerAgentTPADetEntity);
				click(searchButton);
			}
			if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigChangeStakeCode")) {
				selectValueFromList(changeStakeCodeDropdown, polBrokerAgentTPADetEntity.getStringValueForField("ChangeStakeCode"));
			}
			if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigBrokerCode")) {
				fillBrokerCodeSearch(polBrokerAgentTPADetEntity);
			}
			if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigSITECode")) {
				fillsITECodeSearch(polBrokerAgentTPADetEntity);
			}
		
		}
		else if(polBrokerAgentTPADetEntity.getAction().equalsIgnoreCase("verify")){
			
		}
		
	}
	public void submitBrokerAgentTPAChangeDet(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity) {
		if (polBrokerAgentTPADetEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void fillAndSubmitBrokerAgentTPAChangeDet(PolBrokerAgentTPADetEntity polBrokerAgentTPADetEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polBrokerAgentTPADetEntity.getConfigExecute())){
			switchToFrame("display");
			fillBrokerAgentTPAChangeDet(polBrokerAgentTPADetEntity, assertReference);
			submitBrokerAgentTPAChangeDet(polBrokerAgentTPADetEntity);
		}
	}
}
