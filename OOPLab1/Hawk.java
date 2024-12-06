public class Hawk extends Animal implements CanFly,CanWalk{
    public Hawk(String name){
        super(name, "Hawk");
    }
    public void stand(){
        //for something at least
        System.out.println("The Hawk begins to stand");
    }
    public void walk(){
        //look at him go
        System.out.println("*HAWK NOISES*");
    }
    public void takeoff(){
        //no dont leave yet
        System.out.println("The Hawk begins to soar");
    }
    public void fly(){
        //yeah man, of course
        System.out.println("The Hawk is flying, as hawks are want to do");
    }
}
