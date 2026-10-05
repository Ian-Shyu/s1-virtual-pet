import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();
    
    public VPMain(){
        vp.hungry();
        this.waitABeat(1000);
        
        while (vp.hungerLevel() > 0 && vp.hungerLevel() < 10){
            String ans = this.askForInput("What do you want to feed the pet? (bread/fruit/drink/dessert/nothing) Hunger Level: " + vp.hungerLevel());
            if (ans.equals("bread"))
                vp.feed();
            else if (ans.equals("fruit"))
                vp.fruit();
            else if (ans.equals("drink"))
                vp.drink();
            else if (ans.equals("dessert"))
                vp.dessert();
            else if (ans.equals("nothing"))
                vp.nothing();
        }
        vp.dead();
    }

    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args) {
        new VPMain();    
    }
}

