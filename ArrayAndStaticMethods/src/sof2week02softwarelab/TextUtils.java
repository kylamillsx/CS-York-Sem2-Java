package sof2week02softwarelab;
import java.util.ArrayList;
import java.util.Arrays;
public class TextUtils {
    
    public static void main(String[] args) {
        System.out.println(toBase10("11111111"));
        System.out.println(Arrays.toString(split("Hello my name is Shkiyla")));
        System.out.println(Arrays.toString(split("Hello, my name is Shkiyla!",",.!? ")));
        int[][] answer = rasterise(new int[]{1,2,3,4,5,6,7,8}, 4);
        System.out.println(Arrays.deepToString(answer));
    }
    //*Exercise 1: toBase10 from Base2 */
    public static int toBase10(String binary){
        StringBuilder reversed = new StringBuilder(binary); 
        reversed.reverse(); //reversed binary string 
        int base10 = 0;
        for (int i=0;i<reversed.length();i++){
            if (reversed.charAt(i) == '1'){
                base10 = base10 + (1<<i); // same as 2^i 
            }
        }
        return base10;

    }
    //*Exercise2: reinventing the wheel */
    public static String[] split(String text){
        ArrayList<String> words = new ArrayList<String>();
        String temp = "";
        for (int i = 0; i<text.length();i++){
            if (text.charAt(i) != ' '){
                temp = temp + text.charAt(i);
            }
            else{
                words.add(temp);
                temp = "";
            }
        }
        if (temp != ""){
            words.add(temp);
            temp = "";
        }
        return words.toArray(new String[0]); //converts from arrayList to array
    }
    //*Exercise 3: a more flexible split */
    public static String[] split(String text, String separators){
        ArrayList<String> words = new ArrayList<String>();
        String temp = "";
        for (int i = 0; i<text.length();i++){
            if (separators.indexOf(text.charAt(i))== -1){
                temp = temp + text.charAt(i);
            }
            else{
                if (temp != ""){
                    words.add(temp);
                    temp = "";
                }

            }
        }
        if (temp != ""){ //includes final word
            words.add(temp);
            temp = "";
        }
        return words.toArray(new String[0]);
    }
    //*Exercise4: 1D to 2D Array */
    public static int[][] rasterise(int[] data, int width){
        if (width<=0){
            return null;
        }
        if (data.length % width != 0) {
            return null;
        }
        int[][] twoDimArray = new int[(data.length/width)][width];
        int index = 0;
        for (int i=0; i<(data.length/width);i++){
            for (int j = 0; j<width;j++){
                twoDimArray[i][j] = data[index];
                index++; //seperate index or add same data[i] to each column
            }
        }
        return twoDimArray;
    }
}
