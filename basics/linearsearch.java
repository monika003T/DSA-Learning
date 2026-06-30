package basics;

public class linearsearch{
    public static int linear(int number[] ,int key){
    for(int i=0; i<number.length;i++){
        if(number[i]==key){
            return i;
        }
    }return -1;
 }
 public static void main(String[] args) {
    int number[]={2,5,8,1,0};
    int key=5;
    int index=linear(number,key);
    if(index==-1){
        System.out.println("Key not found");

    }
    else{
        System.out.println("key is at index:"+index);
    }
 }
}
