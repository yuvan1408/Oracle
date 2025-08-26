public class Nestedoperator {
    public static void main(String[] args){
        int a=10,b=20,c=25;
        int result = (a>b)?((a>c) ?a:b) : ((b>c)?b:c);
        System.out.println("Max value: "+result);
    }
    
}
