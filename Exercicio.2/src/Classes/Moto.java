/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class Moto extends Veiculos {
    
    public int ano;
    
    public Moto(String m, double p, int a){
        super(m, p);
        this.ano = a;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }
    
    public void setAno(int a){
        ano = a;
    }
    

    
    
}
