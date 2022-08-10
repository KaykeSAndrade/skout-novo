package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class CandidatosActivity extends AppCompatActivity {
    //Declarando variavel para apresentar para o Java
    BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidatos_layout);

        //Apresentando o xml oa Java
        bottomAppBar = findViewById(R.id.bottomBarCandidatos);

        //Clicando nos itens de menu
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mBottomAlterar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no botão alterar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBottomExcluir:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no botão excluir",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBottomPesquisar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no botão pesquisar",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        //Clicando no ícone de navegação do bottomBar
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no ícone bottomBat",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}