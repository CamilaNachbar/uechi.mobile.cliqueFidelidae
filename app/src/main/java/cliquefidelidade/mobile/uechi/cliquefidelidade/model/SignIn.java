package cliquefidelidade.mobile.uechi.cliquefidelidade.model;

/**
 * Created by Camila Nachbar on 7/29/2017.
 */

public class SignIn {

    private String email;
    private String password;

    public SignIn(){

    }
    public String getPassword(String s) {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
