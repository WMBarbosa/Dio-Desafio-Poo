package br.com.dio.desafio.dominio;


public class Curso  extends Conteudo{

    private Integer cargaHoraria;


    public Curso() {
    }


    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " +
                "Titulo = " + getTitulo() +
                ", Descrição = " + getDescricao() +
                ", CargaHoraria = " + cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
