package practice11;

public class Person {
    String name;
    int age;
    int id;

    public  Person(int Myid, String Myname, int Myage) {
        id = Myid;
        name = Myname;
        age = Myage;
    }

    public String introduce() {
        return this.basicIntroduce();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String basicIntroduce() {
        return ("My name is " + name + ". I am " + age + " years old.");
    }

    public int getId(){
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        Person person = (Person) obj;
        if(person!=null){
            result = ((this.getId()==(person.getId())));}
        return result;


    }
}