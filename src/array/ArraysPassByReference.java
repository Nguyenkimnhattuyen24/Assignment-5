
package array;
import java.util.Arrays;
public class ArraysPassByReference {
    public static void main(String[] args) {
       int [] iq = {126 , 167,95};
       increase(iq);
        System.out.println(Arrays.toString(iq));
    }
    public static void main(int [] a) {
        for (int i=0; i< a.length;i++){
        a[i] = a[i]*2;
        }
        
    }
    
}
