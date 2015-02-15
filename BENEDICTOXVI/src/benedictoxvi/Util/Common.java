/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Util;

import java.util.Date;

/**
 *
 * @author alumnos
 */
public class Common {

    public static boolean IsNullOrEmpty(String pValue)
    {
        return (pValue == null || pValue.isEmpty())?true:false;
    }
    
    public static boolean IsMinorOrEqualsZero(int pValue)
    {       
        return (pValue <= 0)?true:false;   
    }
    
    public static boolean IsMinorOrEqualsZero(double pValue)
    {       
        return (pValue <= 0)?true:false;   
    }
}
