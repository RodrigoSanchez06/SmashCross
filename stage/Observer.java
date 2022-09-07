package stage;

/**
 * Define el comportamiento de un espectador.
 */
public interface Observer {
    /**
     * Se actualiza así mismo y para saber que está pasando en la Arena.
     */
    public void update();
}

