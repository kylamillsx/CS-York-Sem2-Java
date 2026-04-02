package geometry;

public class Line {
    private Point start;
    private Point end;
    private String color = "black";

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Point getStart(){
        return this.start;
    }

    public Point getEnd(){
        return this.end;
    }

    public void setStart(Point start){
        this.start = start;
    }
    
    public void setEnd(Point end){
        this.end = end;
    }

    public String toString(){
        return "Line begins at" + start+ " and finishes at" +end+ "and is the color, "+color;
    }
}

