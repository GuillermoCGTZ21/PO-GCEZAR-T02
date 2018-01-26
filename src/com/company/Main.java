package com.company;

public class Main {

    public static void main(String[] args) {
        //Mostrar resultados de Fresco
        Fresco prueba = new Fresco ("Medio Fresco", "20 de abril", 1120304);
        System.out.println("MANZANA");
        System.out.println("Frescura: " + prueba.getFrescura());
        System.out.println("Caducidad: " + prueba.getCaducidad());
        System.out.println("Lote: " + prueba.getLote());
        System.out.println("");
        //Mostrar resultados de Refrigerado
        Refrigerado refri = new Refrigerado("3 horas", "17 de Marzo", 893740);
        System.out.println("LECHE");
        System.out.println("Tiempo de refrigerado: " + refri.getTiemporefrigeracion());
        System.out.println("Caducidad: " + refri.getCaducidad());
        System.out.println("Lote: " + refri.getLote());
        System.out.println("");
        //Mostrar resultados de CongeladoAire
        CongeladoAire conaire = new CongeladoAire("Congelado por aire", "4°", "5 de Noviembre", 83410);
        System.out.println("CARNE DE RES");
        System.out.println("Método de congelación:  " + conaire.getAire());
        System.out.println("Temperatura: " + conaire.getTemperatura());
        System.out.println("Caducidad: " + conaire.getCaducidad());
        System.out.println("Lote: " + conaire.getLote());
        System.out.println("");
        //Mostrar resultados CongeladoAgua
        CongeladoAgua conagua = new CongeladoAgua("Congelado por agua", "0°", "21 de Diciembre", 738201);
        System.out.println("ZANAHORIAS");
        System.out.println("Método de congelación:  " + conagua.getAgua());
        System.out.println("Temperatura: " + conaire.getTemperatura());
        System.out.println("Caducidad: " + conaire.getCaducidad());
        System.out.println("Lote: " + conaire.getLote());
        System.out.println("");
        //Mostrar resultados CongeladoNitrogeno
        CongeladoNitrogeno connitro = new CongeladoNitrogeno("Congelado por nitrógeno", "-15°", "5 de Junio del 2020", 493028);
        System.out.println("CERVEZA");
        System.out.println("Método de congelación:  " + connitro.getNitro());
        System.out.println("Temperatura: " + connitro.getTemperatura());
        System.out.println("Caducidad: " + connitro.getCaducidad());
        System.out.println("Lote: " + connitro.getLote());
        System.out.println("");
    }
}



