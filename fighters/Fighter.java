package fighters;

public interface Fighter {
    public String fightersIntro();

    public String defend();

    public String attack(Fighter fighter);

    public void restLife(double totalDamage);

    public static int randomIntNumber(int min, int max) {
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomInt;
    }

}
