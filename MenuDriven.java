import java.util.Scanner;

public class MenuDriven {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        do{
            int marks = sc.nextInt();
            if(marks >=90 && marks <=100){
                System.out.println("This is Good");
            }else if (marks>=60 && marks<=89){
                System.out.println("This is also Good");
            }else if(marks>=0 && marks<=59){
                System.out.println("This is Good as well");
            }else {
                System.out.println("Invalid");
            }
            System.out.println("Want to continue ? (y(1) or n(0))");
          
            n = sc.nextInt();
        }
       while (n==1);
   }
    
}
