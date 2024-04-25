package adailson.almeida.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade menor que 15 = categoria infantil
        // idade maior igual a 15 e menor que 18 = categoria juvenil
        // idade maior igual a 18 = categoria adulto
        int idade = 17;
        String categoria;
        if (idade < 15){
            categoria ="Categoria Infantil";
        } else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
