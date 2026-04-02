package geometry;

public class Point {
    public double x;
    public double y;
    private String color;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
        this.color = "black";
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "Point x="+this.x+", and Point y="+this.y;
    }

}
