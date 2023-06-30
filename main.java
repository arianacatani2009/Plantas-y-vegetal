public class main {
    public static void main(System []args){
        plantas planta1 =new plantas("orquidea",3,"orqui");
        vegetal planta2 = new vegetal("lechuga",10,"lechugin","no");
        verduras planta3 = new verduras("lenteja",6,"lentejin","si");
        Flores planta4 = new Flores("Girasol",2,"Gira","SI");

        System.out.println(((plantas) planta1).getNombre());
        System.out.println(((vegetal) planta2).getNombre());
        System.out.println(((verduras)planta3).getNombre());
        System.out.println(((Flores)planta4).getNombre());

    }
}
