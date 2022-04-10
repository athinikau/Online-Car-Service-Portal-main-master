package za.ac.cput.repository;
/**RegistrationTest.java
 Author: Athini Mbiko (213196379)

 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Registration;
import za.ac.cput.factory.RegistrationFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class RegistrationRepositoryTest {
    private static RegistrationRepository repo = RegistrationRepository.getRepository();
    private  static Registration registration = RegistrationFactory.createRegistration("kau","athini@yahoo.com","Athini","21235",8);
    @Test
    void a_creat() {
        Registration reg = repo.creat(registration);
        assertEquals(registration.getUserName(),reg.getUserName());
        System.out.println("Login "+ reg);

    }

    @Test
    void b_read() {
        Registration read = repo.read(registration.getUserName());
        assertNotNull(read);
        System.out.println("read "+ read);
    }

    @Test
    void c_update() {
        Registration updated = new Registration.Builder().copy(registration).setuserName("Atix")
                .setuserPassword("235*nnddb")
                .builder();
        assertNotNull(repo.update(updated));
        System.out.println("Updated " +updated);
    }

    @Test
    void delete() {
        boolean deleted = repo.delete(registration.getUserName());
        assertTrue(deleted);
    }

    @Test
    void getall() {
        System.out.println("show all ");
        System.out.println(repo.getall());
    }
}