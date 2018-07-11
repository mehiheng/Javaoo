package practice07;


public class Student extends Person {
    Klass klass;
    public Student(String Myname,int Myage,Klass Myklass){
        super(Myname,Myage);
        klass=Myklass;
    }
    public String introduce(){
        return (super.introduce()+" I am a Student. I am at Class "+klass.number+".");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Klass getKlass(){
        return klass;
    }
}
