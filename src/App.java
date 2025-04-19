import Produtos.*;
import Produtos.Produto.ESPORTE;
import Produtos.Produto.TAMANHO;
import Produtos.Raquete.MATERIAL;
import Produtos.Vestuario.TIPO;

public class App {
    public static void main(String[] args) throws Exception {
        
        Bola bola = new Bola(1234, 32.50f, "amarela", TAMANHO.M,  ESPORTE.Futebol, 0.45f );
        System.out.println(bola);

        Vestuario camisa = new Vestuario(1234, 32.50f, "amarela", TAMANHO.M,  ESPORTE.Futebol, TIPO.Camisa, "Polo", "Botafogo");  
        System.out.println(camisa);

        Raquete raquete = new Raquete(3421, 123.0f, "cinza", TAMANHO.G, ESPORTE.Tênis, MATERIAL.Carbono);
        System.out.println(raquete);
    }
}
