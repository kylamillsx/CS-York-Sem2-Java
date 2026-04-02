package tools;

public interface ITallyCounter {
    public void reset();
    public int read();
    public void increment() throws InvalidOperationException;


}
