package com.clases;

public abstract class SmartDevice {

    //1. Atributos
    String modelo;
    String marca;
    String year;
    int memoria;
    int ram;
    String pantalla;

    //2. Constructor

    public SmartDevice() {
    }

    public SmartDevice(String modelo, String marca, String year, int memoria, int ram, String pantalla) {
        this.modelo = modelo;
        this.marca = marca;
        this.year = year;
        this.memoria = memoria;
        this.ram = ram;
        this.pantalla = pantalla;
    }
}
