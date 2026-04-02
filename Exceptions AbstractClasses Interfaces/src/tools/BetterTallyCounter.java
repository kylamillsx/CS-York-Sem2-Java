package tools;

public class BetterTallyCounter extends BasicTallyCounter implements IAdvancedCounter {
    public BetterTallyCounter(){
        super();
    }
    public BetterTallyCounter(int digit){
        super(digit);
    }
    public void decrement() throws InvalidOperationException{
        if (this.counter ==0){
            throw new InvalidOperationException();
        }
        else{
            this.counter-= 1;
        }
    }

}
