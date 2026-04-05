public class HollowButterfly{
    public static void main(String[] args){
        int n = 5; // Size of half the butterfly

        // ---------------- TOP HALF ----------------
        for (int i = 1; i <= n; i++) {
            
            // 1. Print Left Wing
            for (int j = 1; j <= i; j++) {
                // Print '*' only at the first or last position
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 2. Print Middle Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // 3. Print Right Wing
            for (int j = 1; j <= i; j++) {
                // Print '*' only at the first or last position
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } // Move to the next line after finishing the row
            
            System.out.println();
        }
        //---------------------------2nd half------------------------------------------
        for(int i = n; i>=1; i--){
            // 1. Print Left Wing
            for (int j = 1; j <= i; j++) {
                // Print '*' only at the first or last position
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // 2. Print Middle Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // 3. Print Right Wing
            for (int j = 1; j <= i; j++) {
                // Print '*' only at the first or last position
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } // Move to the next line after finishing the row
            
            System.out.println();
        }
        }
    }
