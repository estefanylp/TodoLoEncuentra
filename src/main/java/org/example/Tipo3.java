package org.example;

public class Tipo3 extends Medicamento{
    public Tipo3() {
    }

    public Tipo3(String nombre, double preciounitarioSINIVA, String registroINVIMA, String fechadevencimiento, String fechadefabricacion) {
        super(nombre, preciounitarioSINIVA, registroINVIMA, fechadevencimiento, fechadefabricacion);

    }

    @Override
    public double ValorDescuentoTipo() {

        return 0.08;
    }
}
