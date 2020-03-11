package bridgepattern;

import java.util.*;
public class BridgePatternDemo
{
	 public static void main(String[] args) {  
		    QuestionFormat questions = new QuestionFormat("OOPS");  
		    questions.q = (Question) new OopsQuestions();  
		        questions.delete("what is class?");  
		        questions.display();  
		    questions.newOne("What is inheritance? ");  
		      
		    questions.newOne("How many types of inheritance are there in java?");  
		    questions.displayAll();  
		    }  

}
