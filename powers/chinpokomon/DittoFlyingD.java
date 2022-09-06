package powers.chinpokomon;

public class DittoFlyingD implements Chinpokomon{
    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    public DittoFlyingD(){
        this.name = "DittoFlyingD";
        this.technicalDetail="Dittu adquiere las propiedades de una planta alucinogena, su ataque consiste en quemarse a si mismo haciendo que el rival este expuesto a su humo, recibiendo daño. Al defenderse, Dittu se quema completamente haciendose intangible pero recibe daño por el fuego";
        this.damagePercentage=1.2;
        this.defensePercentage=1;
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
        return this.narration="Dittu ve a lo lejos a su mejor amigo Marihuanachard y copia sus habilidades";
    }

    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    public String defenseNarration(){
        return "Dittu se quema completamente y se mantiene en estado gaseoso pero recibio daño al quemarse";
    }

    public String attackNarration(){
        return "Dittu quema sus extremos alucinogenos ocasionando daño y confusion al rival";
    }
}

