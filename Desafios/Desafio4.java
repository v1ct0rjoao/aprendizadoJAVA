// Desafio: Trabalhando com Arrays
// Peça ao usuário para inserir 10 números.
// Mostre:
// Os números em ordem normal.
// Os números em ordem inversa.
// A soma de todos os números.

import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // declaração de array

        int[] numeros;
        numeros = new int[10];

        System.out.println("Digite 10 numeros: ");

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = scanner.nextInt();
        }
        System.out.println("\nNúmeros na ordem normal:");
        for (int j = 0; j < numeros.length; j++) {
            System.out.println("O numero é: " + numeros[j]);

        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int k = numeros.length - 1; k >= 0; k--) { // Correção do laço
            System.out.println("O número é: " + numeros[k]);
        }

        System.out.println("\nSoma dos valores");
        int soma = 0;
        for (int l = 0; l < numeros.length; l++) {
          soma = numeros[l] + soma;
          
        }

        System.out.println("\n a soma é: " + soma);
    }
}
