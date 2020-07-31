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
public class Carnes_embutidos {
    
    private String procedencia;
    private int cantidad; 
    private String tipo;
    private double precio;
    
    public Carnes_embutidos(){
        
    }
    
    public Carnes_embutidos(String tipo){
        this.tipo = tipo;
    }
    
    public Carnes_embutidos(String tipo, int cantidad){
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    
    public void setProcedencia(String procedencia){
        this.procedencia = procedencia;
    }
    
    public String getProcedencia(){
        return procedencia;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    @Override
    public String toString(){
        return "Tipo: "+tipo+" Cantidad: "+cantidad;
    }
    
}
