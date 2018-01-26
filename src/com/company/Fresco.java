package com.company;

public class Fresco extends Producto {
    //Atributos
    protected String frescura;

    //Constructor que hereda
    public Fresco(String frescura, String caducidad, int lote) {
        super(caducidad, lote);
        this.frescura = frescura;
    }
    //Métodos
    public String getFrescura(){
        return frescura;
    }
}
