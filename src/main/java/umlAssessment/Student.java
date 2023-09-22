package umlAssessment;

public class Student extends Customer implements Discountable{
    public Student(String name, Size size) {
        super(name, size);
    }
}
