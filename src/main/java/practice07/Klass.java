package practice07;

public class Klass {
    int number;
    public Klass(int Mynumber){
        number=Mynumber;
    }
    public int getNumber(){
        return number;
    }
    public String getDisplayName(){
        return "Class "+number;
    }
}
