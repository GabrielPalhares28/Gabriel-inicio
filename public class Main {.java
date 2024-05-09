public class Main {
    
}

import java.util.Scanner;

// Classe para representar uma pessoa
class Pessoa {
    private String nome;
    private String dataNascimento;
    private String estadoCivil;

    // Construtor
    public Pessoa(String nome, String dataNascimento, String estadoCivil) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }

    // Método para exibir os dados da pessoa
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados da pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite o estado civil: ");
        String estadoCivil = scanner.nextLine();

        // Criar um objeto Pessoa com os dados fornecidos
        Pessoa pessoa = new Pessoa(nome, dataNascimento, estadoCivil);

        // Exibir os dados da pessoa
        System.out.println("\nDados da Pessoa:");
        pessoa.exibirDados();

        scanner.close();
    }
}
