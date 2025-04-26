package produtos;

public abstract class Produto {
    public enum TAMANHO {P, M, G};
    public enum ESPORTE {Volei, Futebol, Basquete, Handebol, Rugby, Tênis};
    private TAMANHO tamanho;
    private ESPORTE esporte;
    private String codigo;
    private Float preco;
    private String cor;

    public Produto(String codigo, Float preco, String cor, TAMANHO tamanho, ESPORTE esporte) {
        this.codigo = codigo;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
        this.esporte = esporte;
    }

    public TAMANHO getTamanho() {
        return tamanho;
    }

    public ESPORTE getEsporte() {
        return esporte;
    }

    public String getCodigo() {
        return codigo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }
}
