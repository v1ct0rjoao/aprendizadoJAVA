
// DESAFIO 1 : calculadora de area e perimetro
// 1. Solicite ao usuário o comprimento e a largura de um retângulo.
// 2. Calcule e exiba:
//      A área do retângulo: area = comprimento × largura
//      O perímetro do retângulo:  perımetro = 2 ×(comprimento+largura)
//3. use variaveis adequadas para armazenar os dados   
//4. utilize o Scanner para capturar os valores do usuario
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        String calculadora = "Calcular Área e Perímetro";
        System.out.println(calculadora);

        Scanner DadoArea = new Scanner(System.in);

        System.out.println("preciso que você indique a comprimento e largura");
        float comprimento = DadoArea.nextFloat();
        float largura = DadoArea.nextFloat();

        float area = comprimento * largura;
        float perimetro = 2 * (comprimento + largura);

        String resultado = "Area é: " + area + " O perimetro é: " + perimetro;

        System.out.println(resultado);

    }

}
