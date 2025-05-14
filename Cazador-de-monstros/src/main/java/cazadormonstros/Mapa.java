package cazadormonstros;



/**
 * Clase Mapa que representa las diferentes áreas del juego. Contiene
 * información sobre el terreno, ubicaciones y elementos del mapa.
 */
public class Mapa {

    /**
     * Nombre del mapa
     */
    private String nombre;
    /**
     * Tipo de terreno o ambiente del mapa
     */
    private String tipo;
    /**
     * Coordenadas de referencia del mapa
     */
    private String coordenadas;

    /**
     * Constructor de la clase Mapa
     */
    public Mapa() {
        this.nombre = "";
        this.tipo = "";
        this.coordenadas = "0,0";
    }

    /**
     * Obtiene el nombre del mapa
     *
     * @return Nombre del mapa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el mapa
     *
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo de terreno del mapa
     *
     * @return Tipo de terreno
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece un nuevo tipo de terreno para el mapa
     *
     * @param tipo Nuevo tipo de terreno
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene las coordenadas del mapa
     *
     * @return Coordenadas
     */
    public String getCoordenadas() {
        return coordenadas;
    }

    /**
     * Establece nuevas coordenadas para el mapa
     *
     * @param coordenadas Nuevas coordenadas
     */
    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * Permite explorar el mapa y descubrir nuevas áreas
     */
    public void explorar() {
        // Encuentras zonas que no estaban exploradas
        System.out.println("Explorando el mapa: " + nombre);
    }

    /**
     * Permite entrar a una zona específica del mapa
     */
    public void entrar() {
        // Interaccion con las puertas de otros mapa hacia este mapa
        System.out.println("Entrando al mapa: " + nombre);
    }

    /**
     * Permite salir de una zona específica del mapa
     */
    public void salir() {
        // Interaccion con las puertas de este mapa para acceder a otros
        System.out.println("Saliendo del mapa: " + nombre);
    }
}
