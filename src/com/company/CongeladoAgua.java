package com.company;

public class CongeladoAgua extends Congelado {
    protected String agua;

    public CongeladoAgua (String agua, String temperatura, String caducidad, int lote){
        super(temperatura, caducidad, lote);
        this.agua = agua;
    }
    public String getAgua(){
        return agua;
    }
}