package geometry;

public class Circle extends Shape {
    public double radius;
    //three constructors
    public Circle(){
        super();//calls shape default constructor to initlaise inherited fields
        this.radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);//calls shape constructor to initialise inherited fields
        this.radius = radius;
    }

    //getter for instance variable radius
    public double getRadius(){
        return this.radius;
    }
    //setter for instance variable radius 
    public void setRadius(double radius){
        this.radius = radius;
    }

    //get area method
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    //get perimeter method
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius=" + this.radius+ " which is a subclass of" + super.toString();
    }//returns output of toString() method from superclass alongside extra from this class.

}
