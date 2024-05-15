package adailson.almeida.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {

        System.out.println(10 + 10);
    }

    public void subtracaoDoisNumeros() {

        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {

        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        return (num1 / num2);
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }
}
