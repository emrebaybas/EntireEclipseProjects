package Tutorial1;

import java.util.Scanner;

public class MultipleChoiceQuiz {

	public static void main(String[] args) {
		
		String q1="What color are apples\n"+"a- red/green\nb- Orange\nc- Magenta\n";
		String q2="What color are bananas\n"+"a- red/green\nb- Yellow\nc- Blue\n";
	
	MultipleChoiceQuestions [] questions = {
			new MultipleChoiceQuestions(q1,"a"),
			new MultipleChoiceQuestions(q2, "b")	
	};
	takeTest(questions);
		
	}

	public static void takeTest(MultipleChoiceQuestions[] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);

		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();

			if (answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println("You got " + score + "/" + questions.length);
	}
}
