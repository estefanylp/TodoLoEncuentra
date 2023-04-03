package org.example;

public class Tipo2 extends Medicamento{
    public Tipo2() {
    }

    public Tipo2(String nombre, Int preciounitarioSINIVA, int registroINVIMA, String fabricante, int fechadevencimiento, int fechadefabricación) {
        super(nombre, preciounitarioSINIVA, registroINVIMA, fabricante, fechadevencimiento, fechadefabricación);
    }

    @Override
    public float ValorDescuentoTipo() {
        return 0.6f;
    }
}
