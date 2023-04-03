package org.example;

public class Tipo5 extends Medicamento{
    public Tipo5() {
    }

    public Tipo5(String nombre, double preciounitarioSINIVA, String registroINVIMA,  String fechadevencimiento, String fechadefabricacion) {
        super(nombre, preciounitarioSINIVA, registroINVIMA,  fechadevencimiento, fechadefabricacion);

    }

    @Override
    public double ValorDescuentoTipo() {
        return 0;
    }


}
