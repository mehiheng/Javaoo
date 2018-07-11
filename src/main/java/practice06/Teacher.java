package practice06;

public class Teacher extends Person {
    int klass;
    public Teacher(String Myname,int Myage,int Myklass){
        super(Myname,Myage);
        klass=Myklass;
    }
    public Teacher(String Myname,int Myage){
        super(Myname,Myage);
        klass=0;
    }
    public String introduce(){
        if(klass!=0){
            return (super.introduce()+" I am a Teacher. I teach Class "+klass+".");
        }else{
            return(super.introduce()+" I am a Teacher. I teach No Class.");
        }
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