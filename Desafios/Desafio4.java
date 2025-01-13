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
            int index = 0;

            if(i   numeros.length){
                System.out.println(numeros[i]);
            }

        }

    

    }
}