package fighters;

import powers.chinpokomon.*;

public class Dittu implements Fighter {

    private double life = 100;
    private double basicAttack = 10;
    private Chinpokomon actual;

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
            return actual.defenseNarration();
        }
        this.restLife(a.realDamage());
        return "Dittu se puso en guardia pero al no tener poder recibio todo el daño";
    }

    public void restLife(double totalDamage) {
        this.life = this.life - totalDamage;

    }

    @Override
    public String attack(Fighter a) {
        if (this.actual != null) {
            a.restLife(this.realDamage());
            return actual.attackNarration();
        }
        a.restLife(this.basicAttack);
        return "Dittu da golpes a piño limpio";
    }

    @Override
    public double getLife() {
        return this.life;
    }

}
