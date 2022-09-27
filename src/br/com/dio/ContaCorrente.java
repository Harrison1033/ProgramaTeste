package br.com.dio;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***** Extrato Conta Corrente *****");
        //informações comuns da classe conta da parte de baixo do código
        super.imprimirInfosComuns();
    }
}
