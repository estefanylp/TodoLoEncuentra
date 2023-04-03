package org.example;

public class Tipo1 extends Medicamento{

    public Tipo1() {
    }

    public Tipo1(String nombre, int preciounitarioSINIVA, int registroINVIMA, String fabricante, int fechadevencimiento, int fechadefabricación) {
        super(nombre, preciounitarioSINIVA, registroINVIMA, fabricante, fechadevencimiento, fechadefabricación);
    }

    @Override
    public float ValorDescuentoTipo() {

        return 0.5f;
    }
}
