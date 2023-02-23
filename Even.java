import java.util.*;
public class Even{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter your number "+n);
        for(int i=0 ; i<=n ; i++ )
        {
            if(i%2==0){
                System.out.println(i);
                System.out.println("the even numbers are");
            }
        }
    }
}
