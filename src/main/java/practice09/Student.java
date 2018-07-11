package practice09;

public class Student extends Person {
    Klass klass;
    public Student(int id,String Myname,int Myage,Klass Myklass){
        super(id,Myname,Myage);
        klass=Myklass;
    }
    public String introduce(){
        if(klass.leader==this){
            return (super.introduce() + " I am a Student. I am Leader of Class " + klass.number + ".");
        }else {
            return (super.introduce() + " I am a Student. I am at Class " + klass.number + ".");
        }
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
