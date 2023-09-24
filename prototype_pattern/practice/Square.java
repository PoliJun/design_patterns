package prototype_pattern.practice;

/**
 * Square
 */
public class Square extends Shape{
    public Square(){
        type = "Square";

    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}