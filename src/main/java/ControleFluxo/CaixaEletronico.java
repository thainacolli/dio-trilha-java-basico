package ControleFluxo;

public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.00;
        double valorSaque = 22;

        if (valorSaque < saldo) {
            saldo = saldo - valorSaque;
            System.out.print("Saldo:" + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }
}
