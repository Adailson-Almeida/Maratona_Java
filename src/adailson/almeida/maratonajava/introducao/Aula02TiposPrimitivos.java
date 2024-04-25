package adailson.almeida.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        // Forçando um valor long para o tipo int (casting)
        int idade = (int) 10000000000L;
        long numeroGrande = 100000;
        double valorSalario = 3000;
        float Salario = 3500.0F;
        byte idadeByte = 32;
        short idadeShort = 32;
        boolean verdade = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Olá, meu nome é Adailson!";

        System.out.println("A idade é " + idade);
        System.out.println(verdade);
        System.out.println(numeroGrande);
        System.out.println(idade);
        System.out.println(nome);
    }
}
