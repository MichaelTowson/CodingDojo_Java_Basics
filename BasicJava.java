import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public void print255() {
        for (int i = 0; i<=255; i++) {
            System.out.println(i);
        }
    }

    public void printOdd255() {
        for (int i = 0; i<=255; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 0; i<=255; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void iterateArray(int[] array) {
        for (int i = 0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i<array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public void getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println(average);
    }

    public void arrayWithOddNumbers() {
        ArrayList<Integer> array = new ArrayList<Integer>();  
        for (int i = 0; i<=255; i++) {
            if(i % 2 != 0) {
                array.add(i);
            }
        }
        System.out.println(array);
    }

    public void greaterThanY(int[] array, int value) {
        int count = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] > value) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void squareTheValues(int[] array) {
        for (int i = 0; i<array.length; i++) {
            array[i] = array[i] * array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public void elliminateNegativeNumbers(int[] array) {
        for (int i = 0; i<array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void maxMinAverage(int[] array){
        //Find max
        findMax(array);

        //Find min
        int min = array[0];
        for (int i = 0; i<array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);
        
        //Find avg
        getAverage(array);
    }

    public void shiftingTheValues(int[] array){
        for (int i = 0; i<array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
        System.out.println(Arrays.toString(array));
    }
}
