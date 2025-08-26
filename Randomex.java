import java.util.Random;
public  class Randomex {
    public static void main(String[] args){
        Random rand = new Random();
        int randInt = rand.nextInt();
        System.out.println("Random Integer: "+randInt);
        int randIntRange = rand.nextInt(100);
        System.out.println("Random Integer between 0 to 99: "+randIntRange);
    }
    
}
