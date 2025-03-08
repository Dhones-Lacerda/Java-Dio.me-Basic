import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);


        //Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados pelo usuário

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do titular: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        //Exibir a mensagem conta criada com sucesso
        System.out.println("****** Conta criada com sucesso! ******");
        System.out.println(" ");
        System.out.println("Numero da conta: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Nome do titular: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
        System.out.println(" ");

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        //Fechar o scanner
        scanner.close();
    }
}
