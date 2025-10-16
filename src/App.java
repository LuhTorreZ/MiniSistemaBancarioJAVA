
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Usuarios usuarioLogado; // Vamos chamar o objeto de usuarioLogado

        // --- ETAPA DE CADASTRO ---
        System.out.println("\n BEM VINDO A TRZ BANKING, O SEU BANCO DIGITAL ");
        System.out.println("--- VAMOS CRIAR SUA CONTA ---");
        usuarioLogado = new Usuarios();

        System.out.print("Insira seu nome: ");
        usuarioLogado.nome = sc.nextLine();

        System.out.print("Insira seu CPF (APENAS NÚMEROS, SEM PONTOS): ");
        usuarioLogado.CPF = sc.nextLine();

        System.out.print("Insira sua data de nascimento (ex: DD/MM/AAAA): ");
        usuarioLogado.dataDeNascimento = sc.nextLine();

        System.out.println("\nCadastro realizado com sucesso!");
        System.out.println(usuarioLogado); // Usa o método toString()

        // --- MENU DE OPERAÇÕES ---
        int opcao = 0;
        while (opcao != 4) { 
            System.out.println("\n--- O que você deseja fazer? ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver Extrato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = sc.nextDouble();
                    usuarioLogado.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = sc.nextDouble();
                    usuarioLogado.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("\n--- EXTRATO DA CONTA ---");
                    System.out.println(usuarioLogado); // Mostra dados do cliente
                    // Formatando a saída do saldo para ter duas casas decimais
                    System.out.printf("Saldo atual: R$ %.2f\n", usuarioLogado.getSaldo());
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nossos serviços. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        sc.close();
    }
}
