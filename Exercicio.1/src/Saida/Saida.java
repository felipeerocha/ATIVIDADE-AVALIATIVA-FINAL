/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Saida;

import Classes.CD;
import Classes.DVD;
import Classes.Midia;
import java.util.Scanner;




public class Saida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de mídia a cadastrar (CD ou DVD): ");
        String tipoMidia = scanner.nextLine();

        System.out.println("Digite o código: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer após a leitura de double

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        int atributoEspecifico = 0;

        if (tipoMidia.equalsIgnoreCase("CD")) {
            System.out.println("Digite o número de músicas: ");
            atributoEspecifico = scanner.nextInt();
        } else if (tipoMidia.equalsIgnoreCase("DVD")) {
            System.out.println("Digite o número de faixas: ");
            atributoEspecifico = scanner.nextInt();
        }

        // Criação da instância com base nas entradas do usuário
        Midia midia;
        if (tipoMidia.equalsIgnoreCase("CD")) {
            midia = new CD(codigo, preco, nome, atributoEspecifico);
        } else if (tipoMidia.equalsIgnoreCase("DVD")) {
            midia = new DVD(codigo, preco, nome, atributoEspecifico);
        } else {
            System.out.println("Tipo de mídia inválido. Encerrando programa.");
            return;
        }

        midia.printDados();
    }
}
