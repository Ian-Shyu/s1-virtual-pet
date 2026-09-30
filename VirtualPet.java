/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 1;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    // public void feed() {
    //     if (hunger > 10) {
    //         hunger = hunger - 10;
    //     } else {
    //         hunger = 0;
    //     }
    //     face.setMessage("Yum, thanks");
    //     face.setImage("normal");
    // }
    
    // public void exercise() {
    //     hunger = hunger + 3;
    //     face.setMessage("1, 2, 3, jump.  Whew.");
    //     face.setImage("tired");
    // }
    
    // public void sleep() {
    //     hunger = hunger + 1;
    //     face.setImage("asleep");
    // }

    // public void wonTheLottery(){
    //     face.setMessage("No way I won.");
    // }
    
    public void hungry(){
        if (hunger < 5){
            face.setImage("starving");
        }
    }

    public void feed(){
        if (hunger > 5) {
            hunger = hunger - 3;
        }
            
        face.setMessage("Yum, thanks");
        face.setImage("normal");
        hunger += 1;
    }

    public void fruit(){
        face.setMessage("I do NOT like fruits");
        face.setImage("annoyedfruit");
        hunger -= 3;
    }

    public void drink(){
        face.setMessage("I really like the drink.");
        face.setImage("ecstaticdrink");
        hunger += 2;
    }

    public void desert(){
        face.setMessage("Desert taste goooodddd.");
        face.setImage("joyful");
        hunger += 2;
    }

    public void nothing(){
        face.setMessage("I am HUNGRY");
        face.setImage("enraged");
        hunger -= 5;
    }

    public void dead(){
        face.setImage("dead");
    }

    public int hungerLevel(){
        return hunger; 
    }

// while (vp.hungerLevel > 0){
//             String ans = this.askForInput("What do you want to feed the pet?");
//             if (ans.equals("bread"))
//                 vp.feed();
//             if (ans.equals("drink"))
//                 vp.drink();
//             if (ans.equals("desert"))
//                 vp.desert();
//             if (ans.equals("nothing"))
//                 vp.nothing();
//         }
//         vp.dead();


} // end Virtual Pet
