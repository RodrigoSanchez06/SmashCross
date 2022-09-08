package powers.copcam;

/**
 * Clase que  representa al poder Matrix de la franquicia 
 * Copcam
 */
public class Matrix implements Copcam{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    /**
     * Constructor de Matrix se asignan valores por defecto.
     */
    public Matrix(){
        this.name = "Matrix";
        this.technicalDetail="Meganman se infiltra en la matrix del juego para manipular la vida de sus oponentes";
        this.damagePercentage=1.2;
        this.defensePercentage=0.5;
    }

    /**
     * Devuelve el nombre del podel.
     * @return el nombre el poder.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Asigna el nombre del poder.
     * @param newName nombre del poder a asignar.
     */
    @Override
    public void setName(String newName) {
        if(newName == null)
            throw new NullPointerException();
        this.name = newName;
    }

    /**
     * Devuelve el porcentaje de daño del poder.
     * @return el porcentaje de daño.
     */
    @Override
    public double getDamage() {
        return this.damagePercentage;
    }

    /**
     * Asigna un porcentaje de daño al poder.
     * @param damage porcentaje de daño a asignar. 
     */
    @Override
    public void setDamage(double damage) {
        if(0 <= damage || damage >1.5)
            throw new IllegalArgumentException();
        this.damagePercentage=damage;
    }

    /**
     * Devuelve el porcentaje de defensa del poder.
     * @return porcentaje  de defensa del poder.
     */
    @Override
    public double getDefense() {
        return this.defensePercentage;
    }

    /**
     * Asigna un porcentaje de defensa al poder.
     * @param defensePercentage porcentaje de defensa a asignar.
     */
    @Override
    public void setDefense(double defensePercentage) {
        if(defensePercentage <= 0 || defensePercentage>=1)
            throw new IllegalArgumentException();
        this.defensePercentage=defensePercentage;
    }

    /**
     * Devuelve el detalle técnico del poder.
     * @return detalle técnico del poder.
     */
    @Override
    public String getTechnicalDetail() {
        return this.technicalDetail;
    }

    /**
     * Asigna un detalle técnico al poder.
     * @param description detalle técnico a asignar.
     */
    @Override
    public void setTechnicalDetail(String description) {
        if(description == null)
            throw new NullPointerException();
        this.technicalDetail=description;
        
    }

    /**
     * Devuelve la descrinpción de la cinemática del poder.
     * @return descripción de la cinemática del poder.
     */
    @Override
    public String getCinematic() {
        return this.narration="Meganman se ha convertido en un robot altamente informatico y ha logrado asociar la matrix del juego";
    }

    /**
     * Asigna una descripción de la cinemática del poder.
     * @param narration descripción de la cinemática a asignar.
     */
    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    /**
     * Devuelve la narración del ataque del poder.
     * @return narración del ataque del poder.
     */
    public String attackNarration(){
        return "Meganman ha manipulado los puntos de vida de su oponente";
    }

    /**
     * Devuelve la narración de la defensa del poder.
     * @return narracion de la defensa del poder.
     */
    public String defenseNarration(){
        return "Meganman ha disminuido con la Matrix el daño que recibe";
    }
    
}
