public class Hippo extends Animal implements Runable, Swimable {
    private int run_limit;
    private int swim_limit;

    public Hippo (String name, String color, int age, int run_limit, int swim_limit) {
        super (name, color, age);
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
    } //если объявлен конструктор в абстрактном Animal, или

    //public Cat(String name, String color, int age, int run_limit, int swim_limit){
    //    this.name = name;
    //    this.color = color;
    //    this.age = age;
    //    this.run_limit = run_limit;
    //   this.swim_limit = swim_limit;
    //} //если не объявлен конструктор в абстрактном Animal

    @Override
    public String voice(){
        return "Uf-uf-uf!";
    }

    @Override
    public boolean run (int distance){
        return run_limit >= distance;
    }

    @Override
    public boolean swim (int swim_distance){
        return swim_limit >= swim_distance;
    }
}