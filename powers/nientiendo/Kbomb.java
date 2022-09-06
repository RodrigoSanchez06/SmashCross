package powers.nientiendo;

public class Kbomb implements Nientiendo{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    public Kbomb(){
        this.name = "Kbomb";
        this.technicalDetail="Korby absorbe un enemigo con poderes pirotecnicos, explota al contacto del rival y se defiende con una pared de minibombas";
        this.damagePercentage=1.3;
        this.defensePercentage=0.7;
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
        return this.narration="De las gradas, sale un Bakugito e intenta meterse en la pelea pero es absorbido por Korby";
    }

    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    public String defenseNarration(){
        return "Korby levanta una pared de petardos y disminuye el daño recibido";
    }

    public String attackNarration(){
        return "Korby corre hacia el oponente y lanza una serie de jabs explosivos";
    }    
}

