package es.com.curso.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste  {
    Scanner scan;
    int tamanhoX, tamanhoY;
    static int tabuleiroJogador1 [] [],tabuleiroJogador2 [] [];
    public void imprimir() {
        for (;;) {//loop infinito até o tudo ok ficar verdadeiro
            boolean tudoOk = false;
            try {//Tratando o erro
                scan = new Scanner(System.in);
                System.out.println("Digite altura do tabuleiro: ");
                tamanhoX = scan.nextInt();
                System.out.println("Digite o comprimento: ");
                tamanhoY = scan.nextInt();
                tudoOk = true;
                System.out.println(tamanhoX + " X " + tamanhoY);
            } catch (InputMismatchException erro) {//erro caso coloquem letras no lugar dos números
                System.out.println("Digite um valor numérico");
            }
            if (tudoOk) {
                scan.close();
                break;
            }
        }
        imprimir();
        tabuleiroJogador1 = new int[tamanhoX][tamanhoY];
        tabuleiroJogador2 = new int[tamanhoX][tamanhoY];

    }
}