package es.com.curso.classes;

import java.util.Scanner;

public class Teste3 {
    Scanner scan = new Scanner(System.in);
    double numero;

    public void imprime() {
        System.out.println("Digite um número para a tabuada de Multiplicação: ");
        numero = scan.nextDouble();
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }

}
