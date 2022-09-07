package fighters;

import powers.copcam.Copcam;
import powers.copcam.Matrix;
import powers.copcam.Robomania;
import powers.copcam.SuperSonic;

public class MeganMan implements Fighter {
    private double life = 100;
    private double basicAttack = 10;
    private Copcam actual;
    private boolean defense=false;

    public String fightersIntro() {
        return "MeganMan salta de una nave directo hacia el escenario, hace una grieta en el, se levanta y se pone modo ataque";
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
                actual = new Robomania();
                break;

            case 2:
                actual = new Matrix();
                break;

            case 3:
                actual = new SuperSonic();
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
        return a.attackCinematic()+"\n"+"MeganMan se puso en guardia pero al no tener poder recibio todo el daño";
    }

    public void restLife(double totalDamage) {
        this.life = this.life - totalDamage;

    }

    @Override
    public String attack(Fighter a) {
        if (this.actual != null) {
            a.restLife(this.realDamage());
            return actual.attackNarration()+"\n"+a.takenDamage();
        }
        a.restLife(this.basicAttack);
        return "MeganMan da golpes a puño limpio \n"+a.takenDamage();
    }

    public String itemCinematic(){
        if(this.actual!=null){
          return this.actual.getCinematic();
        }
        return null;
    }

    public String attackCinematic(){
        if(this.actual!=null){
            return this.actual.attackNarration();
        }
        return null;
    }

    public String dead(){
        return "Meganman ha perdido todos sus puntos de vida y ha decidido retirarse de la pelea civilizadamente";
    }

    public void changeDefense(){
        this.defense=!this.defense;
    }

    public boolean getState(){
        return this.defense;
    }

    public String takenDamage(){
        return "Meganman afirma que apenas sintio el golpe";
    }

    public double getLife(){
        return this.life;
      }

}
