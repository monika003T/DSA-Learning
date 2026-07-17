package Arrays.level1;

import java.util.HashMap;

//find a number that appered once and the other number twice 
public class findNumber {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,3,2,1,6,6,7,7};
        System.out.println(appeareOnce(nums));
        System.out.println(better(nums));
    }
    public static int appeareOnce(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            int num=nums[i];
            for(int j=0; j<n;j++){
                if(nums[j]==num)
                    count++;
                
            }if(count==1) return num;

        } return -1;
    }
    public static int better(int[] nums){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1) return key;
        }
        return-1;
    }
}
