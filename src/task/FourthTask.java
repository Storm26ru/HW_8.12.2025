package task;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FourthTask {
    private String strNumber;
    private Scanner scanner;
    public FourthTask(Scanner scanner){
        this.scanner=scanner;
    }
    public void createNumber(){
        System.out.println("Введите шестизначное число: ");
        input();
        replaceNumber(0,5);
        replaceNumber(1,4);
        System.out.println("Число: "+strNumber);

    }
    private void input(){
        while (true){
            try {
                strNumber=((Integer)scanner.nextInt()).toString();
                if(strNumber.length()==6) break;
                else System.out.println("Введите шестизначное число");
            }catch (InputMismatchException e){
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                scanner.next();
            }
        }
    }
    private void replaceNumber(int i, int j){
        char [] digits=strNumber.toCharArray();
        char temp = digits[i];
        digits[i]=digits[j];
        digits[j]=temp;
        strNumber=String.valueOf(digits);
    }

}
