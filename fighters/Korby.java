
package fighters;

import powers.nientiendo.Kbomb;
import powers.nientiendo.Nientiendo;
import powers.nientiendo.OneMK;
import powers.nientiendo.ZahandK;

/**
 * clase que define el comportamiento del peleador Korby.
 */
public class Korby implements Fighter {

    private double life = 100;
    private double basicAttack = 20;
    private Nientiendo actual;
    private boolean defense = false;

    /**
     * Devuelve la introduccion de un peleador a la Arena.
     * 
     * @return
     */
    @Override
    public String fightersIntro() {
        return "Korby llega volando en una estrella e impacta la arena, sonrie y empieza a calentar para el combate";
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
                actual = new Kbomb();
                break;

            case 2:
                actual = new OneMK();
                break;

            case 3:
                actual = new ZahandK();
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
        return a.attackCinematic() + "\n" + "Korby se puso en guardia pero al no tener poder recibio todo el daño";
    }

    /**
     * Devuelve una cadena que explica lo que sucede cuando el personaje muere.
     * 
     * @return cadena explicando lo que sucede cuando el peleador muere.
     */
    @Override
    public String dead() {
        return "Korby ha perdido todos sus puntos de vida y ha explotado";
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
        return "Korby da golpes a puño limpio \n" + a.takenDamage();
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
        return "Korby llora de dolor";
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