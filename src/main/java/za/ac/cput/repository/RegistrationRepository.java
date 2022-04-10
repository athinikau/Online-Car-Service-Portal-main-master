package za.ac.cput.repository;
import za.ac.cput.Entity.Log;
import za.ac.cput.Entity.Registration;

/**RegistrationRepository.java
 * Registration repository fiile that implements method on the IRegistration interfaca
 Author: Athini Mbiko (213196379)

 */
import java.util.HashSet;
import java.util.Set;

public class RegistrationRepository implements IRegistrationRepository{

    private static RegistrationRepository repo = null;
    private Set<Registration> RegistrationDB = null;

    public RegistrationRepository() {
        RegistrationDB = new HashSet<Registration>();
    }

    public static RegistrationRepository getRepository(){
        if(repo == null){
            repo = new RegistrationRepository();
        }
        return repo;
    }



    @Override
    public Registration creat(Registration registration) {
        boolean reg= RegistrationDB.add(registration);
        if(!reg)
            return null;
        return registration;
    }

    @Override
    public Registration read(String userName) {
        for(Registration r:RegistrationDB){
            if(r.getUserName().equals(userName));
            return r;
        }
        return null;

    }

    @Override
    public Registration update(Registration registration) {
        Registration oldReg = read(registration.getUserName());
        if(oldReg!= null){
            RegistrationDB.remove(oldReg);
            RegistrationDB.add(registration);
            return registration;
        }
        return null;
    }

    @Override
    public boolean delete(String userName) {
        Registration deleteReg = read(userName);
        if(deleteReg== null) {
            return false;
        }
        RegistrationDB.remove(deleteReg);
        return true;
    }
    @Override
    public Set<Registration> getall() {
        return RegistrationDB;
    }
}
