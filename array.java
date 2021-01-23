/* Array Operations*/

import java.util.Arrays;

public class array{
    public static void main(String[] args) {

    int[] num = {10, 60, 90, 50};

    //Access the Elements of an Array
    System.out.println(num[0]);

    //Change an Array Element
    num[0] = 88;
    System.out.println("After changing : "+num[0]);

    //Array Length
    System.out.println("Array length : "+num.length);

    //Sorting of the array
    Arrays.sort(num);
    System.out.println("Array after sorting : "+Arrays.toString(num));

    //Loop Through an Array with For-Each
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }

    //Multidimensional Arrays
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
          for(int j = 0; j < myNumbers[i].length; ++j) {
            System.out.println(myNumbers[i][j]);
           }
         }


}
}