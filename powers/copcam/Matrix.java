package powers.copcam;

public class Matrix implements Copcam{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    public Matrix(){
        this.name = "Matrix";
        this.technicalDetail="Meganman se infiltra en la matrix del juego para manipular la vida de sus oponentes";
        this.damagePercentage=1.2;
        this.defensePercentage=0.5;
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
        return this.narration="Meganman se ha convertido en un robot altamente informatico y ha logrado asociar la matrix del juego";
    }

    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    public String attackNarration(){
        return "Meganman ha manipulado los puntos de vida de su oponente";
    }

    public String defenseNarration(){
        return "Meganman ha disminuido con la Matrix el daño que recibe";
    }
    
}
