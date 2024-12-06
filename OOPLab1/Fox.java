public class Fox extends Animal implements CanWalk, CanRun {
    public Fox(String name){
        super(name, "Fox");
    }
    public void stand(){
        //as they tend to do
        System.out.println("He Fox stands up, no pun here");
    }
    public void walk(){
        //with a smugness
        System.out.println("The fox begins to walk, who knows to where");
    }
    public void run(){
        //and boy can he
        System.out.println("At least as fast as a fox can, the fox runs");
    }
}
