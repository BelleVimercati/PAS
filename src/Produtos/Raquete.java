package Produtos;

public class Raquete extends Produto {
    public enum MATERIAL {Metal, Aluminio, Carbono}
    private MATERIAL material;


    public Raquete(Integer codigo, Float preco, String cor, TAMANHO tamanho, ESPORTE esporte, MATERIAL material) {
        super(codigo, preco, cor, tamanho, esporte);
        this.material = material;
    }


    public MATERIAL getMaterial() {
        return material;
    }
    
    @Override
    public String toString() {
        return "Raquete {" +
            "código=" + getCodigo() +
            ", preço=" + getPreco() +
            ", cor='" + getCor() + '\'' +
            ", tamanho=" + getTamanho() +
            ", esporte=" + getEsporte() +
            ", material=" + material +
            '}';
    } 
}
