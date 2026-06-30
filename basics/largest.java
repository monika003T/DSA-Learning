package basics;
public class largest {
    public static int  largestarray(int number[]){
        int largest= Integer.MIN_VALUE;
        
        for(int i= 0; i<number.length;i++){
            if(largest<number[i]){
              largest=number[i];
            }
        
            }
        
        return largest;    
     
    }   

    
    public static void main(String args[]) {
        int number[]={2,5,9,4,1,0};
        System.out.println("largest is : "+ largestarray(number));
    }
}                 