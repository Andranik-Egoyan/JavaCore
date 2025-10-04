package homework;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 7, 3, 9, 0};

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {

               int tmp = array[j];
               array[j] = array[j - 1];
               array [j -1 ] = tmp;

                }
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
   
   
    }


}
