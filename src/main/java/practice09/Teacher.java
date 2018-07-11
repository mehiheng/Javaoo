package practice09;

import java.util.LinkedList;

public class Teacher extends Person {
    Klass klass;
    public Teacher(int Myid,String Myname,int Myage,Klass Myklass){
        super(Myid,Myname,Myage);
        klass=Myklass;
    }
    public Teacher(int Myid,String Myname,int Myage){
        super(Myid,Myname,Myage);
        klass=null;
    }
    public String introduce(){
        if(klass!=null){
            String result=(super.introduce()+" I am a Teacher. I teach Class "+klass.number+".");
            result= result.replace(", .",".");
            return result;
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
    public boolean isTeaching(Student student){
        boolean result=false;
        if(klass==student.klass){
            result=true;
        }
        return  result;
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