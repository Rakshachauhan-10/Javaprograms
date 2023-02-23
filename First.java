class First
{
     int a,b; //instance variable
     static int s;//static variable
    //instance method
      void display()
     {System.out.println("a="+a);
      System.out.println("b="+b'
);
     }
        
} 
class Demo
{
     public static void main(String args[])
     {
         First f1=new First();
         f1.display();
     }
}
   