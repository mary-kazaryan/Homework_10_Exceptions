package TeachMeSkills;
import TeachMeSkills.Exceptions.DocumentStartValidatorException;
import java.util.Scanner;

// В данной программе должна быть проверка, что строка, введенная с консоли, начинается с последовательности 555.
// Если номер документа не начинается с 555, нужно выбросить Exception c описанием ошибки, например,
// "The entered doc number doesn't start with a necessary symbol combination 555. Please try again.").

public class Task1_2 {

    public static void toCheckIfStringStartsWith555(String docNumber) throws DocumentStartValidatorException {
            if (!docNumber.startsWith("555")) {
                throw new DocumentStartValidatorException
                        ("The entered doc number doesn't start with a necessary symbol combination 555. Please try again.");
            }
    }

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String docNumber = sc1.nextLine();

        try {
            toCheckIfStringStartsWith555(docNumber);
        } catch (DocumentStartValidatorException e1) {
            System.out.println(e1.getMessage());
        }
    }
}