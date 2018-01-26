package com.company;

public class CongeladoNitrogeno extends Congelado {
    protected String nitro;

    public CongeladoNitrogeno(String nitro, String temperatura, String caducidad, int lote) {
        super(temperatura, caducidad, lote);
        this.nitro = nitro;
    }

    public String getNitro() {
        return nitro;
    }
}