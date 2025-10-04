package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray da = new
                DynamicArray();


        da.add(5);
        da.add(10);
        da.add(15);


        System.out.println(" Զանգվածի պարունակությունը");
        da.print();


        System.out.println("Ինդեքս 0 արժեքը -> " + da.getByIndex(0));

        System.out.println("Ինդեքս 2 արժեքը -> " + da.getByIndex(2));

        System.out.println(" Ինդեքս 5 արժեքը -> " + da.getByIndex(5));


    }

}



































