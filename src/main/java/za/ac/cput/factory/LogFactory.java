/**LogFactory.java
 * Foctory for login entity
 Author: Athini Mbiko (213196379)

 */
package za.ac.cput.factory;

import za.ac.cput.Entity.Log;
import za.ac.cput.util.Helper;

public class LogFactory {
    public static Log createLog(String userName, String passWord){
        Helper.isValidUsername(userName);
        Helper.isValidPassword(passWord);
        return new Log.Builder().setuserName(userName)
                                .setPassWord(passWord)
                                .builder();

    }
}
