package cliquefidelidade.mobile.uechi.cliquefidelidade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import cliquefidelidade.mobile.uechi.cliquefidelidade.model.Usuario;

public class CadastroActivity extends AppCompatActivity {

    private CadastroActivityHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

    }
    public void ConferePassword(){
        Usuario usuario = helper.usuarioCadastro();
        if (usuario.getPassword() == usuario.getPasswordRepeat()){
            Toast.makeText(CadastroActivity.this,"Senhas conferem", Toast.LENGTH_SHORT).show();
        }

    }
}
