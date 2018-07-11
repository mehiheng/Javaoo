package practice10;

public class Klass {
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
    }
}