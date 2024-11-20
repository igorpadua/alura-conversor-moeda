package br.com.alura;

import br.com.alura.exchangerate.ConversorMoeda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var opcao = -1;

        while (opcao != 0) {
            Menu();
            opcao = scanner.nextInt();
            var valor = 0.0;

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor em Dolar: ");
                    valor = scanner.nextDouble();
                    System.out.println(ConversorMoeda.converte(Moeda.USD, Moeda.BRL, valor));
                    break;
                case 2:
                    System.out.println("Digite o valor em Real: ");
                    valor = scanner.nextDouble();
                    System.out.println(ConversorMoeda.converte(Moeda.BRL, Moeda.USD, valor));
                    break;
                case 3:
                    System.out.println("Digite o valor em Euro: ");
                    valor = scanner.nextDouble();
                    System.out.println(ConversorMoeda.converte(Moeda.EUR, Moeda.BRL, valor));
                    break;
                case 4:
                    System.out.println("Digite o valor em Real: ");
                    valor = scanner.nextDouble();
                    System.out.println(ConversorMoeda.converte(Moeda.BRL, Moeda.EUR, valor));
                    break;
                case 5:
                    System.out.println("Digite o valor em Libra: ");
                    valor = scanner.nextDouble();
                    System.out.println(ConversorMoeda.converte(Moeda.GBP, Moeda.BRL, valor));
                    break;
                case 6:
                    System.out.println("Digite o valor em Real: ");
                    valor = scanner.nextDouble();
                    System.out.println(ConversorMoeda.converte(Moeda.BRL, Moeda.JPY, valor));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    static void Menu() {
        System.out.println("1 - Converter " + Moeda.USD.getNome() +  " para " + Moeda.BRL.getNome());
        System.out.println("2 - Converter " + Moeda.BRL.getNome() +  " para " + Moeda.USD.getNome());
        System.out.println("3 - Converter " + Moeda.EUR.getNome() +  " para " + Moeda.BRL.getNome());
        System.out.println("4 - Converter " + Moeda.BRL.getNome() +  " para " + Moeda.EUR.getNome());
        System.out.println("5 - Converter " + Moeda.GBP.getNome() +  " para " + Moeda.BRL.getNome());
        System.out.println("6 - Converter " + Moeda.BRL.getNome() +  " para " + Moeda.JPY.getNome());
        System.out.println("0 - Sair");
    }
}