package homework.homework1;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8,};

        // 1
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //2

        System.out.println(numbers[0]);

        //3

        System.out.println(numbers[numbers.length - 1]);


        //4


        System.out.println(numbers.length);

        //5

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > min) {
                min = numbers[i];
            }
        }
        System.out.println(min);


        //6
        {
            System.out.println(numbers[numbers.length / 2]);
            {

                //7

                int even = 0;
                for (int i = 0; i < numbers.length; i++) {

                    if (numbers[i] % 2 == 0) {
                        even++;
                    }
                }
                System.out.println(even);

                //8

                int odd = 0;
                for (int i = 0; i < numbers.length; i++) {

                    if (numbers[i] % 2 != 0) {

                        odd++;

                    }

                }

                System.out.println(odd);

                //9

                int sum = 0;
                for (int i = 0; i < numbers.length; i++) {


                    sum = sum + numbers[i];
                }
                System.out.println(sum);

                //10

                int sum2 = 0;
                for (int i = 0; i < numbers.length; i++) {


                    sum2 = sum2 + numbers[i];
                }
                double average = (double) sum2 / numbers.length;

                System.out.println(average);

            }

        }

    }


}














