package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Digita el tipo de medicamento que quieres comprar:
                • Opcion 1: Analgésicos
                • Opcion 2: Antiácidos
                • Opcion 3: Antialergénicos
                • Opcion 4: Antiinflamatorio
                • Opcion 5: Antiinfeccioso
                • Opcion 0: Salir\s""");
        int tipo = sc.nextInt();


        if(tipo==1){
            Tipo1 tipo1=new Tipo1("Analgesicos",7000,"2005M-0006342","23/01/2024","8/05/2023");
            System.out.println("Digita la cantidad de medicamentos que quieres comprar.");
            int cantidad = sc.nextInt();

            double precioconDescuento= tipo1.getPreciounitarioSINIVA()-(tipo1.getPreciounitarioSINIVA()*tipo1.ValorDescuentoTipo());
            double preciounitarioCONIVA = precioconDescuento + (precioconDescuento * tipo1.getIva()) ;
            double preciototal=cantidad*precioconDescuento;
            System.out.println("Nombre: "+tipo1.getNombre()+"\n"+"Precio sin IVA: "+tipo1.getPreciounitarioSINIVA()+"\n"+"Registro Invima: "+tipo1.getRegistroINVIMA()+"\n"+"Fabricante: "+tipo1.getFabricante()+"\n"+"Fecha vencimiento: "+tipo1.getFechadevencimiento()+"\n"+"Fecha de fabricación: "+tipo1.getFechadefabricacion()+"\n"+"Descuento: "+"5%"+"\n"+"Precio unitario con descuento: "+precioconDescuento+"\n"+"Precio unitario con iva: "+preciounitarioCONIVA+"\n"+"Cantidad: "+cantidad+"\n"+"Precio total: "+"["+preciototal+"]");

        }
        if(tipo==2){

            Tipo2 tipo2=new Tipo2("Antiácidos",3000,"2005M-0009876","24/10/2024","13/12/2023");
            System.out.println("Digita la cantidad de medicamentos que quieres comprar.");
            int cantidad = sc.nextInt();

            double precioconDescuento= tipo2.getPreciounitarioSINIVA()-(tipo2.getPreciounitarioSINIVA()*tipo2.ValorDescuentoTipo());
            double preciounitarioCONIVA = precioconDescuento + (precioconDescuento * tipo2.getIva()) ;
            double preciototal=cantidad*precioconDescuento;
            System.out.println("Nombre: "+tipo2.getNombre()+"\n"+"Precio sin IVA: "+tipo2.getPreciounitarioSINIVA()+"\n"+"Registro Invima: "+tipo2.getRegistroINVIMA()+"\n"+"Fabricante: "+tipo2.getFabricante()+"\n"+"Fecha vencimiento: "+tipo2.getFechadevencimiento()+"\n"+"Fecha de fabricación: "+tipo2.getFechadefabricacion()+"\n"+"Descuento: "+"6%"+"\n"+"Precio unitario con descuento: "+precioconDescuento+"\n"+"Precio unitario con iva: "+preciounitarioCONIVA+"\n"+"Cantidad: "+cantidad+"\n"+"Precio total: "+"["+preciototal+"]");


        }
        if(tipo==3){
            Tipo3 tipo3=new Tipo3("Antialergénicos",9000,"2005M-0002346","6/04/2024","27/03/2023");
            System.out.println("Digita la cantidad de medicamentos que quieres comprar.");
            int cantidad = sc.nextInt();

            double precioconDescuento= tipo3.getPreciounitarioSINIVA()-(tipo3.getPreciounitarioSINIVA()*tipo3.ValorDescuentoTipo());
            double preciounitarioCONIVA = precioconDescuento + (precioconDescuento * tipo3.getIva()) ;
            double preciototal=cantidad*precioconDescuento;
            System.out.println("Nombre: "+tipo3.getNombre()+"\n"+"Precio sin IVA: "+tipo3.getPreciounitarioSINIVA()+"\n"+"Registro Invima: "+tipo3.getRegistroINVIMA()+"\n"+"Fabricante: "+tipo3.getFabricante()+"\n"+"Fecha vencimiento: "+tipo3.getFechadevencimiento()+"\n"+"Fecha de fabricación: "+tipo3.getFechadefabricacion()+"\n"+"Descuento: "+"5%"+"\n"+"Precio unitario con descuento: "+precioconDescuento+"\n"+"Precio unitario con iva: "+preciounitarioCONIVA+"\n"+"Cantidad: "+cantidad+"\n"+"Precio total: "+"["+preciototal+"]");


        }
        if(tipo==4){
            Tipo4 tipo4=new Tipo4("Antiinflamatorio",4000,"2005M-0002315","21/06/2024","22/07/2023");
            System.out.println("Digita la cantidad de medicamentos que quieres comprar.");
            int cantidad = sc.nextInt();

            double precioconDescuento= tipo4.getPreciounitarioSINIVA()-(tipo4.getPreciounitarioSINIVA()*tipo4.ValorDescuentoTipo());
            double preciounitarioCONIVA = precioconDescuento + (precioconDescuento * tipo4.getIva()) ;
            double preciototal=cantidad*precioconDescuento;
            System.out.println("Nombre: "+tipo4.getNombre()+"\n"+"Precio sin IVA: "+tipo4.getPreciounitarioSINIVA()+"\n"+"Registro Invima: "+tipo4.getRegistroINVIMA()+"\n"+"Fabricante: "+tipo4.getFabricante()+"\n"+"Fecha vencimiento: "+tipo4.getFechadevencimiento()+"\n"+"Fecha de fabricación: "+tipo4.getFechadefabricacion()+"\n"+"Descuento: "+"5%"+"\n"+"Precio unitario con descuento: "+precioconDescuento+"\n"+"Precio unitario con iva: "+preciounitarioCONIVA+"\n"+"Cantidad: "+cantidad+"\n"+"Precio total: "+"["+preciototal+"]");

        }
        if(tipo==5){
            Tipo5 tipo5=new Tipo5("Antiinfeccioso",10000,"2005M-00009236","9/01/2024","8/09/2023");
            System.out.println("Digita la cantidad de medicamentos que quieres comprar.");
            int cantidad = sc.nextInt();
            double preciounitarioCONIVA = tipo5.getPreciounitarioSINIVA() + (tipo5.getPreciounitarioSINIVA() * tipo5.getIva()) ;
            double preciototal=cantidad*preciounitarioCONIVA;

            System.out.println("Nombre: "+tipo5.getNombre()+"\n"+"Precio sin IVA: "+tipo5.getPreciounitarioSINIVA()+"\n"+"Registro Invima: "+tipo5.getRegistroINVIMA()+"\n"+"Fabricante: "+tipo5.getFabricante()+"\n"+"Fecha vencimiento: "+tipo5.getFechadevencimiento()+"\n"+"Fecha de fabricación: "+tipo5.getFechadefabricacion()+"\n"+"Precio unitario con iva: "+preciounitarioCONIVA+"\n"+"Cantidad: "+cantidad+"\n"+"Precio total: "+"["+preciototal+"]");

        }
        else if(tipo==0||tipo>=6){
            System.out.println("Saliendo...");
            exit(0);
        }
        System.out.println("\n"+"""
                Quieres Comprar más medicamentos?
                • Opcion 1: Si
                • Opcion 2: No,Salir""");
        int comprarmas = sc.nextInt();

        if(comprarmas==1){

            Main.main (null);
        }else{
            System.out.println("Saliendo...");
            exit(0);
        }

    }
}