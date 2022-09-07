package fighters;

import powers.chinpokomon.*;

public class Dittu implements Fighter {

    private double life = 100;
    private double basicAttack = 10;
    private Chinpokomon actual;
    private boolean defense=false;

    public String fightersIntro() {
        return "Dittu sale debajo del escenario listo para la pelea";
    }

    public double realDamage() {
        if (this.actual != null)
            return this.basicAttack * this.actual.getDamage();
        return this.basicAttack;
    }

    public void consumePowers() { // El metodo regresa el indice de la lista para
        int acquiredPowerNumber = Fighter.randomIntNumber(1, 3);
        switch (acquiredPowerNumber) {

            case 1:
                actual = new DittoEternalMemories();
                break;

            case 2:
                actual = new DittoFlyingD();
                break;

            case 3:
                actual = new DittoNewt();
                break;
        }
    }

    @Override
    public String defend(Fighter a) {
        if (this.actual != null) {
            this.restLife(a.realDamage() * this.actual.getDefense());
            return a.attackCinematic()+"\n"+actual.defenseNarration();
        }
        this.restLife(a.realDamage());
        return a.attackCinematic()+"\n"+"Dittu se puso en guardia pero al no tener poder recibio todo el daño";
    }

    public String attackCinematic(){
        if(this.actual!=null){
            return this.actual.attackNarration();
        }
        return null;
    }

    public void restLife(double totalDamage) {
        this.life = this.life - totalDamage;

    }

    public String dead(){
        return "Dittu ha perdido todos los puntos de via y se ha derretido en un charquito";
    }

    @Override
    public String attack(Fighter a) {
        if (this.actual != null) {
            a.restLife(this.realDamage());
            return actual.attackNarration()+"\n"+a.takenDamage();
        }
        a.restLife(this.basicAttack);
        return "Dittu da golpes a puño limpio\n"+a.takenDamage();
    }

    public void changeDefense(){
        this.defense=!this.defense;
    }

    public boolean getState(){
        return this.defense;
    }

    public String itemCinematic(){
        if(this.actual!=null){
          return this.actual.getCinematic();
        }
        return null;
    }

    public String takenDamage(){
        return "Dittu berrea de dolor";
    }

    @Override
    public double getLife() {
        return this.life;
    }

}
