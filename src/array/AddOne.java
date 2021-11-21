package array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Givena big number represented by an array
 *
 * Add One(1) to the number and out out the result as a Long
 *
 * Ex -- int arr[] = {1,1,9}
 *
 * Output -- 120
 *
 */
public class AddOne {
    public static long getSum(int arr[]){
        List<Integer> arrList = new ArrayList<>();
        int one =1;
        int carry =0;
        for(int i=arr.length-1; i>=0; i--){
            int sum =0;
            int unit = arr[i];
            if(i == arr.length-1){
                sum = arr[i]+carry+one;

            } else{
                sum = arr[i]+carry;

            }
            if(sum ==10){
                unit = 0;
                carry =1;
            }else{
                unit = sum;
                carry =0;
            }
            arrList.add(unit);
        }
        if(carry ==1){
            arrList.add(carry);
        }

        String s ="";
        for(int i= arrList.size()-1; i>=0; i--){
            s= s+arrList.get(i);
        }
        return Long.valueOf(s);

    }

    public static void main(String arg[]) {
        int arr[] ={ 0, 3, 7, 6, 4, 0, 5, 5, 9};
        System.out.println(getSum(arr));
    }
}
