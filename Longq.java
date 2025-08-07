public class Longq{
    public static void main(String[] args){
       int a=3,b=4,c=5;
       int res = a+b<<c/a&b;
       if(res>20){
         System.out.println("greater");
       }else if(res>10){
         System.out.println("med");
       }else{
         System.out.println("small");
       }
       }
    }
