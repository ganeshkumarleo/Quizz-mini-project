import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Quiz{
    Scanner input=new Scanner(System.in);
    int CorrectAnsCount=0;
    int WrongAnsCount=0;
    public void logic(){
        Questions q1=new Questions("Which statement is above true about Java?",
        "A. Java is a sequence-dependent programming language",
        "B. Java is a code depended programming language",
        "c. Java is a platform depended programming language",
        "D. Java is a Platform Independed programming language");
        Questions q2=new Questions("What is the Extenstion of java file?",
        "A. .txt",
        "B. .Pdf ",
        "c. .sql ",
        "D. .java");
        Questions q3=new Questions("Who invented java programming?",
        "A. Guido van Rossum",
        "B. James Gosling ",
        "c. Dennis Ritchie",
        "D. Bjarne Stroustrup");
        Questions q4=new Questions("Which of these cannot be used for a variable name in java?",
        "A. identifier and keyword",
        "B. identifier",
        "c. keyword",
        "D. none of the above ");
        Questions q5=new Questions("Which of the following is not a java feature?",
         "A. Object-Oriented ",
         "B. use of pointers",
         "c. portable",
         "D. Dynamic and extensible");

        Map<Questions,Character>hmap=new HashMap<>();
        hmap.put(q1,'D');
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'B');
        

        for(Map.Entry<Questions,Character>map:hmap.entrySet()){
            System.out.println(map.getKey().getquestion());
            System.out.println(map.getKey().getoption1());
            System.out.println(map.getKey().getoption2());
            System.out.println(map.getKey().getoption3());
            System.out.println(map.getKey().getoption4());

                System.out.println("enter your anser");
                Character ans=input.next().charAt(0);

                int Cans=Character.compare(ans,map.getValue());
                if(Cans==0){
                    System.out.println("correct");
                    CorrectAnsCount++;
                }
                else{
                    System.out.println("wrong");
                    WrongAnsCount++;
                }
             }
        System.out.println();
        System.out.println("------Result----");
        System.out.println("Total Questions:"+hmap.size());
        System.out.println("Correct Answered Questions:"+CorrectAnsCount);
        System.out.println("Wrong Answered Questions:"+WrongAnsCount);
        int percentage=(100*CorrectAnsCount)/hmap.size();
        System.out.println("Percentage:"+percentage);
        if(percentage>95) {
        	System.out.println("Percentage:very Good");
        }else if(percentage<35) {
        	System.out.println("Percentage:very low");
        }
        else {
        	System.out.println("performance :medium");  
        }
    }
}

public class Main2{
    public static void main (String []args){
        Quiz q=new Quiz();
        q.logic();
    }
}