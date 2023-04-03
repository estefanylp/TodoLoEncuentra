package org.example;

public class Tipo1 extends Medicamento{

    public Tipo1() {
    }

    public Tipo1(String nombre, double preciounitarioSINIVA, String registroINVIMA,  String fechadevencimiento, String fechadefabricacion) {
        super(nombre, preciounitarioSINIVA, registroINVIMA, fechadevencimiento, fechadefabricacion);
    }

    @Override
    public double ValorDescuentoTipo() {

        return 0.05;
    }
}
