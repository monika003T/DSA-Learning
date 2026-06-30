import java.util.Scanner;
public class stringbuilders {
public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("Monika");
    System.out.println(sb.length());
    StringBuilder sb2= new StringBuilder();
    System.out.println(sb2.capacity());

    //function in string builder
    StringBuilder sb3= new StringBuilder("abcd");
    StringBuilder sb4= new StringBuilder("abcd");
    System.out.println(sb3.equals(sb4));
    System.out.println(sb3.reverse());
    System.out.println(sb3.delete(1,3));

    //input in string builder
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    StringBuilder sb5= new StringBuilder(s);
    System.out.println(sb5);

    //setchatAt
    StringBuilder sb6= new StringBuilder(sc.nextLine());
    sb6.setCharAt(0,'f');
    System.out.println(sb6);

    //toogle char
    StringBuilder m=new StringBuilder(sc.nextLine());
    int n=m.length();
    for(int i=0; i<n; i++){
        char ch=m.charAt(i);
        int ascii=(int)ch;
        if(ascii>=65 && ascii<=95){
            ascii+=32;
            ch=(char)ascii;
            m.setCharAt(i, ch);
        }
        else if(ascii>=95 && ascii<=122){
            ascii-=32;ch=(char)ascii;
            m.setCharAt(i, ch);
        }
        
    }
    System.out.println(m);

    //append
    StringBuilder e= new StringBuilder("abc");
    //string append
    e.append("xyz");
    System.out.println(e);
    //integer append
   e.append(34);
   System.out.println(e);
   //character append
   e.append("*&");
   //integer array append - not possible array  address will we appended in the stringbuilder
   int[] arr= {1,2,3,4,5};
   e.append(arr);

   //char[] array append
   char[] ch={'r','s','3'};
   e.append(ch);
   System.out.println(e);
   // stringbuilder append
   StringBuilder t=new StringBuilder("pow");
   e.append(t);
   System.out.println(e);

   //deletecharat

}
}
