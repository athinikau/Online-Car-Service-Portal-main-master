package za.ac.cput.repository;


import za.ac.cput.Entity.Log;

import java.util.HashSet;
import java.util.Set;

public class LogRepository implements ILogRepository{
    private static LogRepository repository = null;
    private Set<Log> LogDB = null;

    private LogRepository(){
        LogDB = new HashSet<Log>();
    }

    public static LogRepository getRepository(){
        if(repository == null){
            repository = new LogRepository();
        }
        return repository;
    }



    @Override
    public Log creat(Log log) {
        boolean login = LogDB.add(log);
        if(!login)
            return null;
        return log;


    }

    @Override
    public Log read(String userName) {
        for(Log l:LogDB){
            if(l.getUserName().equals(userName));
                return l;
        }
        return null;

    }

    @Override
    public  Log update(Log log) {
        Log oldLogin = read(log.getUserName());
        if(oldLogin != null){
            LogDB.remove(oldLogin);
            LogDB.add(log);
            return log;
        }
        return null;

    }

    @Override
    public boolean delete(String userName) {
        Log deleteLogin = read(userName);
        if(deleteLogin == null) {
            return false;
        }
        LogDB.remove(deleteLogin);
        return true;

    }
    @Override
    public Set<Log> getall() {
        return LogDB;
    }
}
