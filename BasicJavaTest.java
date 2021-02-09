public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava algorithms = new BasicJava();
        algorithms.print255();
        algorithms.printOdd255();
        algorithms.printSum();
        int[] array = {1, -3, 5, 7};
        algorithms.iterateArray(array);
        algorithms.findMax(array);
        algorithms.getAverage(array);
        algorithms.arrayWithOddNumbers();
        algorithms.greaterThanY(array, 3);
        algorithms.squareTheValues(array);
        int[] array2 = {1, -3, 5, 7};
        algorithms.elliminateNegativeNumbers(array2);
        int[] array3 = {1, -3, 5, 7};
        algorithms.maxMinAverage(array3);
        algorithms.shiftingTheValues(array3);
    }
}
