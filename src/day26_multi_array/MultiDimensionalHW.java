package day26_multi_array;

public class MultiDimensionalHW {
    public static void main(String[] args) {
        /*
        Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array
         */

        int[][] array = {{1, 5, 2,42, 23}, {-12, 41, -5,-2}, {1, 5, 1, 5}};
        int max = 0;
        int min = 0;
        for ( int[] element : array) {
            for (int each : element) {
                if (each > max)
                    max = each;
                if (each < min)
                    min = each;

            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

            }
        }
