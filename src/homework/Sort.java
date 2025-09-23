package homework;

public class Sort {
    public static void main(String[] args) {


        int[] array = {4, 7, 1, 3, 9, 0, 2};  //Ստեղծորմ ենք array անունով մասիվ,որտեղ կան թվեր:

        int n = array.length;     // n փոփոխականում պահում ենք մասիվի երկարությունը: Այս դեպքում n = 7-ի:
        n = 7;
        for (int i = 0; i < n - 1; i++) {  // Ամեն անգամ ամենամեծ թիվը գնում է վերջը, դրա համար բավական է ո - 1 անցում:

            for (int j = 0; j < n - 1 - i; j++) { //Սա քայլում է մասիվի մեջ և համեմատում հարևան թվերը:

                if (array[j] > array[j + 1]) {   // Ստուգում ենք արդյոք ձախ թիվը ավելի մեծ է քան աջը:

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int num : array) {
            System.out.print(num + " ");

        }


    }
}
















