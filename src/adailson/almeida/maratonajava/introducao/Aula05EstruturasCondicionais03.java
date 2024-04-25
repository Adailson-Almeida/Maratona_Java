package adailson.almeida.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário for maior que 5000.
        double salario = 6000;

        //Operador ternário = (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Vou doar 500 pro DevDojo." : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
