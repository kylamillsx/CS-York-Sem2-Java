package tools;

public class MainApp {
    public static void main(String[] args){
        TallyCounter tallycount = new TallyCounter();//creates instance tallycount of class TallyCounter
        System.out.println(tallycount);//prints object tallycount
        try{
            tallycount.increment();
            System.out.println(tallycount);

        }
        catch(InvalidOperationException e){
            System.out.println("Counter cannot exceed 999");
        }//catching and handling the exception if counter exceeds 999
    }

}
