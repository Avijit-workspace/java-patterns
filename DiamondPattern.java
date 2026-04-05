public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;

        //outer loop --> print number of line
        for(int i = 1; i <= n; i++ ){

            //inner loop -> print spaces
        for(int j = 1; j <= n-i; j++){
            System.out.print("   ");
        }
        //inner loop --> print pattern
        for(int j = 1; j <=((2*i)-1); j++){
            System.out.print("*  ");
        }
        System.out.println();
        }
// 2nd half ...
           //outer loop --> print number of line
        for(int i = n; i >= 1; i-- ){

            //inner loop -> print spaces
        for(int j = 1; j <= n-i; j++){
            System.out.print("   ");
        }
        //inner loop --> print pattern
        for(int j = 1; j <=((2*i)-1); j++){
            System.out.print("*  ");
        }
        System.out.println();
        }
    }
}
