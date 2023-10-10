package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro:");
        int p1 = entrada.nextInt();
        System.out.print("Digite o segundo parâmetro:");
        int p2 = entrada.nextInt();

        try {
            contar(p1, p2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        entrada.close();

    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            for (int c = 1; c <= contagem; c++ ) {
                System.out.println("Imprimindo os números: " + c);
            }
    }
}}
