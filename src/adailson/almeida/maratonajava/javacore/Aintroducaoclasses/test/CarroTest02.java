package adailson.almeida.maratonajava.javacore.Aintroducaoclasses.test;

import adailson.almeida.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Nivus";
        carro.modelo = "SUV";
        carro.ano = "2022";

        System.out.println("Nome: "+carro.nome + " === "+ "Modelo: " + carro.modelo + " === "+ "Ano: " + carro.ano );
    }
}
