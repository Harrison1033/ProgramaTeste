package desafio.dio.POO.mentoria.java;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXP() {

        return XP_PADRAO * cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso:\n" +
                "titulo= " + getTitulo() +
                "\ndescricao= " + getDescricao()+
                "\ncargaHoraria= " + cargaHoraria + "\n-----------------------------";
    }
}
