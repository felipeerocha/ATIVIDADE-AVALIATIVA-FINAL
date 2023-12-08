/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public class Midia {
    int codigo;
    double preco;
    String nome;
    
    
    public Midia(int c, double p, String n){
        codigo = c;
        preco = p;
        nome = n;
    }
    
    public String getTipo(){
        return "Midia";
    }
    
    public String getDetahles(){
        return "Codigo: " + codigo + "\nPreco: R$" + preco + "\nNome: " + nome;
    }
    
    public void printDados(){
        System.out.println(getTipo() + getDetahles());
    }
    
    public void inserirDados(int novoCodigo, double novoPreco, String novoNome) {
        codigo = novoCodigo;
        preco = novoPreco;
        nome = novoNome;
    }
    
    
}
