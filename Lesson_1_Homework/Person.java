abstract class Person {
    protected String name;
    protected String sex;
    protected int age;

    public Person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    } //или не объявлять конструктор, тогда нужно объявить его в наследниках, иначе можно вызвать super

    public abstract String speak();

    @Override
    public String toString(){
        return "Имя класса: " +this.getClass() +", имя: " +name+ ", пол: " +sex+ ", возраст: " +age;
    }
}
