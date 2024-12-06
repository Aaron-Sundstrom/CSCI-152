import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> AnimalList = new ArrayList<>();

        AnimalList.add(new Duck("Scrooge"));
        AnimalList.add(new Fox("Quick Brown"));
        AnimalList.add(new Sardine("Ishmael"));
        AnimalList.add(new Hawk("Preston"));


        //Flood
        System.out.println("There is a great big flood, bummer");
        for(Animal animal : AnimalList){
            if (animal instanceof CanSwim){
                ((CanSwim)animal).swim();
            }
            else{
                animal.die();
            }
        }
        System.out.println();

        //Meteor strike
        System.out.println("The sky is falling, AND its a Monday");
        for (Animal animal: AnimalList){
            if (animal instanceof CanRun){
                ((CanRun)animal).run();
            }
            else{
                animal.die();
            }
        }
        System.out.println();

        //Flash flood (trying to get flying animals to live)
        System.out.println("A smaller more localized flood that sweeps through quickly");
        for (Animal animal: AnimalList){
            if (animal instanceof CanFly){
                ((CanFly)animal).takeoff();
                ((CanFly)animal).fly();
            }
            else{
                animal.die();
            }
        }
    }

}
