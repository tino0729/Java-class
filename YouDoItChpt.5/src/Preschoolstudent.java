public class Preschoolstudent {
    int idNum;
    int age;
    
    public final int HiGH_iD = 9999;
    public final int HiGH_AGe = 6;

    public void setidNum(int num) {
        if (num <= HiGH_iD)
            idNum = num;
        else
            idNum = 0;
    }

    public void setAge(int studentAge) {
        if (studentAge <= HiGH_AGe)
            age = studentAge;
        else
            age = 0;
    }

    public int getidNum() {
        return idNum;
    }

    public int getAge() {
        return age;
    }

    public Preschoolstudent(int num, int studentAge) {
        setidNum(num);
        setAge(studentAge);
    }
}
