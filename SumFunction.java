import java.util.Scanner;



public class SumFunction {

    public static int Sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();

        Sum(a, b);

    }
}
