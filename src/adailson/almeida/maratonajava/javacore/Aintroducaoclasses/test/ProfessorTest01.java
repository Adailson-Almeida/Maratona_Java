package adailson.almeida.maratonajava.javacore.Aintroducaoclasses.test;

import adailson.almeida.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Pedro";
        professor.idade = 30;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome + " ===" +" Idade: "+professor.idade + " ===" +" Sexo: "+professor.sexo);

    }
}
