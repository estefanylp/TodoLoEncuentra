package org.example;

public class Tipo5 extends Medicamento{
    public Tipo5() {
    }

    public Tipo5(String nombre, Int preciounitarioSINIVA, int registroINVIMA, String fabricante, int fechadevencimiento, int fechadefabricación) {
        super(nombre, preciounitarioSINIVA, registroINVIMA, fabricante, fechadevencimiento, fechadefabricación);
    }

    @Override
    public float ValorDescuentoTipo() {
        return 0.10f;
    }
}
