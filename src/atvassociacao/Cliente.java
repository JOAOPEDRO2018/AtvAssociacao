package atvassociacao;
public class Cliente extends Pessoa{
    private int Codigo;
    private double LimiteCredito; 
    private double LimiteDisponivel;
    private Pedidos pedidos; 
    
    public Cliente(int Codigo, String nome, String endereço, double credito) {
        super(nome, endereço);
        this.Codigo = Codigo; 
        this.LimiteCredito = credito; 
    }
    
    public void listarPedidos(int Codigo, String data, double Valor){
        this.pedidos.setNum(Codigo);
        this.pedidos.setData(data);
        this.pedidos.setValor(Valor); 
    } 
    
    //GET SET    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public double getLimiteCredito() {
        return LimiteCredito;
    }

    public void setLimiteCredito(double LimiteCredito) {
        this.LimiteCredito = LimiteCredito;
    }

    public double getLimiteDisponivel() {
        return LimiteDisponivel;
    }

    public void setLimiteDisponivel(double LimiteDisponivel) {
        this.LimiteDisponivel = LimiteDisponivel;
    }
    
    
    
    
    
    
    
    
}
