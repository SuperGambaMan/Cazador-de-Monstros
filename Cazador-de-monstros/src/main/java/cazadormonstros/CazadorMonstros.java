package cazadormonstros;

/**
 *
 * @author Marcos Bernal / Eduardo González
 */
public class CazadorMonstros {

    // Main en el que comprobamos la interaccion de los ataques entre Heroe y Monstro
    public static void main(String[] args) {
        Heroe heroe1 = new Heroe ("h001");
        Monstro monstro1 = new Monstro ("m001");
        
        //Heroe recibira el daño de Monstro en el que usa el método atacar()
        //para obtener el poder de ataque que usara el Monstro
        System.out.println("La vida del heroe que tiene antes de recibir daño: "+heroe1.getPuntosVida());
        heroe1.recibirDanio(monstro1);
        System.out.println("La vida del heroe que tiene despues de recibir daño: "+heroe1.getPuntosVida());
        System.out.println("---------------------------------------------- ");
        //Monstro recibira el daño de Heroe en el que usa el método atacar()
        //para obtener el poder de ataque que usara el Monstro
        System.out.println("La vida del monstro que tiene antes de recibir daño: "+monstro1.getPuntosVida());
        monstro1.recibirDanio(heroe1);
        System.out.println("La vida del monstro que tiene despues de recibir daño: "+monstro1.getPuntosVida());   
    }
    
}
