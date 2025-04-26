package pessoas;

import java.util.ArrayList;
import vendas.*;

public class Vendedor extends Pessoa {
    private Float salario;
    private ArrayList<Venda> vendas;

    public Vendedor(String cpf, String nome, Float salario) {
        super(cpf, nome);
        this.salario = salario ;
        this.vendas = new ArrayList<Venda>();
    }

    public void addVenda(Venda venda) {
        this.vendas.add(venda);
    }

    public Float calcularComissao(Float valorVenda, Float percentual) { //arrumar isso
        return valorVenda * (percentual/100);
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
