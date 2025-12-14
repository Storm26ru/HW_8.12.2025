package task;
import java.time.DateTimeException;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FifthTask {
    private final Scanner scanner;
    private final String[] SEASONS ={"Winter","Winter","Spring","Spring","Spring","Summer","Summer","Summer","Autumn",
                                "Autumn","Autumn","Winter"};
    private int monthNumber;
    public FifthTask(Scanner scanner){
        this.scanner = scanner;
    }
    public void seasonsDisplay(){
        System.out.println("Введите номер месяца: ");
        input();
        System.out.println("Время года: "+ SEASONS[monthNumber-1]);

    }
    private void input(){
        while (true){
            try {
                monthNumber = scanner.nextInt();
                Month.of(monthNumber); // Для проверки корректности ввода номера месяца в диапазоне 1-12
                break;
            }catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                scanner.next();
            }catch (DateTimeException e){
                System.out.println("Некорректный номер месяца");
            }
        }
    }
}
