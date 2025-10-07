package homework.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];


    private int size = 0;

    private void extend() {
        int[] newArray = new
                int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void add(int value) {

        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    public int getByIndex(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }
        return array[index];

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    // Ավելացնում եմք նոր արժեք ըստ ինդեքսի

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println(" Չկա նման ինդեքս ");
            return;

        }
        if (size == array.length) {
            extend();

        }
        for (int i = size; i > index; i--) {

            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;

    }
    // Փոխում եմք արժեքը ըստ ինդեքսի

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println(" Չկա նման ինդեքս ");
            return;
        }

        array[index] = value;

    }
    // Ջնջում եմք ինդեքսով

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println(" Չկա նման ինդեքս ");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        array[size] = 0;

    }
    // Ստուգում ենք արժեքը

    public boolean existsa(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {

                return true;
            }
        }
        return false;

    }
    // Գտնում ենք արժեքը

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;

            }

        }
        return -1;


    }

}







