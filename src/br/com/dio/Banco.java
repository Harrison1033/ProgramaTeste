package br.com.dio;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

//geters e seters------------------------------
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public List<Conta> getContas() {

        return contas;
    }

    public void setContas(List<Conta> contas) {

        this.contas = contas;
    }
}
