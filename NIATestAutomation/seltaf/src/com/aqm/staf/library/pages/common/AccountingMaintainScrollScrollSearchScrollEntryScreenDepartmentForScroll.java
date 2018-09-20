package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.BasePage;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.PageElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AccDepartmentForScrollEntity;
import com.aqm.staf.library.databin.AccoScrollEntryEntity;
import com.aqm.staf.library.databin.AccountngCollectnSearcEntity;
import com.aqm.staf.library.databin.PolicyPremCollectionEntity;

public class AccountingMaintainScrollScrollSearchScrollEntryScreenDepartmentForScroll
extends BasePage {
	private PageElement departmentForScrollPageTitle;
	private PageElement departmentDropdown;
	private PageElement engineNoTextField;
	private PageElement chasisNoTextField;
	private PageElement newVehicleDropdown;
	private PageElement vehicleNumberTextField;
	private PageElement saveButton;
	private PageElement addButton;
	private PageElement deleteButton;
	private PageElement backButton;
	private PageElement scrollEntryScreenPageTitle;
	private PageElement scrollNumberTextField;
	public AccountingMaintainScrollScrollSearchScrollEntryScreenDepartmentForScroll(
			WebDriver driver, String pageName,int rowcount) {
		super(driver, pageName);
		departmentForScrollPageTitle = new PageElement(By.xpath("//div//b[contains(text(),'Department for Scroll')]"),"Department For Scroll Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//Table - Enter Scroll Specific Department(s)//
		departmentDropdown = new PageElement(By.name("pDepartment"+rowcount+""), "Department Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		engineNoTextField =  new PageElement(By.name("pEngineNo"+rowcount+""), "Engine No TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		chasisNoTextField = new PageElement(By.name("pChasisNo"+rowcount+""), "Chasis No TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		newVehicleDropdown = new PageElement(By.name("pNewVehicle"+rowcount+""), "New Vehicle Dropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//vehicleNumberTextField = new PageElement(By.xpath("//td//b[contains(text(),'Vehicle Number')]"), "Vehicle Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		saveButton = new PageElement(By.name("Save"),"Save Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		addButton = new PageElement(By.name("btnAdd"),"Add Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		deleteButton = new PageElement(By.name("btnDelete"),"Delete Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button",false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		scrollEntryScreenPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Scroll Entry Screen')]"), "Scroll Entry Screen Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		scrollNumberTextField=new PageElement(By.name("pScrollNumber"), "Scroll Number TextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}
	//TABLE - Enter Scroll Specific Department(s)//

	public void fillAccountingScrollDepartmentDetails(AccoScrollEntryEntity accoScrollEntryEntity, CustomAssert assertReference) throws InterruptedException{

		if(accoScrollEntryEntity.getAction().equalsIgnoreCase("add")||accoScrollEntryEntity.getAction().equalsIgnoreCase("edit")){
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigDepartmentDropdown")) {
				selectValueFromList(departmentDropdown, accoScrollEntryEntity.getStringValueForField("DepartmentDropdown"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigEngineNo")) {
				clearAndSendKeys(engineNoTextField, accoScrollEntryEntity.getStringValueForField("EngineNo"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigChasisNo")) {
				clearAndSendKeys(chasisNoTextField, accoScrollEntryEntity.getStringValueForField("ChasisNo"));
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigNewVehicleDropdown")) {
				selectValueFromList(newVehicleDropdown, accoScrollEntryEntity.getStringValueForField("NewVehicleDropdown"));
			}
			/*if (accDepartmentForScrollEntity.getBooleanValueForField("ConfigVehicleNo")) {
				clearAndSendKeys(vehicleNumberTextField, accDepartmentForScrollEntity.getStringValueForField("VehicleNo"));
			}*/
		}
		else if(accoScrollEntryEntity.getAction().equalsIgnoreCase("verify")){
			AccDepartmentForScrollEntity actualAccDepartmentForScrollEntity=new AccDepartmentForScrollEntity();

			if (accoScrollEntryEntity.getBooleanValueForField("ConfigDepartmentDropdown")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("DepartmentDropdown", fetchValueFromList(departmentDropdown));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("DepartmentDropdown"),actualAccDepartmentForScrollEntity.getStringValueForField("DepartmentDropdown"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigEngineNo")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("EngineNo", fetchValueFromTextFields(engineNoTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("EngineNo"),actualAccDepartmentForScrollEntity.getStringValueForField("EngineNo"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigChasisNo")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("ChasisNo", fetchValueFromTextFields(chasisNoTextField));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("ChasisNo"),actualAccDepartmentForScrollEntity.getStringValueForField("ChasisNo"), AssertionType.WARNING);
			}
			if (accoScrollEntryEntity.getBooleanValueForField("ConfigNewVehicleDropdown")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("NewVehicleDropdown", fetchValueFromList(newVehicleDropdown));
				assertReference.assertEquals(accoScrollEntryEntity.getStringValueForField("NewVehicleDropdown"),actualAccDepartmentForScrollEntity.getStringValueForField("NewVehicleDropdown"), AssertionType.WARNING);
			}
			/*if (accDepartmentForScrollEntity.getBooleanValueForField("ConfigVehicleNo")) {
				actualAccDepartmentForScrollEntity.setStringValueForField("VehicleNo", fetchValueFromTextFields(vehicleNumberTextField));
				assertReference.assertEquals(accDepartmentForScrollEntity.getStringValueForField("VehicleNo"),actualAccDepartmentForScrollEntity.getStringValueForField("VehicleNo"), AssertionType.WARNING);
			}*/
		}
	}

	public void submitAccountingMaintainScrollDepartmentForScrollDetails(AccoScrollEntryEntity accoScrollEntryEntity) {
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
			isElementDisplayed(scrollEntryScreenPageTitle);
			switchToFrame("display");
			accoScrollEntryEntity.setStringValueForField("ScrollNumber", fetchValueFromTextFields(scrollNumberTextField));

		}
	}
	public void addAccountingMaintainScrollDepartmentForScrollDetails(AccoScrollEntryEntity accoScrollEntryEntity) {
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigAddButton")) {
			click(addButton);
		}
	}
	public void deleteFromAccountingMaintainScrollDepartmentForScroll(AccoScrollEntryEntity accoScrollEntryEntity) {
		if (accoScrollEntryEntity.getBooleanValueForField("ConfigDeleteButton")) {
			click(deleteButton);
		}
	}

	//Only Buttons and Table//
	public void fillAndSubmitAccountingMaintainScrollDepartmentForScroll(AccoScrollEntryEntity accoScrollEntryEntity , CustomAssert assertReference) throws InterruptedException {
		switchToFrame("display");
		fillAccountingScrollDepartmentDetails(accoScrollEntryEntity,assertReference);
		submitAccountingMaintainScrollDepartmentForScrollDetails(accoScrollEntryEntity);
		addAccountingMaintainScrollDepartmentForScrollDetails(accoScrollEntryEntity);
		deleteFromAccountingMaintainScrollDepartmentForScroll(accoScrollEntryEntity);

	}
}

