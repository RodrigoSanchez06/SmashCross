package powers.nientiendo;

public class OneMK implements Nientiendo{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    public OneMK(){
        this.name = "OneMK";
        this.technicalDetail="Korby se divide en muchas partes, generando un ejercito de mini Korbys donde el daño se acumula cuando se vuelve a unir";
        this.damagePercentage=1.2;
        this.defensePercentage=0.8;
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
        // TODO Auto-generated method stub
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
        return this.narration="Korby absorbe a un Mirrorkub, ahora Korby puede generar clones de si mismo";
    }

    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    public String defenseNarration(){
        return "Korby se escabulle entre sus clones recibiendo solo una parte de los ataques";
    }

    public String attackNarration(){
        return "Korby lanza a sus clones hacia el oponente y aprovecha la confusion para darle un golpe limpio";
    }

}
