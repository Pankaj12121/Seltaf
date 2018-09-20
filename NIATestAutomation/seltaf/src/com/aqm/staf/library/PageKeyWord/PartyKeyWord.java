package com.aqm.staf.library.PageKeyWord;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.framework.FrameworkServices;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.entity.ExecutionTestSteps;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.databin.AccoScrollEntryEntity;
import com.aqm.staf.library.databin.AccountingBGOrCDSearchEntity;
import com.aqm.staf.library.databin.AccountingDistributionTable;
import com.aqm.staf.library.databin.AccountingEntity;
import com.aqm.staf.library.databin.ClaimPaymentEntity;
import com.aqm.staf.library.databin.ClaimTransferToAPEntity;
import com.aqm.staf.library.databin.MembAtachCovrgPremSchdEntity;
import com.aqm.staf.library.databin.PartyContactsDetailsEntity;
import com.aqm.staf.library.databin.PartyEntity;
import com.aqm.staf.library.databin.PartyFollowupDetailsEntity;
import com.aqm.staf.library.databin.PartyPartyRoleClaimantEntity;
import com.aqm.staf.library.databin.PartyRoleBuyerMastINDEntity;
import com.aqm.staf.library.databin.PartyRolBrokerCommiEntity;
import com.aqm.staf.library.databin.PartyRolesFunctDetailsEntity;
import com.aqm.staf.library.databin.PartyRolesFunctionsEntity;
import com.aqm.staf.library.databin.PartyRolesMemberDetailEntity;
import com.aqm.staf.library.databin.PolicyEntity;
import com.aqm.staf.library.databin.PolicyMemberAttributeEntity;
import com.aqm.staf.library.databin.PolicyMemberDetailsEntity;
import com.aqm.staf.library.databin.PolicyPaymDetailsCycleEntity;
import com.aqm.staf.library.databin.PolicyPremCollectionEntity;
import com.aqm.staf.library.databin.PolicyPremiumScheduleEntity;
import com.aqm.staf.library.databin.PolicyRelationDetailEntity;
import com.aqm.staf.library.databin.PolicyShowVersionPageEntity;
import com.aqm.staf.library.databin.RelatedPartyRelationsEntity;
import com.aqm.staf.library.databin.SecurityPartyEntity;
import com.aqm.staf.library.pages.common.PartyContactsPage;
import com.aqm.staf.library.pages.common.PartyContactsPageDetailsPage;
import com.aqm.staf.library.pages.common.PartyDetailsCreateEditPage;
import com.aqm.staf.library.pages.common.PartyFollowupDetails;
import com.aqm.staf.library.pages.common.PartyFollowupListPage;
import com.aqm.staf.library.pages.common.PartyPartyRolesBrokerageCommission;
import com.aqm.staf.library.pages.common.PartyPartyRolesBuyerMasterIND;
import com.aqm.staf.library.pages.common.PartyPartyRolesMemberDOB;
import com.aqm.staf.library.pages.common.PartyPartyRolesPartyFunctionDetails;
import com.aqm.staf.library.pages.common.PartyPartyRolesPartyFunctions;
import com.aqm.staf.library.pages.common.PartyRelatedPartyDetailsPage;
import com.aqm.staf.library.pages.common.PartySearchPage;
import com.aqm.staf.library.pages.common.Party_PartyRole_Claimant;
import com.aqm.staf.library.pages.common.Party_PartyRolesPartyFunctions;
import com.aqm.staf.library.pages.common.Party_Relations;

public class PartyKeyWord extends FunctionalKeywords{
	public void createParty(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		/*keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();*/
		List<PartyEntity> partyEntitiesList=testData.getPartyEntities();
		for(PartyEntity partyEntity:partyEntitiesList){
			if(partyEntity.getAction().equalsIgnoreCase("add") && partyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPage partySearchPage=new PartySearchPage(driver, "Party Search Page");
				partySearchPage.navigateToPartySearchPage();
				partySearchPage.navigateToPartyCreatePage();
				PartyDetailsCreateEditPage partyDetailsCreatePage = new PartyDetailsCreateEditPage(driver, "Party Details Create Page");
				partyDetailsCreatePage.fillandSubmitPartyDetails(partyEntity, assertReference);
				partySearchPage.fetchPartyCode(partyEntity);
				testData.updateRecordsForCriteria(partyEntity);
				setEditPartyDependency(partyEntity, testData);
			}
		}
	}

	public void verifyParty(ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<PartyEntity> partyEntitiesList=testData.getPartyEntities();
		for(PartyEntity partyEntity:partyEntitiesList){
			if(partyEntity.getAction().equalsIgnoreCase("verify")&& partyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPage partySearchPage=new PartySearchPage(driver, "Party Search Page");
				partySearchPage.navigateToPartySearchPage();
				partySearchPage.fillAndSearchPartyDetails(partyEntity);
				partySearchPage.selectSearchPartyCode(partyEntity);
				partySearchPage.navigateToPartyDetailsPage();

				PartyDetailsCreateEditPage partyDetailsViewPage=new PartyDetailsCreateEditPage(driver, "Party Details Create Page");
				partyDetailsViewPage.fillandSubmitPartyDetails(partyEntity, assertReference);

				if(partyEntity.getBooleanValueForField("ConfigPartyRoles")) {
					List<PartyRolesFunctDetailsEntity> partyRolesFunctionsEntityList=testData.getPartyRolesFunctDetailsRecords();
					for(PartyRolesFunctDetailsEntity partyRolesFunctDetailsData:partyRolesFunctionsEntityList){
						if(partyEntity.getParentKey().equalsIgnoreCase(partyRolesFunctDetailsData.getChildKey())){
							if(partyRolesFunctDetailsData.getAction().equalsIgnoreCase("verify")&& partyRolesFunctDetailsData.getStepGroup().equalsIgnoreCase(stepGroup)){
								partyDetailsViewPage.navigateToPartyRoles(partyEntity); 
								/*List<PartyRolesFunctionsEntity> partyRolesFunctionsEntityList=testData.get*/
								PartyPartyRolesPartyFunctions partyPartyRolesPartyFunctions=new PartyPartyRolesPartyFunctions(driver, "Party_Party Function");
								partyPartyRolesPartyFunctions.selectFunctionCodeFromSearchPage(partyRolesFunctDetailsData);
								/******************Click On Function Code and Open Record in View Mode*****************/
								PartyPartyRolesPartyFunctionDetails partyPartyRolesPartyFunctionDetails=new PartyPartyRolesPartyFunctionDetails(driver, "Party Function Details");
								partyPartyRolesPartyFunctionDetails.fillAndSubmitPartyFunctionDetails(partyRolesFunctDetailsData, assertReference);

								/******************Verify Party Function Details Page and Click on Next Button*******************/
								if(partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("MEMBER") || partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("POLICY-HOL")){
									List<PartyRolesMemberDetailEntity> partyRolesMemberDetailEntityList=testData.getPartyRolesMemberDetailRecords();
									for(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity :partyRolesMemberDetailEntityList){
										if(partyEntity.getParentKey().equalsIgnoreCase(partyRolesMemberDetailEntity.getChildKey())){
											if(partyRolesMemberDetailEntity.getAction().equalsIgnoreCase("verify") && partyRolesMemberDetailEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
												PartyPartyRolesMemberDOB partyPartyRolesMemberDOB=new PartyPartyRolesMemberDOB(driver, "Member DOB ");
												if(!(partyRolesMemberDetailEntity.getStringValueForField("Product").equalsIgnoreCase("LP")||partyRolesMemberDetailEntity.getStringValueForField("Product").equalsIgnoreCase("CX")))
													partyPartyRolesMemberDOB.navigateToMemberDOBPage();
												partyPartyRolesMemberDOB.fillAndSubmitPartyRolesMemberDetails(partyRolesMemberDetailEntity, assertReference);
												/************************fill Member DOB Data Then Proceed then Save in 1 callCount***********************/
											}
										}
									}
								}

								else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("CLAIMANT")) {
									List<PartyPartyRoleClaimantEntity> partyRoleClaimantEntitieList=testData.getpartyPartyRoleClaimantEntityRecords();
									for(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntityData:partyRoleClaimantEntitieList){
										if(partyPartyRoleClaimantEntityData.getAction().equalsIgnoreCase("verify")){
											Party_PartyRole_Claimant partyPartyRoleClaimant=new  Party_PartyRole_Claimant(driver, "Claimant Party Rule ");
											//partyPartyRoleClaimant.navigateToClaimantRulePage();
											partyPartyRoleClaimant.navigateTosurveyorOrganizationdetailsPage();
											partyPartyRoleClaimant.fillPartyDetails(partyPartyRoleClaimantEntityData, assertReference);
											/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
										}
									}
								}
								else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("BROKER")) {
									List<PartyRolBrokerCommiEntity> partyRolesBrokerageCommiEntityList=testData.getPartyRolesBrokerageCommiEntity();
									for(PartyRolBrokerCommiEntity partyRolesBrokerageCommiEntityListData:partyRolesBrokerageCommiEntityList){
									if(partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("verify") && partyRolesBrokerageCommiEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){	
										PartyPartyRolesBrokerageCommission partyPartyRolesBrokerageCommission=new  PartyPartyRolesBrokerageCommission(driver, "Brokerage Commission");
											//partyPartyRoleClaimant.navigateToClaimantRulePage();
											partyPartyRolesBrokerageCommission.navigateToBrokerCommission();
											partyPartyRolesBrokerageCommission.fillandSubmitPartyPartyRolesBrokerageCommission(partyRolesBrokerageCommiEntityListData, assertReference);
											/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
										}
									}
								}
							else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("DEVLP-OFF")) {
								List<PartyRolBrokerCommiEntity> partyRolesBrokerageCommiEntityList=testData.getPartyRolesBrokerageCommiEntity();
								for(PartyRolBrokerCommiEntity partyRolesBrokerageCommiEntityListData:partyRolesBrokerageCommiEntityList){
									if(partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("verify") && partyRolesBrokerageCommiEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){	
									//if(partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("verify")){
										PartyPartyRolesBrokerageCommission partyPartyRolesBrokerageCommission=new  PartyPartyRolesBrokerageCommission(driver, "Claimant Party Rule ");
										//partyPartyRoleClaimant.navigateToClaimantRulePage();
										partyPartyRolesBrokerageCommission.navigateToDevelopmentOfficer();
										partyPartyRolesBrokerageCommission.fillandSubmitPartyPartyRolesBrokerageCommission(partyRolesBrokerageCommiEntityListData, assertReference);
										/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
							}
						}
					}
				}
				else if(partyEntity.getBooleanValueForField("ConfigContacts")){
					List<PartyContactsDetailsEntity> partyContactsDetailsEntityList= testData.getPartyContactsDetailsRecords();
					for(PartyContactsDetailsEntity partyContactsDetailsEntityData:partyContactsDetailsEntityList){
						if(partyContactsDetailsEntityData.getAction().equalsIgnoreCase("verify")){
							PartyContactsPage partyContactsPage=new PartyContactsPage(driver, "Party Contacts");
							partyContactsPage.navigateToContacts(partyContactsDetailsEntityData);
							partyContactsPage.selectConatctTypeAndnavigatePartyContactDeatail(partyContactsDetailsEntityData);
							PartyContactsPageDetailsPage partyContactsPageDetailsPage=new PartyContactsPageDetailsPage(driver, "PartyContactsPageDetailsPage");
							partyContactsPageDetailsPage.navigateContactDetails();
							partyContactsPageDetailsPage.fillandSubmitPartyContactDetails(partyContactsDetailsEntityData, assertReference);
						}
					}
				}
				else if(partyEntity.getBooleanValueForField("ConfigRelatedParties")){
					List<RelatedPartyRelationsEntity> relatedPartyRelationsEntities=testData.getrelatedPartyRelationsEntityRecords();
					for(RelatedPartyRelationsEntity relatedPartyRelationsEntityData:relatedPartyRelationsEntities){
						if(relatedPartyRelationsEntityData.getAction().equalsIgnoreCase("verify")){
							Party_Relations party_RelationsSearchPage=new Party_Relations(driver, "Party Relation Search Page");
							party_RelationsSearchPage.selectRealtionFromSearchPage(relatedPartyRelationsEntityData);


							//TODO - Check why the above search Page Object is not different than the details Page -NBS
							Party_Relations party_RelationsCreatePage=new Party_Relations(driver, "Party Relation Create Page");
							party_RelationsCreatePage.fillPartyRelations(relatedPartyRelationsEntityData, assertReference);
						}
					}
				}
				else if(partyEntity.getBooleanValueForField("ConfigFollowup")){
					List<PartyFollowupDetailsEntity> partyFollowupDetailsEntitiesList=testData.getPartyFollowupDetailsEntityRecords();
					for(PartyFollowupDetailsEntity partyFollowupDetailsEntityData:partyFollowupDetailsEntitiesList){
						if(partyFollowupDetailsEntityData.getAction().equalsIgnoreCase("verify")){
							PartyFollowupListPage partyFollowupSearchPage=new PartyFollowupListPage(driver, "Party follow Page");
							partyFollowupSearchPage.selectFollowUpFromSearchPage(partyFollowupDetailsEntityData);

							PartyFollowupDetails partyFollowupDetailsCreate=new PartyFollowupDetails(driver, "Party follow up Cretae New Page");
							partyFollowupDetailsCreate.fillandSubmitFollowupDetails(partyFollowupDetailsEntityData, assertReference);
						}
					}
				}
			}
		}

	}

	private void setEditPartyDependency(PartyEntity partyEntity, ScenarioTestData testData) {
		if(partyEntity.getStringValueForField("DependencyForPartyCode")!=null){
			ArrayList<PartyEntity> partyEntityListAll = testData.getObjectByReference(testData.getPartyEntities(), partyEntity.getStringValueForField("DependencyForPartyCode"));
			ArrayList<PartyEntity> partyEntityList = FrameworkServices.getObjectByPrimaryKey(
					partyEntityListAll, partyEntity.getStringValueForField("DependencyForPartyCode"));

			for (PartyEntity partyEntityData : partyEntityList) {
				partyEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				partyEntityData.setStringValueForField("FirstName", partyEntity.getStringValueForField("FirstName"));
				partyEntityData.setStringValueForField("MiddleName", partyEntity.getStringValueForField("MiddleName"));
				partyEntityData.setStringValueForField("LastName", partyEntity.getStringValueForField("LastName"));
				partyEntityData.setStringValueForField("OtherName", partyEntity.getStringValueForField("OtherName"));
				partyEntityData.setStringValueForField("ContactType", partyEntity.getStringValueForField("ContactType"));
				testData.updateRecordsForCriteria(partyEntityData);
				//for party-->followup
				//for party--> Contacts	 
				//for pARTY rOLES
				// FOR4 RELATED pARTY   
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPolicy")!=null){
			ArrayList<PolicyEntity> policyEntityListAll=testData.getObjectByReference(testData.getPolicyRecords(), partyEntity.getStringValueForField("DependencyForPolicy"));
			ArrayList<PolicyEntity> policyEntityList = FrameworkServices.getObjectByPrimaryKey(
					policyEntityListAll, partyEntity.getStringValueForField("DependencyForPolicy"));

			for(PolicyEntity policyEntityData:policyEntityList){
				policyEntityData.setStringValueForField("PolicyHolderCode",partyEntity.getStringValueForField("PartyCode"));
				//GH Abhijit
				if(partyEntity.getStringValueForField("BusinessName").isEmpty()){
					String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
					policyEntityData.setStringValueForField("PolicyHolderName",partyName);
				}
				else{
					String partyName=partyEntity.getStringValueForField("BusinessName") ;
					policyEntityData.setStringValueForField("PolicyHolderName",partyName);
				}
				testData.updateRecordsForCriteria(policyEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPolicyMember")!=null){
			ArrayList<PolicyMemberDetailsEntity> policyMemberDetailsEntityListAll=testData.getObjectByReference(testData.getPolicyMemberDetailsEntity(), partyEntity.getStringValueForField("DependencyForPolicyMember"));
			ArrayList<PolicyMemberDetailsEntity> policyMemberDetailsEntityList = FrameworkServices.getObjectByPrimaryKey(
					policyMemberDetailsEntityListAll, partyEntity.getStringValueForField("DependencyForPolicyMember"));

			for(PolicyMemberDetailsEntity policyMemberDetailsEntityData:policyMemberDetailsEntityList){
				policyMemberDetailsEntityData.setStringValueForField("MemberCode",partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				policyMemberDetailsEntityData.setStringValueForField("PartyName",partyName);
				testData.updateRecordsForCriteria(policyMemberDetailsEntityData);
			}
		}
		if(partyEntity.getStringValueForField("DependencyForPolicyBuyer")!=null){
			ArrayList<PolicyMemberDetailsEntity> policyMemberDetailsEntityListAll=testData.getObjectByReference(testData.getPolicyMemberDetailsEntity(), partyEntity.getStringValueForField("DependencyForPolicyMember"));
			ArrayList<PolicyMemberDetailsEntity> policyMemberDetailsEntityList = FrameworkServices
					.getObjectByPrimaryKey(policyMemberDetailsEntityListAll,partyEntity.getStringValueForField("DependencyForPolicyBuyer"));
			for(PolicyMemberDetailsEntity policyMemberDetailsEntityData:policyMemberDetailsEntityList){
				policyMemberDetailsEntityData.setStringValueForField("BuyerCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(policyMemberDetailsEntityData);
			}
		}
		if(partyEntity.getStringValueForField("DependencyForPolicyMemberPremium")!=null){
			ArrayList<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityListAll=testData.getObjectByReference(testData.getmembAtachCovrgPremSchdEntityRecords(), partyEntity.getStringValueForField("DependencyForPolicyMemberPremium"));
			ArrayList<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList = FrameworkServices.getObjectByPrimaryKey(
					membAtachCovrgPremSchdEntityListAll,partyEntity.getStringValueForField("DependencyForPolicyMemberPremium"));

			for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntityData:membAtachCovrgPremSchdEntityList){
				membAtachCovrgPremSchdEntityData.setStringValueForField("MemberCoode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(membAtachCovrgPremSchdEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForContacts")!=null){
			ArrayList<PartyContactsDetailsEntity>partyContactsDetailsEntityListAll=testData.getObjectByReference(testData.getPartyContactsDetailsRecords(),partyEntity.getStringValueForField("DependencyForContacts") );
			ArrayList<PartyContactsDetailsEntity> partyContactsDetailsEntityList = FrameworkServices.getObjectByPrimaryKey(
					partyContactsDetailsEntityListAll,partyEntity.getStringValueForField("DependencyForContacts"));

			for(PartyContactsDetailsEntity partyContactsDetailsEntityData:partyContactsDetailsEntityList){
				partyContactsDetailsEntityData.setStringValueForField("ContactType", partyEntity.getStringValueForField("ContactType"));
				partyContactsDetailsEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName") + " " + partyEntity.getStringValueForField("LastName");
				partyContactsDetailsEntityData.setStringValueForField("PartyName", partyName);
				testData.updateRecordsForCriteria(partyContactsDetailsEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPartyRoles")!=null){
			ArrayList<PartyRolesFunctDetailsEntity> partyRolesFunctDetailsEntityListAll=testData.getObjectByReference(testData.getPartyRolesFunctDetailsRecords(),partyEntity.getStringValueForField("DependencyForPartyRoles"));
			ArrayList<PartyRolesFunctDetailsEntity> partyRolesFunctDetailsEntityList = FrameworkServices.getObjectByPrimaryKey(
					partyRolesFunctDetailsEntityListAll,partyEntity.getStringValueForField("DependencyForPartyRoles"));

			for(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntityData:partyRolesFunctDetailsEntityList){
				partyRolesFunctDetailsEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				partyRolesFunctDetailsEntityData.setStringValueForField("PartyName", partyName);
				testData.updateRecordsForCriteria(partyRolesFunctDetailsEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPartyRoleMember")!=null){
			ArrayList<PartyRolesMemberDetailEntity> partyRolesMemberDetailEntityListAll=testData.getObjectByReference(testData.getPartyRolesMemberDetailRecords(),partyEntity.getStringValueForField("DependencyForPartyRoleMember"));
			ArrayList<PartyRolesMemberDetailEntity> partyRolesMemberDetailEntityList = FrameworkServices.getObjectByPrimaryKey(
					partyRolesMemberDetailEntityListAll, partyEntity.getStringValueForField("DependencyForPartyRoleMember"));

			for(PartyRolesMemberDetailEntity partyRolesMemberDetailEntityData:partyRolesMemberDetailEntityList){
				partyRolesMemberDetailEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				partyRolesMemberDetailEntityData.setStringValueForField("PartyName", partyName);
				testData.updateRecordsForCriteria(partyRolesMemberDetailEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForRelatedParties")!=null){
			ArrayList<RelatedPartyRelationsEntity> relatedPartyRelationsEntityListAll=testData.getObjectByReference(testData.getrelatedPartyRelationsEntityRecords(), partyEntity.getStringValueForField("DependencyForRelatedParties"));
			ArrayList<RelatedPartyRelationsEntity> relatedPartyRelationsEntityList = FrameworkServices.getObjectByPrimaryKey(
					relatedPartyRelationsEntityListAll,partyEntity.getStringValueForField("DependencyForRelatedParties"));

			for(RelatedPartyRelationsEntity relatedPartyRelationsEntityData:relatedPartyRelationsEntityList){
				relatedPartyRelationsEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				relatedPartyRelationsEntityData.setStringValueForField("PartyName", partyName);
				testData.updateRecordsForCriteria(relatedPartyRelationsEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForFollowup")!=null){
			ArrayList<PartyFollowupDetailsEntity> partyFollowupDetailsEntityListAll=testData.getObjectByReference(testData.getPartyFollowupDetailsEntityRecords(), partyEntity.getStringValueForField("DependencyForFollowup"));
			ArrayList<PartyFollowupDetailsEntity> partyFollowupDetailsEntityList = FrameworkServices.getObjectByPrimaryKey(
					partyFollowupDetailsEntityListAll, partyEntity.getStringValueForField("DependencyForFollowup"));

			for(PartyFollowupDetailsEntity partyFollowupDetailsEntityData:partyFollowupDetailsEntityList){
				partyFollowupDetailsEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				partyFollowupDetailsEntityData.setStringValueForField("PartyName", partyName);
				testData.updateRecordsForCriteria(partyFollowupDetailsEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPolicyRelation")!=null){
			ArrayList<PolicyRelationDetailEntity> policyRelationDetailEntityListAll=testData.getObjectByReference(testData.getPolicyRelationDetailEntity(), partyEntity.getStringValueForField("DependencyForPolicyRelation"));
			ArrayList<PolicyRelationDetailEntity> policyRelationDetailEntityList = FrameworkServices.getObjectByPrimaryKey(
					policyRelationDetailEntityListAll,partyEntity.getStringValueForField("DependencyForPolicyRelation"));

			for(PolicyRelationDetailEntity policyRelationDetailEntityData:policyRelationDetailEntityList){
				if(partyEntity.getStringValueForField("BusinessName")!=null){
					String partyCode=partyEntity.getStringValueForField("PartyCode");
					policyRelationDetailEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				}
				else if(partyEntity.getStringValueForField("BusinessName").isEmpty()){
					String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
					policyRelationDetailEntityData.setStringValueForField("PolicyHolder",partyName);
				}
				else if(partyEntity.getStringValueForField("BusinessName")!=null){

					String partyCode=partyEntity.getStringValueForField("PartyCode");
					policyRelationDetailEntityData.setStringValueForField("PartyCode",partyCode);

					policyRelationDetailEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				}
				else{
					String partyName=partyEntity.getStringValueForField("BusinessName") ;
					policyRelationDetailEntityData.setStringValueForField("PolicyHolder",partyName);
				}
				/*String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				policyRelationDetailEntityData.setStringValueForField("PolicyHolder",partyName);*/
				testData.updateRecordsForCriteria(policyRelationDetailEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPolicyMemberPayments")!=null){
			ArrayList<PolicyPaymDetailsCycleEntity> policyPaymDetailsCycleEntityListAll=testData.getObjectByReference(testData.getPolicyPaymDetailsCycleEntities(), partyEntity.getStringValueForField("DependencyForPolicyMemberPayments"));
			ArrayList<PolicyPaymDetailsCycleEntity> policyPaymDetailsCycleEntityList = FrameworkServices.getObjectByPrimaryKey(
					policyPaymDetailsCycleEntityListAll,partyEntity.getStringValueForField("DependencyForPolicyMemberPayments"));

			for(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntityData:policyPaymDetailsCycleEntityList){
				policyPaymDetailsCycleEntityData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(policyPaymDetailsCycleEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForSuperUserUserCode")!=null){
			ArrayList<SecurityPartyEntity> securityPartyEntityListAll=testData.getObjectByReference(testData.getSecurityPartyEntityRecords(), partyEntity.getStringValueForField("DependencyForSuperUserUserCode"));
			ArrayList<SecurityPartyEntity> securityPartyEntityList = FrameworkServices.getObjectByPrimaryKey(
					securityPartyEntityListAll, partyEntity.getStringValueForField("DependencyForSuperUserUserCode"));

			for(SecurityPartyEntity securityPartyEntityListData:securityPartyEntityList){
				securityPartyEntityListData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(securityPartyEntityListData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForScrollPartyName")!=null){
			ArrayList<AccoScrollEntryEntity> accoScrollEntryEntityList=testData.getObjectByReference(testData.getAccoScrollEntryEntities(), partyEntity.getStringValueForField("DependencyForScrollPartyName"));
			for(AccoScrollEntryEntity accoScrollEntryEntityData:accoScrollEntryEntityList){
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				accoScrollEntryEntityData.setStringValueForField("ReceivedFrom",partyName);
				testData.updateRecordsForCriteria(accoScrollEntryEntityData);
			}
		}
		if(partyEntity.getStringValueForField("DependencyForAccountingPartyCode")!=null){
			ArrayList<AccountingBGOrCDSearchEntity> accountingBGOrCDSearchEntityListAll=testData.getObjectByReference(testData.getAccountingBGOrCDSearchEntity(), partyEntity.getStringValueForField("DependencyForAccountingPartyCode"));
			ArrayList<AccountingBGOrCDSearchEntity> accountingBGOrCDSearchEntityList = FrameworkServices.getObjectByPrimaryKey(
					accountingBGOrCDSearchEntityListAll,partyEntity.getStringValueForField("DependencyForAccountingPartyCode"));
			for(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntityData:accountingBGOrCDSearchEntityList){
				accountingBGOrCDSearchEntityData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(accountingBGOrCDSearchEntityData);
			}
		}
		//Abhijit

		if(partyEntity.getStringValueForField("DependencyForPolicyPremiumSchedule")!=null){
			ArrayList<PolicyPremiumScheduleEntity> policyPremiumScheduleEntityList=testData.getObjectByReference(testData.getPolicyPremiumScheduleEntity(), partyEntity.getStringValueForField("DependencyForPolicyPremiumSchedule"));
			for(PolicyPremiumScheduleEntity policyPremiumScheduleEntityData:policyPremiumScheduleEntityList){
				policyPremiumScheduleEntityData.setStringValueForField("MemberCode",partyEntity.getStringValueForField("PartyCode"));
				if(partyEntity.getStringValueForField("BusinessName").isEmpty()){
					String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
					policyPremiumScheduleEntityData.setStringValueForField("Policyholder",partyName);
				}
				else{
					String partyName=partyEntity.getStringValueForField("BusinessName") ;
					policyPremiumScheduleEntityData.setStringValueForField("Policyholder",partyName);
				}
				testData.updateRecordsForCriteria(policyPremiumScheduleEntityData);
			}
		}

		//Added by PKP
		if(partyEntity.getStringValueForField("DependencyForClaimPayment")!=null){
			ArrayList<ClaimPaymentEntity> claimPaymentEntityList=testData.getObjectByReference(testData.getClaimPaymentEntity(), partyEntity.getStringValueForField("DependencyForClaimPayment"));
			for(ClaimPaymentEntity claimPaymentEntityData :claimPaymentEntityList){
				claimPaymentEntityData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				//String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				//claimPaymentEntityData.setStringValueForField("Policyholder",partyName);
				testData.updateRecordsForCriteria(claimPaymentEntityData);
			}
		}
		//Abhijit
		if(partyEntity.getStringValueForField("DependencyForAccountingDistributionTable")!=null){
			ArrayList<AccountingDistributionTable>accountingDistributionTableList=testData.getObjectByReference(testData.getAccountingDistributionTablesRecords(), partyEntity.getStringValueForField("DependencyForAccountingDistributionTable"));
			for(AccountingDistributionTable accountingDistributionTableData:accountingDistributionTableList){
				accountingDistributionTableData.setStringValueForField("GLDescription",partyEntity.getStringValueForField("PartyCode") );
				testData.updateRecordsForCriteria(accountingDistributionTableData);
			}
		}
		//Mangesh
		if(partyEntity.getStringValueForField("DependencyForShowVersion")!=null){
			ArrayList<PolicyShowVersionPageEntity>policyShowVersionPageEntityList=testData.getObjectByReference(testData.getPolicyShowVersionPageEntity(), partyEntity.getStringValueForField("DependencyForShowVersion"));
			for(PolicyShowVersionPageEntity policyShowVersionPageEntityData:policyShowVersionPageEntityList){
				policyShowVersionPageEntityData.setStringValueForField("PolicyHolder",(partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("MiddleName")+" "+partyEntity.getStringValueForField("LastName")));
				testData.updateRecordsForCriteria(policyShowVersionPageEntityData);
			}
		}

		//Abhijit
		if(partyEntity.getStringValueForField("DependencyForClaimTransferToAPEntity")!=null){
			ArrayList<ClaimTransferToAPEntity> claimTransferToAPEntityListAll=testData.getObjectByReference(testData.getClaimTransferToAPEntityRecords(), partyEntity.getStringValueForField("DependencyForClaimTransferToAPEntity"));
			ArrayList<ClaimTransferToAPEntity> claimTransferToAPEntityList = FrameworkServices.getObjectByPrimaryKey(
					claimTransferToAPEntityListAll, partyEntity.getStringValueForField("DependencyForClaimTransferToAPEntity"));

			for(ClaimTransferToAPEntity claimTransferToAPEntityListData:claimTransferToAPEntityList){
				claimTransferToAPEntityListData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(claimTransferToAPEntityListData);
			}

		}
		//Abhijit
		if(partyEntity.getStringValueForField("DependencyForPolicyPremiumCollection")!=null){
			ArrayList<PolicyPremCollectionEntity> policyPremCollectionEntityListAll=testData.getObjectByReference(testData.getPolicyPremCollectionEntityRecords(), partyEntity.getStringValueForField("DependencyForPolicyPremiumCollection"));
			ArrayList<PolicyPremCollectionEntity> policyPremCollectionEntityList = FrameworkServices.getObjectByPrimaryKey(
					policyPremCollectionEntityListAll, partyEntity.getStringValueForField("DependencyForPolicyPremiumCollection"));

			for(PolicyPremCollectionEntity policyPremCollectionEntityListData:policyPremCollectionEntityList){
				policyPremCollectionEntityListData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(policyPremCollectionEntityListData);
			}

		}

		//Abhijit

		if(partyEntity.getStringValueForField("DependencyForMemberName")!=null){
			ArrayList<PolicyMemberAttributeEntity> policyMemberAttributeEntityListAll = testData.getObjectByReference(testData.getPolMemberAttributeRecords(), partyEntity.getStringValueForField("DependencyForMemberName"));
			ArrayList<PolicyMemberAttributeEntity> policyMemberAttributeEntityList = FrameworkServices.getObjectByPrimaryKey(
					policyMemberAttributeEntityListAll, partyEntity.getStringValueForField("DependencyForMemberName"));
			for (PolicyMemberAttributeEntity policyMemberAttributeEntityListData : policyMemberAttributeEntityList) {
				String name= partyEntity.getStringValueForField("FirstName") + " " + partyEntity.getStringValueForField("MiddleName") +  " " +partyEntity.getStringValueForField("LastName");
				policyMemberAttributeEntityListData.setStringValueForField("NameofMember", name);
			}
		}
		if(partyEntity.getStringValueForField("DependencyForParentCode")!=null){
			ArrayList<PartyEntity> partyEntityListAll = testData.getObjectByReference(testData.getPartyEntities(), partyEntity.getStringValueForField("DependencyForParentCode"));
			ArrayList<PartyEntity> partyEntityList = FrameworkServices.getObjectByPrimaryKey(
					partyEntityListAll, partyEntity.getStringValueForField("DependencyForParentCode"));
			for (PartyEntity partyEntityData : partyEntityList) {
				partyEntityData.setStringValueForField("ParentCode", partyEntity.getStringValueForField("PartyCode"));
			}
		}
	}


	public void  editParty (ScenarioTestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<PartyEntity> partyEntitiesList=testData.getPartyEntities();
		for(PartyEntity partyEntity:partyEntitiesList){
			if(partyEntity.getAction().equalsIgnoreCase("edit") && partyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPage partySearchPage=new PartySearchPage(driver, "Party Search Page");
				partySearchPage.navigateToPartySearchPage();
				partySearchPage.fillAndSearchPartyDetails(partyEntity);
				partySearchPage.selectSearchPartyCode(partyEntity);
				partySearchPage.navigateToPartyDetailsPage();

				PartyDetailsCreateEditPage partyDetailsEditPage=new PartyDetailsCreateEditPage(driver, "Party Details Create Page");
				partyDetailsEditPage.fillandSubmitPartyDetails(partyEntity, assertReference);

				/**************For Editing Party Click on Edit button*****************/
				testData.updateRecordsForCriteria(partyEntity);
				if(partyEntity.getBooleanValueForField("ConfigPartyRoles")) {
					/************************Edit and configParty Role in same line*************/
					List<PartyRolesFunctDetailsEntity> partyRolesFunctionsEntityList = testData.getPartyRolesFunctDetailsRecords();
					for(PartyRolesFunctDetailsEntity partyRolesFunctDetailsData:partyRolesFunctionsEntityList){
						if((partyRolesFunctDetailsData.getAction().equalsIgnoreCase("add") || partyRolesFunctDetailsData.getAction().equalsIgnoreCase("edit")) && partyRolesFunctDetailsData.getStepGroup().equalsIgnoreCase(stepGroup)){
							//partyDetailsEditPage.navigateToPartyRoles(partyEntity);
							/*List<PartyRolesFunctionsEntity> partyRolesFunctionsEntityList=testData.get*/
							PartyPartyRolesPartyFunctions partyPartyRolesPartyFunctions=new PartyPartyRolesPartyFunctions(driver, "Party_Party Function");
							/********************For Creating New Member*********************/
							partyPartyRolesPartyFunctions.createNewPartyRole(partyRolesFunctDetailsData);
							/********************For Editing Created Member*********************/
							partyPartyRolesPartyFunctions.selectFunctionCodeFromSearchPage(partyRolesFunctDetailsData);

							/********************For Editing Created Member*********************/
							PartyPartyRolesPartyFunctionDetails partyPartyRolesPartyFunctionDetails=new PartyPartyRolesPartyFunctionDetails(driver, "Party Function Details");
							partyPartyRolesPartyFunctionDetails.fillAndSubmitPartyFunctionDetails(partyRolesFunctDetailsData, assertReference);

							/******************Click on Proceed then select Role then Click on Next*******************/
							if(partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("MEMBER")){
								List<PartyRolesMemberDetailEntity> partyRolesMemberDetailEntityList=testData.getPartyRolesMemberDetailRecords();
								for(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity :partyRolesMemberDetailEntityList){
									if((partyRolesMemberDetailEntity.getAction().equalsIgnoreCase("add")||partyRolesMemberDetailEntity.getAction().equalsIgnoreCase("edit")) && partyRolesMemberDetailEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
										PartyPartyRolesMemberDOB partyPartyRolesMemberDOB=new PartyPartyRolesMemberDOB(driver, "Member DOB ");
										partyPartyRolesMemberDOB.navigateToMemberDOBPage();
										partyPartyRolesMemberDOB.fillAndSubmitPartyRolesMemberDetails(partyRolesMemberDetailEntity, assertReference);
										/************************fill Member DOB Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
							else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("CLAIMANT")) {
								List<PartyPartyRoleClaimantEntity> partyRoleClaimantEntitieList=testData.getpartyPartyRoleClaimantEntityRecords();
								for(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntityData:partyRoleClaimantEntitieList){
									if((partyPartyRoleClaimantEntityData.getAction().equalsIgnoreCase("add")||partyPartyRoleClaimantEntityData.getAction().equalsIgnoreCase("edit")) && partyPartyRoleClaimantEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										Party_PartyRole_Claimant partyPartyRoleClaimant=new  Party_PartyRole_Claimant(driver, "Claimant Party Rule ");
										partyPartyRoleClaimant.navigateToClaimantRulePage();
										partyPartyRoleClaimant.fillandSearchPartyDetails(partyPartyRoleClaimantEntityData, assertReference);
										/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
							else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("BUYER")) {
								List<PartyRoleBuyerMastINDEntity> partyRoleBuyerMastINDEntityList=testData.getPartyRoleBuyerMastINDEntityRecords();
								for(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntityListData:partyRoleBuyerMastINDEntityList){
									if((partyRoleBuyerMastINDEntityListData.getAction().equalsIgnoreCase("add")||partyRoleBuyerMastINDEntityListData.getAction().equalsIgnoreCase("edit")) && partyRoleBuyerMastINDEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										PartyPartyRolesBuyerMasterIND partyPartyRolesBuyerMasterIND=new  PartyPartyRolesBuyerMasterIND(driver, "Buyer Master IND");
										partyPartyRolesBuyerMasterIND.navigateToBuyerMasterIND();
										partyPartyRolesBuyerMasterIND.fillandSubmitPartyPartyRolesBuyerMasterIND(partyRoleBuyerMastINDEntityListData, assertReference);
										/************************fill Buyer Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
							else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("BROKER")||partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("DEVLP-OFF")) {
								List<PartyRolBrokerCommiEntity> partyRolesBrokerageCommiEntityList=testData.getPartyRolesBrokerageCommiEntity();
								for(PartyRolBrokerCommiEntity partyRolesBrokerageCommiEntityListData:partyRolesBrokerageCommiEntityList){
									if((partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("add")||partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("edit")) && partyRolesBrokerageCommiEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										PartyPartyRolesBrokerageCommission partyPartyRolesBrokerageCommission=new  PartyPartyRolesBrokerageCommission(driver, "Brokerage Commission");
										partyPartyRolesBrokerageCommission.navigateToBrokerCommission();
										partyPartyRolesBrokerageCommission.fillandSubmitPartyPartyRolesBrokerageCommission(partyRolesBrokerageCommiEntityListData, assertReference);
										/************************fill Buyer Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
						}
					}
				}
				else if(partyEntity.getBooleanValueForField("ConfigContacts")){
					List<PartyContactsDetailsEntity> partyContactsDetailsEntityList= testData.getPartyContactsDetailsRecords();
					for(PartyContactsDetailsEntity partyContactsDetailsEntityData:partyContactsDetailsEntityList){
						if((partyContactsDetailsEntityData.getAction().equalsIgnoreCase("add")||partyContactsDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& partyContactsDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
							PartyContactsPage partyContactsPage=new PartyContactsPage(driver, "Party Contacts");
							partyContactsPage.navigateToContacts(partyContactsDetailsEntityData);
							partyContactsPage.selectConatctTypeAndnavigatePartyContactDeatail(partyContactsDetailsEntityData);
							PartyContactsPageDetailsPage partyContactsPageDetailsPage=new PartyContactsPageDetailsPage(driver, "PartyContactsPageDetailsPage");
							partyContactsPageDetailsPage.navigateContactDetails();
							partyContactsPageDetailsPage.fillandSubmitPartyContactDetails(partyContactsDetailsEntityData, assertReference);
						}
					}
				}
				else if(partyEntity.getBooleanValueForField("ConfigRelatedParties")){
					List<RelatedPartyRelationsEntity> relatedPartyRelationsEntities=testData.getrelatedPartyRelationsEntityRecords();
					for(RelatedPartyRelationsEntity relatedPartyRelationsEntityData:relatedPartyRelationsEntities){
						if(relatedPartyRelationsEntityData.getAction().equalsIgnoreCase("add")||relatedPartyRelationsEntityData.getAction().equalsIgnoreCase("edit")){
							Party_Relations party_RelationsSearchPage=new Party_Relations(driver, "Party Relation Search Page");
							party_RelationsSearchPage.createNewPartyRelation(relatedPartyRelationsEntityData);
							party_RelationsSearchPage.selectRealtionFromSearchPage(relatedPartyRelationsEntityData);
							Party_Relations party_RelationsCreatePage=new Party_Relations(driver, "Party Relation Create Page");
							party_RelationsCreatePage.fillandSearchPartyDetails(relatedPartyRelationsEntityData, assertReference);
						}
					}
				}
				else if(partyEntity.getBooleanValueForField("ConfigFollowup")){
					List<PartyFollowupDetailsEntity> partyFollowupDetailsEntitiesList=testData.getPartyFollowupDetailsEntityRecords();
					for(PartyFollowupDetailsEntity partyFollowupDetailsEntityData:partyFollowupDetailsEntitiesList){
						if(partyFollowupDetailsEntityData.getAction().equalsIgnoreCase("add")||partyFollowupDetailsEntityData.getAction().equalsIgnoreCase("edit")){
							PartyFollowupListPage partyFollowupSearchPage=new PartyFollowupListPage(driver, "Party follow Page");
							partyFollowupSearchPage.createNewFollowupForParty(partyFollowupDetailsEntityData);
							PartyFollowupDetails partyFollowupDetailsCreate=new PartyFollowupDetails(driver, "Party follow up Cretae New Page");
							partyFollowupDetailsCreate.fillandSubmitFollowupDetails(partyFollowupDetailsEntityData, assertReference);
						}
					}
				}
			}
		}
	}
}