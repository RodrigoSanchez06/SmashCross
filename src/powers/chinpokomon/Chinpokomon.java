package powers.chinpokomon;

/**
 * Interfaz que define el comportamiento de un poder perteneciente a la
 * franquicia Chinpokomon.
 */
public interface Chinpokomon {

    /**
     * Devuelve el nombre del podel.
     * @return el nombre el poder.
     */
    public String getName();

    /**
     * Asigna el nombre del poder.
     * @param newName nombre del poder a asignar.
     */
    public void setName(String newName);

    /**
     * Devuelve el porcentaje de daño del poder.
     * @return el porcentaje de daño.
     */
    public double getDamage();

    /**
     * Asigna un porcentaje de daño al poder.
     * @param damage porcentaje de daño a asignar. 
     */
    public void setDamage(double damage);

    /**
     * Devuelve el porcentaje de defensa del poder.
     * @return porcentaje  de defensa del poder.
     */
    public double getDefense();

    /**
     * Asigna un porcentaje de defensa al poder.
     * @param defensePercentage porcentaje de defensa a asignar.
     */
    public void setDefense(double defensePercentage);

    /**
     * Devuelve el detalle técnico del poder.
     * @return detalle técnico del poder.
     */
    public String getTechnicalDetail();

    /**
     * Asigna un detalle técnico al poder.
     * @param description detalle técnico a asignar.
     */
    public void setTechnicalDetail(String description);

    /**
     * Devuelve la descrinpción de la cinemática del poder.
     * @return descripción de la cinemática del poder.
     */
    public String getCinematic();

    /**
     * Asigna una descripción de la cinemática del poder.
     * @param narration descripción de la cinemática a asignar.
     */
    public void setCinematic(String narration);

    /**
     * Devuelve la narración del ataque del poder.
     * @return narración del ataque del poder.
     */
    public String attackNarration();

    /**
     * Devuelve la narración de la defensa del poder.
     * @return narracion de la defensa del poder.
     */
    public String defenseNarration();
}