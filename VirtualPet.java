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
    
    public void hungry(){
        if (hunger < 5){
            face.setImage("starving");
        }
    }

    public void bread(){
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
        hunger -= 1;
    }

    public void drink(){
        face.setMessage("I really like the drink.");
        face.setImage("ecstaticdrink");
        hunger += 2;
    }

    public void dessert(){
        face.setMessage("Desert taste goooodddd.");
        face.setImage("joyful");
        hunger += 2;
    }

    public void nothing(){
        face.setMessage("I am HUNGRY");
        face.setImage("enraged");
        hunger -= 3;
    }

    public void dead(){
        face.setImage("dead");
    }

    public int hungerLevel(){
        return hunger; 
    }
 

} 
