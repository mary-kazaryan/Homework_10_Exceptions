package TeachMeSkills;
import TeachMeSkills.Exceptions.DocumentValidatorException;
import java.util.Scanner;

// В данной программе должна быть проверка, что строка, введенная с консоли,  заканчивается последовательностью 1a2b.
// Таким образом, пользователь должен ввести с консоли радномный номер документа.
// Если номер документа заканчивается на 1a2b, программа должна скомпилироваться
// (можно вывести сообщение о том. что номер докумета удовлеворяет условиям ввода).
// Если же номер документа не заканчивается на 1a2b, нужно высброить Exception c описанием ошибки
// (например, "The entered doc number doesn't contain a necessary symbol combination 1a2b. Please try again").

public class Task1_3 {

        public static void validateDocumentNumber(String docNumber) throws DocumentValidatorException {
            if (!docNumber.endsWith("1a2b")) {
                throw new DocumentValidatorException
                ("The entered document number doesn't contain a necessary symbol combination 1a2b. Please try again.");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String docNumber = sc.nextLine();

            try {
                validateDocumentNumber(docNumber);
            } catch (DocumentValidatorException e) {
                System.out.println(e.getMessage());
            }
        }
}



