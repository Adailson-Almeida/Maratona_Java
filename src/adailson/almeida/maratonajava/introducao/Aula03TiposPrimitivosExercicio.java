package adailson.almeida.maratonajava.introducao;

/*
* Prática
*
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereco>,
* confirmo que recebi o salário de <salario>, na data <data>
* */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome, endereco, data;
        float salario;
        nome = "Adailson";
        endereco = "QN 18, Conjunto 2, Casa 3, Riacho Fundo 2";
        data = "05/04/2024";
        salario = 2200F;

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", " +
                "confirmo que recebi o salário de R$ " + salario + ", na data " + data +".");
    }
}
