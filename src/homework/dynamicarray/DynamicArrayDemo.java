package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray dy = new
                DynamicArray();


        dy.add(5);
        dy.add(20);
        dy.add(30);
        dy.add(1, 15);  // Ավելացնորմ ենք 15-ը index  = 1-ում

        System.out.println(" Զանգվածի պարունակությունը");
        dy.print();


        System.out.println("Ինդեքս 0 արժեքը -> " + dy.getByIndex(0));

        System.out.println("Ինդեքս 2 արժեքը -> " + dy.getByIndex(2));

        System.out.println(" Ինդեքս 5 արժեքը -> " + dy.getByIndex(5));

        System.out.println();

        System.out.println(dy.existsa(20));

        System.out.println(dy.getIndexByValue(30));



    }


}



































