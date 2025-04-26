package conjuntos;
import produtos.Vestuario;

public class Uniforme{
	private Conjunto conjunto;
	private String time;
	
	public Uniforme(String nome, String time){
		conjunto = new Conjunto(nome);
		this.time = time;
	}
	
	public void addVestuario(Vestuario v){
		if(v.getTime().equals(time));
			conjunto.addProduto(v);
	}
}
