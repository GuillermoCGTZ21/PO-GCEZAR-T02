package com.company;

public class Producto {
    //Atributos
    protected String caducidad;
    protected int lote;
    //Constructor
    public Producto(){
        this.caducidad= "";
        this.lote = 0;
    }
    //Constructor con parámetros
    public Producto(String caducidad, int lote){
        this.caducidad=caducidad;
        this.lote=lote;
    }
    //Métodos
    public String getCaducidad(){
        return caducidad;
    }
    public int getLote() {
        return lote;
    }
}

