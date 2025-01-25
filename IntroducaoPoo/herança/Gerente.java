package herança;
// Criar a Subclasse Gerente:
// Estenda a classe Funcionario usando a palavra-chave extends.
// Adicione um novo atributo setor (do tipo String) para armazenar o setor do gerente.
// Implemente um construtor que receba o nome, o salário e o setor. Use a palavra-chave super para 
// chamar o construtor da superclasse e inicializar nome e salario.
// Sobrescreva (@Override) o método exibirInfo para incluir também o setor nas informações exibidas. 
// Utilize o método super.
// exibirInfo para reaproveitar o código da superclasse.


public class Gerente extends Funcionarios {

   private String setor;

    public Gerente( String nome, double salario, String setor){
        super(nome, salario);
        this.setor = setor;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Setor: " +  setor);
    }


    
}
