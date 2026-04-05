public class PalindromicNumberPyramid {
    public static void main(String[] args) {
        int n = 6;
        //outer loop -> 1 to n time 
        for(int i =1; i<=n; i++){
            // inner loop -> print space..
        for(int j =1 ; j<= n-i; j++){
        System.out.print("   ");
        }
        // inner loop --> print left side numbers 
        for( int j=i; j>=1;j--){
        System.out.print(j+"  ");
        }
        // inner loop --> print right side numbers 
        for(int j = 2; j<=i; j++){
        System.out.print(j +"  ");
        }
        System.out.println();
        }
    }
}
