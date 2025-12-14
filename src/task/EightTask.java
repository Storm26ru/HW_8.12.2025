package task;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EightTask {
    private Scanner scanner;
    private int firstNumber;
    private int secondNumber;
    public EightTask(Scanner scanner){
        this.scanner=scanner;
    }
    public void multiplicationTable(){
        System.out.println("Введите два числа, начало и конец диапазона таблицы умножения");
        System.out.println("Введите первое число:");
        firstNumber=input();
        System.out.println("Введите второе число:");
        secondNumber = input();
        normalization();
        for(int i = 1; i<11; i++){
        //for(int i = firstNumber; i<=secondNumber; i++){
            for (int j =firstNumber; j<=secondNumber; j++){
            //for (int j =1; j<11; j++){
                //System.out.print((j==1) ? i+"x"+j+"="+i*j : "\t"+i+"x"+j+"="+i*j);
                System.out.print((j==firstNumber) ? j+"x"+i+"="+i*j : "\t"+j+"x"+i+"="+i*j);
            }
            System.out.println();
        }

    }
    private int input(){
        int number;
        while(true){
            try{
                number=scanner.nextInt();
                if(number>0 & number<11) break;
                else System.out.println("Введите число в диапазоне от 1 до 10");
            }catch (InputMismatchException e){
                System.out.println("Некорректный ввод. Пожалуйста введите число.");
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
