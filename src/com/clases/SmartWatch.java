package com.clases;

public class SmartWatch extends SmartDevice{
    boolean sensorPulso;
    String correa;

    public SmartWatch() {
    }

    public SmartWatch(String modelo, String marca, String year, int memoria, int ram, String pantalla,boolean sensorPulso,String correa) {
        super(modelo, marca, year, memoria, ram, pantalla);
        this.sensorPulso = sensorPulso;
        this.correa = correa;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "sensorPulso=" + sensorPulso +
                ", correa='" + correa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", year='" + year + '\'' +
                ", memoria=" + memoria +
                ", ram=" + ram +
                ", pantalla='" + pantalla + '\'' +
                '}';
    }
}
