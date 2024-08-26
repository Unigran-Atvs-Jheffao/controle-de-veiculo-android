package com.hakimen.controledeveiculo;

import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Dados {
    public static final List<Veiculo> VEICULOS = new ArrayList<>();

    static {
    }

    static class Veiculo{
        String nome;

        public Veiculo(String nome) {
            this.nome = nome;
        }

        @NonNull
        @NotNull
        @Override
        public String toString() {
            return nome;
        }
    }
}
