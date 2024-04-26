package adailson.almeida.maratonajava.javacore.Aintroducaoclasses.test;

import adailson.almeida.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Grand Siena";
        carro01.modelo = "Sedan";
        carro01.ano = 2014;

        carro02.nome = "Nivus";
        carro02.modelo = "SUV";
        carro02.ano = 2022;

        System.out.println("Nome: "+carro01.nome + " === "+ "Modelo: " + carro01.modelo + " === "+ "Ano: " + carro01.ano );
        System.out.println("Nome: "+carro02.nome + " === "+ "Modelo: " + carro02.modelo + " === "+ "Ano: " + carro02.ano );


    }
}
