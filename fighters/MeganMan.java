package fighters;
import java.util.LinkedList;
import java.util.List;
import powers.copcam.*;

public class MeganMan implements Fighter{

    private Copcam actual;
    private double life;
    private List<Copcam> availablePowers = new LinkedList<Copcam>();

    public String fightersIntro(){
        return "";
    }

    @Override
    public double defend() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public String attack(Fighter a) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

