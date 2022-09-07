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
     *Escribe las actualizaciones en el archivo correspondiente, sin sobreescribir las actualizaciones previas.
     */
    private void writeEvents(){
        try {
            FileWriter report = new FileWriter(filePath, true); 
            report.write(eventsInTheArena + "\n"); //Escribe en el archivo.
            report.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Devuelve el id del espectador.
     * @return Id del espectador.
     */
    public int getViewerId(){
        return this.viewerId;
    }

    /**
     * Devuelve el nombre del espectador.
     * @return nombre del espectador.
     */
    public String getViewerName(){
        return this.viewerName;
    }

    /**
     * Devuelve el nombre del peleador favorito del espectador.
     * @return nombre de peleador.
     */
    public String getFavoriteFighter(){
        return this.favoriteFighter;
    }

    /**
     * Asigna el nombre del peleador favorito del espectador.
     * @param favoriteFighter nombre del peleador a asignar.
     */
    public void setFavoriteFighter(String favoriteFighter){
        this.favoriteFighter  = favoriteFighter;
    }

}

