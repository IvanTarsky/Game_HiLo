import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain;
        do {
            int number = (int) (Math.random() * 100 + 1); // Сгенерировать случайное число от 1 до 100, которое пользователь будет угадывать.
            // Вывести на экран строку текста (запрос), попросив пользователя угадать число в указанном диапазоне.
            // Просить пользователя дать ответ до тех пор, пока он не угадает число.
            int guess = 0;
            int numberOfTries = 0;

            while (guess != number) {
                System.out.println("Введите число между 1 и 100: ");
                guess = in.nextInt();
                // Сравнить ответ пользователя с загаданным числом.
                // Определить их соотношение: больше, меньше или равно.
                // Отобразить результат сравнения на экране.
                if (guess < number)
                    System.out.println(guess + " меньше." + "Попробуйте снова.");
                else if (guess > number)
                    System.out.println(guess + " больше." + "Попробуйте снова.");
                else
                    System.out.println(guess + " правильно." + " Вы выиграли!");
                numberOfTries = numberOfTries + 1; //Подсчитать попыток.
            }

            if (guess == number) //Сообщить о том, сколько попыток потребовалось пользователю, чтобы угадать число.
                System.out.println("Вам потребовалось всего " + numberOfTries + " попыток! Хорошая работа!");

            // Спросить пользователя, хочет ли он снова сыграть в игру.
            System.out.println("Хотите снова сыграть в игру? (y/n)");
            playAgain = in.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Спасибо за игру! Пока!");
        in.close();
    }
}
