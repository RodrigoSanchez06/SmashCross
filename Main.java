import java.util.Random;
import escenario.*;
import fighters.*;

public class Main{
    public static void main(String[] args) {
        
        System.out.println("********** Bienvenido a Smash Cross **********\n");
        System.out.println("Generando Arena...");
        Arena arena = new Arena();
        int id = 0;
        Viewer firstViewer = new Viewer(id++, "Dittu", arena, "Rogerxdgta");
        arena.register(firstViewer);
        Viewer secondViewer =  new Viewer(id++, "MeganMan", arena, "Heinz");
        arena.register(secondViewer);
        Viewer thirdViewer = new Viewer(id++, "Korby", arena, "Chao");
        arena.register(thirdViewer);
        Viewer fourthViewer = new  Viewer(id++, "Dittu", arena, "Vegetta777");
        arena.register(fourthViewer);

        int scenery = randomCase();
        Fighter korby = new Korby();
        Fighter dittu = new Dittu();
        Fighter meganMan = new  MeganMan(); 
        
        switch (scenery) {
            case 1:
                
                break;
            
            case 2:

                break;

            case 3:

                break;
            
            default:
                break;
        }
    }
    public static int randomCase(){
        Random random = new Random();
        return random.nextInt(3 + 1) + 1;
    }
}