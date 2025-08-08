 package Restaraunt;
public class Restaraunt {
    String dish;
    String desart;
    int rate;
    public Restaraunt(){
        dish = "Unknown";
        desart = "Unknown";
        rate = 0;
    }
    public Restaraunt(String dish,String desart,int rate){
        this.dish = dish;
        this.desart = desart;
        this.rate = rate;
    }public void display(){
        System.out.println("Dish name: "+dish);
        System.out.println("Desart: "+desart);
        System.out.println("Rate: "+rate);
    }

   
}
