package cliquefidelidade.mobile.uechi.cliquefidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String [] codigosCadastrados = {"4 pontos - Casa da Dona Neusa","1 ponto- Bar do Mool"};
        ListView ListaCodigos =(ListView) findViewById(R.id.lista_fidelidade);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrarNovoQr = new Intent(ListActivity.this, SignInActivity.class);
                startActivity(cadastrarNovoQr);

            }
        });
    }

}
