public class Long {
    public static void main(String[] args){
        int x=500;
        double y = x*2.5;
        byte b= (byte) y;
        int result=(b>0)?b*2:b+128;
        System.out.println(result);
    }
}
