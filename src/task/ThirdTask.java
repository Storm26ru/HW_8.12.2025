package  task;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {
    private  Scanner scanner;
    public ThirdTask(Scanner scanner){
        //scanner=new Scanner(System.in);
       this.scanner=scanner;
    }
    public  void CreateNumber(){
       System.out.println("Введите первое число: ");
       int firstNumber = Input();
       System.out.println("Введите второе число: ");
       int secondNumber = Input();
       System.out.println("Введите третье число: ");
       int thirdNumber =Input();
       System.out.println("Число: "+firstNumber+secondNumber+thirdNumber);
       //scanner.close();
    }
   private int Input(){
        int number=0;
            while (true){
                try{
                    number=scanner.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                    scanner.next();
                }
            }
        return number;
    }
}
