package practice11;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Observable;
public class Klass extends Observable{
    int number;
    Student leader;

    public Klass(int Mynumber) {
        number = Mynumber;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public boolean assignLeader(Student student) {
        if (student.klass == this) {
            this.leader = student;
            this.setChanged();
            notifyObservers("I know " + student.name + " become Leader of Class " + this.number + ".");

            return true;
        } else {
            System.out.print("It is not one of us.\n");
            this.leader=null;
            return false;
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.klass = this;
        setChanged();
        this.notifyObservers("I know " + student.name + " has joined Class " + this.number + ".");

    }

}