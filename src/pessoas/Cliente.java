package pessoas;

public class Cliente extends Pessoa {
    private final String email;


    public Cliente(String cpf, String nome, String email) {
        super(cpf, nome);
        this.email = email;
    }
    
}
