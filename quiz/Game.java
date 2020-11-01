package quiz;

public class Game {

	    Question[] questions=new Question[3];
	    Player player=new Player();

	    String[] questionsdata={"Which is the Strongest team in IPL?","Which is the biggest planet?","What is the capital of India?"};
	    String[] options1={"CSK","Earth","Delhi"};
	    String[] options2={"MI","Venus","Mumbai"};
	    String[] options3={"RCB","Mercury","Kolkata"};
	    String[] options4={"KKR","Jupiter","Lucknow"};
	    int[] answers={2,4,1};
	    
	    public void initGame()
	    {
	        for(int i=0;i<3;i++){
	            questions[i]=new Question();
	        }
	        for(int i=0;i<3;i++)
	        {
		        questions[i].question=questionsdata[i];
		        questions[i].option1=options1[i];
		        questions[i].option2=options2[i];
		        questions[i].option3=options3[i];
		        questions[i].option4=options4[i];
		        questions[i].correctAnswer=answers[i];
	        }
	    }
	    
	    public void play()
	    {
	          player.getDetails();
	          for(int i=0;i<3;i++)
	          {
	              boolean status=questions[i].askQuestion();
	              if(status==true)
	              {
	                  System.out.println("Correct Answer");
	                  player.score=player.score+5;
	              }
	              else{
	                  System.out.println("Wrong Answer");
	                  player.score=player.score;
	              }
	          }
	        System.out.println(player.name+" your score is "+player.score);
	    }

}
