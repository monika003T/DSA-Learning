 import java.util.Scanner;
public class toggle {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       StringBuilder str=new StringBuilder(sc.nextLine());
       System.out.print(tooglech(str));
       System.out.print(builtin(str));
    }
    static String tooglech(StringBuilder str){
        int n=str.length();
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65 && ascii<=95){
                ascii+=32;
            }else if(ascii>=95 && ascii<=122){
                ascii-=32;
            }
            ch=(char)ascii;
            str.setCharAt(i,ch);
        } 
        return str.toString();
    }
 static String builtin(StringBuilder str){
        int n=str.length();
        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
if(Character.isUpperCase(ch)){
    str.setCharAt(i, Character.toLowerCase(ch));
}
else{
    str.setCharAt(i, Character.toUpperCase(ch));
}
    }
    return str.toString();
}}
