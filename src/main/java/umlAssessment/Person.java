package umlAssessment;

public abstract class Person {
    private String name;
    private Size size;
    private Clothing[] clothingItems;
    public Person(String name, Size size){
        this.name = name;
        this.size = size;
        this.clothingItems = new Clothing[0];
    }
}
