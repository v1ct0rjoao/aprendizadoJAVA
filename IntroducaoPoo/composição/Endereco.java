package composição;
// Criação de uma classe Endereco: OK
// Essa classe deve representar um endereço com os atributos: OK
// Nome da rua. OK 
// Número do endereço.OK 
// Deve ter um construtor para inicializar esses atributos ao criar um objeto. OK
// Adicione métodos para retornar o valor da rua e o número do endereço. OK



public class Endereco {
    
   private String rua;
   private int numero;


    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    //a rua do atributo é a rua que eu vou criar

    public String getRua(){
        return rua;
    }

    public int getNumero(){
        return numero;
    }





    
}
