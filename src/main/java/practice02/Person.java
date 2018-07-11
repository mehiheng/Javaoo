package practice02;

public class Person {
    String name;
    int age;
    public Person(String Myname,int Myage){
        name=Myname;
        age=Myage;
    }
    public String introduce(){
        return ("My name is "+name+". I am "+age+" years old.");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}