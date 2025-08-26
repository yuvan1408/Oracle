public class Methodexam {
    public static int Addition(int a, int b){
        return a + b;
    }
    public static int Subtraction(int a, int b){
        return a - b;
    
    }
    public static int Multiplication(int a, int b){
        return a * b;
    }
    public static int Division(int a, int b){
        return a / b;
    }
    public static int Modulus(int a, int b){
        return a % b;
    }
    public static void main(String[] args){
        int a = 10,b =5;
        int add = Methodexam.Addition(+a, b);
        System.out.println("add "+add);
        int sub = Methodexam.Subtraction(+a,b);
        System.out.println("sub "+sub);
        int mul = Methodexam.Multiplication(+a, b);
        System.out.println("mul "+mul);
        int div = Methodexam.Division(a, b);
        System.out.println("div "+div);
        int mod = Methodexam.Modulus(a, b);
        System.out.println("mod "+mod);

    }

}

