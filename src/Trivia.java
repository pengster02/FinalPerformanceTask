/**
 * This program creates a trivia on grade 10 history, testing the user to see if they are ready for their test or not..
 * Authors: Sarah Peng
 * Created: May 18th, 2019
 */

//Imports the scanner
import java.util.Scanner;

//Creates a trivia game that has both true false and multiple choice questions which tests the user on their knowledge of grade 10 Canadian history.
public class Trivia
{
  //Lists all the possible questions for the game.
  private static String[] questions = {
    "\nIn which battle was chlorine gas first used?", 
    "\nFLQ stands for Front de Liberator du Quebec?",
    "\nWhose assassination caused WW2 to start?",
    "\nThe alliance between Britain, France and Russia was called the Triple Alliance?",
    "\nWhat does NATO stand for?",
    "\nOn which day did Canada enter WW2?",
    "\nWhen did the stock market crash?",
    "\nWho won a Nobel peace prize for resolving the Suez Canal crisis?",
    "\nWho led the famous five?",
    "\nDid Frederick Banting invent insulin?",
    "\nThe cold war was between the US and the USSR?",
    "\nProhibition is the ban on...",
    "\nLittle boy was dropped on...",
    "\nAfter WW2, the United Nations was created.",
    "\nThe constitution was signed in 1983.",
    "\nWhich prime minister had people ask him for money during the Depression?",
    "\nThe purpose of the Meech Lake Accord was to amend the constitution.",
    "\nQuebec was the last province to join the Confederation.",
    "\nThe Official Languages Act was in 1970.",
    "\nThe conscription crisis in WW1 caused french and english relations to worsen."
    };
  
  //Lists the options for each question.
  private static String[] options = {
    "\na) Battle of Ypres "
    + "\nb) Battle of Passchendaele "
    + "\nc) Battle of Somme "
	+ "\nd) Battle of Vimy Ridge",
	"\na) True "
	+ "\nb) False",
	"\na) Gavrilo Princip "
    + "\nb) Arthur Currie "
	+ "\nc) Archduke Franz Ferdinand "
	+ "\nd) Billy Bishop",
	"\na) North American Treaty Organization "
	+ "\nb) North Atlantic Treaty Organization "
	+ "\nc) North American Trade Operation "
    + "\nd) North Atlantic Trade Operation",
	"\na) September 1st, 1939"
	+ "\nb) September 3rd, 1939 "
	+ "\nc) September 6th, 1939 "
	+ "\nd) September 10th, 1939",
	"\na) October 24th, 1929 "
	+ "\nb) October 25th, 1929 "
	+ "\nc) October 27th, 1929 "
	+ "\nd) October 29th, 1929",
	"\na) Arthur Currie "
	+ "\nb) Robert Borden "
	+ "\nc) Lester Pearson "
	+ "\nd) Pierre Trudeau",
	"\na) Henrietta Edwards "
    + "\nb) Nellie McClung "
	+ "\nc) Emily Murphy "
	+ "\nd) Louise McKinney",
	"\na) Firearms"
	+ "\nb) Cigarettes"
	+ "\nc) Gum"
	+ "\nd) Alcohol",
	"\na) Nagasaki"
	+ "\nb) Kyoto"
	+ "\nc) Osaka"
	+ "\nd) Hiroshima",
	"\na) Robert Borden"
	+ "\nb) Mackenzie King"
	+ "\nc) Richard Bennett"
	+ "\nd) Pierre Trudeau"
	};
  
  //Lists the indexes of the questions.
  private static int[] index = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
  
  //Uses the Fisher-Yates shuffle to randomize the indexes of the questions array.
  public static void rdmQuestions(int[] index)
  {
	//Swaps each integer in the array with another integer from a different index.
	for (int k = 0; k < index.length; k++)
	{
	  int rdmIndex = (int) (Math.random() * (index.length));
	  int swap = index[rdmIndex];
	  index[rdmIndex] = index[k];
	  index[k] = swap;
	}
  }
  
  //Combines the question with its respective options.
  public static String fnlQuestion(String[] questions, String[] options, int index)
  {
	if (index == 1 || index == 3 || index == 9 || index == 10 || index == 13|| index == 14 || index == 16 || index == 17 || index == 18 || index == 19)
	  return questions[index] + options[1];
	else if (index == 0)
	  return questions[index] + options[0];
	else if (index == 2)
	  return questions[index] + options[2];
    else if (index == 4)
	  return questions[index] + options[3];
	else if (index == 5)
      return questions[index] + options[4];
	else if (index == 6)
	  return questions[index] + options[5];
	else if (index == 7)
	  return questions[index] + options[6];
	else if (index == 8)
	  return questions[index] + options[7];
	else if (index == 11)
	  return questions[index] + options[8];
    else if (index == 12)
	  return questions[index] + options[9];
	else if (index == 15)
	  return questions[index] + options[10];
    else
	  return questions[index];
  }
  
  //Tests to see if the user's input is the correct answer for the respective question.
  public static boolean correct(String answer, int index)
  {
	switch(index)
	{
	  case 0:
	    if (answer.equals("a"))
	      return true;
	    break;
	  case 1:
	    if (answer.equals("b"))
	      return true;
	    break;
	  case 2:
	    if (answer.equals("c"))
	 	  return true;
	    break;
	  case 3:
	    if (answer.equals("b"))
	 	  return true;
	    break;
	  case 4:
	    if (answer.equals("b"))
		  return true;
	    break;
	  case 5:
	    if (answer.equals("d"))
		  return true;
	    break;
	  case 6:
	    if (answer.equals("a"))
		  return true;
	    break;
	  case 7:
	    if (answer.equals("c"))
		  return true;
	    break;
	  case 8:
	    if (answer.equals("c"))
		  return true;
	    break;
	  case 9:
	    if (answer.equals("a"))
		  return true;
	    break;
	  case 10:
	    if (answer.equals("a"))
	      return true;
	    break;
	  case 11:
	    if (answer.equals("d"))
	      return true;
	    break;
	  case 12:
	    if (answer.equals("d"))
		  return true;
	    break;
	  case 13:
	    if (answer.equals("a"))
		  return true;
	    break;
	  case 14:
	    if (answer.equals("b"))
	      return true;
	    break;
	  case 15:
	    if (answer.equals("c"))
	      return true;
	    break;
	  case 16:
	    if (answer.equals("a"))
	      return true;
	    break;
	  case 17:
	    if (answer.equals("b"))
	      return true;
	    break;
	  case 18:
	    if (answer.equals("b"))
	      return true;
	    break;
	  case 19:
	    if (answer.equals("a"))
		  return true;
	    break;
    }	
    return false;
  }
  
  //Tests to see if the question is a true or false question, if it is not, then it is a multiple choice question.
  public static boolean isTF (int index)
  {
	if (index == 1 || index == 3 || index == 9 || index == 10 || index == 13|| index == 14 || index == 16 || index == 17 || index == 18 || index == 19)
	  return true;
    return false;
  }
  
  //Tests to see if the user's input is a valid option for the respective question.
  public static boolean isValid(String answer, int index)
  {
	//Test to see if the input is a character.
	if (answer.length() == 1)
	{
	  //Tests to see if the input is either a or b for true and false questions.
	  if (isTF(index))
	  {
		if (answer.equals("a") || answer.equals("b"))
		  return true;
		return false;
	  }
	  //Tests to see if the input is either a, b, c or d for the multiple choice questions.
	  else 
	  {
		if (answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d"))
		  return true;
		return false;
	  }
	}
	return false;
  }
  
  //Determines whether the user has passed the test or not.
  public static boolean pass(int correct)
  {
	  Integer right = new Integer(correct);
	  Integer pass = new Integer(7);
	  if (right.compareTo(pass) >= 0)
		  return true;
	  return false;
  }
  
  //
  public static void main(String[] args) 
  {
	Scanner kb = new Scanner(System.in);
	String answer, ready;
	int correct = 0, incorrect = 0, i = 0;
	
	//Prints out the instructions to the game.
	System.out.println("\nCANADIAN HISTORY TRIVIA"
				   + "\n\nThis game will test your knowledge of grade 10 Canadian history."
				   + "\nIn order to pass, you need to get at least 7 answers correct."
				   + "\nTo answer the questions please enter the corresponding letter to the answer."
				   + "\na, b, c, or d for multiple choice and a or b for true and false questions."
				   + "\nDo not worry, this game is not case sensitive.\n");
	
	//Prevents the game from starting until user inputs 'ready'.
	do 
	{
	  System.out.println("To begin the game, type 'ready'.");
	  ready = kb.nextLine().toLowerCase();
	}
	while (ready.equals("ready") == false);
	
	if (ready.equals("ready"))
	{
	  //Prints out the start of the game and shuffle the index array.
	  System.out.println("GOOD LUCK!");
	  System.out.print("*****************************************************************************");
	  rdmQuestions(index);
	  
	  //Prints out 10 randomly selected questions from the questions array.
	  while (i < 10)
	  {
		int newIndex = index[i];
		System.out.println("\n" + (i + 1) + ". " + fnlQuestion(questions, options, newIndex));
		
		//Prevents the user from answering with anything but the options listed.
		do
		{
		  System.out.print("Answer: ");
		  answer = kb.nextLine().toLowerCase();
		  if (isValid(answer, newIndex) == false && isTF(newIndex))
			System.out.println("Invalid answer. Please choose from: a or b.");
		  else if (isValid(answer, newIndex) == false && isTF(newIndex) == false)
			System.out.println("Invalid answer. Please choose from: a, b, c or d.");
		}
		while (isValid(answer, newIndex) == false);
		
		//Keeps track of how many questions the user gets right, printing out CORRECT every time they do.
		if (correct(answer, newIndex))
		{
		  System.out.println("CORRECT");
		  correct++;
		  System.out.println("Correct: " + correct + " Incorrect: " + incorrect);
		  System.out.print("-----------------------------------------------------------------------------");
		  i++;
		}
		//Keeps track of how many questions the user gets wrong, printing out INCORRECT every time they do.
		else
		{
		  System.out.println("INCORRECT");
		  incorrect++;
		  System.out.println("Correct: " + correct + " Incorrect: " + incorrect);
		  i++;
		  System.out.print("-----------------------------------------------------------------------------");
		}
	  }
	}
	
	//Game over notifications that will print the final score of the user.
	System.out.println("\n~~~~GAME OVER~~~~");
	System.out.println("# of correct answers: " + correct);
	System.out.println("# of incorrect answers: " + incorrect);
	System.out.println("Final Score: " + (100 * correct/(double)(correct + incorrect)) + "%");
	
	//Determines whether the user's final score is at least seven in order to pass the game, if not, the user fails.
	if (pass(correct))
		System.out.print("YOU PASSED! YOU ARE READY!");
	else 
		System.out.print("YOU FAILED! STUDY MORE AND TRY AGAIN!");
	System.out.print("\n*****************************************************************************");
  }
}


