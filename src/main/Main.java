package main;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import task.*;

public class Main {
    public static void  main(String[] args){
        // Задание №1
        System.out.println("Задание №1");
        new FirstTask().print();
       try (Scanner scanner = new Scanner(System.in)){
         //Задание №2
           System.out.println("Задание №2");
           new SecondTask(scanner).percent();
         //Задание №3
           System.out.println("Задание №3");
           new ThirdTask(scanner).CreateNumber();
         //Задание №4
           System.out.println("Задание №4");
           new FourthTask(scanner).createNumber();
         //Задание №5
           System.out.println("Задание №5");
           new FifthTask(scanner).seasonsDisplay();
         //Задание №6
           System.out.println("Задание №6");
           new SixthTask(scanner).conversion();
         //Задание №7
           System.out.println("Задание №7");
           new SeventhTask(scanner).oddNumbers();
         //Задание №8
           System.out.println("Задание №8");
           new EightTask(scanner).multiplicationTable();
       }
       //Задание №9
        System.out.println("Задание №9");
        NinthTask ninthTask = new NinthTask(10,100);
        ninthTask.max();
        ninthTask.min();
        ninthTask.negative();
        ninthTask.positive();
        ninthTask.zero();

        //Задание №10
        System.out.println("Задание №10");
        TenthTask tenthTask = new TenthTask(10,100);
        int [] evenNumbers = tenthTask.evenNumbers();
        printArray(evenNumbers);
        int [] oddNumbers = tenthTask.oddNumbers();
        printArray(oddNumbers);
        int [] negativeNumber = tenthTask.negativeNumber();
        printArray(negativeNumber);
        int [] positiveNumber = tenthTask.positiveNumber();
        printArray(positiveNumber);
        //Задание №11
        System.out.println("Задание №11");
        EleventhTask.print('*',20, EleventhTask.Axis.X);
        //Задание №12
        System.out.println("Задание №12");
        int [] array = createRandomArray(5,100);
        printArray(array);
        TwelfthTask.sortingArray(array,true);
        printArray(array);




    }
    static void printArray(int [] array){
        if(array!=null) System.out.println(Arrays.toString(array));
        else System.out.println("Массив не содержит данных");
    }
    static int [] createRandomArray(int size, int max){
        Random random = new Random();
        int [] array = new int[size];
        for(int i = 0; i<array.length; i++){
            array[i] = random.nextInt(max)-max/2;
        }
        return array;
    }
}
