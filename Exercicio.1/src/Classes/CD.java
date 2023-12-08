/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class CD extends Midia {
    
    int musicas;
    
    public CD(int c, double p, String s, int m){
        super(c, p, s);
        this.musicas = m;
    }
    
    
   @Override
   public String getTipo(){
       return "CD";
   } 
    
    
    @Override
    public String getDetahles(){
        return super.getDetahles() + "\nMusicas: " + musicas;
    }
    
    public void setMusica(int m){
        musicas = m;
    }
    
    
    public void inserirDados(int novoCodigo, double novoPreco, String novoNome, int musicas) {
        super.inserirDados(novoCodigo, novoPreco, novoNome);
        setMusica(musicas);
    }
    
}
