/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg4.pop_12011159;
import java.util.Date;
/**
 *
 * @author dalva
 */
public class Liquidos {
    
   private String categoria;
   private String empaque;
   private String size;
   private String nombre;
   private double precio;
   private Date fechaVencimiento;
   
   
   public Liquidos(){
       
   }
   
   public Liquidos(String nombre){
       this.nombre = nombre;
   }
   
   public Liquidos(String nombre, String categoria){
       this.nombre = nombre;
       this.categoria = categoria;
   } 
   
   public void setCateigoria(String categoria){
       this.categoria = categoria;
   }
   
   public String getCategoria(){
       return categoria;
   }
   
   public void setEmpaque(String empaque){
       this.empaque = empaque;
   }
   
   public String getEmpaque(){
       return empaque;
   }
   
   public void setSize(String size){
       this.size = size;
   }
   
   public String getSize(){
       return size;
   }
   
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public void setPrecio(double precio){
       this.precio = precio;
   }
   
   public double getPrecio(){
       return precio;
   }
   
   public void setFechaVencimiento(Date fechaVencimiento){
       this.fechaVencimiento = fechaVencimiento;
   }
   
   public Date getFechaVencimiento(){
       return fechaVencimiento;
   }
   
   @Override
   public String toString(){
       return "-> Nombre: "+nombre+" -> Fecha de Vencimiento: "+fechaVencimiento;
   }
}
