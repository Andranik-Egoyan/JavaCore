package lesson6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setDim(10, 20, 15);

        double vol = myBox.volume();
        System.out.println(vol * 2);
        myBox.setDim(20, 30, 40);
        System.out.println(myBox.volume());



    }


}
