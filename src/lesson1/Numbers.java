package lesson1;

public class Numbers {
    public static void main(String[] args) {

        // 1. [ 0 - 100 ] tpel
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------");

        // 2. [100 - 0 ] tpel

        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("----------");

        // 3. [ 0, 2, 4, 6,------100] tpel zuyg tver
        for (int i = 0; i <= 100; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        System.out.println();
        System.out.println("-----------");

        // 4. [100, 98, 96, 94-------0] tpel zuyg tver
        for (int i = 100; i >= 0; i--)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        System.out.println();
        System.out.println("------------");

        // 5. [1, 3, 5, 7 --------99] tpel kent tver
        for (int i = 1; i <= 100; i++)
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        System.out.println();
        System.out.println("------------");

        // 6. [99, 97, 95, 93----------0] tpel kent tver
        for (int i = 100; i >= 0; i--)
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        System.out.println();
        System.out.println("-------------");

        // tpel bazmapatkman axusyak
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("----------");
        }




        /*


         *            0  1
         * *          1  2
         * * *        2  3
         * * * *      3  4
         * * * * *    4  5

         */
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------");
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (height - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------");

        /*
         * * * * *
           * * * *
             * * *
               * *
                 *
         */
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < height - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------");

        /*

                 *   0 4
               * *   1 3
             * * *   2 2
           * * * *   3 1
         * * * * *   4 0
         */
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (height - i - 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("-----------");

        // tpel burk
        for (int i = height - 1; i > -height; i--) {
            int k = i;
            if (i < 0) {
                k = -i;

            }
            for (int j = 0; j < k; j++) {
                System.out.print("  ");


            }


            for (int j = 0; j < ((height - k) * 2 - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------");



       // tpel qarakusi
            for (int j = 0; j < height; j++) {
                for (int l = 0; l < height; l++) {
                    System.out.print("*  ");
                }

                System.out.println();


            }







        }

    }
    
    












































