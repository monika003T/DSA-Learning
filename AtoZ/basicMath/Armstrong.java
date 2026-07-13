package basicMath;
public class Armstrong{
    public static void main(String[] args) {
        int num=10;
        System.out.println(ArmstrongOfaNumber(num));
        
    }
    static boolean ArmstrongOfaNumber(int num){
        int ori=num;
        int temp=num;
        int digitCount=0;
        while(temp>0){
            digitCount++;
            temp/=10;
        }
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=(int)Math.pow(digit, digitCount);
            num/=10;
        }
        if(ori==sum) return true;
        else{
            return false;
        }

    }
}