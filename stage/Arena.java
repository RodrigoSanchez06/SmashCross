package stage;
import java.util.LinkedList;

/**
 * Define un objeto de tipo arena, en donde se transmiten acontecimientos de una pelea a los espectadores.
 */
public class Arena implements Subject{

    private LinkedList<Viewer> observerList = new LinkedList<Viewer>();
    private String eventsInTheArena;

    /**
     * Añade a un nuevo espectador a la lista de espectadores.
     * @param viewer espectador a añadir.
     */
    @Override
    public void register(Viewer viewer) {
        observerList.add(viewer);   
        //Muestra en pantalla quien se añadió    
        System.out.println("EL espectador " + viewer.getViewerName() +  " Con ID " 
            + viewer.getViewerId() + " se ha unido a ver los guamasos, apoyando a " + viewer.getFavoriteFighter());
    }


    /**
     * Remueve a un espectador de la lista de espectadores.
     * @param viewer espectador a remover.
     */
    @Override
    public void remove(Viewer viewer) { 
        //Muestra en pantalla quien se retiró de la sesión.
        System.out.println("El espectador " + viewer.getViewerName() + " Con  ID " 
            + viewer.getViewerId() + " ha abandonado la sesión");
        observerList.remove(viewer);
    }


    /**
     * Transmite un mensaje a todos los espectadores de la lista.
     */
    @Override
    public void communicate() {
        //actualiza la información a todos y cada uno de los espectadores.
        if (observerList.size() > 0) {
            for (Viewer c: observerList) {
                c.update();
            }
        }
    }
 
    /**
     * Regresa la lista de todos nuestros espectadores.
     * @return lista de espectadores.
     */
    public LinkedList<Viewer> getObserverList(){
        return this.observerList;
    }

    /**
     * Añade lo que está pasando en la arena.
     * @param eventsInTheArea evento sucedido.
     */
    public void setEventsInTheArea(String eventsInTheArea){
        this.eventsInTheArena = eventsInTheArea;
    }

    /**
     * Regresa lo que esta pasando en la arena.
     * @return eventos en la arena.
     */
    public String getEventsInTheArena(){
        return this.eventsInTheArena;
    }
}

