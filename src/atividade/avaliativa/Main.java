package atividade.avaliativa;

// IMPORTE A CLASSE SCANNER PARA LER A ENTRADA DO CONSOLE
import java.util.Scanner;

// ==========================================
// SISTEMA DE GERENCIAMENTO - AUTOESCOLA "DIREÇÃO CERTA"
// (Classes Pessoa, Aluno, Instrutor, Veiculo, Aula, Agenda não foram alteradas)
// ==========================================

// CLASSE ABSTRATA - demonstra ABSTRAÇÃO e HERANÇA
abstract class Pessoa {
    // ENCAPSULAMENTO
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    // POLIMORFISMO (método sobrescrito nas subclasses)
    public abstract void exibirInfo();
}

// SUBCLASSE Aluno herda de Pessoa (HERANÇA)
class Aluno extends Pessoa {
    private int idade;
    private String categoriaDesejada;

    public Aluno(String nome, String cpf, int idade, String categoriaDesejada) {
        super(nome, cpf);
        this.idade = idade;
        this.categoriaDesejada = categoriaDesejada;
    }

    // SOBRESCRITA
    @Override
    public void exibirInfo() {
        System.out.println("Aluno: " + getNome() + " - CNH: " + categoriaDesejada);
    }
}

// SUBCLASSE Instrutor herda de Pessoa (HERANÇA)
class Instrutor extends Pessoa {
    private String credencial;

    public Instrutor(String nome, String cpf, String credencial) {
        super(nome, cpf);
        this.credencial = credencial;
    }

    // SOBRESCRITA
    @Override
    public void exibirInfo() {
        System.out.println("Instrutor: " + getNome() + " - Credencial: " + credencial);
    }
}

// Classe simples para representar Veículo
class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String categoria;

    public Veiculo(String placa, String marca, String modelo, String categoria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void exibirInfo() {
        System.out.println("Veículo: " + marca + " " + modelo + " (" + categoria + ")");
    }
}

// Classe Aula conecta os objetos (ENVIO DE MENSAGENS ENTRE OBJETOS)
class Aula {
    private Aluno aluno;
    private Instrutor instrutor;
    private Veiculo veiculo;
    private String horario;

    public Aula(Aluno aluno, Instrutor instrutor, Veiculo veiculo, String horario) {
        this.aluno = aluno;
        this.instrutor = instrutor;
        this.veiculo = veiculo;
        this.horario = horario;
    }

    public void exibirAula() {
        System.out.println("Aula: " + aluno.getNome() + " com " + instrutor.getNome() +
                " - " + veiculo.getMarca() + " às " + horario);
    }
}

// Classe Agenda controla aulas e mostra SOBRECARGA
class Agenda {
    private Aula[] aulas = new Aula[10];
    private int total = 0;

    public void agendarAula(Aula aula) {
        if (total < aulas.length) {
            aulas[total] = aula;
            total++;
            System.out.println("Aula agendada com sucesso!");
        }
    }

    // SOBRECARGA: mesmo nome, mas parâmetros diferentes
    public void listarAulas() {
        for (int i = 0; i < total; i++) {
            aulas[i].exibirAula();
        }
    }

    public void listarAulas(String dia) {
        System.out.println("Aulas do dia " + dia + ":");
        listarAulas();
    }
}

// CLASSE PRINCIPAL (com entrada de dados do usuário)
public class Main {
    public static void main(String[] args) {
        // Inicializa o Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println(" CADASTRO AUTOESCOLA - DIREÇÃO CERTA");
        System.out.println("===========================================");

        // --- DADOS DO ALUNO ---
        System.out.println("\n--- Cadastro do Aluno ---");
        System.out.print("Nome do Aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("CPF do Aluno: ");
        String cpfAluno = scanner.nextLine();
        System.out.print("Idade do Aluno: ");
        int idadeAluno = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Categoria de CNH desejada (Ex: A, B, AB): ");
        String catDesejada = scanner.nextLine();

        // --- DADOS DO INSTRUTOR ---
        System.out.println("\n--- Cadastro do Instrutor ---");
        System.out.print("Nome do Instrutor: ");
        String nomeInstrutor = scanner.nextLine();
        System.out.print("CPF do Instrutor: ");
        String cpfInstrutor = scanner.nextLine();
        System.out.print("Credencial do Instrutor (Ex: CR-001): ");
        String credencialInstrutor = scanner.nextLine();

        // --- DADOS DO VEÍCULO ---
        System.out.println("\n--- Cadastro do Veículo ---");
        System.out.print("Placa do Veículo: ");
        String placaVeiculo = scanner.nextLine();
        System.out.print("Marca do Veículo: ");
        String marcaVeiculo = scanner.nextLine();
        System.out.print("Modelo do Veículo: ");
        String modeloVeiculo = scanner.nextLine();
        System.out.print("Categoria do Veículo (Ex: B): ");
        String catVeiculo = scanner.nextLine();

        // --- DADOS DA AULA ---
        System.out.println("\n--- Agendamento da Aula ---");
        System.out.print("Horário da Aula (Ex: 10/10 às 10h): ");
        String horarioAula = scanner.nextLine();

        // --- FECHA O SCANNER ---
        scanner.close();


        // Criando objetos com os dados do usuário
        Aluno a1 = new Aluno(nomeAluno, cpfAluno, idadeAluno, catDesejada);
        Instrutor i1 = new Instrutor(nomeInstrutor, cpfInstrutor, credencialInstrutor);
        Veiculo v1 = new Veiculo(placaVeiculo, marcaVeiculo, modeloVeiculo, catVeiculo);

        // Criando a Aula
        Aula aula1 = new Aula(a1, i1, v1, horarioAula);

        // Criando agenda e adicionando aula
        Agenda agenda = new Agenda();
        agenda.agendarAula(aula1);

        // Listando informações
        System.out.println("\n--- INFORMAÇÕES CADASTRADAS ---");
        a1.exibirInfo();
        i1.exibirInfo();
        v1.exibirInfo();

        System.out.println("\n--- AGENDA DE HOJE ---");
        // O dia é o que o usuário digitou no horário
        String diaAula = horarioAula.split(" ")[0]; // Pega a primeira parte da string (ex: "10/10")
        agenda.listarAulas(diaAula);
    }
}