package estudando.classeMain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClasse {
    public static void main(String[] args) {
        //1.Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
        //Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
        // e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 - Fevereiro e etc).
        List<Double> temperaturas = new ArrayList<>();
        temperaturas.add(25.3);
        temperaturas.add(36.7);
        temperaturas.add(42.8);
        temperaturas.add(32.8);
        temperaturas.add(12.7);
        temperaturas.add(21.2);
        System.out.println(temperaturas);
        Iterator <Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double media = (soma/temperaturas.size());
        System.out.printf("Média da temperatura: %.2f \n" , media);
        if (temperaturas.get(0) < media){
            System.out.println("1-Janeiro: " + temperaturas.get(0) + "º");
        }if (temperaturas.get(1) < media){
            System.out.println("2-Fevereiro: " + temperaturas.get(1) + "º");
        }if (temperaturas.get(2) < media){
            System.out.println("3-Março: " + temperaturas.get(2) + "º");
        }if (temperaturas.get(3) < media){
            System.out.println("4-Abril: " + temperaturas.get(3) + "º");
        }if (temperaturas.get(4) < media){
            System.out.println("5-Maio: " + temperaturas.get(4) + "º");
        }if (temperaturas.get(5) < media){
            System.out.println("6-Junho: " + temperaturas.get(5) + "º");
        }
    }
}
