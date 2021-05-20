package TeachMeSkills;
import TeachMeSkills.Exceptions.DocumentWithoutABCException;
import java.util.Scanner;

// Проверить, содержит ли номер документа последовательность abc, и вывети сообщение содержит или нет.
// Причем, abc и ABC считается одинаковой последовательностью.
// TODO Проверить содержит ли номер документа последовательность abc.

public class Task1_1 {

    public static void toCompareLowerAndUpperCases (String docNumber) throws DocumentWithoutABCException {
        if (!docNumber.contains("abc") || !docNumber.contains("ABC")) {
            throw new DocumentWithoutABCException
                    ("The entered document number doesn't contain a necessary symbol combination, abc or ABC. Please, try again.");
        }
    }

    public static void main(String[] args) throws DocumentWithoutABCException {

        Scanner sc2 = new Scanner(System.in);
        String docNumber = sc2.nextLine();

        String abc = "abc";
        String ABC = "ABC";

        try {
            toCompareLowerAndUpperCases(docNumber);
        } catch (DocumentWithoutABCException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
