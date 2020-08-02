/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg4.pop_12011159;

/**
 *
 * @author dalva
 */
public class Frutas_Verduras {
    
    private double precio;
    private int cInventariar;
    private String categoria;
    
    
    public Frutas_Verduras(){}
    
    public Frutas_Verduras(double precio){
        this.precio = precio;
    }
    
    public Frutas_Verduras(double precio, int cInventariar){
        this.precio = precio;
        this.cInventariar = cInventariar;
    }
    
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setcInventariar(int cInventariar){
        this.cInventariar = cInventariar;
    }
    
    public int getcInventariar(){
        return cInventariar;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    @Override
    public String toString(){
        return "-> Categoria: "+categoria+" -> Precio: "+precio;
    }
}
