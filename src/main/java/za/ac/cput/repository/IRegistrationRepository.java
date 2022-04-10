package za.ac.cput.repository;

import za.ac.cput.Entity.Registration;

import java.util.Set;

public interface IRegistrationRepository extends IRepository<Registration,String>{
    public Set<Registration> getall();

}
