package adailson.almeida.maratonajava.javacore.Aintroducaoclasses.test;

import adailson.almeida.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Grand Siena";
        carro.modelo = "Sedan";
        carro.ano = "2014";

        System.out.println("Nome: "+carro.nome + " === "+ "Modelo: " + carro.modelo + " === "+ "Ano: " + carro.ano );
    }
}
