package sof2week03softwarelab;

public class Vector {
    public static void main(String[] args) {
        double[] data = {1.0,2.0,3.0};
        Vector vector1 = new Vector(data);
        Vector vector2 = new Vector(data);
        System.out.println(vector1);
        System.out.println(vector2.toString());
    }
    public double[] vector;//when was private all tests couldnt compile
    //constructor
    public Vector(double[] arr){
        vector = new double[arr.length];
        for (int i=0; i<arr.length;i++){
            vector[i] = arr[i];
        }
    }
    //converts double array to a string
    public String toString(){
        String result = "[";
        for (int i = 0;i<vector.length;i++){
            result += vector[i];
            if (i<vector.length-1){
                result+= ", ";
            }
        }
        result += "]";
        return result;
    }
    //returns dimension of vector
    public int size(){
        return vector.length;
    }
    //accessor 
    public Double get(int index){
        return vector[index];
    }
    //mutator
    public Double set(int index, double value){
        Double prev =  vector[index];
        vector[index] = value;
        return prev;
    }
    //scalar product 
    public Vector scalarProduct(double scalar){
        double[] result = new double[vector.length];
        for (int i=0;i<vector.length;i++){
            result[i] = vector[i]*scalar;
        }
        return new Vector(result);
    }
    //scalar addition
    public Vector add(Vector other){
        if (vector.length != other.vector.length){
            return null;
        }
        double[] answer = new double[vector.length];
        for (int i = 0;i<vector.length;i++){
            answer[i] = vector[i] + other.vector[i];
        }
        return new Vector(answer);//returns new vector instance
    }

    public boolean equals(Object other){
        if (this == other){ //reflexive
            return true;
        }
        if (other == null){ //null
            return false;
        }
        if (!(other instanceof Vector)){
            return false;
        }
        //casting
        Vector oth = (Vector) other;

        if (this.vector.length != oth.vector.length){//compare dimensions
            return false;
        }
        for (int i = 0; i<vector.length;i++){//same elements check
            if (this.vector[i]!=oth.vector[i]){
                return false;
            }
        }
        return true; //if passed all tests above

    }

    
}
