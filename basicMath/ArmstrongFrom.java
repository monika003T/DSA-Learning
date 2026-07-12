package basicMath;

public class ArmstrongFrom {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            if(isArmstrong(i)){
                System.out.println(i+"");
            }
        }
    }
    static boolean isArmstrong(int num){
        if(num==0) return true;
        int ori=num;
        int temp=num;
        int digitCount=(int)(Math.log10(num)+1);
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum+=(int)Math.pow(digit,digitCount);
            temp/=10;
        }
        return sum==ori;

    }
    
}
