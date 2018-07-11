package practice06;


public class Student extends Person {
    int klass;
    public Student(String Myname,int Myage,int Myklass){
        super(Myname,Myage);
        klass=Myklass;
    }
    public String introduce(){
        return (super.introduce()+" I am a Student. I am at Class "+klass+".");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getKlass(){
        return klass;
    }
}