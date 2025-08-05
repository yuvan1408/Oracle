public class Logicaloperator{
    public static void main(String[] args){
        int a=20,b=30;
        if (a<15 && b>25){
            System.out.println("AND :True");
        }else{
            System.out.println("AND :False");
        }
        if (a<15 || b>25){
                System.out.println("NOT :True");
        }else{
            System.out.println("NOT :False");

        } boolean isgreater =(a>b);
        if (!isgreater){
            System.out.println("OR :True");
        }else{
            System.out.println("OR :False");

        }
    }
}