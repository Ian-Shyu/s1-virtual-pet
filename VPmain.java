import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();
    
    public VPMain(){
        vp.hungry();
        // vp.exercise();
        this.waitABeat(1000);
        // String ans = this.askForInput("Are you ready to sleep?");
        // if(ans.equals("yes"))
        //     vp.sleep();
        // else
        //     vp.exercise();
        while (vp.hungerLevel() > 0 || vp.hungerLevel() < 10){
            String ans = this.askForInput("What do you want to feed the pet?");
            if (ans.equals("bread"))
                vp.feed();
            if (ans.equals("fruit"))
                vp.fruit();
            if (ans.equals("drink"))
                vp.drink();
            if (ans.equals("desert"))
                vp.desert();
            if (ans.equals("nothing"))
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

