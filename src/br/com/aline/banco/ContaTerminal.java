package br.com.aline.banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor, digite o número da Agência:");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = sc.next();
        System.out.println("Por favor, digite o valor do saldo:");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu " +
                "saldo %s já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}