package pessoa;

public class testepessoa {

    public static void main(String[] args) {
        // Primeiro objeto com construtor parametrizado
        Pessoa pessoa1 = new Pessoa("Matheus Magri", 32, "11974190633");

        // Segundo objeto com construtor default
        Pessoa pessoa2 = new Pessoa();

        // Exibe os dados iniciais
        System.out.println("PESSOA 1 - Parametrizada");
        System.out.println(pessoa1);

        System.out.println("\nPESSOA 2 - Antes Default");
        System.out.println(pessoa2);

        // Altera os dados do segundo objeto
        pessoa2.alterarDados("Matheus Silva Magri", 26, "11974190633");

        System.out.println("\nPESSOA 2 - Depois Default");
        System.out.println(pessoa2);
    }
}
