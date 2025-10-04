package lesson7;

// Ցույց տալ մեթոդի գերբեռնվածությունը

public class OverLoadDemo {
    void test() {
        System.out.println("Պարամետրեր չկան");
    }

    void test(int a) {
        System.out.println("a: " + a);

    }

    void test(int a, int b) {
        System.out.println("a & b: " + a + " " + b);

    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;


    }


}

class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Rezultat vizovza ob.test(123.25) : " + result);
    }
}




