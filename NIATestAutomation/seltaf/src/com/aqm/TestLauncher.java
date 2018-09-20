package com.aqm;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.aqm.staf.framework.core.MapOfUserIDAssignedToAllocation;
import com.aqm.staf.framework.core.Uploader;
import com.aqm.staf.framework.core.scenarioResult.ScenarioResultCollection;
import com.aqm.staf.framework.core.scenarioResult.ScenarioResultStringGen;
import com.aqm.staf.framework.core.scenarioResult.WriteScenarioResultInCSV;
import com.aqm.staf.framework.core.scenarioResult.WriteScenarioResultInExcel;

public class TestLauncher {
		
	public static void main (String[] args) throws Exception {
		Uploader uploader= null;
		try {
			MapOfUserIDAssignedToAllocation.getInstance();
			uploader = new Uploader();
			uploader.uploadByVBSOrAPOI();
			uploader.createExecutionRecords();
			uploader.launchExecution();
			uploader.updateExecutionLog();
			uploader.closeDBSessions();
			System.out.println("Execution Completed.");
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}finally{
			Date ExecutionWatch= new Date();
			System.out.println( " Execution Endeded at time  :-"+ ExecutionWatch);
			if(ScenarioResultCollection.getListOfAllScenarioResult()!=null)
				new WriteScenarioResultInExcel("ResultSummary",uploader.getCurrentExecutionResultsFolder(),ScenarioResultStringGen.ResultSetInStringBuilder(ScenarioResultCollection.getListOfAllScenarioResult()));
		System.out.println("ExecutionResultSummary Report generated at path " + uploader.getCurrentExecutionResultsFolder().toString());
		}
}
}

