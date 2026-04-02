package tools;

public class BasicTallyCounter implements ITallyCounter {
    protected int counter;//attribute 
    private int digits;
    public BasicTallyCounter(){//constructor
        this.digits = 3; //default is 3 digits
        this.counter = 0;//initialise counter to 0
    }
    public BasicTallyCounter(int digit){
        this.digits = digit;
        this.counter = 0;
    }
    public String toString(){
        String counterString = Integer.toString(this.counter);
        int size = counterString.length();
        int zerosNeeded = this.digits - size;
        String answer = "";
        for (int i = 0; i<zerosNeeded;i++){
            answer = answer + "0";
        }
        answer += counterString;
        return answer;

    }
    public void increment() throws InvalidOperationException{
        if (this.counter == Math.pow(10,digits)-1){
            throw new InvalidOperationException();
        }
        else{
            this.counter+= 1;
        }
    }
    public int read(){
        return this.counter;
    }
    public void reset(){
        this.counter = 0;
    }
}
