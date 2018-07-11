package practice10;

import java.util.Arrays;
import java.util.LinkedList;

public class Teacher extends Person {
    LinkedList<Klass> klass;
    public Teacher(int Myid,String Myname,int Myage,LinkedList<Klass> Myklass){
        super(Myid,Myname,Myage);
        klass=Myklass;
    }
    public Teacher(int Myid,String Myname,int Myage){
        super(Myid,Myname,Myage);
        klass=null;
    }
    public String introduce(){
        if(klass!=null){
            String klasses="";
            for(int i=0;i<klass.size();i++){
                 klasses+=(((klass.get(i).number))+", ");
            }
                String result=(super.introduce()+" I am a Teacher. I teach Class "+klasses+".");
            result= result.replace(", .",".");
            return result;
        }else{
            return(super.introduce()+" I am a Teacher. I teach No Class.");
        }
    }
    public String introduceWith(Student student){
        if(klass.contains(student.klass)){
            return super.introduce()+" I am a Teacher. I teach "+student.name+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+student.name+"." ;
        }
    }
    public boolean isTeaching(Student student){
        boolean result=false;
        if(klass.contains(student.klass)){
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
    public LinkedList<Klass> getClasses(){
        return klass;
    }
}