// Descrição
// Você deve criar um programa que simule um sistema de avaliação escolar, 
// onde o usuário insere a nota de um aluno e o programa determina:
// Se o aluno foi aprovado, reprovado ou está de recuperação.
// Critérios:
// Nota maior ou igual a 7: Aprovado.
// Nota entre 5 e 6.9 (inclusive): Recuperação.
// Nota menor que 5: Reprovado.
// Se o aluno tirou uma nota par ou ímpar.
// Exibir uma mensagem ao final com as informações completas.

import java.util.Scanner;

public class SistemaDeNotas {

  public static void main(String[] args) {

    int continuar;
    float Nota;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Deseja colocar nota de alguma aluno, digite se sim 1 ou não 2 ");
    continuar = scanner.nextInt();

    while (continuar == 1) {
      if (continuar == 1) {

        System.out.println("Digite a nota do Aluno");
        Nota = scanner.nextFloat();

        while (Nota > 10 || Nota < 0) {
          System.out.println("erro, digite a nota novamente: ");
          Nota = scanner.nextFloat();

        }

        if (Nota >= 7) {
          System.out.println("O Aluno foi aprovado com média: " + Nota);

        } else if (Nota >= 5 && Nota <= 6.9) {
          System.out.println("O aluno está de recuperação com nota: " + Nota);

        } else {
          System.out.println("O aluno foi reprovado com nota menor que 5: " + Nota);

        }

        if ((int) Nota % 2 == 0) {
          System.out.println("\nNota é par");
          System.out.println("Deseja continuar digite 1 para sim digite 2 para não");
          continuar = scanner.nextInt();
        } else {
          System.out.println("Nota é impar");
          System.out.println("Deseja continuar digite 1 para sim digite 2 para não");
          continuar = scanner.nextInt();
        }

      }

    }
  }

}
