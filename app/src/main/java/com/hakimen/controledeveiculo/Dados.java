package com.hakimen.controledeveiculo;

import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Dados {
    public static final List<Veiculo> VEICULOS = new ArrayList<>();

    static class Veiculo{
        String nome;
        String marca;
        String modelo;
        String placa;

        public String getNome() {
            return nome;
        }

        public Veiculo setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public String getMarca() {
            return marca;
        }

        public Veiculo setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public String getModelo() {
            return modelo;
        }

        public Veiculo setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public String getPlaca() {
            return placa;
        }

        public Veiculo setPlaca(String placa) {
            this.placa = placa;
            return this;
        }

        @NonNull
        @NotNull
        @Override
        public String toString() {
            return "Nome: " + nome + "\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Placa: " + placa;
        }
    }
}
