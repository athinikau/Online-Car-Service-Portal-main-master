/**LogRepositoryTest.java
 Author: Athini Mbiko (213196379)
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Log;
import za.ac.cput.factory.LogFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class LogRepositoryTest {
    private static LogRepository repository = LogRepository.getRepository();
    private static Log log = LogFactory.createLog("Ahini","21256Athi");
    @Test
    void a_creat() {
        Log loged =  repository.creat(log);
        assertEquals(log.getUserName(),loged.getUserName());
        System.out.println("Login "+ loged);
    }

    @Test
    void b_read() {
        Log read = repository.read(log.getUserName());
        assertNotNull(read);
        System.out.println("read "+ read);
    }

    @Test
    void c_update() {
        Log updated = new Log.Builder().copy(log).setuserName("Atix")
                .setPassWord("235*nnddb")
                .builder();
        assertNotNull(repository.update(updated));
        System.out.println("Updated " +updated);
    }

    @Test
    void d_delete() {
        boolean deleted = repository.delete(log.getUserName());
        assertTrue(deleted);
    }

    @Test
    void e_getall() {
        System.out.println("show all ");
        System.out.println(repository.getall());
    }
}