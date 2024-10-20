import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) throws Exception {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);

        switch(args[1]) {
            case "+" :
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "x" :
                System.out.println(a*b);
                break;
            case "/" :
                System.out.println(a/b);
                break;
            case "^" :
                System.out.println(Math.pow(a,b));
                break;
            case "#" :
                System.out.println("Unsipported operator");
                break;
            default :
                System.out.println("Unsupported operator");
                break;
        }
    }
}