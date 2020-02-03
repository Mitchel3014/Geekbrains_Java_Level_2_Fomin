public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    } //или не объявлять конструктор, тогда нужно объявить его в наследниках, иначе можно вызвать super

    public abstract String voice();

    @Override
    public String toString(){
        return "Имя класса: " +this.getClass() +", кличка: " +name+ ", окрас: " +color+ ", возраст: " +age;
    }
}