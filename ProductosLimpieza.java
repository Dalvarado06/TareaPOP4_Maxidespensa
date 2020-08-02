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
public class ProductosLimpieza {
    
    private String tipo;
    private String marca;
    private String codigo;
    private double precio;
    private int cantidad;
    private String proveedor;
    private String nombre;
    
    
    public ProductosLimpieza(){
        
    }
    
    public ProductosLimpieza(String nombre){
        this.nombre = nombre;
    }
    
    public ProductosLimpieza(String marca, String proveedor){
        this.marca = marca;
        this.proveedor = proveedor;
    }
    
    public ProductosLimpieza(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setProveedor(String proveedor){
        this.proveedor = proveedor;
    }
    
    public String getProveedor(){
        return proveedor;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString(){
        return "-> Nombre: "+nombre+" -> Codigo: "+codigo;
    }
}
