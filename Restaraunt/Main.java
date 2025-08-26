package Restaraunt;
public class Main{
        public static void main(String[] args){
            Restaraunt myrestaraunt = new Restaraunt();
            System.out.println("menu receipt");
            myrestaraunt.display();
             Restaraunt mydish = new Restaraunt("Fried rice"," Ice cream", 150);
             System.out.println("please take it!");
             mydish.display();

            
        }
    }