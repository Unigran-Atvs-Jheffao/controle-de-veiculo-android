package com.hakimen.controledeveiculo;

import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Cadastro extends AppCompatActivity {

    Button btnCadastrar;
    Button btnVoltar;
    EditText edtCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btnCadastrar = findViewById(R.id.btn_cadastrar);
        btnVoltar = findViewById(R.id.btn_cancelar);

        edtCadastro = findViewById(R.id.edit_txt_vehicle_name);

        btnCadastrar.setOnClickListener(v -> {
            Dados.VEICULOS.add(new Dados.Veiculo(edtCadastro.getText().toString()));
            onBackPressed();
        });
        btnVoltar.setOnClickListener(v -> {onBackPressed();});

    }
}