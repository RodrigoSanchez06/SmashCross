package fighters;

public interface Fighter {
    public String fightersIntro();
    public String defend(Fighter fighter);
    public String attack(Fighter fighter);
    public void consumePowers();
    public void changeDefense();
    public boolean getState();
    public String itemCinematic();
    public String takenDamage();
    public double realDamage();
    public String attackCinematic();
    public String dead();
    public void restLife(double totalDamage);
    public static int randomIntNumber(int min, int max) {
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomInt;
    }
    public double getLife();
}
