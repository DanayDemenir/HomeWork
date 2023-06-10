import java.util.Scanner;

class Testing {
    private final String[][] arrayForTest = {{"1. Чему равно 1+1?", "2. Чему равно 1+2?", "3. Чему равно 1+3?"},
            {"1) 1", "2) 2", "3) 3"}, {"1) 3", "2) 2", "3) 4"}, {"1) 3", "2) 1", "3) 4"}};
    private final String[] arrayRightAnswers = {"2", "1", "3"};

    public void AskQuestion(int numberQuestion) {
        Scanner console = new Scanner(System.in);
        printQuestion(numberQuestion);
        String answer = console.next();
        if (IsRight(answer, numberQuestion)) {
            System.out.println("You're Right!");
        } else {
            System.out.println("You're Wrong!");
        }
    }

    private boolean IsRight(String answer, int question) {
        return answer.equals(arrayRightAnswers[question]);
    }

    private void printQuestion(int i) {
        System.out.println(arrayForTest[0][i]);
        for (int j = 0; j < 3; j++) {
            System.out.print(arrayForTest[i + 1][j] + "\t");
        }
        System.out.println();
    }

}

public class TestingOOP {

    public static void main(String[] args) {
        Testing obj = new Testing();

        obj.AskQuestion(0);
        obj.AskQuestion(1);
        obj.AskQuestion(2);
    }
}
