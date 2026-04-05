public class ButterflyPattern {
    public static void main(String[] args) {
        int n=6;
        for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("*  ");
        }
        for(int j = 1; j <= (2*(n-i)); j++){
            System.out.print("   ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*  ");
        }
        System.out.println();
    }
    //outer loop -> control how many line should print
    for(int i = n; i >= 1; i--){
        //inner loop -> print 1st stars
    for(int j = 1; j <= i; j++){
        System.out.print("*  ");
    }
    for(int j =1; j <= (2*(n-i)); j++){
        System.out.print("   ");
    }
    for(int j = 1; j <=i; j++){
    System.out.print("*  ");
    }
    System.out.println();
}
}
}
