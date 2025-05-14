package cazadormonstros;



/**
 * Clase Mundo que representa el entorno global del juego. Gestiona los mapas y
 * el estado general del mundo del juego.
 */
public class Mundo {

    /**
     * Conjunto de mapas que forman el mundo
     */
    private Mapa[] mapa;

    /**
     * Constructor de la clase Mundo
     */
    public Mundo() {
        // Inicialización del mundo con un array vacío de mapas
        this.mapa = new Mapa[0];
    }

    /**
     * Obtiene el array de mapas del mundo
     *
     * @return Array de objetos Mapa
     */
    public Mapa[] getMapa() {
        return mapa;
    }

    /**
     * Establece un nuevo conjunto de mapas para el mundo
     *
     * @param mapa Nuevo array de objetos Mapa
     */
    public void setMapa(Mapa[] mapa) {
        this.mapa = mapa;
    }

    /**
     * Cambia el mapa actual del jugador
     */
    public void cambiarMapa() {
        // Interaccion del Heroe con las puertas del mapa
        System.out.println("Cambiando de mapa...");
    }

    /**
     * Guarda el estado actual del mundo
     */
    public void guardarMundo() {
        // Guarda la partida o el estado actual del mundo
        System.out.println("Guardando el estado del mundo...");
    }

    /**
     * Carga un mundo previamente guardado
     */
    public void cargarMundo() {
        // Carga la partida o el estado previamente guardado del mundo
        System.out.println("Cargando mundo guardado...");
    }
}
