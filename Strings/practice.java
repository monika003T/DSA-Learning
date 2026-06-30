public class practice {
    public static void main(String[] agrs){
        String s="xmnmkm";
        System.out.println(StringPalindrome(s));
        System.out.println(evenposition(s));
        

    }
    static boolean StringPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
static String evenposition(String str){
        String s = "";

        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0){
                s += 'a';
            } 
            else{
                s += str.charAt(i);
            }
        }

        return s;
    }

}
