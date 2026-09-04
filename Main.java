import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner entrada = new Scanner(System.in);
    private static final List<Servico> servicos = new ArrayList<>();
    private static final List<Agendamento> agendamentos = new ArrayList<>();

    public static void main(String[] args) {
        cadastrarServicos();
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> listarServicos();
                case 2 -> realizarAgendamento();
                case 3 -> listarAgendamentos();
                case 4 -> exibirInformacoes();
                case 0 -> System.out.println("\nObrigado por visitar a Soberano Barbearia! 👑");
                default -> System.out.println("\nOpção inválida.");
            }
        } while (opcao != 0);

        entrada.close();
    }

    private static void exibirMenu() {
        System.out.println("\n========================================");
        System.out.println("          SOBERANO BARBEARIA 👑");
        System.out.println("========================================");
        System.out.println("1 - Ver serviços e preços");
        System.out.println("2 - Agendar horário");
        System.out.println("3 - Ver agendamentos");
        System.out.println("4 - Informações da barbearia");
        System.out.println("0 - Sair");
        System.out.println("========================================");
    }

    private static void cadastrarServicos() {
        servicos.add(new Servico("Degrade com desenho", 45.90, "O corte com o seu estilo."));
        servicos.add(new Servico("Degrade clássico", 40.90, "O corte que você precisa."));
        servicos.add(new Servico("Barba desenhada", 25.50, "Contorno definido, estilo moderno e versátil."));
        servicos.add(new Servico("Social", 20.98, "O corte para o seu trabalho."));
        servicos.add(new Servico("Técnica à tesoura", 35.90, "Técnica de corte à tesoura para maior controle de volume e forma."));
        servicos.add(new Servico("Degrade navalhado", 50.00, "O toque rústico que você merece."));
        servicos.add(new Servico("Alinhamento e acabamento", 15.90, "Acabamento para manter o visual sempre em dia."));
        servicos.add(new Servico("Sobrancelha e remoção de pelos nasais", 20.00, "A atenção que você precisa."));
    }

    private static void listarServicos() {
        System.out.println("\n========== SERVIÇOS ==========");
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            System.out.printf("%d - %-38s R$ %.2f%n", i + 1, servico.getNome(), servico.getPreco());
            System.out.println("    " + servico.getDescricao());
        }
    }

    private static void realizarAgendamento() {
        System.out.println("\n========== NOVO AGENDAMENTO ==========");
        String nome = lerTexto("Nome do cliente: ");
        Cliente cliente = new Cliente(nome);

        listarServicos();
        int opcaoServico = lerInteiro("\nEscolha o número do serviço: ");

        if (opcaoServico < 1 || opcaoServico > servicos.size()) {
            System.out.println("Serviço inválido.");
            return;
        }

        Servico servico = servicos.get(opcaoServico - 1);
        String data = lerTexto("Data do agendamento (dd/mm/aaaa): ");
        String horario = lerTexto("Horário (ex.: 14:00): ");

        if (horarioOcupado(data, horario)) {
            System.out.println("\nEsse horário já está ocupado.");
            return;
        }

        agendamentos.add(new Agendamento(cliente, servico, data, horario));
        System.out.println("\n✓ Agendamento realizado com sucesso!");
        System.out.println(agendamentos.get(agendamentos.size() - 1));
    }

    private static boolean horarioOcupado(String data, String horario) {
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getData().equals(data) && agendamento.getHorario().equals(horario)) {
                return true;
            }
        }
        return false;
    }

    private static void listarAgendamentos() {
        System.out.println("\n========== AGENDAMENTOS ==========");
        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento cadastrado.");
            return;
        }

        for (Agendamento agendamento : agendamentos) {
            System.out.println(agendamento);
        }
    }

    private static void exibirInformacoes() {
        System.out.println("\n========== SOBRE A SOBERANO ==========");
        System.out.println("👑 Soberano Barbearia");
        System.out.println("Desde 2025, no mercado com excelência.");
        System.out.println("Horário: Terça a sábado, das 09:00 às 19:00.");
        System.out.println("Pagamento: Dinheiro, cartão ou Pix.");
        System.out.println("Contato: (41) 9 9806-4023");
        System.out.println("Endereço: R. Cascavel, 881 - Colombo/PR");
        System.out.println("CEP: 83410-270");
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }

    private static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextLine();
    }
}
