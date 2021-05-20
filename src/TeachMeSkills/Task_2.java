package TeachMeSkills;
import TeachMeSkills.Exceptions.WrongLoginException;
import TeachMeSkills.Exceptions.WrongPasswordException;
import java.util.Scanner;

// Создать класс, в котором будет статический метод.
// Этот метод принимает на вход три параметра: login, password, confirmPassword.
// Все поля имеют тип данных String.
// Длина login должна быть меньше 20 символов и не должен содержать пробелы.
// Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
// Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
// Также password и confirmPassword должны быть равны.
// Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
// WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
// второй принимает сообщение исключения и передает его в конструктор класса Exception.
// Метод возвращает true, если значения верны или false в другом случае.

public class Task_2 {

    public static void ValidateEnteredLogin(String login) throws WrongLoginException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Incorrect login is entered. Please, try again.");
        }
    }

    public static void ValidateEnteredPassword(String password) throws WrongPasswordException {
        if (password.length() > 20 && password.contains(" ") && !password.matches("[a-zA-Z ]*\\d+.*")) {
            throw new WrongPasswordException("Incorrect password is entered. Please, try again.");
        }
    }

    public static void PasswordIsNotConfirmed(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match. Please, try again.");
        }
    }

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Scanner sc1 = new Scanner(System.in);
        String login = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        String password = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        String confirmPassword = sc3.nextLine();

        try {
            ValidateEnteredLogin(login);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidateEnteredPassword(password);
        } catch (WrongPasswordException e1) {
            System.out.println(e1.getMessage());
        }

        try {
            PasswordIsNotConfirmed(password, confirmPassword);
        } catch (WrongPasswordException e2) {
            System.out.println(e2.getMessage());
        }
    }
}






