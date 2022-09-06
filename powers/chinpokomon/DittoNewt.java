package powers.chinpokomon;

public class DittoNewt implements Chinpokomon{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    public DittoNewt(){
        this.name = "DittoNewt";
        this.technicalDetail="Dittu se transforma en un fluido no Newtoniano haciendo que al ser atacado, ese mismo ataque no le hace daño a él sino al rival pero su ataque se disminuye";
        this.damagePercentage=0.5;
        this.defensePercentage=0.2;
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
        return this.narration="En la arena de la batalla que esta, Dittu se da cuenta que hay un laboratorio cerca con un Chiponkomon de pruebas, al cual le estaban experimentando fluidos no Newtonianos y obtiene su poder";
    }

    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    public String defenseNarration(){
        return "Dittu absorbió el ataque y lo reflejo *Excepcional*";
    }

    public String attackNarration(){
        return "Dittu se altera y da un empujon";
    }
    
}
