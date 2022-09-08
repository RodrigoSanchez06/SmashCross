import fighters.*;
import stage.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("********** Bienvenido a Smash Cross **********\n");
        System.out.println("Generando Arena...\n");
        Arena arena = new Arena();
        int id = 0;
        Viewer firstViewer = new Viewer(++id, "Dittu", arena, "Rogerxdgta");
        arena.register(firstViewer);
        Viewer secondViewer = new Viewer(++id, "MeganMan", arena, "Heinz");
        arena.register(secondViewer);
        Viewer thirdViewer = new Viewer(++id, "Korby", arena, "Chao");
        arena.register(thirdViewer);
        Viewer fourthViewer = new Viewer(++id, "Dittu", arena, "Vegetta777");
        arena.register(fourthViewer);

        int scenery = randomIntNumber(1, 3);
        Fighter korby = new Korby();
        Fighter dittu = new Dittu();
        Fighter meganMan = new MeganMan();
        String atack, cinematic;

        System.out.println(scenery);

        switch (scenery) {
            case 1:
                arena.setEventsInTheArea("\n");
                arena.communicate();
                System.out.println(
                        "Transportando a todos los espectadores y peleadores a nuestro escenario PUEBLO CALETA.\n");
                arena.setEventsInTheArea("Nos transportamos a pueblo Caleta.\n");
                arena.communicate();

                System.out.println("SALEN TODOS LOS PERSONAJES A PRESENTARSE...\n");
                arena.setEventsInTheArea("SALEN TODOS LOS PERSONAJES A PRESENTARSE...\n");
                arena.communicate();

                System.out.println(korby.fightersIntro() + "\n");
                arena.setEventsInTheArea(korby.fightersIntro());
                arena.communicate();
                System.out.println(dittu.fightersIntro() + "\n");
                arena.setEventsInTheArea(dittu.fightersIntro());
                arena.communicate();
                System.out.println(meganMan.fightersIntro() + "\n");
                arena.setEventsInTheArea(meganMan.fightersIntro());
                arena.communicate();

                meganMan.consumePowers();
                korby.consumePowers();
                dittu.consumePowers();

                cinematic = meganMan.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                cinematic = korby.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                cinematic = dittu.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                dittu.consumePowers();

                atack = korby.attack(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                korby.consumePowers();
                meganMan.consumePowers();

                atack = korby.attack(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();

                atack = meganMan.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = meganMan.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();

                atack = meganMan.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();
                dittu.consumePowers();

                atack = dittu.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();

                if (korby.getLife() <= 0) {
                    System.out.println(korby.dead());
                    arena.setEventsInTheArea(korby.dead());
                    arena.communicate();
                } else {
                    atack = dittu.attack(korby) + "\n";
                    System.out.println(atack);
                    arena.setEventsInTheArea(atack);
                    arena.communicate();

                    atack = meganMan.attack(korby) + "\n";
                    System.out.println(atack);
                    arena.setEventsInTheArea(atack);
                    arena.communicate();
                    System.out.println(korby.dead());
                    arena.setEventsInTheArea(korby.dead());
                    arena.communicate();
                }

                atack = meganMan.defend(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();
                dittu.consumePowers();

                atack = dittu.attack(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = meganMan.defend(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();
                dittu.consumePowers();

                atack = dittu.attack(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = dittu.defend(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = dittu.attack(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = dittu.defend(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                while (meganMan.getLife() > 0) {
                    atack = dittu.attack(meganMan) + "\n";
                    System.out.println(atack);
                    arena.setEventsInTheArea(atack);
                    arena.communicate();
                }

                System.out.println(meganMan.dead());
                arena.setEventsInTheArea(meganMan.dead());
                arena.communicate();

                System.out.println("El peleador Dittu ha ganado el combate.");
                arena.setEventsInTheArea("El peleador Dittu ha ganado el combate.");
                arena.communicate();
                arena.isWinner("Dittu");

                break;

            case 2:
                arena.setEventsInTheArea("\n");
                arena.communicate();
                System.out.println(
                        "Transportando a todos los espectadores y peleadores a nuestro escenario BIZARRE TOWN.\n");
                arena.setEventsInTheArea("Nos transportamos a pueblo BIZARRE TOWN.\n");
                arena.communicate();

                System.out.println("*SALEN TODOS LOS PERSONAJES A PRESENTARSE...*\n");
                arena.setEventsInTheArea("*SALEN TODOS LOS PERSONAJES A PRESENTARSE...*\n");
                arena.communicate();

                System.out.println(korby.fightersIntro() + "\n");
                arena.setEventsInTheArea(korby.fightersIntro());
                arena.communicate();
                System.out.println(dittu.fightersIntro() + "\n");
                arena.setEventsInTheArea(dittu.fightersIntro());
                arena.communicate();
                System.out.println(meganMan.fightersIntro() + "\n");
                arena.setEventsInTheArea(meganMan.fightersIntro());
                arena.communicate();

                meganMan.consumePowers();
                korby.consumePowers();
                dittu.consumePowers();

                cinematic = meganMan.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                cinematic = korby.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                cinematic = dittu.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                // hasta la linea de arriba los jugadores se presentan

                atack = meganMan.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = korby.defend(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = korby.attack(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = meganMan.attack(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();

                atack = meganMan.attack(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = dittu.defend(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                korby.consumePowers();

                atack = korby.attack(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                // Por los calculos del guion aqui ditty ya no tiene vida por lo que se muere
                System.out.println(dittu.dead());
                arena.setEventsInTheArea(korby.dead());
                arena.communicate();

                // Inicia masacre de Korby para que gane MeganMan

                atack = korby.attack(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = korby.attack(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = meganMan.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = korby.defend(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = meganMan.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = meganMan.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = meganMan.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                System.out.println(korby.dead());
                arena.setEventsInTheArea(korby.dead());
                arena.communicate();

                System.out.println("El peleador MeganMan ha ganado el combate.");
                arena.setEventsInTheArea("El peleador MeganMan ha ganado el combate.");
                arena.communicate();
                arena.isWinner("MeganMan");

                break;

            case 3:
                System.out.println("Nos transportamos al tercer escenario.");
                System.out.println(korby.fightersIntro() + "\n");
                arena.setEventsInTheArea(korby.fightersIntro());
                arena.communicate();
                System.out.println(dittu.fightersIntro() + "\n");
                arena.setEventsInTheArea(dittu.fightersIntro());
                arena.communicate();
                System.out.println(meganMan.fightersIntro() + "\n");
                arena.setEventsInTheArea(meganMan.fightersIntro());
                arena.communicate();

                meganMan.consumePowers();
                korby.consumePowers();
                dittu.consumePowers();

                cinematic = meganMan.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                cinematic = korby.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                cinematic = dittu.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                atack = korby.attack(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();
                cinematic = meganMan.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                atack = korby.attack(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();
                cinematic = meganMan.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                atack = dittu.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = meganMan.attack(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();
                cinematic = meganMan.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                atack = meganMan.attack(dittu) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                korby.consumePowers();
                cinematic = korby.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                dittu.consumePowers();
                cinematic = dittu.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                atack = dittu.attack(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();
                cinematic = meganMan.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                if (dittu.getLife() <= 0) {
                    System.out.println(dittu.dead());
                    arena.setEventsInTheArea(dittu.dead());
                    arena.communicate();
                } else {
                    atack = korby.attack(dittu) + "\n";
                    System.out.println(atack);
                    arena.setEventsInTheArea(atack);
                    arena.communicate();

                    atack = meganMan.attack(dittu) + "\n";
                    System.out.println(atack);
                    arena.setEventsInTheArea(atack);
                    arena.communicate();
                    System.out.println(dittu.dead());
                    arena.setEventsInTheArea(korby.dead());
                    arena.communicate();
                }

                atack = meganMan.defend(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();
                cinematic = meganMan.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                korby.consumePowers();
                cinematic = korby.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                atack = korby.attack(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = meganMan.defend(korby) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                meganMan.consumePowers();
                cinematic = meganMan.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                korby.consumePowers();
                cinematic = korby.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                atack = korby.attack(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = korby.defend(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                atack = korby.defend(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                korby.consumePowers();
                cinematic = korby.itemCinematic() + "\n";
                System.out.println(cinematic);
                arena.setEventsInTheArea(cinematic);
                arena.communicate();

                atack = korby.defend(meganMan) + "\n";
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();

                while (meganMan.getLife() > 0) {
                    atack = korby.attack(meganMan) + "\n";
                    System.out.println(atack);
                    arena.setEventsInTheArea(atack);
                    arena.communicate();
                }

                System.out.println(meganMan.dead());
                arena.setEventsInTheArea(meganMan.dead());
                arena.communicate();

                System.out.println("El peleador Korby ha ganado el combate.");
                arena.setEventsInTheArea("El peleador Korby ha ganado el combate.");
                arena.communicate();
                arena.isWinner("Korby");
                break;

            default:
                System.out.println("Opcion no disponible");
                break;
        }
    }

    public static int randomIntNumber(int min, int max) {
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomInt;
    }
}
