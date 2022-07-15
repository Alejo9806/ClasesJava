package com.clases;

public class SmartPhone extends SmartDevice{

    double pixeles;
    boolean camara;
    boolean huellaDigital;

    public SmartPhone() {
    }

    public SmartPhone(String modelo, String marca, String year, int memoria, int ram, String pantalla, double pixeles, boolean camara, boolean huellaDigital) {
        super(modelo, marca, year, memoria, ram, pantalla);
        this.pixeles = pixeles;
        this.camara = camara;
        this.huellaDigital = huellaDigital;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pixeles=" + pixeles +
                ", camara=" + camara +
                ", huellaDigital=" + huellaDigital +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", year='" + year + '\'' +
                ", memoria=" + memoria +
                ", ram=" + ram +
                ", pantalla='" + pantalla + '\'' +
                '}';
    }
}
