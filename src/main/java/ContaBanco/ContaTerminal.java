package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {


        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite seu nome:");
        String  NomeCliente = entrada.nextLine();

        System.out.print("Digite sua agência:");
        String agencia = entrada.nextLine();

        System.out.print("Digite o número da sua conta:");
        int conta = entrada.nextInt();

        System.out.print("Digite o seu saldo R$");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + NomeCliente + "obrigado por criar uma conta em nosso banco," +
                " sua agência é: "+ agencia + " conta: " + conta + " e seu saldo de R$" + saldo +
                " já está disponível para saque.");

        entrada.close();
    }
}
