package fighters;

import java.util.LinkedList;
import java.util.List;
import powers.nientiendo.*;

public class Korby implements Fighter {

  private double life = 100;
  private double basicAttack = 10;
  private Nientiendo actual;

  public String fightersIntro() {
    return "Korby llega volando en una estrella e impacta la arena, sonrie y empieza a calentar para el combate";
  }

  public void consumePowers() { // El metodo regresa el indice de la lista para
    int acquiredPowerNumber = Fighter.randomIntNumber(1, 3);
    switch (acquiredPowerNumber) {

      case 1:
        actual = new ZahandK();
        break;

      case 2:
        actual = new OneMK();
        break;

      case 3:
        actual = new Kbomb();
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

    a.restLife(this.basicAttack * actual.getDamage());

    return actual.attackNarration();
  }

}
