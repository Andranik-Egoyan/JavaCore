package homework.homework1;


public class FigurePainter {
    public static void main(String[] args) {
        int n = 5;

// առաջի վարժ.

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------");

        // եկրորդ վարժ.
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------");


// երորրդ վարժ.
        for (int i = 0; i < n; i++) {
            for (int s = i; s < n - 1; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
// չորորդ վարժ.
        System.out.println("---------");

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------");
        // հինգերորդ վարժ.

        for (int i = 0; i < n; i++) {
            for (int s = i; s < n - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int s = i; s < n - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
// լրացուցիչ աշխատանք


        for (int i = 1; i <= 10; i++) {


            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();


        }


    }


}









































