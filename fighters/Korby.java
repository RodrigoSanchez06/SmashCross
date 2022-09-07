
package fighters;

import powers.nientiendo.Kbomb;
import powers.nientiendo.Nientiendo;
import powers.nientiendo.OneMK;
import powers.nientiendo.ZahandK;

public class Korby implements Fighter {

  private double life = 100;
  private double basicAttack = 10;
  private Nientiendo actual;

  public String fightersIntro() {
    return "Korby llega volando en una estrella e impacta la arena, sonrie y empieza a calentar para el combate";
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

  @Override
  public String defend(Fighter a) {
    if (this.actual != null) {
      this.restLife(a.realDamage() * this.actual.getDefense());
      return actual.defenseNarration();
    }
    this.restLife(a.realDamage());
    return "Korby se puso en guardia pero al no tener poder recibio todo el daño";
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
    return "Korby da golpes a piño limpio";
  }

  @Override
  public double getLife() {
    return this.life;
  }

}