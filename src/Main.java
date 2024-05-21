import entidades.Paciente;
import repositorios.Lista;

import java.util.Scanner;
import java.util.List;

public class Main {
//Ex4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Cadastrar novo paciente");
            System.out.println("2 - Listar pacientes");
            System.out.println("3 - Alterar informações do paciente");
            System.out.println("4 - Mostrar informações de um paciente");
            System.out.println("5 - Registrar atividade física para um paciente");
            System.out.println("6 - Remover paciente");
            System.out.println("7 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarNovoPaciente(scanner);
                    break;
                case 2:
                    listarPacientes();
                    break;
                case 3:
                    alterarInformacoesPaciente(scanner);
                    break;
                case 4:
                    mostrarInformacoesPaciente(scanner);
                    break;
                case 5:
                    registrarAtividadeFisica(scanner);
                    break;
                case 6:
                    removerPaciente(scanner);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
//Ex5
    public static void cadastrarNovoPaciente(Scanner scanner) {
        System.out.println("Informe o nome do paciente:");
        String nome = scanner.nextLine();

        System.out.println("Informe a idade do paciente:");
        int idade = scanner.nextInt();

        System.out.println("Informe o peso do paciente (kg):");
        double peso = scanner.nextDouble();

        System.out.println("Informe a altura do paciente (m):");
        double altura = scanner.nextDouble();

        System.out.println("Informe a pressão arterial do paciente:");
        double pressaoArterial = scanner.nextDouble();

        System.out.println("Informe a frequência cardíaca do paciente:");
        double frequenciaCardiaca = scanner.nextDouble();

        System.out.println("Informe a dieta alimentar do paciente:");
        scanner.nextLine(); // Consumir quebra de linha
        String dietaAlimentar = scanner.nextLine();

        Paciente paciente = new Paciente(nome, idade, peso, altura, pressaoArterial, frequenciaCardiaca, dietaAlimentar);
        Lista.adicionar(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
    }
//Ex6
    public static void listarPacientes() {
        System.out.println("\nListagem de Pacientes:");
        List<Paciente> pacientes = Lista.listar();
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println((i + 1) + " - " + pacientes.get(i).getNome());
        }
    }
//Ex7
    public static void alterarInformacoesPaciente(Scanner scanner) {
        listarPacientes();
        System.out.println("Informe o ID do paciente que deseja alterar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        Paciente paciente = Lista.buscarPorId(id - 1);
        if (paciente != null) {
            System.out.println("\nInforme as novas informações:");
            System.out.println("Peso (kg):");
            double peso = scanner.nextDouble();
            paciente.setPeso(peso);

            System.out.println("Altura (m):");
            double altura = scanner.nextDouble();
            paciente.setAltura(altura);

            System.out.println("Pressão arterial:");
            double pressaoArterial = scanner.nextDouble();
            paciente.setPressaoArterial(pressaoArterial);

            System.out.println("Frequência cardíaca:");
            double frequenciaCardiaca = scanner.nextDouble();
            paciente.setFrequenciaCardiaca(frequenciaCardiaca);

            System.out.println("Dieta alimentar:");
            scanner.nextLine(); // Consumir quebra de linha
            String dietaAlimentar = scanner.nextLine();
            paciente.setDietaAlimentar(dietaAlimentar);

            Lista.alterar(id - 1, paciente);
            System.out.println("Informações do paciente atualizadas com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }
//Ex8
    public static void mostrarInformacoesPaciente(Scanner scanner) {
        listarPacientes();
        System.out.println("Informe o ID do paciente para ver as informações:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        Paciente paciente = Lista.buscarPorId(id - 1);
        if (paciente != null) {
            System.out.println("\nInformações do Paciente:");
            System.out.println(paciente.monitorarPaciente());
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }
//Ex9
    public static void registrarAtividadeFisica(Scanner scanner) {
        listarPacientes();
        System.out.println("Informe o ID do paciente para registrar atividade física:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        Paciente paciente = Lista.buscarPorId(id - 1);
        if (paciente != null) {
            System.out.println("Informe a atividade física realizada:");
            String atividade = scanner.nextLine();
            paciente.registrarAtividadeFisica(atividade);
            System.out.println("Atividade física registrada com sucesso para o paciente " + paciente.getNome() + ".");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }
//Ex10
    public static void removerPaciente(Scanner scanner) {
        listarPacientes();
        System.out.println("Informe o ID do paciente que deseja remover:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        Paciente paciente = Lista.buscarPorId(id - 1);
        if (paciente != null) {
            Lista.remover(id - 1);
            System.out.println("Paciente removido com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }
}