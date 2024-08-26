package com.hakimen.controledeveiculo;

import android.app.AlertDialog;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnSair;
    Button btnCadastro;

    ListView listView;

    ArrayAdapter<Dados.Veiculo> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSair = findViewById(R.id.btn_sair);
        btnCadastro = findViewById(R.id.btn_cadastrar);

        listView = findViewById(R.id.listView);

        arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, Dados.VEICULOS);

        listView.setAdapter(arrayAdapter);

        btnCadastro.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Cadastro.class);
            startActivity(intent);
        });
        btnSair.setOnClickListener(v -> {
            finish();
        });

        listView.setOnItemLongClickListener((parent, view, position, id) -> {
            Dados.Veiculo veiculo = arrayAdapter.getItem(position);

            TextView text = new TextView(this);
            text.setText("Deseja remover o veiculo '{}' ?".replace("{}", veiculo.nome));
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                    .setCancelable(true)
                    .setCustomTitle(text)
                    .setPositiveButton("Confirmar", (dialog, which) -> {
                        Dados.VEICULOS.remove(veiculo);
                        arrayAdapter.notifyDataSetChanged();
                        dialog.dismiss();
                    })
                    .setNegativeButton("Cancelar", (dialog, which) -> {
                        dialog.dismiss();
                    });
            builder.show();

            return true;
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        arrayAdapter.notifyDataSetInvalidated();
    }

    @Override
    protected void onStart() {
        super.onStart();
        arrayAdapter.notifyDataSetChanged();
    }
}