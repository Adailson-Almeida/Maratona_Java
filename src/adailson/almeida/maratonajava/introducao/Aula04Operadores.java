package adailson.almeida.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = numero1 / (double) numero2;
        int resto = 20 % 2;

        // Operadores lógicos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte "+isDezIgualAVinte);
        System.out.println("isDezIgualADez "+isDezIgualADez);
        System.out.println("isDezDiferenteDeDez "+isDezDiferenteDeDez);

        // Operadores lógicos && (AND) || (OR) ! (NO)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQue30 "+isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQue30 "+isDentroDaLeiMenorQue30);


        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 4000;
        float valorPlaystation = 3500F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // Operadores de atribuição = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        // Operadores unários
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++; // contador = contador + 1;
        contador--; // contador = contador - 1;
        ++contador; // colocando o ++ antes, primeiro ele incrementa depois executa, colocando depois primeiro executa depois incrementa
        --contador;
        System.out.println(contador);
    }
}
