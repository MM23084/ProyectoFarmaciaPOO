/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import CONEXION.DAC;

/**
 *
 * @author usuario
 */
public class BUSQUEDA extends DAC {

    private int cod_lab;
    private int cod_med;


    public BUSQUEDA(){
        cod_lab=0;
        cod_med=0;
    }

    public BUSQUEDA(int codl,int codm){
        cod_lab=codl;
        cod_med=codm;
    }


    public void CodigoLaboratorio(int cod){
        cod_lab=cod;
    }
    public int CodigoLaboratorio(){
        return cod_lab;
    }

    public void CodigoMedicamento(int cod){
        cod_med=cod;
    }
    public int CodigoMedicamento(){
        return cod_med;
    }

    
}
