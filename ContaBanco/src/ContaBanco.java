import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);


        int numeroConta;
        String agencia;
        String nomeDoCliente;
        Double saldo = 3.450;

        System.out.println("Por favor, digite o número da Agência");
        agencia = Scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta");
        numeroConta = Scanner.nextInt();
        System.out.println("Por favor, digite o seu nome");
        nomeDoCliente = Scanner.nextLine();
        nomeDoCliente = Scanner.nextLine();

        Scanner.close();

        System.out.println("Olá " + nomeDoCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
         ", conta: " + numeroConta + " e seu saldo " + saldo + " está disponível para saque.");


    }

}
