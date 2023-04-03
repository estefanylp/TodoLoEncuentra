package org.example;

public class Tipo4 extends Medicamento{
    public Tipo4() {
    }

    public Tipo4(String nombre, Int preciounitarioSINIVA, int registroINVIMA, String fabricante, int fechadevencimiento, int fechadefabricación) {
        super(nombre, preciounitarioSINIVA, registroINVIMA, fabricante, fechadevencimiento, fechadefabricación);
    }

    @Override
    public float ValorDescuentoTipo() {
        return 0.10f;
    }
}
