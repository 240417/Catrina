/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.enumerador;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Jesus
 */
public enum Tipo {
    @SerializedName("1")
    Desposito,
    @SerializedName("2")
    Retiro;
    
}
