package task;
import java.util.Random;

public class NinthTask {
    //private Scanner scanner;
    private int [] array;
    public NinthTask(int size, int max){
       // this.scanner = scanner;
        this.array = new int[size];
        random(max);
    }
    private void random(int max){
        Random random = new Random();
        System.out.println("Массив чисел:");
        for(int i=0; i<array.length;i++){
            array[i]= random.nextInt(max)-max/2;
            System.out.print(array[i]+", ");
        }
        System.out.println();

    }
    public void max(){
        int max = array[0];
        for(int i : array){
            if(i>max) max=i;
        }
        System.out.println("Максимальное значение элемента в массиве: "+ max);
    }
    public void min(){
        int min =array[0];
        for(int i : array){
            if(i<min) min =i;
        }
        System.out.println("Минимальное значение элемента в массиве: "+min);
    }
    public void negative(){
        int count=0;
        for(int i:array){
            if(i<0) count++;
        }
        System.out.println("Колличество отрицательных элементов в массиве: "+ count);
    }
    public  void positive(){
        int count =0;
        for(int i : array){
            if(i>0) count++;
        }
        System.out.println("Колличество положительных элементов в массиве: "+count);
    }
    public void zero(){
        int count =0;
        for(int i: array){
            if(i==0)count++;
        }
        System.out.println("Колличество элементов в массиве равных нулю: "+count);
    }

}
