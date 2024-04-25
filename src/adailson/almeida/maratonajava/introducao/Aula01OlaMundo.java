package adailson.almeida.maratonajava.introducao;

import java.util.Scanner;

public class Aula01OlaMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //float medidaTotalParede, medidaSuport, resultado;

        System.out.println("Digite a medida total da parede em cm: ");
        float medidaTotalParede = Float.parseFloat(scanner.nextLine());

        System.out.println("Digite a medida da distância entre os suportes: ");
        float medidaSuporte = Float.parseFloat(scanner.nextLine());

        float resultado = (medidaTotalParede - medidaSuporte) / 2;

        System.out.println("==== Medidas Informadas ====");
        System.out.println("Medida Total da Parede = " + medidaTotalParede + " cm");
        System.out.println("Medida da Distância entre os Suportes = " + medidaSuporte + " cm");

        System.out.println("A medida de cada lado para furação deverá ser de " + resultado + " cm");
    }
}
