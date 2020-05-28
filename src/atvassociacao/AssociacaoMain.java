package atvassociacao;
public class AssociacaoMain {
    public static void main(String[] args) {
        //Pedidos pedido = new Pedidos();
        Vendedor vendedor = new Vendedor("João", "Av.Brasil", 123);
        
        vendedor.listaPedidos(1,"26/05/2020",200.0);
        
        vendedor.status();
        

    }
    
}
