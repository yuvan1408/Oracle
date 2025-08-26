public class Nested {
    public static void main(String[] args){
        int result = 35;
        boolean pass = true;
        if(result<50){
            System.out.println("You are passed");
            if(pass){
                System.out.println("you selected the higher studies");
            }else{
                System.out.println("try next time");
            }
        }else{
            System.out.println("Failed");
        }
    }
    
}
