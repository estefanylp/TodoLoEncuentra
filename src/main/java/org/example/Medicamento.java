package org.example;

public abstract class Medicamento {


    String nombre;
    int preciounitarioSINIVA;
    int registroINVIMA;
    String fabricante;
    int fechadevencimiento;
    int fechadefabricación;

    public Medicamento() {
    }

    public Medicamento(String nombre, int preciounitarioSINIVA, int registroINVIMA, String fabricante, int fechadevencimiento, int fechadefabricación) {
        this.nombre = nombre;
        this.preciounitarioSINIVA = preciounitarioSINIVA;
        this.registroINVIMA = registroINVIMA;
        this.fabricante = fabricante;
        this.fechadevencimiento = fechadevencimiento;
        this.fechadefabricación = fechadefabricación;
    }

    public String getNombre() {


        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPreciounitarioSINIVA() {
        return preciounitarioSINIVA;
    }

    public void setPreciounitarioSINIVA(int preciounitarioSINIVA) {
        this.preciounitarioSINIVA = preciounitarioSINIVA;
    }

    public int getRegistroINVIMA() {
        return registroINVIMA;
    }

    public void setRegistroINVIMA(int registroINVIMA) {
        this.registroINVIMA = registroINVIMA;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getFechadevencimiento() {
        return fechadevencimiento;
    }

    public void setFechadevencimiento(int fechadevencimiento) {
        this.fechadevencimiento = fechadevencimiento;
    }

    public int getFechadefabricación() {
        return fechadefabricación;
    }

    public void setFechadefabricación(int fechadefabricación) {
        this.fechadefabricación = fechadefabricación;
    }

    public abstract float ValorDescuentoTipo();



}
