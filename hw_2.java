package homework_Exception.hw_2;

import java.util.Scanner;

// Создаем пользовательское исключение
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class hw_2 {
    Scanner scanner = new Scanner(System.in);
        
    try {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }
    } catch (InvalidNumberException e) {
        System.err.println(e.getMessage());
    } catch (java.util.InputMismatchException e) {
        System.err.println("Введите корректное число");
    } finally {
        scanner.close();
    }
}
