package es.com.curso.classes;

import java.util.Scanner;

//Funcionário
public class Teste2 {
    Scanner scan = new Scanner(System.in);
    double numero1;
    double numero2;
    double resultado;

    public void imprime() {
        System.out.println("digite um número para divisão:");
        numero1 = scan.nextDouble();
        System.out.println("Digite um segundo número:");
        numero2 = scan.nextDouble();
        resultado = numero1 / numero2;
        System.out.println("O resultado da divisão é:\n" + resultado);
    }
}
