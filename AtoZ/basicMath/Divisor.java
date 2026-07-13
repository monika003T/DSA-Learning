package basicMath;
import java.util.ArrayList;
public class Divisor {
    public static void main(String[] args) {
        System.out.println(DivisorsOfNumber(36));
        
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
}
