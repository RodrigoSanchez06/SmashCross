package fighters;

import java.util.LinkedList;
import java.util.List;

import powers.copcam.Copcam;
import powers.copcam.Matrix;
import powers.copcam.Robomania;
import powers.copcam.SuperSonic;
import powers.nientiendo.*;

public class MeganMan implements Fighter {

    private double life = 100;
    private double basicAttack = 10;
    private Copcam actual;

    public String fightersIntro() {
        return "Korby llega volando en una estrella e impacta la arena, sonrie y empieza a calentar para el combate";
    }

    public void consumePowers() { // El metodo regresa el indice de la lista para
        int acquiredPowerNumber = Fighter.randomIntNumber(1, 3);
        switch (acquiredPowerNumber) {

            case 1:
                actual = new Matrix();
                break;

            case 2:
                actual = new Robomania();
                break;

            case 3:
                actual = new SuperSonic();
                break;
        }
    }

    @Override
    public String defend() {
        String formOfDefense = "";
        formOfDefense = actual.defenseNarration();
        this.restLife(this.basicAttack * actual.getDefense());
        return formOfDefense;
    }

    public void restLife(double totalDamage) {
        this.life = this.life - totalDamage;

    }

    @Override
    public String attack(Fighter a) {
        String attackForm = "";
        attackForm = actual.attackNarration();
        a.restLife(this.basicAttack * actual.getDamage());

        return attackForm;
    }

}
