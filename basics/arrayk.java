package basics;

    public class arrayk {
        public static void kadanes(int number[]){
            
            int maxsum=Integer.MIN_VALUE; 
            int currsum=0;
            for(int i=0; i<number.length; i++){
                currsum= currsum + number[i];
                if(currsum<0){
                    currsum=0;
                }
                maxsum=Math.max(currsum,maxsum);
            }
            System.out.println(" Maximum Subarray is "+ maxsum);
        }
        public static void main(String[] args) {
            int number[]={-2,-3,4,-1,-2,1,5,-3};
            kadanes(number);
        }
    }
    

