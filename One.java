import java.util.*;
public class One{
    public static void main(String[] args)
    {
    /*Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("The name of the user is" +name);
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println(sum);*/
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    /*if(age > 18)
    System.out.println("you are adult");
    else
    System.out.println("you are not a adult");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a == b){
        System.out.println("The no a is equal to b");
    }
    else if (a > b) {
            System.out.println("The no a is greater than b");
        }
        else{
            System.out.println("The no a is less than b");
        }*/
    switch(button) {
        case 1 : System.out.println("Hello");
        break;
        case 2 : System.out.println("Namste");
        break;
        default : System.out.println("Use valid button"); 
    }
    
     }
}
