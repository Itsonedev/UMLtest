package umlAssessment;

public abstract class Employee extends Customer implements Discountable{
    private static final double DISCOUNT = 1.0;
    public Employee(String name, Size size) {
        super(name, size);
    }
}
