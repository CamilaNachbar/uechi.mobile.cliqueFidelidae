package cliquefidelidade.mobile.uechi.cliquefidelidade;


import android.widget.EditText;

import cliquefidelidade.mobile.uechi.cliquefidelidade.model.SignIn;

/**
 * Created by Camila Nachbar on 7/29/2017.
 */

public class SignInActivityHelper {

    private final EditText email;
    private final EditText password;

    public SignInActivityHelper(SignInActivity activity ){
        email =  (EditText) activity.findViewById(R.id.loginEmail) ;
        password = (EditText) activity.findViewById(R.id.loginPassword);
    }

    public SignIn signIn(){
        SignIn login = new SignIn();
        login.getEmail(email.getText().toString());
        login.getPassword(password.getText().toString());
        return login;
    }
}
