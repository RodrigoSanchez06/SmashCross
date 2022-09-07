
package fighters;

import powers.nientiendo.Kbomb;
import powers.nientiendo.Nientiendo;
import powers.nientiendo.OneMK;
import powers.nientiendo.ZahandK;

public class Korby implements Fighter {

  private double life = 100;
  private double basicAttack = 10;
  private Nientiendo actual;
  private boolean defense = false;

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
      return a.attackCinematic()+"\n"+actual.defenseNarration();
    }
    this.restLife(a.realDamage());
    return a.attackCinematic()+"\n"+"Korby se puso en guardia pero al no tener poder recibio todo el daño";
  }

  public String dead(){
    return "Korby ha perdido todos sus puntos de vida y ha explotado";
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

  public void changeDefense(){
    this.defense=!this.defense;
  }

  public boolean getState(){
    return this.defense;
  }

  @Override
  public String attack(Fighter a) {
    if (this.actual != null) {
      a.restLife(this.realDamage());
      return actual.attackNarration()+"\n"+a.takenDamage();
    }
    a.restLife(this.basicAttack);
    return "Korby da golpes a puño limpio \n"+a.takenDamage();
  }

  public String itemCinematic(){
    if(this.actual!=null){
      return this.actual.getCinematic();
    }
    return null;
  }

  public String takenDamage(){
    return "Korby llora de dolor";
  }

  @Override
  public double getLife() {
    return this.life;
  }

}