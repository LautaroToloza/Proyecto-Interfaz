package Test;

import clase.*;

public class Test {

    public static void main(String[] args) {

        Adidas ad = new Adidas("Thomas Rabe", 350000);
        Nike ni = new Nike("Phil Knight", 380000);

        // Muestra metodos abstractos
        System.out.println("----------------------------------------");
        System.out.println("Informacion Adidas..\n");
        ad.MuestraJugador();
        ad.Fundacion();
        System.out.println(ad.toString());
        System.out.println("----------------------------------------");
        System.out.println("Informacion Nike..\n");
        ni.MuestraJugador();
        ni.Fundacion();
        System.out.println(ni.toString());
        System.out.println("----------------------------------------");
        
    }

}
