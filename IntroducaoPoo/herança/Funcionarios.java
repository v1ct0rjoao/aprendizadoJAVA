// Criar a Superclasse Funcionario:

// Defina dois atributos: nome (do tipo String) e salario (do tipo double)
//  como protected para permitir acesso nas subclasses.
// Crie um construtor que receba o nome e o salário como parâmetros e inicialize os atributos.
// Implemente um método exibirInfo, que exibe o nome e o salário do funcionário.



package herança;

public class Funcionarios {
 
    protected String nome;
    protected double salario;


    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInfo(){

        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
    
}
