/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import java.util.Date;
import mx.itson.catrina.enumerador.Tipo;

/**
 *
 * @author Alejandra Medina
 */
public class Movimiento {
    
    private String descripcion;
    private double cantidad;
    private Date fecha;
    private Tipo tipo;
    private double deposito;
    private double retiro;

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
        
        
    }

    /**
     * @return the deposito
     */
       public Double getDeposito() {
        return deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(double deposito) {
        
        
        
        this.deposito = deposito;
    }

    /**
     * @return the retiro
     */
    public Double getRetiro() {
        return retiro;
    }

    /**
     * @param retiro the retiro to set
     */
    public void setRetiro(double retiro) {
        
        //if(){
          //  retiro=cantidad;
        //}
        this.retiro = retiro;
    }
    
}
