class Circle {
    public void draw() {
        System.out.println("a circle drawn");
    }
}

class Rectangle {
    public void draw() {
        System.out.println("a rectangle drawn");
    }
}

class Square {
    public void draw() {
        System.out.println("a square drawn");
    }

    public void getArea() {
        int s = 20;
        int area_square = s * s;
        System.out.println("Area of the square=" + area_square);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Creating Object of Circle class
        Circle c = new Circle();
        c.draw();

        // Creating Object of Rectangle class
        Rectangle r = new Rectangle();
        r.draw();

        // Creating Object of Square class
        Square s = new Square();
        s.draw();

    }
}
