package homework;

public class ArrayHomework {
    public static void main(String[] args) {

        // հաշվել փոփոխակաների քանակը
        int[] numbers = {3, 6, 1, 6, 9, 2, 6, 4, 5, 7};
        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }

        }
        System.out.println("քանակը = " + count);


        // թվերը դասավորել թարս
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("թարս մասիվը = ");

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");

        }
        System.out.println();


        // հաշվել կրկնվող թվերը
        int krknvox = 0;

        for (int i = 0; i < numbers.length; i = i + 1) {
            int s = 0;
            for (int j = 0; j < numbers.length; j = j + 1) {
                if (numbers[i] == numbers[j]) {
                    s = s + 1;
                }
            }
            if (s > 1) {
                boolean arden = true;

                for (int k = 0; k < i; k = k + 1) {
                    if (numbers[k] == numbers[i]) {
                        arden = false;
                    }
                }
                if (arden == false) {
                    krknvox = krknvox + 1;
                }
            }

        }
        System.out.println(" կրկնվող թվերի քանակը =  " + krknvox);


        // հաշվել ձայնավորների քանակը
        char[] lettrs = {'ա', 'բ', 'գ', 'ե', 'զ', 'ո', 'լ', 'մ', 'ն', 'օ', 'պ', 'ր', 'ի'};
        int cout4 = 0;
        for (int i = 0; i < lettrs.length; i++) {
            if (lettrs[i] == 'ա' ||
                    lettrs[i] == 'ը' ||
                    lettrs[i] == 'ի' ||
                    lettrs[i] == 'ո' ||
                    lettrs[i] == 'ե' ||
                    lettrs[i] == 'օ') {
                cout4++;



            }
        }
        System.out.println("4 )Ձայնավորների քանակը = " + cout4);



    }
}