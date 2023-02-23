import java.util.Scanner;
public class Switchcase{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a char:\t");
        String ch=scan.next();
        switch(ch){
            /*case"a":
            case"e":
            case"i":
            case"o":
            case"u":
            System.out.println("it is a vowel");
            break;
            default:
            System.out.println("it is not a vowel");*/
            case "a","e","i","o","u"->System.out.println("it is a vowel");
            default-> System.out.println("it is not a vowel");    
        }
    }
}