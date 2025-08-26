package Hotel;


public class Main {
    public static void main(String[] args){
        Hotel myhotel = new Hotel();
        System.out.println("HOTEL1 DETAILS: ");
        myhotel.display();
        Hotel myhotel2 = new Hotel("Thondu","Raghul",19);
        System.out.println("RS!");
        myhotel2.display();
        Hotel myHotel3 = new Hotel("white","lia",60);
        System.out.println("Mei!");
        myHotel3.display();
    }
}
