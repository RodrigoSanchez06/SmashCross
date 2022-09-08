package stage;

/**
 * Define el comportamiento de un sujeto.
 */
public interface Subject {

    /**
     * Añade a un nuevo espectador a la lista de espectadores.
     * @param viewer espectador a añadir.
     */
    public void register(Viewer viewer);

    /**
     * Remueve a un espectador de la lista de espectadores.
     * @param viewer espectador a remover.
     */
    public void remove(Viewer viewer);
    
    /**
     * Transmite un mensaje a todos los espectadores de la lista.
     */
    public void communicate();
}
