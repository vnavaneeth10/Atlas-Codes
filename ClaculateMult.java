import java.util.Scanner;

public class ClaculateMult {

    public static int CalcMul(int a, int b){
        int result = a * b;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = CalcMul(a, b);
        
        System.out.println("Product of the given numbers is:"+ result);
        
    }

    
}
