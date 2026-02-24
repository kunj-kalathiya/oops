// Enum to represent result of each question
enum Result {
    CORRECT,
    WRONG,
    UNANSWERED
}

public class QuizGrader {

    public static void main(String[] args) {

        // Correct answers stored in array
        char[] correctAnswers = {'C','A','B','D','B','C','C','A'};

        // Check if 8 answers are provided
        if (args.length != 8) {
            System.out.println("Please provide exactly 8 answers as program arguments.");
            return;
        }

        int correctCount = 0;
        int wrongCount = 0;
        int unansweredCount = 0;

        System.out.println("QUESTION  SUBMITTED ANS  CORRECT ANS  RESULT");

        for (int i = 0; i < 8; i++) {

            char submitted = args[i].toUpperCase().charAt(0);
            char correct = correctAnswers[i];

            Result r;

            if (submitted == 'X') {
                r = Result.UNANSWERED;
                unansweredCount++;
            } 
            else if (submitted == correct) {
                r = Result.CORRECT;
                correctCount++;
            } 
            else {
                r = Result.WRONG;
                wrongCount++;
            }

            System.out.printf("%-9d %-14c %-12c %-12s%n",
                    (i + 1), submitted, correct, r);
        }

        System.out.println();
        System.out.println("No. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);
        System.out.println("No. of questions unanswered: " + unansweredCount);

        // Pass or Fail
        if (correctCount >= 5) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
