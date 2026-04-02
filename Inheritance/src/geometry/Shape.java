package geometry;

//import java.security.PublicKey;

public class Shape {
    public String color;
    public boolean filled; //usually private but for gradescope leave public

    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    //getter for color
    public String getColor(){
        return this.color;
    }
    //setter for color
    public void setColor(String color){
        this.color = color;
    }
    //setter for filled
    public void setFilled( boolean filled){
        this.filled = filled;
    }
    //getter for filled
    public boolean isFilled(){
        return this.filled;
    }
    
    public String toString(){
        if (this.filled == false){
            return "A shape with color of "+this.color+" and not filled.";
        }
        else{
            return "A shape with color of "+this.color+" and filled.";
        }
    }

}
