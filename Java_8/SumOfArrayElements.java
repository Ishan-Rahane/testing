import java.util.Arrays;

public class SumOfArrayElements {

    public static void main(String[] args) {

        int [] arr =  {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        System.out.printf("Original array is: "+Arrays.toString(arr));
        int sum=0;
        for (int i:arr){
            sum = sum+i;
        }
        System.out.println("Sum of array elements:- "+sum);
    }
}