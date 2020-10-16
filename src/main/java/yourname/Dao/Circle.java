package yourname.Dao;

class Circle extends Shape {
    double radius;

    public static void main(String[] args) {
        Circle circle = new Circle("purple", 3.14);

        System.out.println(circle.area());
        //test

    }
    public Circle(String color,double radius) {

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }


    @Override
    public String toString() {
        return null;
    }

}