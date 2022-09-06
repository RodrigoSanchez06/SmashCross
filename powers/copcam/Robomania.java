package powers.copcam;

public class Robomania implements Copcam{

    private String name;
    private String technicalDetail;
    private String narration;
    private double damagePercentage;
    private double defensePercentage;

    public Robomania(){
        this.name = "Robomania";
        this.technicalDetail="Meganman se convierte en un robot moderno que dispara misiles teledirigidos y tiene escudos de plasma";
        this.damagePercentage=1.3;
        this.defensePercentage=0.4;
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
        return this.narration="Meganman se ha enojado y ahora se ha actualizado a un viejo enemigo que destacaba por sus misiles teledirigidos y sus escudos de plasma";
    }

    @Override
    public void setCinematic(String narration) {
        if(narration == null)
            throw new NullPointerException();
        this.narration=narration;
    }

    public String defenseNarration(){
        return "Meganman absorbe gran parte del daño con un escudo de plasma";
    }

    public String attackNarration(){
        return "Meganman ha disparado misiles hacia el rival";
    }

}
