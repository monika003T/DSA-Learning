import java.math.BigInteger;

public class square {
    public static void main(String[] args) {
        int num=2;
        System.out.println(num*num*num);
        BigInteger big= new BigInteger("893473739937397598394");
        System.out.println(squareBigInteger(big));
       
    }  public static BigInteger squareBigInteger(BigInteger num) {
        return num.multiply(num);
    }
}
