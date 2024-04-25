package adailson.almeida.maratonajava.javacore.Aintroducaoclasses.test;

import adailson.almeida.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // Variável de referência estudante = objeto Estudante
        Estudante estudante = new Estudante();
        estudante.nome = "Adailson";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
