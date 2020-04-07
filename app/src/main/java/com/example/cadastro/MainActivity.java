package com.example.cadastro;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    String mensagem;
    private EditText campoNome;
    private CheckBox email;
    private CheckBox numero;
    private CheckBox mensagemtexto;
    private TextInputEditText campoNumero;
    private TextView textoInformacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoNumero = findViewById(R.id.editNumero);
        numero = (CheckBox) findViewById(R.id.celular);
        email = (CheckBox) findViewById(R.id.email);
        mensagemtexto = (CheckBox) findViewById(R.id.mensagem);
        textoInformacoes = findViewById(R.id.textoInformacoes);

    }

    public void checkbox(View view) {

        String nome = campoNome.getText().toString();
        String telefone = campoNumero.getText().toString();

        String mensagem = " \n O meio de contato selecionado foi: ";

        if (mensagemtexto.isChecked())
            mensagem += " SMS ";
        if (email.isChecked())
            mensagem += " Email ";
        if (numero.isChecked())
            mensagem += " Telefone ";

        textoInformacoes.setText(mensagem);


    }

    public void limpar(View view) {
        campoNome.setText("");
        campoNumero.setText("");
    }
}
