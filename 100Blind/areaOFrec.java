public class areaOFrec {
    public static void main(String[] args) {
        System.out.println(areaOfRectangle(6,3 ));
        System.out.println(perimeterOfRectangle(2,4));
    }
    public static int areaOfRectangle(int l,int b){
        return l*b;
    }
    public static int perimeterOfRectangle(int l,int b){
        return 2*(l+b);
    }

}
