public class Hello {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}


class Friend {
    private boolean happy;
    private String name;

    public void friend(String N){
        name = N;
    }

    public void makeHappy(){
        happy = true;
    }
    public void makeSad(){
        happy = false;
    }

}
