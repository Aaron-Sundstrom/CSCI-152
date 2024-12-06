public class Duck extends Animal implements CanFly, CanSwim, CanWalk, CanFloat{
    
    public Duck(String name){
        super(name,"Duck");

    }
    public void stand(){
        //on business
        System.out.println("The duck begins to stand");
    }
    public void walk(){
        //this makes the duck walk
        System.out.println("Waddle Waddle");
    }
    public void swim(){
        //this makes the duck swim
        System.out.println("As graceful as a swan but smaller, the duck swims");
    }
    public void takeoff(){
        //duck go fly
        System.out.println("The duck taxi's to the runway and begins preflight procedure");
    }
    public void fly(){
        //he sure does
        System.out.println("The duck is soaring through the air!");
    }
    public void floats(){
        //look at him go
        System.out.println("The duck floats atop the water");
    }
}
