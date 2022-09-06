package escenario;
import java.io.FileWriter;

public class Viewer implements Observer{

    private int viewerId;
    private String viewerName;
    private String favoriteFighter;
    private Arena fightingPlace;
    private String eventsInTheArena;

    public Viewer(int viewerId, String favoriteFighter, Arena fightingPlace, String viewerName){
        this.viewerId = viewerId;
        this.favoriteFighter = favoriteFighter;
        this.fightingPlace = fightingPlace;
        this.viewerName = viewerName;
    }

    @Override
    public void update() {
        eventsInTheArena = fightingPlace.getEventsInTheArena() + "";
    }

    public void writeEvents(){
        try {
            String filePath = String.valueOf(viewerId) + viewerName +".txt";
            FileWriter fw = new FileWriter(filePath, true);
            fw.write(eventsInTheArena);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getViewerId(){
        return this.viewerId;
    }

    public String getViewerName(){
        return this.viewerName;
    }

    public String getFavoriteFighter(){
        return this.favoriteFighter;
    }

    public void setFavoriteFighter(String favoriteFighter){
        this.favoriteFighter  = favoriteFighter;
    }

}

