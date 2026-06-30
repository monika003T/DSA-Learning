public class sqaure {
    public static void main(String[] args) {
        for(int i=1; i<=3;i++){
            for(int j=1;  j<=3; j++){
                System.out.println("i = " + i + "," + "j= "+j);
            }
            System.out.println();
        }
        for( int i=1; i<=10;i++){
            if(i==5) continue;
            System.out.println(i);
        }
        
    }
}
