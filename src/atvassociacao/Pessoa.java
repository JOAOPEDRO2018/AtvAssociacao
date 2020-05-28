package atvassociacao;
public abstract class Pessoa {
    //ATRIBUTOS 
    private String nome;
    private String endereço; 

    public Pessoa(String nome, String endereço){
        this.nome = nome;
        this.endereço = endereço; 
    }
    //METODOS 
    //public abstract void Pessoa(String p1, String p2); 
    
    
    //GET SET    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}
