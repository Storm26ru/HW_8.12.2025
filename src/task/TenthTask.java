package task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TenthTask {
    private int [] array;
    public TenthTask(int size, int max){
        array = new int[size];
        random(max);
    }
   private void random(int max){
        Random random = new Random();
        for(int i = 0; i<array.length; i++){
            array[i] = random.nextInt(max)-max/2;
        }
    }
   public int [] evenNumbers() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0) list.add(i);
        }
        return  convertingToArray(list);
    }
   public int [] oddNumbers(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (i % 2!= 0) list.add(i);
        }
        return  convertingToArray(list);
    }
   public int [] negativeNumber(){
       ArrayList<Integer> list = new ArrayList<>();
       for (int i : array) {
           if (i<0) list.add(i);
       }
       return  convertingToArray(list);
    }
    public int [] positiveNumber(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (i>0) list.add(i);
        }
        return  convertingToArray(list);
    }
   private int [] convertingToArray(ArrayList<Integer> list){
        if (!list.isEmpty()) {
            return Arrays.stream(list.toArray(list.toArray(new Integer[0]))).mapToInt(Integer::intValue).toArray();
        }
        return  null;
    }
}

