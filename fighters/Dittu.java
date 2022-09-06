package fighters;
import java.util.LinkedList;
import java.util.List;
import powers.chinpokomon.*;

public class Dittu implements Fighter{

    private Chinpokomon actual;
    private double life=100;
    private final double DAÑO_BASE=10;
    private List<Chinpokomon> availablePowers = new LinkedList<Chinpokomon>();

    public String fightersIntro(){
        return "";
    }

    @Override
    public double defend() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String attack(Fighter fighter) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
