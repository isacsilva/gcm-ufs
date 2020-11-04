public class GerenciadorVenda{
  protected int id;
  protected String desc;
  protected float valor;

  protected GerenciadorCliente cliente;

  public int realizarVenda(Venda venda){
    this.id = venda.id;
    this.desc = venda.desc; 
    this.valor = venda.valor;
    
    cliente.inserir(venda.id_cliente);
  }
}