 class Meal {
    static int totalmeals = 0;
    Meal() {
        totalmeals++;
    }
    
}
public class main{
    public static void main(String[] args){
        Meal meal1 = new Meal();
        Meal meal2 = new Meal();
        System.out.println(Meal.totalmeals);
    }
}