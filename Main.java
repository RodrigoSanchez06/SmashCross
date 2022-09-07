import fighters.*;
import stage.*;

public class Main{
    public static void main(String[] args) {
        
        System.out.println("********** Bienvenido a Smash Cross **********\n");
        System.out.println("Generando Arena...\n");
        Arena arena = new Arena();
        int id = 0;
        Viewer firstViewer = new Viewer(++id, "Dittu", arena, "Rogerxdgta");
        arena.register(firstViewer);
        Viewer secondViewer =  new Viewer(++id, "MeganMan", arena, "Heinz");
        arena.register(secondViewer);
        Viewer thirdViewer = new Viewer(++id, "Korby", arena, "Chao");
        arena.register(thirdViewer);
        Viewer fourthViewer = new  Viewer(++id, "Dittu", arena, "Vegetta777");
        arena.register(fourthViewer);

        int scenery = randomIntNumber(1,1);
        Fighter korby = new Korby();
        Fighter dittu = new Dittu();
        Fighter meganMan = new  MeganMan(); 

        System.out.println(scenery);
        
        switch (scenery) {
            case 1:
                System.out.println("Nos transportamos a pueblo Caleta.");
                System.out.println(korby.fightersIntro() + "\n");
                arena.setEventsInTheArea(korby.fightersIntro());
                arena.communicate();
                System.out.println(dittu.fightersIntro() + "\n");
                arena.setEventsInTheArea(dittu.fightersIntro());
                arena.communicate();
                System.out.println(meganMan.fightersIntro() + "\n");
                arena.setEventsInTheArea(meganMan.fightersIntro());
                arena.communicate();

                String atack = korby.attack(meganMan);
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();
                
                korby.attack(meganMan);
                System.out.println(atack);
                arena.setEventsInTheArea(atack);
                arena.communicate();
                break;
            
            case 2:
                System.out.println("Nos transportamos otro escenario.");
                System.out.println(korby.fightersIntro() + "\n");
                arena.setEventsInTheArea(korby.fightersIntro());
                arena.communicate();
                System.out.println(dittu.fightersIntro() + "\n");
                arena.setEventsInTheArea(dittu.fightersIntro());
                arena.communicate();
                System.out.println(meganMan.fightersIntro() + "\n");
                arena.setEventsInTheArea(meganMan.fightersIntro());
                arena.communicate();
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
                break;
            
            default:
                System.out.println("Opcion no disponible");
                break;
        }
    }
    public static int randomIntNumber(int min, int max){
        int randomInt= (int)Math.floor(Math.random()*(max-min+1)+min);
        return randomInt;
    }
}
