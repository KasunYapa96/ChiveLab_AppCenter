package com.utils.ExtentReports;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

//OB: ExtentReports extent instance created here. That instance can be reachable by getReporter() method.

public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir+"\\ExtentReports\\ExtentReportResults.html", true);
            extent.loadConfig(new File(workingDir+"/extent-config.xml"));
    		extent.addSystemInfo("Environment","QA");
        }
        return extent;
    }
}

