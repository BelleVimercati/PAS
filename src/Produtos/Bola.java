package produtos;

public class Bola extends Produto {
    private Float peso;
    private String time;

    //se o usuário informa todos os parâmetros
    public Bola(String codigo, Float preco, String cor, TAMANHO tamanho, ESPORTE esporte, String time, Float peso) {
        super(codigo, preco, cor, tamanho, esporte);
        this.time = time;
        this.peso = peso;
    }
    
    //se o usuário não informa time
    public Bola(String codigo, Float preco, String cor, TAMANHO tamanho, ESPORTE esporte, Float peso) {
        this(codigo, preco, cor, tamanho, esporte, "", peso);
    }

    public Float getPeso() {
        return peso;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Bola {" +
            "código=" + getCodigo() +
            ", preço=" + getPreco() +
            ", cor='" + getCor() + '\'' +
            ", tamanho=" + getTamanho() +
            ", esporte=" + getEsporte() +
            ", time='" + time + '\'' +
            ", peso=" + peso +
            '}';
    } 
}
