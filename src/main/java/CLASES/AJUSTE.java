/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;
import java.sql.Date;
import CONEXION.DAC;

/**
 *
 * @author usuario
 */


import java.sql.Date;
import CONEXION.DAC;


public class AJUSTE extends DAC {

    private int cod_ajt;
    private Date fecha;
    private String observacion;

    public AJUSTE(){

    }

    public AJUSTE(int cod,Date f, String ob){
        cod_ajt=cod;
        fecha=f;
        observacion=ob;
    }

    public void Codigo(int cod){
        cod_ajt=cod;
    }
    public int Codigo(){
        return cod_ajt;
    }

    public void Fecha(Date f){
        fecha=f;
    }
    public Date Fecha(){
        return fecha;
    }

    public void Observacion(String ob){
        observacion=ob;
    }
    public String Observacion(){
        return observacion;
    }
}
