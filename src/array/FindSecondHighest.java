package array;

public class FindSecondHighest {

    static int highest = 0;
    static int secondHighest = 0;
    private static int getSecondHighest(int[] arr){
        for(int i : arr){
            if(i > highest){
                secondHighest = highest;
                highest = i;
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] arr = {3,6,9,10,2,3};
        System.out.println(getSecondHighest(arr));

    }
}
