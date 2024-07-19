import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
