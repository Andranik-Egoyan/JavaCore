package lesson7;

public class Trst {
    int a, b;

    Trst(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Trst o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

}
class PassOb{
    public static void main(String[] args) {
        Trst ob1 = new Trst(100,22);
        Trst ob2 = new Trst(100,22);
        Trst ob3 = new Trst(-1,-1);
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));



    }
}