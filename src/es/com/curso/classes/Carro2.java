package es.com.curso.classes;

public class Carro2 extends Carro1 {
    private String pais;

    public Carro2(String nome, double velocidadeMaxima) {
        super(nome, velocidadeMaxima);
    }

    public void imprime(){
        super.imprime();
        System.out.println("País: " + this.pais);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
