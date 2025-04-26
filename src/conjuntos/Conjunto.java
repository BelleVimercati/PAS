package conjuntos;
import java.util.HashMap;
import produtos.*;

public class Conjunto {
    private String nome;
    private HashMap<String, Produto> produtos;
    
    //Construtor
    public Conjunto(String nome){
        this.nome = nome;
        produtos = new HashMap<String, Produto>();
    }
    public String getNome(){
        return nome;
    }
    //fazendo get e set de hashmap
    public Produto getProduto(String codigo){
        return produtos.get(codigo);
    }

    public void addProduto(Produto produto){
        produtos.put(produto.getCodigo(), produto);
    }

    public void removeProduto(String codigo){
        produtos.remove(codigo);
    }

    public float calcularPreco(float desconto){
        float preco = 0;
        for(Produto p : produtos.values()){
            preco += p.getPreco();
        }
        return preco - (preco * desconto / 100);
    }
}
