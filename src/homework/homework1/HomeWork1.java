package homework.homework1;

public class HomeWork1 {
    public static void main(String[] args) {
        // 1) Համեմատել երկու թիվ
        int x = 6;
        int y = 12;
        if (x > y) {
            System.out.println("x-մեծ է ");
        } else if (x < y) {
            System.out.println("x-փոքր է");
        } else {
            System.out.println("x և y = են");
        }

        System.out.println();

        //2) Առաջի 5 բնական թվերը
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 3) a+b գումարը
        int a = 5;
        int b = 7;
        int sum = a + b;

        {
            System.out.println("a+b = " + sum);
        }
        System.out.println();
        // 4) n-ն բազմապատկման աղյուսակ
        int n = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }








    }
}
