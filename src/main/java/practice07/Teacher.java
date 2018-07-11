package practice07;

public class Teacher extends Person {
    Klass klass;
    public Teacher(String Myname,int Myage,Klass Myklass){
        super(Myname,Myage);
        klass=Myklass;
    }
    public Teacher(String Myname,int Myage){
        super(Myname,Myage);
        klass=null;
    }
    public String introduce(){
        if(klass!=null){
            return (super.introduce()+" I am a Teacher. I teach Class "+klass.number+".");
        }else{
            return(super.introduce()+" I am a Teacher. I teach No Class.");
        }
    }
    public String introduceWith(Student student){
        if(klass==student.klass){
            return super.introduce()+" I am a Teacher. I teach "+student.name+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+student.name+"." ;
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