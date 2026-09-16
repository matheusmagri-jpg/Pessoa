package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    // Construtor default (valores padrão)
    public Pessoa() {
        this.nome = "Nao informado";
        this.idade = 0;
        this.cpf = "000.000.000-00";
    }

    // Construtor parametrizado
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Método para alterar os três atributos de uma vez
    public void alterarDados(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Idade: " + idade + "\n" +
               "CPF: " + cpf;
    }
}
