/**LogFactoryTest.java
 *
 Author: Athini Mbiko (213196379)
 MileStone Date: 28 March 2022s
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Log;

import static org.junit.jupiter.api.Assertions.*;

class LogFactoryTest {
    @Test

    public void test(){
        Log log = LogFactory.createLog("athini","2126");
        assertNotNull(log);
        System.out.println("User login" + log.toString());

    }

}