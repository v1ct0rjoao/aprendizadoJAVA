package composição;

public class Main {

    public static void main(String[] args) {
        
        Endereco meuEndereco = new Endereco("Jorge amado",35);
        Pessoa pessoa = new Pessoa("Joao", 22, meuEndereco);

        pessoa.exibirDetallhes();
    }
    
}
