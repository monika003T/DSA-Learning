public class areaCircle {
    public static void main(String[] args) {
        System.out.println(areaOfCircle(6));
        System.out.println(CircumstenceOfCircle(4));
    }
    public static double areaOfCircle(int r){
        double pi=3.14;
         return (pi*r*r);
    }
    public static double CircumstenceOfCircle(int r){
        double pi=3.14;
        return 2*pi*r;
    }
}
