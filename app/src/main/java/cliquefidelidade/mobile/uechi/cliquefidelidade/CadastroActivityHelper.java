package cliquefidelidade.mobile.uechi.cliquefidelidade;

import android.widget.EditText;
import android.widget.Toast;

import cliquefidelidade.mobile.uechi.cliquefidelidade.model.Usuario;

/**
 * Created by Camila Nachbar on 7/27/2017.
 */

public class CadastroActivityHelper {

    private final EditText nome;
    private final EditText cpf;
    private final EditText celphone;
    private final EditText email;
    private final EditText password;
    private final EditText passwordRepeat;


    public CadastroActivityHelper(CadastroActivity activity){
     nome = (EditText) activity.findViewById(R.id.editName);
        cpf = (EditText) activity.findViewById(R.id.editCPF);
        celphone  = (EditText) activity.findViewById(R.id.editCelphone);
        email = (EditText) activity.findViewById(R.id.editEmail);
      password = (EditText) activity.findViewById(R.id.editPassword);
      passwordRepeat = (EditText) activity.findViewById(R.id.editPasswordRepeat);


    }
   public Usuario usuarioCadastro(){
       Usuario usuario = new Usuario();
       usuario.setNome(nome.getText().toString());
       usuario.setCpf(Integer.valueOf(String.valueOf(cpf.getText())));
       usuario.setCelphone(Integer.valueOf(String.valueOf(celphone.getText())));
       usuario.setEmail(email.getText().toString());
       usuario.setPassword(password.getText().toString());
       usuario.setPasswordRepeat(passwordRepeat.getText().toString());

       return usuario;
   }
}
