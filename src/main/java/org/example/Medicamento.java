package org.example;

public abstract class Medicamento {


     private String nombre;
    private double preciounitarioSINIVA;
    private String registroINVIMA;
    final String fabricante="Laboratorio CESDE";
    private String fechadevencimiento;
    private String fechadefabricacion;

     final double iva=0.19;

    public Medicamento() {
    }


    public Medicamento(String nombre, double preciounitarioSINIVA, String registroINVIMA,  String fechadevencimiento, String fechadefabricacion) {
        this.nombre = nombre;
        this.preciounitarioSINIVA = preciounitarioSINIVA;
        this.registroINVIMA = registroINVIMA;
        this.fechadevencimiento = fechadevencimiento;
        this.fechadefabricacion = fechadefabricacion;
    }

    public String getNombre() {
        return nombre;
    }


    public double getPreciounitarioSINIVA() {
        return preciounitarioSINIVA;
    }


    public String getRegistroINVIMA() {
        return registroINVIMA;
    }


    public String getFabricante() {
        return fabricante;
    }


    public String getFechadevencimiento() {
        return fechadevencimiento;
    }


    public String getFechadefabricacion() {
        return fechadefabricacion;
    }


    public double getIva() {
        return iva;
    }



    public abstract double ValorDescuentoTipo();



}
