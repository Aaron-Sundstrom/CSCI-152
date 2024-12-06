public class Sardine extends Animal implements CanSwim, CanFloat{
    public Sardine(String name){
        super(name, "Sardine");
    }
    public void swim(){
        //like a fish
        System.out.println("The Sardine swims without a care in the world");
    }
    public void floats(){
        //uncomfortably
        System.out.println("Depending on your definition of floats, he kinda can");
    }
}
