package umlAssessment;

public class Student extends Customer implements Discountable{
    private long studentID;
    public Student(String name, Size size) {
        super(name, size);
    }
}
