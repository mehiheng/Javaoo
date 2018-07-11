package practice08;

public class Klass {
    int number;
    Student leader;
    public Klass(int Mynumber){
        number=Mynumber;
    }
    public int getNumber(){
        return number;
    }
    public String getDisplayName(){
        return "Class "+number;
    }
    public Student assignLeader(Student student){
         return leader=student;
    }
    public Student getLeader(){
        return leader;
    }
}
