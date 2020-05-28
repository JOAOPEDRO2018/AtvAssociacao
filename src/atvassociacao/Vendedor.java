package atvassociacao;
public class Vendedor extends Pessoa{ 
    private int CodFunci;
    private double TaxaComissao;
    private Pedidos pedidos;

    public Vendedor(String nome, String endereço, int Cod) {
        super(nome, endereço);
        this.CodFunci = Cod; 
    }
   
    public void listaPedidos(int Codigo, String data, double Valor){
        pedidos = new Pedidos();
        this.pedidos.setNum(Codigo);
        this.pedidos.setData(data);
        this.pedidos.setValor(Valor);
        
    }
    public void status(){
        System.out.println("Nome: " +getNome() );
        System.out.println("Cod do funci: "+getCodFunci());
        //System.out.println("Numero pedido: " +pedidos.getNum());
        System.out.println("Valor: " +pedidos.getValor());
    }
    
    
    
    // GET SET 
    public int getCodFunci() {
        return CodFunci;
    }

    public void setCodFunci(int CodFunci) {
        this.CodFunci = CodFunci;
    }

    public double getTaxaComissao() {
        return TaxaComissao;
    }

    public void setTaxaComissao(double TaxaComissao) {
        this.TaxaComissao = TaxaComissao;
    }
    
    
    
}
