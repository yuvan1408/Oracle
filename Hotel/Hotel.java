package Hotel;
public class Hotel {
    String hotelname;
    String owner;
    int year;
    public Hotel(){
        hotelname = "unknown";
        owner = "unknown";
        year = 0;
    }
    public Hotel(String hotelname, String owner,int year){
        this.hotelname = hotelname;
        this.owner = owner;
        this.year = year;
    }
    public void display(){
        System.out.println("hotel1: "+hotelname);
        System.out.println("hotel2: "+owner);
        System.out.println("hotel3: "+year);
    }
}
