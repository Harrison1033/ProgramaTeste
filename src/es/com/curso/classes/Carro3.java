package es.com.curso.classes;

public class Carro3 extends Carro1 {
    private int quantidade;
    public Carro3(String nome,double velocidade){
        super(nome, velocidade);
    }
    public void imprime(){
        super.imprime();
        System.out.println("Quantidade: " + this.quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
