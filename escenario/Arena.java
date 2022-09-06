package escenario;
import java.util.LinkedList;
import fighters.*;

public class Arena implements Subject{

    private Fighter fighter;
    private LinkedList<Viewer> observerList = new LinkedList<Viewer>();
    private String eventsInTheArena;

    
    public LinkedList<Viewer> getObserverList(){
        return this.observerList;
    }


    @Override
    public void register(Viewer viewer) {
        observerList.add(viewer);       
        System.out.println("EL espectador " + viewer.getViewerName() +  " Con ID " 
            + viewer.getViewerId() + " se ha unido a ver los guamasos, apoyando a " + viewer.getFavoriteFighter());
    }


    @Override
    public void remove(Viewer viewer) { 
        System.out.println("El espectador " + viewer.getViewerName() + " Con  ID " 
            + viewer.getViewerId() + " ha abandonado la sesión");
        observerList.remove(viewer);
    }


    @Override
    public void communicate() {
        if (observerList.size() > 0) {
            for (Viewer c: observerList) {
                c.update();
            }
        }
    }

    public void setEventsInTheArea(String eventsInTheArea){
        this.eventsInTheArena = eventsInTheArea;
    }

    public String getEventsInTheArena(){
        return this.eventsInTheArena;
    }

    public void setFighter(Fighter fighter){
        this.fighter = fighter;
    }

    public Fighter getFighter(){
        return this.fighter;
    }
    
  
}

