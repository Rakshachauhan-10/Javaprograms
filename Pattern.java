import java.util.*;
public class Pattern{
    public static void main(String[] args){
        /**Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();

                (1)
                 for(int i=1; i<=n; i++)
                {
                   for(int j=1; j<=m; j++){
                    System.out.print("*");
                   }
                   System.out.println("*");
                }  

                (2)
             for(int i =1; i<=4; i++) {
                for(int j=1; j<=5; j++) {
                  if(i==1 || j==1 || i==4 || j==5) {
                      System.out.print("*");
                  } 
                  else{
                    System.out.print(" ");
                  }
                }
                System.out.println();   
             } 

             (3)
             for(int i=1; i<=5; i++){
                for(int j = 1; j<=i ; j++){
             System.out.print("*");
             }
             System.out.println(" ");
            }

            (4)
            for(int i=1; i<=5; i++){
                for(int j = 1; j<=5-i ; j++){
             System.out.print(" ");
             }
             for(int j=1; j<=i; j++){
                System.out.print("*");
             }
             System.out.println(" ");
             }

             (5)
             for(int i = 1; i<=7; i++){
                for(int j = 1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
                 }

              (6)   
                for(int i = 7; i>=1; i--){
                    for(int j = 1; j<=i; j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }

               (7) 
                int number = 1; 
                for(int i = 1; i<=5; i++){
                    for(int j =1; j<=i; j++){
                        System.out.print(number+" ");
                        number++;
                    }
                    System.out.println();
                }

                (8)**/
                for(int i = 1; i<=5; i++){
                    for(int j = 1; j<=i; j++){
                        if((i+j)%2==0){
                            System.out.print("1 ");
                        }else{
                            System.out.print("0 ");
                        }
                    }System.out.println();
                }

    }
}
             

       
    
        

