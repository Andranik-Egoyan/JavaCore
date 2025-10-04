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

}

