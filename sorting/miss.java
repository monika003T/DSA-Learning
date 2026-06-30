package sorting;

public class miss {
    public static void main(String[] args){
        int arr[]={1,2,3,4,6,0};
        System.out.println(find(arr));
    }
    public static int find(int arr[]){
        int i=0;
        while(i<arr.length){
            
            if(arr[i] != arr[arr[i]]){
                
                int temp = arr[i];
                arr[i] = arr[arr[i]];
                arr[arr[i]] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
}

