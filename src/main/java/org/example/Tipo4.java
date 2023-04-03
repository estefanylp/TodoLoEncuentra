package org.example;

public class Tipo4 extends Medicamento{
    public Tipo4() {
    }

    public Tipo4(String nombre, double preciounitarioSINIVA, String registroINVIMA, String fechadevencimiento, String fechadefabricacion) {
        super(nombre, preciounitarioSINIVA, registroINVIMA, fechadevencimiento, fechadefabricacion);

    }

    @Override
    public double ValorDescuentoTipo() {

        return 0.10;
    }
}
