/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class Carro extends Veiculos {
    
    public double km;
    
    public Carro(String m, double p, double k){
        super(m,p);
        this.km = k;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }
    
    public void setKm(double k){
        this.km = k;
    }
    
  
    
}
