package practice05;

public class Worker extends Person {
    public Worker(String Myname,int Myage){
        super(Myname,Myage);
    }
    public String introduce(){
        return (super.introduce()+" I am a Worker. I have a job.");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}