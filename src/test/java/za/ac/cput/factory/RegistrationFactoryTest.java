
/**RegistrationFactoryTest.java
 *
 Author: Athini Mbiko (213196379)

 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Registration;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationFactoryTest {

    @Test
    public void test() {
        Registration registration = RegistrationFactory.createRegistration("Kathi","athigmai.com","athi","2125",5);
        assertNotNull(registration);
        System.out.println( registration.toString());
    }
}