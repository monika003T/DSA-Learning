package basicMath;
import java.util.ArrayList;
import java.util.Collections;
public class Divisor {
    public static void main(String[] args) {
        System.out.println(DivisorsOfNumber(36));
        System.out.println(DivisorOpti(49));
        
    }
    public static ArrayList<Integer> DivisorsOfNumber(int n){
        ArrayList<Integer> List =new ArrayList<>();
        for(int i=1; i<=n;i++){
            if(n%i==0){
                List.add(i);
            }
        }
        return List;
    }
    public  static ArrayList<Integer> DivisorOpti(int n){
         ArrayList<Integer> List =new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                List.add(i);
                if(i!=n/i){
                    List.add(n/i);
                }
            }
        }
        Collections.sort(List);
        return List;
    }
}
