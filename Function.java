import java.util.*;
public class Function {
    /** Make a Function to add two numbers and return the sum 
      
      public static int calculateSum(int a , int b ){
        int sum=a+b;
        System.out.println("your sum of 2 number is " + sum);
        
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        int a = sc.nextInt();
        System.out.println("Enter your 2nd number");
        int b= sc.nextInt();

        int sum = calculateSum(a,b);
}**/

    /**Make a Function to multiply two numbers and return the product 

public static int calculateProduct(int a , int b ){
    return a*b ;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your 1st number");
    int a = sc.nextInt();
    System.out.println("Enter your 2nd number");
    int b= sc.nextInt();

    System.out.println("the product of two number is "+calculateProduct(a,b));

}**/

/**FIND THE FACTORIAL OF THE NUMBER
public static void factorial(int n){
    if(n<0){
        System.out.println("invalid number");
    }else{
    int factorial = 1;
    for(int i=n; i>=1; i--){
        factorial= factorial*i;
    }
     System.out.println("the factorial of the given number is "+ factorial);
}   
}
      public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find the factorial");
    int n = sc.nextInt();

    factorial(n);
}**/




/**ENTER 3 NUMBER FORM THE USER AND MAKE A FUNCTION TO PRINT THEIR AVERAGE
public static int average(int a , int b, int c){
    int avg = (a+b+c)/3;
    System.out.println("The Average of 3 number is "+avg);
    return avg ;

}
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st nubmer");
    int a = sc.nextInt();
    System.out.println("Enter the 2nd number");
    int b = sc.nextInt();
    System.out.println("Enter the 3rd number");
    int c = sc.nextInt();
    average(a, b, c);
}
  WRITE A FUNCTION TO SUM OF ALL ODD NUMBERS FORM 1 TO N
public static int oddSum(int n ){
    int sum = 0;
    for (int i=1 ; i<=n; i++){
        if( i%2 !=0){
            sum=sum+i;
        }
        System.out.println("The sum of the odd number is "+sum);
        
    }
    return sum; 
}
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    oddSum(n);

}**/
   


}

