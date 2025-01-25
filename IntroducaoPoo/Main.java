
// Criação de uma classe principal (geralmente chamada de Main):
// Nessa classe, crie um objeto do tipo Endereco, fornecendo valores para rua e número.
// Depois, crie um objeto do tipo Pessoa, passando o nome, a idade e o objeto de endereço criado anteriormente.
// Por fim, chame o método que exibe os detalhes da pessoa, mostrando as informações completas.


public class Main {

    public static void main(String[] args) {
        
        Endereco meuEndereco = new Endereco("Jorge amado",35);
        Pessoa pessoa = new Pessoa("Joao", 22, meuEndereco);

        pessoa.exibirDetallhes();
    }
    
}
