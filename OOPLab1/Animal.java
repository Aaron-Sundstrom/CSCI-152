import java.util.Random;

public class Animal {
    //Need the name, its weight and what type of animal it is
    public String Name;
    public int Weight;
    public String Type;

    public Animal(String name, String type){
        //input the name via constructor
        this.Name = name;
        this.Type = type;
        Random random = new Random();
        //randomly put in a weight between 1 and 50 lbs I guess?
        this.Weight = random.nextInt(50);
    }
    public void die(){
        System.out.println("The " + this.Type + " "+this.Name + " has been removed from the mortal plane");
    }
    //given the name of the food, this will store it and print it and add to the weight of the animal.
    public void eat( String food){
        //add to the weight (just one is fine for now)
        this.Weight ++;
        //this will print the animals name, the type it is and what it has eaten.
        System.out.println(this.Name + " the "+ this.Type +" has eaten" + food);
    }
}
