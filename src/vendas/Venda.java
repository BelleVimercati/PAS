package vendas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import conjuntos.Conjunto;
import pessoas.Cliente;
import pessoas.Vendedor;

public class Venda {
    private Date data;
	private float desconto;
	private ArrayList<Vendedor> vendedores;
	private Cliente comprador;
	private ArrayList <Conjunto> produtos;


    public Venda(Cliente comprador) {
        this.comprador = comprador;
        this.vendedores = new ArrayList<Vendedor>();
        this.produtos = new ArrayList<Conjunto>();
    }
    
    //MÉTODOS MAIS ELABORADOS
    public void addVendedor(Vendedor vendedor){
        vendedores.add(vendedor); 
        vendedor.addVenda(this); //passando a instancia atual
    }
    public float calcularValor(){
        float total = 0;
        for (Conjunto produto : produtos){
            total += produto.calcularPreco(desconto);
        }
        return total;
    }

    //SETTERS
    public void fecharCompra(){
        setData(Calendar.getInstance().getTime());

    }
    private void setData(Date data) {
        this.data = data;
    }
    private void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    //GETTERS
    public Date getData() {
        return data;
    }
    public float getDesconto() {
        return desconto;
    }
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
    public Cliente getComprador() {
        return comprador;
    }
    public ArrayList<Conjunto> getProdutos() {
        return produtos;
    }	
}
