package cliquefidelidade.mobile.uechi.cliquefidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cliquefidelidade.mobile.uechi.cliquefidelidade.model.SignIn;

/**
 * Created by Camila Nachbar on 7/26/2017.
 */

public class SignInActivity  extends AppCompatActivity {

    private SignInActivityHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Button cadastrarNovoUsuario = (Button) findViewById(R.id.novoButtonCadastrar);
        cadastrarNovoUsuario.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent it = new Intent(SignInActivity.this, CadastroActivity.class);
                startActivity(it);
            }
        });

        Button loginUsuario = (Button) findViewById(R.id.Buttonlogin);
        loginUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignIn signIn = helper.signIn();
            }
        });



    }

}
