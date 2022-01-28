package br.com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente clienteBanco = new Cliente();
        Scanner scan = new Scanner(System.in);
        clienteBanco.setNome("Harrison");
        String opc;

        Conta contCorrente = new ContaCorrente(clienteBanco);
        Conta poupanca = new ContaPoupanca(clienteBanco);

        System.out.println("Gostaria de fazer um depósito?\nSim\nNão");
        opc = scan.next();
        poupanca.depositar(800);//no caso já existe um valor na poupança:
        contCorrente.depositar(125);//e um valor na conta corrente:
        if (opc.equalsIgnoreCase("Sim")) {
            System.out.println("Digite o valor de depósito para conta corrente: ");
            contCorrente.depositar(scan.nextDouble());
            System.out.println("Gostaria de fazer uma transferencia para conta poupança?\nSim\nNão");
            opc = scan.next();
            if (opc.equalsIgnoreCase("Sim")) {
                System.out.println("digite um valor para transferencia: ");
                contCorrente.transferir(scan.nextDouble(), poupanca);
            }
        }
        contCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
