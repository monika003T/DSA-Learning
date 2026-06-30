public class greaterthree {
    public static void main(String[] args) {
        int a=9;
        int b=10;
        int c=-1;
        if(a>b && a>c){
            System.out.println("A is Greater then all the other numbers");
        }else if(b>a && b>c){
            System.out.println("B is Greater then A AND C");
        }else{
            System.out.println("C is Greatest");
        }
    }
}
