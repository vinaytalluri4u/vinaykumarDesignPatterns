package bridgepattern;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class OopsQuestions implements Question
{
	private static final Logger logger=LogManager.getLogger(OopsQuestions.class);
	private List <String> questions = new ArrayList<String>();  
	 private int current = 0;  
	 public OopsQuestions()
	 {  
	    questions.add("What is abstraction? ");  
	    questions.add("How multiple polymorphism is achieved in java? ");    
	    questions.add("What is abstract class? ");  
	    questions.add("What is multi-threading? ");  
	 }  
	 public void nextQuestion() {  
	    if( current <= questions.size()-1 )
	    {
	    	current++;  
	    }
	    logger.info(current);  
	 }  
	  
	 public void previousQuestion() {  
	    if( current > 0 ) 
	    {
	    current--;
	    }
	 }  
	  
	 public void newQuestion(String quest) {  
	    questions.add(quest);  
	 }  
	  
	 public void deleteQuestion(String quest) {  
	    questions.remove(quest);  
	 }  
	  
	 public void displayQuestion() {  
	   logger.info( questions.get(current) );  
	 }  
	 public void displayAllQuestions() {  
	    for (String quest : questions) {  
	    logger.info(quest);  
	 }  
	}  

}
