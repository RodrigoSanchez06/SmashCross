package powers.copcam;

public class SuperSonic implements Copcam{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    public SuperSonic(){
        this.name = "Supersonic";
        this.technicalDetail="Meganman adquiere aditamentos que le conceden una velocidad supersonica permitiendole enlazar devastadores combos de golpes y tener facilidad para esquivar";
        this.damagePercentage=1.2;
        this.defensePercentage=0.6;
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
        return this.narration="Meganman desarrolla unas poderosas turbinas que le permiten alcanzar velocidades supersonicas";
    }

    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    public String attackNarration(){
        return "Meganman ha salido disparado hacia su enemigo y ha enlazado una serie de golpes";
    }

    public String defenseNarration(){
        return "Meganman ha realizado maniobras evasivas a gran velocidad";
    }
    
}

