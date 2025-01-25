// Criação de uma classe Pessoa:
// Essa classe deve representar uma pessoa com os atributos:
// Nome da pessoa.
// Idade da pessoa.
// Um endereço, que é do tipo da classe criada anteriormente (Endereco).
// Deve ter um construtor para inicializar o nome, a idade e o endereço da pessoa.
// Adicione um método que exiba os detalhes da pessoa, incluindo:
// Nome.
// Idade.
// Rua e número do endereço (usando os métodos da classe Endereco).



public class Pessoa {

   private String nome;
   private int idade;
   private Endereco endereco;


    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void  exibirDetallhes(){

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco.getRua());


    }

    



    
}
