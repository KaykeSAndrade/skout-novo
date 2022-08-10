package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import br.com.myskout.myskout.R;

public class RecrutadoresActivity extends AppCompatActivity {
    //Declarando variavel global para carregar a lista
    ListView listaRecrutadores;

    //Base de dados para inserir no ListView
    int imgRecrutadores[] = {
            R.drawable.recrutador, R.drawable.arnaldo_torres,
            R.drawable.ana_beatriz, R.drawable.fernando_costa,
            R.drawable.gisele_miranda, R.drawable.paulo_fernandez,
            R.drawable.renato_carvalho, R.drawable.rosangela_antunes
    };
    String tiluloRecrutadores[] = {"Kleiton José", "Arnaldo Torres",
            "Ana Beatriz", "Fernando Costa", "Gisele Miranda",
            "Paulo Fernandez", "Renato Carvalho",
            "Rosangela Antunes"};
    String cargoRecrutadores[] = {"Gerente de Recursos", "Consultor de recursos humanos",
            "Gestor de recrutamento e seleção", "Assistente de departamento de pessoal",
            "Supervisor de cargos", "Analista de cargos", "Analista de treinamento",
            "Analista de recursos humanos"};
    String descricaoRecrutadores[] = {"Trabalha no recrutamento de pessoas a mais de 10 anos, é especialista de desenvolvimento de soft skills e hard skils.",
            "Gerencia pessoas e contratação de pessoas",
            "Realiza análise e gestão de processos de recursos humanos",
            "Realiza processos de contratação de pessoas em diversos cargos",
            "Auxiliar na análise de documentação e curriculos",
            "Supervisão dos processos de pessoas", "Verifica os cargos e salários",
            "Realiza a criação de treinamento de pessoas e processos."};
    String rating[] = {"8,5", "8,3", "8,5", "9,4",
            "8,7", "8,9", "9,8", "8,8", "9,5"};


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recrutadores_layout);

        //Informando o xml para o java
        listaRecrutadores = findViewById(R.id.lstRecrutadores);

        //Instanciando o Adaptador
        AdaptadorRecr adapter = new AdaptadorRecr();

        //estou carregando os itens na lista
        listaRecrutadores.setAdapter(adapter);
    }


    //Criando uma innerclass - Classe dentro da classe
    public class AdaptadorRecr extends BaseAdapter {

        //A quantidade de itens que serão carregados na lista
        @Override
        public int getCount() {
            return imgRecrutadores.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        //Quais itens serão utilizados para criar o modelo
        @Override
        public View getView(int i, View v, ViewGroup viewGroup) {
            //Declarar os objetos do modelo
            TextView txtTitulo, txtDescricao, txtRating, txtCargos;
            ImageView imgRecrutador;


            //Vai instanciar a list com o modelo
            View view = getLayoutInflater().inflate(R.layout.modelo_recrutadores, null);

            //Declarando as variaveis em xml para o java
            txtTitulo = view.findViewById(R.id.txtModeloRecrTitulo);
            txtCargos = view.findViewById(R.id.txtModeloRecrSubTitulo);
            txtDescricao = view.findViewById(R.id.txtModeloRecrInformacoes);
            txtRating = view.findViewById(R.id.txtModeloRating);
            imgRecrutador = view.findViewById(R.id.imgModeloRecr);

            //Inserindo valores nos objetos do modelo
            txtTitulo.setText(tiluloRecrutadores[i]);
            txtCargos.setText(cargoRecrutadores[i]);
            txtDescricao.setText(descricaoRecrutadores[i]);
            txtRating.setText(rating[i]);

            imgRecrutador.setImageResource(imgRecrutadores[i]);


            return view;
        }
    }
}