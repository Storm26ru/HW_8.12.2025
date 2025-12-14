package task;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SixthTask {
    private final Scanner scanner;
    private double number;
    private int choice;
    public SixthTask(Scanner scanner){
        this.scanner=scanner;
    }
    public void conversion(){
        Input();
        switch (choice){
            case 1 ->System.out.println("Перевод в мили\n"+number+" (м) = "+number/1609.34+" (mil)");
            case 2 ->System.out.println("Перевод в дюймы\n"+number+" (м) = "+number*39.37+" (in)");
            case 3 ->System.out.println("Перевод в ярды\n"+number+" (м) = "+number*1.09361+" (yd)");
        }
    }
    private void Input(){
        System.out.println("Введите количество метров: ");
        while (true){
            try {
                number =scanner.nextDouble();
                break;
            }catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                scanner.next();
            }
        }
        System.out.println("Выберите систему для перевода: 1(mil), 2(in), 3(yd)");
        while (true){
            try {
                choice = scanner.nextInt();
                if(choice>0 & choice<4)break;
                else System.out.println("Некорректный ввод. Пожалуйста, введите число от 1 до 3");
            }catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                scanner.next();
            }
        }
    }

}
