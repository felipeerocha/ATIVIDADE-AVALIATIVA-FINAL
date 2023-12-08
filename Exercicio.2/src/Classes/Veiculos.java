/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class Veiculos {
    public String modelo;
    public double preco;
    
    public Veiculos(String m, double p){
        modelo = m;
        preco = p;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void printDados(){
        System.out.println("Modelo: " + modelo + "\nPreco: R$" + preco);
    }
}
