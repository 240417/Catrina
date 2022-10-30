/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
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
    private double subTotal;
    private double saldoInicial;
    private double depositos;
    private double retiros;
    
    /*public double getMovimientos(String contenido,double subTotal){
        //Importamos el documento deserealizado
        EstadoCuenta estado = new EstadoCuenta().deserializar(contenido);
        
        //Se acomodan los datos de la tabla en sus respectivos lugares y se mandan a imprimir junto con los datos de resumen
        for(Movimiento d : estado.getMovimientos()){
            //Validamos si la cantidad ingresada es deposito o retiro
            if(d.tipo==Tipo.Desposito){
                subTotal+=d.getCantidad();
            }else{
                subTotal-=cantidad;
                
            }
            }
        return subTotal;
    }*/
     
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

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        
        this.subTotal = subTotal;
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the depositos
     */
    public double getDepositos() {
        
        return depositos;
    }

    /**
     * @param depositos the depositos to set
     */
    public void setDepositos(double depositos) {
        this.depositos = depositos;
    }

    /**
     * @return the retiros
     */
    public double getRetiros() {
        return retiros;
    }

    /**
     * @param retiros the retiros to set
     */
    public void setRetiros(double retiros) {
        this.retiros = retiros;
    }

    private static class lista {

        public lista() {
        }
    }
    
}
