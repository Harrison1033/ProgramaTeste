package br.com.dio;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        //informações comuns da classe conta da parte de baixo do código
        super.imprimirInfosComuns();
    }
}
