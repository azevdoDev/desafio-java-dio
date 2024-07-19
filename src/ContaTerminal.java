import java.util.Scanner;

/**
 * <h1>Meu projeto de banco</h1>
 * <p>
 * Feito na Dio
 * </p>
 * 
 * @author Matheus Azevedo
 * @version 1.0
 * @since 19/07/2024
 */
public class ContaTerminal {
    /**
     * 
     * @param numero  é o parâmetro que recebe o número do banco do usuário.
     * @param agencia é o parâmetro que recebe o número da agência
     * @param nome    é o parâmetro que recebe o nome do usuário.
     * @param saldo   é o parâmetro que recebe o valor em dinheiro da conta do
     *                usuário.
     * @return Mensagem contendo todos os parâmetros inseridos pelo usuário.
     */
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
