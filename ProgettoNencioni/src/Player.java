import java.util.ArrayList;
public class Player extends Thread {
    private String corridore;
    static ArrayList<String> persona = new ArrayList<>();

    public Player(String corridore) {
        this.corridore = corridore;
    }

    public String getCorridore() {
        return this.corridore;
    }

    public void setCorridore(String corridore) {
        this.corridore = corridore;
    }

    @Override
    public void run() {
        for(int i=0; i<101; i++){
            System.out.println(corridore + ": "+ i + " metri");
        }
        System.out.println(corridore + " E' arrivato");
        persona.add(corridore);
    }
}
