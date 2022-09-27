package es.com.curso.principal;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TesteMain {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double a, b, c;
        String primeiro, segundo, terceiro;
        double quadrado, circulo, trapezio, retangulo, triangulo;
        primeiro = JOptionPane.showInputDialog("Entre com o primeiro valor: ");
        segundo = JOptionPane.showInputDialog("Entre como o segundo valor: ");
        terceiro = JOptionPane.showInputDialog("Entre com o terceiro valor: ");
        a = Integer.parseInt(primeiro);
        b = Integer.parseInt(segundo);
        c = Integer.parseInt(terceiro);
        triangulo = (a * c) / 2;
        circulo = 3.14159 * Math.pow(c, 2);
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;
        JOptionPane.showMessageDialog(null, "A área do triangulo é: " + df.format(triangulo), "Resultado", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "A área do circulo é: " + df.format(circulo), "Resultado", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "A área do trapezio é: " + df.format(trapezio), "Resultado", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + df.format(quadrado), "Resultado", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "A área do retangulo é: " + df.format(retangulo), "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
