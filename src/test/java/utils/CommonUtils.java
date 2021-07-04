package utils;

import org.testng.SkipException;

import Tests.BaseTest;

public class CommonUtils extends BaseTest {

	 // function to Check Execution Required
    public static void toCheckExecutionRequired(String executionRequired) {
        
        // if execution required field is no
        if(executionRequired.equals("no")) {
            throw new SkipException("Skipping this exception");
        }
        
        // if execution required field is empty
        if(executionRequired.equals("")) {

 

            throw new SkipException("Skipping this exception");
        }
	
}
}

