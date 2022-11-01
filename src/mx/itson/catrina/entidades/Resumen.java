/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
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
}
