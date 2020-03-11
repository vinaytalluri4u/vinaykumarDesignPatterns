package bridgepattern;

public interface Question
{
	public void nextQuestion();  
    public void previousQuestion();  
    public void newQuestion(String newq);  
    public void deleteQuestion(String delq);  
    public void displayQuestion();  
    public void displayAllQuestions();  

}
