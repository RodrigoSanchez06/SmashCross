package stage;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Define un objeto de tipo Viewer, que será un observador y cobrará el papel de un Observer.
 */
public class Viewer implements Observer{

    private int viewerId;
    private String viewerName;
    private String favoriteFighter;
    private Arena fightingPlace;
    private String eventsInTheArena;
    private String filePath;

    /**
     * Constructor de Viewer recibe los datos necesarios para inicializar un nuevo espectador y crea los archivos necesarios.
     * @param viewerId id único de espectador.
     * @param favoriteFighter peleador favorito del espectador.
     * @param fightingPlace arena en donde pelearan los personajes.
     * @param viewerName nombre del espectador.
     */
    public Viewer(int viewerId, String favoriteFighter, Arena fightingPlace, String viewerName){
        this.viewerId = viewerId;
        this.favoriteFighter = favoriteFighter;
        this.fightingPlace = fightingPlace;
        this.viewerName = viewerName;
        try { //Crea los archivos txt de cada espectador.
            this.filePath = String.valueOf(viewerId + "-") + viewerName +".txt";
            FileWriter fw = new FileWriter(filePath, true);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Se actualiza así mismo y para saber que está pasando en la Arena.
     */
    @Override
    public void update() {
        eventsInTheArena = fightingPlace.getEventsInTheArena() + "";
        writeEvents();
    }

    /**
     *
     */
    public void writeEvents(){
        try {
            FileWriter report = new FileWriter(filePath, true);
            report.write(eventsInTheArena + "\n");
            report.close();
        } catch (IOException e) {
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

