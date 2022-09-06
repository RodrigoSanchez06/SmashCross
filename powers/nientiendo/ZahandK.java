package powers.nientiendo;

public class ZahandK implements Nientiendo{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    public ZahandK(){
        this.name = "ZahandK";
        this.technicalDetail="Korby adquiere la habilidad de manipular el espacio-tiempo aunque con cierta torpeza, ataca acortando la istancia y tiempo dde sus golpes y redirige los ataques que van hacia el";
        this.damagePercentage=1.35;
        this.defensePercentage=0.1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String newName) {
        if(newName == null)
            throw new NullPointerException();
        this.name = newName;
    }

    @Override
    public double getDamage() {
        return this.damagePercentage;
    }

    @Override
    public void setDamage(double damage) {
        if(0 <= damage || damage >1.5)
            throw new IllegalArgumentException();
        this.damagePercentage=damage;
    }

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
        return this.narration="Se parte la arena en dos saliendo de ella un destello impresionante, ciega a todos los jugadores y en un segundo aparece un enemigo a su lado, a lo cual korby reacciona comiendosela entera.";
    }

    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    public String defenseNarration(){
        return "Korby redirige los golpes cortando la dimension";
    }

    public String attackNarration(){
        return "Korby, corta el espacio en la dimension acortando distancia y golpea";
    }

}