import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first value:\t");
        int a=scan.nextInt();
        System.out.println("Enter the second value:\t");
        int b=scan.nextInt();
        System.out.println("Enter your choice from +,-,*,/");
        int c;
        String ch=scan.next();
        switch(ch){
            case"+":
            c=a+b;
            System.out.println("the sun of the number is:"+c);
            break;
            case"-":
            c=a-b;
            System.out.println("the sub of the number is:"+c);
            break;
            case"*":
            c=a*b;
            System.out.println("the mul of the number is:"+c);
            break;
            case"/":
            c= a/b;
            System.out.println("the division of the number is:"+c);
            break;
            default:
            System.out.println("Enter choice is wrong");
              
        }
    }
}
    

