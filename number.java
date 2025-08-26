public class number {
    public static void main(String[] argrs){
        int num = 2;
        while(num<=10){
            if(num == 6){
                System.out.println("incre");
                break;
            }
            System.out.println("Count: "+num);
            num += 2;
        }
    }
}
