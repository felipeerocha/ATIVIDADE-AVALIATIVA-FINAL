package Saida;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Classes.Carro;
import Classes.Moto;
import Classes.Veiculos;
import java.util.ArrayList;
import java.util.Scanner;

public class Saida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculos> veiculosList = new ArrayList<>();

        boolean continuarCadastro = true;

        while (continuarCadastro) {
            System.out.println("Digite 'carro' para inserir um carro, 'moto' para inserir uma moto ou 'sair' para finalizar:");
            String tipoVeiculo = scanner.next();

            if ("sair".equalsIgnoreCase(tipoVeiculo)) {
                continuarCadastro = false;
                continue;
            }

            System.out.println("Digite o modelo do veículo:");
            String modelo = scanner.next();

            System.out.println("Digite o preço do veículo:");
            double preco = scanner.nextDouble();

            if ("carro".equalsIgnoreCase(tipoVeiculo)) {
                System.out.println("Digite a quilometragem do carro:");
                double km = scanner.nextDouble();
                veiculosList.add(new Carro(modelo, preco, km));
            } else if ("moto".equalsIgnoreCase(tipoVeiculo)) {
                System.out.println("Digite o ano da moto:");
                int ano = scanner.nextInt();
                veiculosList.add(new Moto(modelo, preco, ano));
            }
        }

        
        System.out.println("\nRelatório de Veículos Antes dos Ajustes:");
        for (Veiculos veiculo : veiculosList) {
            veiculo.printDados();
            System.out.println("--------");
        }

        
        double totalPrecoOriginal = calcularTotalPreco(veiculosList);

        
        for (Veiculos veiculo : veiculosList) {
            if (veiculo instanceof Moto && ((Moto) veiculo).ano >= 2008) {
                double novoPreco = veiculo.getPreco() * 1.1;
                veiculo.preco = novoPreco;
            }
        }

        
        for (Veiculos veiculo : veiculosList) {
            if (veiculo instanceof Carro && ((Carro) veiculo).km > 100000) {
                double novoPreco = veiculo.getPreco() * 0.92; // Redução de 8%
                veiculo.preco = novoPreco;
            }
        }

        
        System.out.println("\nRelatório de Veículos Após Ajustes:");
        for (Veiculos veiculo : veiculosList) {
            veiculo.printDados();
            System.out.println("--------");
        }

        
        double totalPrecoAjustado = calcularTotalPreco(veiculosList);
        System.out.println("Total de Preços Original: R$" + totalPrecoOriginal);
        System.out.println("Total de Preços Após Ajustes: R$" + totalPrecoAjustado);
    }

    private static double calcularTotalPreco(ArrayList<Veiculos> veiculosList) {
        double total = 0;
        for (Veiculos veiculo : veiculosList) {
            total += veiculo.getPreco();
        }
        return total;
    }
}
