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
public class GranosBasicos {
    
    private String nombre;
    private double cantidad;
    private double precio;
    private String unidadMedida;
    private String procedencia;
    
    //Vacio
    public GranosBasicos(){
        
    }
    
    public GranosBasicos(String nombre){
        this.nombre = nombre;
    }
    
    public GranosBasicos(String nombre, String procedencia){
        this.nombre = nombre;
        this.procedencia = procedencia;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public double getCantidad(){
        return cantidad;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setMedida(String medida){
        unidadMedida = medida;
    }
    
    public String getMedida(){
        return unidadMedida;
    }
    
    public void setProcedencia(String procedencia){
        this.procedencia = procedencia;
    }
    
    public String getProcedencia(){
        return procedencia;
    }
    
    @Override
    public String toString(){
        return "-> Nombre: "+nombre+" -> Cantidad: "+cantidad;
    }
    
}
