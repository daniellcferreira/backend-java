package dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        
        return "Curso: " + getTitulo() + " " + getDescricao() + " " + cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
