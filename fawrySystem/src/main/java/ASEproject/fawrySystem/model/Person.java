package ASEproject.fawrySystem.model;

import org.springframework.stereotype.Component;

public abstract class Person {
    
    protected String username;
    protected String password;
    protected String email;
    
	public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
