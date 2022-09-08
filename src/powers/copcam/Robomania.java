package powers.copcam;

/**
 * Clase que  representa al poder Robomania de la franquicia 
 * Copcam
 */
public class Robomania implements Copcam{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

     /**
     * Constructor de Robomania se asignan valores por defecto.
     */
    public Robomania(){
        this.name = "Robomania";
        this.technicalDetail="Meganman se convierte en un robot moderno que dispara misiles teledirigidos y tiene escudos de plasma";
        this.damagePercentage=1.3;
        this.defensePercentage=0.4;
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
        return this.narration="Meganman se ha enojado y ahora se ha actualizado a un viejo enemigo que destacaba por sus misiles teledirigidos y sus escudos de plasma";
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
     * Devuelve la narración de la defensa del poder.
     * @return narracion de la defensa del poder.
     */
    public String defenseNarration(){
        return "Meganman absorbe gran parte del daño con un escudo de plasma";
    }

    /**
     * Devuelve la narración del ataque del poder.
     * @return narración del ataque del poder.
     */
    public String attackNarration(){
        return "Meganman ha disparado misiles hacia el rival";
    }

}
