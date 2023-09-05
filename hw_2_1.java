package homework_Exception.hw_2;

// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". 
// В противном случае, программа должна выводить результат деления.
// Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception. 
// Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.
import java.util.Scanner;

    // Создаем пользовательское исключение DivisionByZeroException
    class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    public class hw_2_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();

            try {
                double result = divide(num1, num2);

                System.out.println("Результат давления: " + result);

            } catch (DivisionByZeroException e) {

                System.out.println("Ошибка: " + e.getMessage());

            }finally{
                scanner.close();
            }

        }

        public static double divide(int num1, int num2) throws DivisionByZeroException {
            if (num2 == 0) {

                throw new DivisionByZeroException("Деление на ноль недопустимо");

            }

            return (double) num1 / num2;
        }

    }

