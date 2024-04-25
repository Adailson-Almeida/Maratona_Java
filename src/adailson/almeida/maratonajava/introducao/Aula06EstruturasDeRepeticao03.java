package adailson.almeida.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um dado valor. Por exemplo, 50
        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo ; i++) {
            if (i > 25){
                break; // Obs. O break sai do laço de repetição
            }
            System.out.println(i);
        }
    }
}
