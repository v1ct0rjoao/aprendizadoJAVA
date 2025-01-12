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

    float Nota;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a nota do Aluno");
    Nota = scanner.nextFloat();

    if(Nota >= 7){
      System.out.println("O Aluno foi aprovado com média: " +  Nota  );
    } else if( Nota >= 5 && Nota <= 6.9 ){
      System.out.println("O aluno está de recuperação com nota: " +  Nota);
    }



  }

}
