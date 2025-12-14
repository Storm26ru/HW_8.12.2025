package task;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SeventhTask {
    private Scanner scanner;
    private int firstNumber;
    private int secondNumber;

    public SeventhTask(Scanner scanner){
        this.scanner = scanner;
    }
    public void oddNumbers(){
        System.out.println("Введите два числа, начало и конец диапазона чисел");
        System.out.println("Введите первое число: ");
        firstNumber = input();
        System.out.println("Введите второе число: ");
        secondNumber = input();
        normalization();
        for(int i = firstNumber; i<=secondNumber;i++){
            if(i%2!=0) System.out.print((i==firstNumber||i==firstNumber+1) ? "Нечетные числа: "+i : ","+i);
        }
        System.out.println();
    }
    private int input(){
        int number;
        while(true){
            try{
                number=scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Некорректный ввод. Пожалуйста введите целое число.");
                scanner.next();
            }
        }
        return number;
    }
    private void normalization(){
        if(firstNumber>secondNumber){
            int temp = firstNumber;
            firstNumber=secondNumber;
            secondNumber=temp;
        }
    }

}
