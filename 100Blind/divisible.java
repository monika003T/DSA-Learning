import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        divisibleOrNot(number);
    }
    public static void divisibleOrNot(int num){
        if(num%5==0 && num%11==0){
            System.out.println("number is divisible by both 5 and 11");
        }else{
            System.out.println("not divisible");
        }
    }
}
