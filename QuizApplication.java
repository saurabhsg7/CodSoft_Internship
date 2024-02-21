import java.util.*;
// TASK NO - 2 - SAURABH GAIWKAD CODSOFT BATCH A29
class QuizQuestion {
    String question;
    List<String> options;
    int correctOptionIndex;

    public QuizQuestion(String question, List<String> options, int correctOptionIndex) {
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }
}

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<QuizQuestion> quizQuestions = new ArrayList<>();

        // Add Java-related quiz questions
        quizQuestions.add(new QuizQuestion("What does JVM stand for?", Arrays.asList("A. Java Virtual Machine", "B. Java Visual Machine", "C. Java Virtual Method", "D. Java Visual Method"), 0));
        quizQuestions.add(new QuizQuestion("Which keyword is used to define a constant in Java?", Arrays.asList("A. constant", "B. final", "C. static", "D. private"), 1));
        quizQuestions.add(new QuizQuestion("What is the output of the following code?\n\npublic class Main {\n    public static void main(String[] args) {\n        System.out.println(10 > 9);\n    }\n}\n", Arrays.asList("A. 10 > 9", "B. true", "C. false", "D. Compilation Error"), 1));
        quizQuestions.add(new QuizQuestion("Which of the following is a marker interface in Java?", Arrays.asList("A. Runnable", "B. Serializable", "C. Cloneable", "D. Comparable"), 1));
        quizQuestions.add(new QuizQuestion("What is the result of 2 + 2 * 3?", Arrays.asList("A. 8", "B. 10", "C. 12", "D. 14"), 3));
        quizQuestions.add(new QuizQuestion("What is the parent class of all classes in Java?", Arrays.asList("A. Object", "B. Class", "C. Abstract", "D. Parent"), 0));
        quizQuestions.add(new QuizQuestion("Which of the following data types has the smallest size in Java?", Arrays.asList("A. byte", "B. short", "C. int", "D. long"), 0));
        quizQuestions.add(new QuizQuestion("What is the correct syntax to create an array in Java?", Arrays.asList("A. int[] array = new int[10];", "B. int array = new int[10];", "C. array[] = new int[10];", "D. int array[10];"), 0));
        quizQuestions.add(new QuizQuestion("Which keyword is used to create a subclass in Java?", Arrays.asList("A. extends", "B. superclass", "C. implements", "D. subclass"), 0));
        quizQuestions.add(new QuizQuestion("What is the purpose of the 'static' keyword in Java?", Arrays.asList("A. To create a constant", "B. To access class variables and methods without creating an object", "C. To make a variable or method local", "D. To create an instance of a class"), 1));


        int score = 0;

        System.out.println("Welcome to the Java Quiz! You will have 10 seconds to answer each question.");

        for (int i = 0; i < quizQuestions.size(); i++) {
            QuizQuestion question = quizQuestions.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + question.question);
            for (String option : question.options) {
                System.out.println(option);
            }

            System.out.print("\nEnter your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(question.options.get(question.correctOptionIndex).substring(0, 1))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + question.options.get(question.correctOptionIndex));
            }
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Your final score is: " + score + "/" + quizQuestions.size());

        scanner.close();
    }
}
