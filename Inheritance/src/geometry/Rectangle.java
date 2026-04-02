package geometry;

public class Rectangle extends Shape{
    public double width,length;
    //three constructors
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //getter for instance variable width
    public double getWidth(){
        return this.width;
    }
    //setter for instance variable width
    public void setWidth(double width){
        this.width = width;
    }
    //getter for instance variable length
    public double getLength(){
        return this.length;
    }
    //setter for instance variable length
    public void setLength(double length){
        this.length = length;
    }

    //method to get area of rectangle
    public double getArea(){
        return this.length * this.width;
    }
    //method to return perimeter of rectangle
    public double getPerimeter(){
        return (this.length*2) + (this.width*2);
    }

    @Override
    public String toString(){
        return "A Rectangle with width= "+this.width+" and length= "+this.length+", which is a subclass of "+ super.toString();
    }

}
