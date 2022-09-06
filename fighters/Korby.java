package fighters;
import java.util.LinkedList;
import java.util.List;
import powers.nientiendo.*;

public class Korby implements Fighter{

    private double life = 100;
    private double basicAttack=10;
    private Nientiendo actual;
    


    public String fightersIntro(){
        return "Korby llega volando en una estrella e impacta la arena, sonrie y empieza a calentar para el combate";
    }

    public int randomIntNumber(int min, int max){
        int randomInt= (int)Math.floor(Math.random()*(max-min+1)+min);
        return randomInt;
    }

    public void consumePowers() { //El metodo regresa el indice de la lista para 
      int acquiredPowerNumber=randomIntNumber(1, 3);
      switch(acquiredPowerNumber){

        case 1:
        actual=new ZahandK();
        break;
        
        case 2:
        actual=new OneMK();
        break;

        case 3:
        actual=new Kbomb();
        break;
      }
    }

    @Override
    public double defend() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String attack(Fighter a) {
        String attackForm= "";
        Nientiendo itemPointer;

      if(actual instanceof ZahandK){

      }
        // switch(actual){
        //     case -1:
        //         //imprimir this.basicAttackNarration();
        //         //a.restarVida(this.basicAttack);
        //         break;

        //         case 1:              
                 
        //           attackForm= itemPointer.attackNarration();
        //           //a.restlive(this.basicAttack *itemPointer.getDamage());
        //         break;
        // }
        // return attackForm;
        return "si0";
    }
}

