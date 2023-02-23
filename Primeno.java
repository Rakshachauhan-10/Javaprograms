import java.util.*;
public class Primeno{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        {
            for(int i = 1; i<=n; i++)
            {
                for(int j = 2; j<=i/2;j++){
                if(i%j == 0){
                    System.out.println("The number is not a prime no");
                }
                else {
                    System.out.println("The nunber is prime no");
               } 
            }
        }

    }
}
}
    

