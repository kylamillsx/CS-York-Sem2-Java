package tools;

public class TallyCounter {
    private int counter;//attribute 
    public TallyCounter(){//constructor
        this.counter = 0;//initialise counter to 0
    }
    public String toString(){
        String counterString = Integer.toString(this.counter);
        int size = counterString.length();
        String answer = "";
        if (size == 1){
            answer = "00"+counterString;
        }
        else if (size == 2){
            answer = "0"+counterString;
        }
        else{
            answer = counterString;
        }
        return answer;

    }
    public void increment() throws InvalidOperationException{
        if (this.counter == 999){
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
