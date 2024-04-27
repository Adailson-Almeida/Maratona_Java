package adailson.almeida.maratonajava.javacore.Aintroducaoclasses.test;

import adailson.almeida.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // Variável de referência estudante = objeto Estudante
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.nome = "Adailson";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante1.nome = "Felipe";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante1.nome);

    }
}
