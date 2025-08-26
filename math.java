public class math {
    public static void main(String[] args){
      try{ 

        int a = 10;
        int b = 0;
        System.out.println(a/b);
      }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error: division by zero ");
      }


    }
}
