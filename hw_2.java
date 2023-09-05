package homework_Exception.hw_2;

import java.util.Scanner;

//Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
// В противном случае, программа должна выводить сообщение "Число корректно".

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
