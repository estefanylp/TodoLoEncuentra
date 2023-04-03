package org.example;

public class Tipo2 extends Medicamento{
    public Tipo2() {
    }

    public Tipo2(String nombre, double preciounitarioSINIVA, String registroINVIMA,  String fechadevencimiento, String fechadefabricacion) {
        super(nombre, preciounitarioSINIVA, registroINVIMA,  fechadevencimiento, fechadefabricacion);

    }

    @Override
    public double ValorDescuentoTipo() {

        return 0.06;
    }
}
