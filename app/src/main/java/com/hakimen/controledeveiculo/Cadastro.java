package com.hakimen.controledeveiculo;

import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Cadastro extends AppCompatActivity {

    Button btnCadastrar;
    Button btnVoltar;
    EditText edtCadastro;
    EditText edtMarca;
    EditText edtModelo;
    EditText edtPlaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btnCadastrar = findViewById(R.id.btn_cadastrar);
        btnVoltar = findViewById(R.id.btn_cancelar);

        edtCadastro = findViewById(R.id.edit_txt_vehicle_name);
        edtMarca = findViewById(R.id.edit_txt_vehicle_brand);
        edtModelo = findViewById(R.id.edit_txt_vehicle_model);
        edtPlaca = findViewById(R.id.edit_txt_vehicle_license_plate);

        btnCadastrar.setOnClickListener(v -> {
            Dados.VEICULOS.add(new Dados.Veiculo()
                    .setNome(edtCadastro.getText().toString())
                    .setMarca(edtMarca.getText().toString())
                    .setPlaca(edtPlaca.getText().toString())
                    .setModelo(edtModelo.getText().toString()));
            onBackPressed();
        });
        btnVoltar.setOnClickListener(v -> {
            onBackPressed();
        });

    }
}