package lesson4;

public class ArrayExample {

    public static void main(String[] args) {
        int array[] = new int[9]; //Length
        int[] array2 = new int[20];
        int[] array3 = {4, 5, 3, 8, 7};


        System.out.println(array3.length);
        System.out.println(array.length);
        System.out.println(array2.length);


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

}

