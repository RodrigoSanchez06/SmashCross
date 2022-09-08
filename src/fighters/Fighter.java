package fighters;

/**
 * Interfaz que define el comportamiento de un peleador.
 */
public interface Fighter {

    /**
     * Devuelve la introduccion de un peleador a la Arena.
     * @return
     */
    public String fightersIntro();

    /**
     * Realiza los calculos necesarios para determinar la vida del peleador atacado despues de defenderse.
     * @param fighter peleador que ataca.
     * @return Una cadena explicando como se efectuó la defensa.
     */
    public String defend(Fighter fighter);

    /**
     * Realiza los calculos necesarios para determinar la vida del peleador atacado despues de haber sido atacado.
     * @param fighter peleador que ataca.
     * @return Una cadena explicando como se efectuó el ataque.
     */
    public String attack(Fighter fighter);

    /**
     * El peleador consume los poderes disponibles.
     */
    public void consumePowers();

    /**
     * El peleador cambia la forma de defenderse.
     */
    public void changeDefense();

    /**
     * Obtiene el estado de defensa del peleador.
     * @return estado de defensa del peleador.
     */
    public boolean getState();

    /**
     * Devuelve una cadena explicando la cinemática de un item cuando se consume.
     * @return cadena explicando cinemática.
     */
    public String itemCinematic();

    /**
     * Devuelve una cadena que expresa que el peleador ha recibido daño.
     * @return cadena expresando el daño hacia el peleador.
     */
    public String takenDamage();

    /**
     * Calcula el daño del peleador dependiendo del item que posee.
     * @return el porcentaje del daño.
     */
    public double realDamage();

    /**
     * Devuelve una cadena explicando la cinemática del ataque.
     * @return cadena explicando cinemática del ataque.
     */
    public String attackCinematic();

    /**
     * Devuelve una cadena que explica lo que sucede cuando el personaje muere.
     * @return cadena explicando lo que sucede cuando el peleador muere.
     */
    public String dead();

    /**
     * Resta vida del peleador al recibir daño.
     * @param totalDamage porcentaje del daño total.
     */
    public void restLife(double totalDamage);

    /**
     * Generador de números aleatorios.
     * @param min minimo numero a generar.
     * @param max maximo numero a generar.
     * @return un numero aleatorio.
     */
    public static int randomIntNumber(int min, int max) {
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomInt;
    }

    /**
     * Devuelve la vida actual del peleador. 
     * @return vida acutal del peleador.
     */
    public double getLife();
}
