import java.util.ArrayList;

import java.util.Scanner;
public class main {


    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        ArrayList <plantas> compose = new ArrayList<plantas>();
        plantas planta1 =new plantas("orquidea",3,"orqui");
        vegetal planta2 = new vegetal("lechuga",10,"lechugin","no");
        verduras planta3 = new verduras("lenteja",6,"lentejin");
        Flores planta4 = new Flores("Girasol",2,"Gira");

        compose.add(planta1);
        compose.add(planta2);
        compose.add(planta3);
        compose.add(planta4);
        //Menu principal---------------------------------------------------------------------------------------
        System.out.println("\n---------------Menu PLANTAS------------------");
        System.out.println("1. Plantas ");
        System.out.println("2. Vegetal  ");
        System.out.println("3. verduras");
        System.out.println("4. Flores ");
        System.out.print("Seleccione una de las opciones del menu: ");
        int opt = entrada.nextInt();

        switch (opt){
            case 1 -> {
                System.out.println("\n----> Este es el nombre de plantas "+"  " +planta1.getNombre());
                System.out.println(" ");
            }
            case 2 -> {
                System.out.println("\n----> Este es el nombre de vegetal "+"  "+planta2.getNombre());
                System.out.println(" ");
            }

            case 3 -> {
                System.out.println("\n----> Este es el nombre de verduras "+"  " +planta3.getNombre());
                System.out.println(" ");
            }
            case 4 -> {
                System.out.println("\n----> Este es el nombre de flores "+"  " +planta4.getNombre());
                System.out.println(" ");
            }

            default -> System.out.println("----> ERROR! no se encuentra en el sistema !");
        }
    }

}