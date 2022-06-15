public class SummativeSums {
    public static void main(String[] args) {

        // Arrays
        int[] arrayOne = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arrayTwo = { 999, -60, -77, 14, 160, 301 };
        int[] arrayThree = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };

        // Print sums of arrays
        System.out.printf("#1 Array Sum: %d %n", calcSummativeSums(arrayOne));
        System.out.printf("#2 Array Sum: %d %n", calcSummativeSums(arrayTwo));
        System.out.printf("#3 Array Sum: %d %n", calcSummativeSums(arrayThree));
    }

    // Calc sum of arrays method
    public static int calcSummativeSums(int[] array){
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
