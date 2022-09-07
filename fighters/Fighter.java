package fighters;

public interface Fighter{
    public String fightersIntro();
    public String defend(Fighter fighter);
    public String attack(Fighter fighter);
    public double realDamage();
}
