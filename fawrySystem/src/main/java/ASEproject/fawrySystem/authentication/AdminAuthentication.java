package ASEproject.fawrySystem.authentication;

import org.springframework.stereotype.Service;

import ASEproject.fawrySystem.admin.Admin;
import ASEproject.fawrySystem.model.Person;
import ASEproject.fawrySystem.util.Common;
@Service
public class AdminAuthentication extends Authentication{

    private boolean check=false;

    
    public boolean isCheck() {
        return check;
    }


    public void setCheck(boolean check) {
        this.check = check;
    }


    @Override
    public boolean logInValidation(Person p) {
        if(Common.admins.get(p.getUsername())!=null)
        {
            setCheck(true);
           
            logIn=true;
            return true;
        }
        logIn=false;
        return logIn;
    }

    
    
}
    
    
