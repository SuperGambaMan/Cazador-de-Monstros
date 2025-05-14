package cazadormonstros;

/**
 * Clase Heroe que representa a los personajes jugables del juego. Define
 * características, habilidades y acciones que puede realizar un héroe.
 */
public class Heroe {

    /**
     * Puntos de vida del héroe
     */
    private int puntosVida;
    /**
     * Apariencia visual del héroe
     */
    private String apariencia;
    /**
     * Poder de ataque del héroe
     */
    private int ataque;
    /**
     * Posición X del NPC
     */
    private int coordenadax;
    /**
     * Posición Y del NPC
     */
    private int coordenaday;
    /**
     * Identificador único del héroe
     */
    private String id_heroe;

    /**
     * Constructor de la clase Heroe
     *
     * @param id_heroe Se le asigna una id a cada Heroe que se crea
     */
    public Heroe(String id_heroe) {
        this.puntosVida = 100;
        this.apariencia = "default";
        this.ataque = 10;
        this.coordenadax = 0;
        this.coordenaday = 0;
        this.id_heroe = id_heroe;
    }

    /**
     * Obtiene los puntos de vida actuales del héroe
     *
     * @return Puntos de vida
     */
    public int getPuntosVida() {
        return puntosVida;
    }

    /**
     * Establece los puntos de vida del héroe
     *
     * @param puntosVida Nuevos puntos de vida
     */
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    /**
     * Obtiene la apariencia del héroe
     *
     * @return Descripción de la apariencia
     */
    public String getApariencia() {
        return apariencia;
    }

    /**
     * Establece una nueva apariencia para el héroe
     *
     * @param apariencia Nueva apariencia
     */
    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    /**
     * Obtiene el poder de ataque del héroe
     *
     * @return Poder de ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Establece el poder de ataque del héroe
     *
     * @param ataque Nuevo poder de ataque
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Obtiene las coordenadas actuales del héroe
     *
     * @return Coordenada X en formato int
     */
    public int getCoordenadax() {
        return coordenadax;
    }

    /**
     * Establece nuevas coordenada X para el héroe
     *
     * @param coordenadax Nuevas coordenada en X
     */
    public void setCoordenadax(int coordenadax) {
        this.coordenadax = coordenadax;
    }

    /**
     * Obtiene las coordenadas actuales del héroe
     *
     * @return Coordenada Y en formato int
     */
    public int getCoordenaday() {
        return coordenaday;
    }

    /**
     * Establece nuevas coordenada Y para el héroe
     *
     * @param coordenaday Nuevas coordenada en Y
     */
    public void setCoordenaday(int coordenaday) {
        this.coordenaday = coordenaday;
    }

    /**
     * Obtiene el identificador único del héroe
     *
     * @return ID del héroe
     */
    public String getId_heroe() {
        return id_heroe;
    }

    /**
     * Establece el identificador único del héroe
     *
     * @param id_heroe Nuevo ID para el héroe
     */
    public void setId_heroe(String id_heroe) {
        this.id_heroe = id_heroe;
    }

    /**
     * Recibir daño de un Monstro
     *
     * @param atacante Monstro que te ataca
     */
    public void recibirDanio(Monstro atacante) {
        this.puntosVida -= atacante.atacar();
    }

    /**
     * Interactúa con objetos o personajes cercanos
     *
     * @param ainteractuar NPC con el que vas a interactuar
     * @return True coinciden las coordenadas e interactua, false en caso
     * contrario
     */
    public boolean interactuar(NPC ainteractuar) {
        if (ainteractuar.getCoordenadax() == this.coordenadax
                && ainteractuar.getCoordenaday() == this.coordenaday) {
            return true;
        }
        return false;
    }

    /**
     * Realiza un ataque contra enemigos
     *
     * @return Poder de ataque que realiza el Heroe
     */
    public int atacar() {
        System.out.println("Atacando con poder: " + this.ataque);
        return this.ataque;
    }

    /**
     * Mueve al NPC por el mapa en una dirección específica
     *
     * @param direccion Dirección del movimiento ("norte", "sur", "este",
     * "oeste")
     * @param pasos Cantidad de pasos a mover
     * @return Las nueva coordenada de X o de Y después del movimiento
     */
    public int moverse(String direccion, int pasos) {

        // Actualizar posición según la dirección
        switch (direccion.toLowerCase()) {
            case "norte":
                this.coordenaday += pasos;
                System.out.println("NPC movido hacia arriba");
                return this.coordenaday;
            case "sur":
                this.coordenaday -= pasos;
                System.out.println("NPC movido hacia abajo");
                return this.coordenaday;
            case "este":
                this.coordenadax += pasos;
                System.out.println("NPC movido a la derecha");
                return this.coordenadax;
            case "oeste":
                this.coordenadax -= pasos;
                System.out.println("NPC movido a la izquierda");
                return this.coordenadax;
            default:
                System.out.println("Dirección no válida. Use norte, sur, este u oeste.");
                return this.coordenadax;
        }
    }
}