import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        isleap(year);
    }
    public static void isleap(int year){
        boolean is_leap_year=false;
        is_leap_year= ( year%400 == 0 ) || ( year%4 == 0 && year%100 !=0 )?true:false;
        System.out.println(is_leap_year);
    }
}
