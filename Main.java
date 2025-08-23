class Finalvariable{
    final int pin;
    Finalvariable(int pin){
        this.pin = pin;
    }
    public void displayValue(){
        System.out.println("Your pin: "+pin);
    }
}
public class Main{
    public static void main(String[] args){
        Finalvariable obj = new Finalvariable(6248);
        obj.displayValue();
    }
}