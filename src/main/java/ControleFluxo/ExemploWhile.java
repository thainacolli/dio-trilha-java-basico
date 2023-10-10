package ControleFluxo;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;



            System.out.println("Valor do doce:" + valorDoce );
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada" + mesada);

    }
        private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
