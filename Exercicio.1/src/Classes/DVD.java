/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class DVD extends Midia {
    
    int faixas;
    
    public DVD(int c, double p, String s, int f){
        super(c, p, s);
        this.faixas = f;
    }
    
    @Override
    public String getTipo(){
        return "DVD";
    }
    
    
    @Override
    public String getDetahles(){
        return super.getDetahles() + "\nFaixas: " + faixas;
    }
    
    public void setFaixas(int f){
        faixas = f;
    }
    
    
    public void inserirDados(int novoCodigo, double novoPreco, String novoNome, int faixas) {
        super.inserirDados(novoCodigo, novoPreco, novoNome);
        setFaixas(faixas);
    }
    
}
