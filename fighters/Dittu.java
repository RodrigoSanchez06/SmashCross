package fighters;

import powers.chinpokomon.*;

/**
 * clase que define el comportamiento del peleador Dittu.
 */
public class Dittu implements Fighter {

    private double life = 100;
    private double basicAttack = 20;
    private Chinpokomon actual;
    private boolean defense = false;

    /**
     * Devuelve la introduccion de un peleador a la Arena.
     * 
     * @return
     */
    @Override
    public String fightersIntro() {
        return "Dittu sale debajo del escenario listo para la pelea";
    }

    /**
     * Calcula el daño del peleador dependiendo del item que posee.
     * 
     * @return el porcentaje del daño.
     */
    @Override
    public double realDamage() {
        if (this.actual != null)
            return this.basicAttack * this.actual.getDamage();
        return this.basicAttack;
    }

    /**
     * El peleador consume los poderes disponibles.
     */
    @Override
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

    /**
     * Realiza los calculos necesarios para determinar la vida del peleador atacado
     * despues de defenderse.
     * 
     * @param fighter peleador que ataca.
     * @return Una cadena explicando como se efectuó la defensa.
     */
    @Override
    public String defend(Fighter a) {
        if (this.actual != null) {
            this.restLife(a.realDamage() * this.actual.getDefense());
            return a.attackCinematic() + "\n" + actual.defenseNarration();
        }
        this.restLife(a.realDamage());
        return a.attackCinematic() + "\n" + "Dittu se puso en guardia pero al no tener poder recibio todo el daño";
    }

    /**
     * Devuelve una cadena explicando la cinemática del ataque.
     * 
     * @return cadena explicando cinemática del ataque.
     */
    @Override
    public String attackCinematic() {
        if (this.actual != null) {
            return this.actual.attackNarration();
        }
        return null;
    }

    /**
     * Resta vida del peleador al recibir daño.
     * 
     * @param totalDamage porcentaje del daño total.
     */
    @Override
    public void restLife(double totalDamage) {
        this.life = this.life - totalDamage;

    }

    /**
     * Devuelve una cadena que explica lo que sucede cuando el personaje muere.
     * 
     * @return cadena explicando lo que sucede cuando el peleador muere.
     */
    @Override
    public String dead() {
        return "Dittu ha perdido todos los puntos de vida y se ha derretido en un charquito";
    }

    /**
     * Realiza los calculos necesarios para determinar la vida del peleador atacado
     * despues de haber sido atacado.
     * 
     * @param fighter peleador que ataca.
     * @return Una cadena explicando como se efectuó el ataque.
     */
    @Override
    public String attack(Fighter a) {
        if (this.actual != null) {
            a.restLife(this.realDamage());
            return actual.attackNarration() + "\n" + a.takenDamage();
        }
        a.restLife(this.basicAttack);
        return "Dittu da golpes a puño limpio\n" + a.takenDamage();
    }

    /**
     * El peleador cambia la forma de defenderse.
     */
    @Override
    public void changeDefense() {
        this.defense = !this.defense;
    }

    /**
     * Obtiene el estado de defensa del peleador.
     * 
     * @return estado de defensa del peleador.
     */
    @Override
    public boolean getState() {
        return this.defense;
    }

    /**
     * Devuelve una cadena explicando la cinemática de un item cuando se consume.
     * 
     * @return cadena explicando cinemática.
     */
    @Override
    public String itemCinematic() {
        if (this.actual != null) {
            return this.actual.getCinematic();
        }
        return null;
    }

    /**
     * Devuelve una cadena que expresa que el peleador ha recibido daño.
     * 
     * @return cadena expresando el daño hacia el peleador.
     */
    @Override
    public String takenDamage() {
        return "Dittu berrea de dolor";
    }

    /**
     * Devuelve la vida actual del peleador.
     * 
     * @return vida acutal del peleador.
     */
    @Override
    public double getLife() {
        return this.life;
    }

}
