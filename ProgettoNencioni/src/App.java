import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player("Antonino");
        Player p2 = new Player("Ciruzzo");
        Player p3 = new Player("Giovanni");
        Player p4 = new Player("Carletto");
        p4.setPriority(10);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        
        p1.join();
        p2.join();
        p3.join();
        p4.join();

        System.out.println("---FINE DELLA GARA---");
        System.out.println(p1.persona.get(0) + " è arrivato primo");
        System.out.println(p1.persona.get(1) + " è arrivato secondo");
        System.out.println(p1.persona.get(2) + " è arrivato terzo");
        System.out.println(p1.persona.get(3) + " è arrivato quarto");
        }
}
