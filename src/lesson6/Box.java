package lesson6;

public class Box {

    double width; // լայնություն
    double height;  // բարձրություն
    double depth;  // խորություն

    double volume() {

        return width * height * depth;
    }
    void setDim (double w, double h, double d){
            width = w;
            height = h;
            depth = d;
    }






}
