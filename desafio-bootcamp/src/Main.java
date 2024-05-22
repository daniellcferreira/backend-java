import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAluno1 = new Dev();
        devAluno1.setNome("Pedro");
        devAluno1.inscreverBootcamp(bootcamp);
        devAluno1.progredir();

        Dev devAluno2 = new Dev();
        devAluno2.setNome("Aline");
        devAluno2.inscreverBootcamp(bootcamp);
        devAluno2.progredir();

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
