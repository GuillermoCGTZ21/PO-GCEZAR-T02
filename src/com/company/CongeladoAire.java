package com.company;

public class CongeladoAire extends Congelado {
    protected String aire;

public CongeladoAire (String aire, String temperatura, String caducidad, int lote){
    super(temperatura, caducidad, lote);
    this.aire = aire;
    }
public String getAire(){
    return aire;
    }
}
