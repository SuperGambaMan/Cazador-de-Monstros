package cazadormonstros;

/**
 * Clase Persona que representa a un usuario del sistema.
 * Contiene información básica de autenticación e identificación del jugador.
 */
public class Persona {
    /** Correo electrónico del usuario */
    private String mail;
    /** Contraseña de la cuenta */
    private String contrasena;
    /** Identificador único del jugador */
    private String id_jugador;
    
    /**
     * Constructor de la clase Persona
     * @param id_jugador Se le asignara una id al jugador cuando se crea
     */
    public Persona(String id_jugador) {
        this.mail = "";
        this.contrasena = "";
        this.id_jugador = id_jugador;
    }

    /**
     * Obtiene el correo electrónico del usuario
     * @return Correo electrónico
     */
    public String getMail() {
        return mail;
    }
    
    /**
     * Establece el correo electrónico del usuario
     * @param mail Nuevo correo electrónico
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    /**
     * Obtiene la contraseña del usuario
     * @return Contraseña actual
     */
    public String getContrasena() {
        return contrasena;
    }
    
    /**
     * Establece una nueva contraseña para el usuario
     * @param contrasena Nueva contraseña
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    /**
     * Obtiene el identificador del jugador
     * @return ID del jugador
     */
    public String getId_jugador() {
        return id_jugador;
    }
    
    /**
     * Establece el identificador del jugador
     * @param id_jugador Nuevo ID de jugador
     */
    public void setId_jugador(String id_jugador) {
        this.id_jugador = id_jugador;
    }
    
    /**
     * Registra un nuevo usuario en el sistema
     * @param mail Persona introducira un correo electrónico de registro
     * @param contrasena Persona introducira una contraseña de registro
     */
    //Introducimos por parametro el mail y la contrasena que 
    //iran en el registro de esta PERSONA
    public void registrarse (String mail, String contrasena){
        this.mail=mail;
        this.contrasena=contrasena;
        System.out.println("Usuario registrado");
    }
    
    /**
     * Inicia el juego para el usuario actual
     */
    public void jugar() {
        // Aqui pulsariamos Jugar y entrariamos al LOGIN para acceder al juego
        System.out.println("Jugador " + id_jugador + " ha iniciado el juego");
    }
    
    /**
     * Finaliza la sesión del usuario
     */
    public void cerrarSesion() {
        // Aqui pulsariamos Cerrar Sesion y nos daria por pantalla que hemos cerrado
        System.out.println("Sesión cerrada para: " + this.mail);
    }
}