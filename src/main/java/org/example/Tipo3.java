package org.example;

public class Tipo3 extends Medicamento{
    public Tipo3() {
    }

    public Tipo3(String nombre, Int preciounitarioSINIVA, int registroINVIMA, String fabricante, int fechadevencimiento, int fechadefabricación) {
        super(nombre, preciounitarioSINIVA, registroINVIMA, fabricante, fechadevencimiento, fechadefabricación);
    }

    @Override
    public float ValorDescuentoTipo() {
        return 0.8f;
    }
}
