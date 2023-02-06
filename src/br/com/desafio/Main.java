package br.com.desafio;

import br.com.dominio.Bootcamp;
import br.com.dominio.Curso;
import br.com.dominio.Dev;
import br.com.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
       System.out.println("\tAdicionando Cursos\t");
        Curso curso1 = new Curso("java", "Java Orientada a Objeto", 8);
        Curso curso2 = new Curso("javascript", "Javascript for web", 10);

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());

        System.out.println("\n");
        System.out.println("\tAdicionando Mentoria\t");
        Mentoria mentoria = new Mentoria("Dominando Programação Orientada a Objetos com Java", "A POO nos permite criar softwares com um constante aprimoramento do processo, sem que isso implique um rearranjo de todo o sistema. ");

        System.out.println("\n");
        System.out.println(mentoria.toString());

        Bootcamp bootcamp = new Bootcamp("Orange Tech", "Backend");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("\n\tAdicionando Bootcamp\t");
        System.out.println(bootcamp);
     

        System.out.println("\n\tAdicionando Dev...\t");
        Dev devWeverson = new Dev("Weverson");
        Dev devCamila = new Dev("Camila");

        System.out.println("\n\tAdicionando Dev no bootcamp\t");
        System.out.println("\n");
        System.out.println("Conteudos Inscrito: " + devWeverson.getConteudosInscritos());

        devWeverson.inscreverBootcamp(bootcamp);
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println(bootcamp);



        System.out.println("\nConteudos Inscrito de " + devWeverson.getNome()+ ": "+devWeverson.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos de " + devWeverson.getNome()+ ": "+devWeverson.getConteudosConcluidos());

   
        System.out.println("Progredir bootcamps");
        devWeverson.progredir();
        devCamila.progredir();

        System.out.println("\nConteudos Inscrito de " + devCamila.getNome()+ ": "+devCamila.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos de " + devCamila.getNome()+ ": "+devCamila.getConteudosConcluidos());
        
        System.out.println("\nConteudos Inscrito de " + devWeverson.getNome()+ ": "+devWeverson.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos de " + devWeverson.getNome()+ ": "+devWeverson.getConteudosConcluidos());

    
        System.out.println("\nExibindo XP\t");
        System.out.println("\n o XP do  " + devWeverson.getNome()+ ": "+devWeverson.calcularTotalXp());
        System.out.println("\n o XP do  " + devCamila.getNome()+ ": "+devCamila.calcularTotalXp());

        devCamila.progredir();
        System.out.println("\n o XP do  " + devWeverson.getNome()+ ": "+devWeverson.calcularTotalXp());
        System.out.println("\n o XP do  " + devCamila.getNome()+ ": "+devCamila.calcularTotalXp());

        

    }
}
