package com.company;

public class Congelado extends Producto{
    protected String temperatura;

public Congelado(){

}
public Congelado (String temperatura, String caducidad, int lote){
    super(caducidad, lote);
    this.temperatura = temperatura;
}
public String getTemperatura(){
    return temperatura;
}
}
