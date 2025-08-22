public class Questions{

    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public Questions(String question,String option1,String option2,String option3,String option4){
        this.question=question;
        this.option1=option1;
        this.option2=option2;
        this.option3=option3;
        this.option4=option4;
    }
    public String getquestion(){
        return question;
    }
    public void setquestion(String question){
        this.question=question;
    }
    public void setoption1(String option1){
        this.option1=option1;
    }
    public String getoption1(){
        return option1;
    }
    public String getoption2(){
        return option2;
    }
    public void setoption2(String option2){
        this.option2=option2;
    }
    public String getoption3(){
        return option3;
    }
    public void setoption3(String option3){
        this.option3=option3;
    }
    public void setoption4(String option4){
            this.option4=option4;
    }
    public String getoption4(){
        return option4;
    }
@Override
public String toString(){
    return "questions{"+
    "question='"+question+'\''+
    ", option1='"+option1+'\'' +
    ", option2='"+option2+'\'' +
    ", option3='"+option3+'\'' +
    ", option4='"+option4+'\'' +
    '}';



}
}