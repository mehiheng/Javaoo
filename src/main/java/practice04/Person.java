package practice04;

public class Person {
    String name;
    int age;
    public Person(String Myname,int Myage){
        name=Myname;
        age=Myage;
    }
    public String introduce(){
       return  this.basicIntroduce();
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String basicIntroduce(){
        return ("My name is "+name+". I am "+age+" years old.");
    }
}