package produtos;

public class Vestuario extends Produto {
    public enum TIPO {Camisa, Bermuda, Meia}
    private TIPO tipo;
    private String estilo;
    private String time;


    public Vestuario(String codigo, Float preco, String cor, TAMANHO tamanho, ESPORTE esporte, TIPO tipo, String estilo, String time) {
        super(codigo, preco, cor, tamanho, esporte);
        this.tipo = tipo;
        this.estilo = estilo;
        this.time = time;
    }
    
    public Vestuario(String codigo, Float preco, String cor, TAMANHO tamanho, ESPORTE esporte, TIPO tipo, String estilo){
        this(codigo, preco, cor, tamanho, esporte, tipo, estilo, "");
    }

    public TIPO getTipo() {
        return tipo;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "ROupa {" +
            "código=" + getCodigo() +
            ", preço=" + getPreco() +
            ", cor='" + getCor() + '\'' +
            ", tamanho=" + getTamanho() +
            ", esporte=" + getEsporte() +
            ", time='" + time + '\'' +
            ", estilo=" + estilo +
            ", Tipo=" + tipo +
            '}';
    }  
}
