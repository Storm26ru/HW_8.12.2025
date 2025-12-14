package task;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTask {
    private Scanner scanner;
    public SecondTask(Scanner scanner){
        this.scanner =scanner;
    }
    public  void percent(){
       // try(Scanner scanner = new Scanner(System.in)) {
            double number = 0;
            double percent =0;
            while(true){
                System.out.println("Введите число: ");
                try {
                    number = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                    scanner.next();
                }
            }
            while (true){
                System.out.println("Введите процент от чила:");
                try {
                    percent = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                    scanner.next();
                }
            }

            System.out.println("Результат: "+result(number,percent));
       // }
    }

   private double result (double number,double percent){
       return number*(percent/100);
    }
}
