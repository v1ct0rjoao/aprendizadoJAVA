
// Descrição: Crie um programa que mostre a tabuada de um número 
// fornecido pelo usuário. Use um laço de repetição.
import java.util.Scanner;;

public class Desafio3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a tabua: ");
    int tabuada = scanner.nextInt();

    System.out.println("Escolheu a tabuada do: " + tabuada);

    for (int i = 1; i < 11; i++) {

      int valor = tabuada * i;

      System.out.println(tabuada + " x " + i + " = " + valor);
    }
  }

}
