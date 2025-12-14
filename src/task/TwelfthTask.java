package task;
import java.util.function.BiPredicate;

public class TwelfthTask {
    /**
     *
     * @param array массив.
     * @param ascending направление сортировки массива true - по возрастанию, false - по убыванию.
     */
   // public  static  int [] sortingArray(int [] array,boolean ascending){
    public  static  void sortingArray(int [] array,boolean ascending){
        BiPredicate<Integer,Integer> comparison;
        if(ascending) {comparison = (a,b) -> a>b;}
        else {comparison = (a,b) ->a<b;}
        for(int i = 0; i<array.length; i++){
            int index = i;
            for(int j = i+1; j<array.length; j++){
                if(comparison.test(array[index],array[j])) index=j;
            }
            if(i!=index){
                array[i] = array[i]^array[index];
                array[index] = array[i]^array[index];
                array[i] = array[i]^array[index];
            }
        }
       // return array;
    }
}
