package herança;
// Criar a Classe Main:

// Na classe Main, no método main, instancie um objeto da classe Gerente, 
// passando nome, salário e setor.
// Chame o método exibirInfo do objeto para exibir todas as informações.


public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Rafael", 3000, "frios");

        gerente.exibirInfo();
    }
}
