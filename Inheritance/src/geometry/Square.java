package geometry;

public class Square extends Rectangle {
    //three constructors
    public Square(){
        super();//calls rect no-arg constructor 
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        //tells rectangle to set width = side and length = side
        //color and filled are passed up inheritence chain
    }

    //getter for instance variable side
    public double getSide(){
        return getWidth();//only needs to return width or length from rectangle
    }
    //setter for the instance variable side
    public void setSide(double side){
        setWidth(side);
        setLength(side);//same value as its a square
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
        //must do both to ensure length = width, maintains square geometry
        //super calls rectangles og setters
    }

    @Override
    public String toString(){
        return "A Square with side=" +getWidth()+", which is a subclass of"+super.toString();
    }

}
