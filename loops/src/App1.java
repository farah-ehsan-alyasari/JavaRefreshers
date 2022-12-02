public class App1 {
    public static void main(String[] args) {
        for(int i = 1; i<=12; i++){
            System.out.println();
            for(int j=1; j<=12; j++){
                System.out.print("  " + i*j);
                if(i*j >= 10 && i*j <=99){
                    System.out.print(" ");
                }
                if(i*j <10){
                    System.out.print("  ");
                }
            }
        }
    }
}
