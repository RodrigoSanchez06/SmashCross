package powers.chinpokomon;

/**
 * Clase que  representa al poder DittoEternalMemories de la franquicia 
 * Chinpokomon
 */
public class DittoEternalMemories implements Chinpokomon{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    /**
     * Constructor de DittoEternalMemories se asignan valores por defecto.
     */
    public DittoEternalMemories(){
        this.name = "DittoEternalMemories";
        this.technicalDetail="Dittu fuerza en su memoria a visualizar a su más grande rival, obteniendo la apariencia y poderes de un dragon de tamaño modesto";
        this.damagePercentage=1.3;
        this.defensePercentage=0.6;
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
        if(newName == null) //El nombre no puede ser null;
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
        if(0 <= damage || damage >1.5) //
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

    @Override
    public void setDefense(double defensePercentage) {
        if(defensePercentage <= 0 || defensePercentage>=1)
            throw new IllegalArgumentException();
        this.defensePercentage=defensePercentage;
    }

    @Override
    public String getTechnicalDetail() {
        return this.technicalDetail;
    }

    @Override
    public void setTechnicalDetail(String description) {
        if(description == null)
            throw new NullPointerException();
        this.technicalDetail=description;
    }

    @Override
    public String getCinematic() {
        // TODO Auto-generated method stub
        return this.narration="Dittu, salta por los aires, se concentra y antes de caer al piso, cierra los ojos y evoca el recuerdo del dragon Calcifer, su mas grande rival obteniendo asi sus poderes";
    }

    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    public String defenseNarration(){
        return "Dittu endurece sus escamas de dragon y recibe menos daño del ataque";
    }

    public String attackNarration(){
        return "Dittu inhala una bocanada de aire y exhala un poderoso aliento de fuego";
    }
    
}
