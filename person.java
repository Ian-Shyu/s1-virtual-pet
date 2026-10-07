public class person {
    public double height;

    public person(double height){
        this.height = height;
    }

    public boolean equals(person other){
        return this.height == other.height;  
    }
}
