package com.company;

public class Refrigerado extends Producto {
    //Atributos
    protected String tiemporefrigeracion;
    //Constructor que hereda
    public Refrigerado (String tiemporefrigeracion, String caducidad, int lote){
        super(caducidad, lote);
        this.tiemporefrigeracion = tiemporefrigeracion;
    }
    public String getTiemporefrigeracion(){
        return tiemporefrigeracion;
    }
}
