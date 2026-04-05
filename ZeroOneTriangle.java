public class ZeroOneTriangle {
    public static void main(String[] args) {
        //outer loop -> how many lines should print..
        for(int i = 1; i <= 5; i++){
            //inner loop -> how many number print in a row..
            for(int j = 1; j <= i; j++){
                //condition -> values of (i+j) is odd or even ..
                if((i + j) % 2 == 0){
                    System.out.print(1 +" ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
