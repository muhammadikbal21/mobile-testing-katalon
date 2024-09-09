package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object RSMerPut_AppPackage
     
    /**
     * <p></p>
     */
    public static Object RSMerPut_AppActivity
     
    /**
     * <p></p>
     */
    public static Object RSMerPut_AppPath
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            G_Timeout = selectedVariables['G_Timeout']
            G_NotificationMessage = selectedVariables['G_NotificationMessage']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            RSMerPut_AppPackage = selectedVariables['RSMerPut_AppPackage']
            RSMerPut_AppActivity = selectedVariables['RSMerPut_AppActivity']
            RSMerPut_AppPath = selectedVariables['RSMerPut_AppPath']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
