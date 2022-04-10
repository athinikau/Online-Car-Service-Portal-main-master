/**RegistrationFactory.java
 * Foctory class for Registration entity
 Author: Athini Mbiko (213196379)

 */
package za.ac.cput.factory;

import za.ac.cput.Entity.Registration;
import za.ac.cput.util.Helper;

public class RegistrationFactory {
    public static Registration  createRegistration(String userName,String userEmail,String addUser, String userPassword,int roleID){
        if(Helper.isNotempty(userName) && Helper.isValidPassword(userPassword)) return null;

        return new Registration.Builder().setuserName(userName)
                                         .setuserEmail(userEmail)
                                         .setaddUser(addUser)
                                         .setuserPassword(userPassword)
                                         .setroleID(roleID)
                                          .builder();

    }
}
