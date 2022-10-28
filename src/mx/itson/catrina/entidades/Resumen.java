/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import java.util.List;
import mx.itson.catrina.enumerador.Tipo;

/**
 *
 * @author Jesus
 */
public class Resumen {
    
    private double saldoInicial;
    private double depositos;
    private double retiros;
    private double saldoFinal;
    private Movimiento movimientos;
    private List<Movimiento>movimiento;

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
        
        for(Movimiento d : getMovimiento()){
            //Validamos si la cantidad ingresada es deposito o retiro
            if(d.getTipo()==Tipo.Desposito){
                saldoInicial += d.getCantidad();
            }else{
                saldoInicial -= d.getCantidad();
            }
                
            }
        
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
        
        for(Movimiento d : getMovimiento()){
        //Validamos si la cantidad ingresada es deposito o retiro
            if(d.getTipo()==Tipo.Desposito){
                depositos+=d.getCantidad();
            }
            
        }
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
        
         for(Movimiento d : getMovimiento()){
        //Validamos si la cantidad ingresada es deposito o retiro
            if(d.getTipo()==Tipo.Retiro){
                retiros+=d.getCantidad();
                
            }
        }
         
        this.retiros = retiros;
    }

    /**
     * @return the saldoFinal
     */
    public double getSaldoFinal() {
        return saldoFinal;
    }

    /**
     * @param saldoFinal the saldoFinal to set
     */
    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    /**
     * @return the movimientos
     */
    public Movimiento getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(Movimiento movimientos) {
        this.movimientos = movimientos;
    }

    /**
     * @return the movimiento
     */
    public List<Movimiento> getMovimiento() {
        return movimiento;
    }

    /**
     * @param movimiento the movimiento to set
     */
    public void setMovimiento(List<Movimiento> movimiento) {
        this.movimiento = movimiento;
    }
    
    
}
