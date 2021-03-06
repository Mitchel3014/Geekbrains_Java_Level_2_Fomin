public class Cat extends Animal implements Runable, Swimable, Jumpable {
    private int run_limit;
    private int swim_limit;
    private int jump_limit;

    public Cat (String name, String color, int age, int run_limit, int swim_limit, int jump_limit) {
        super (name, color, age);
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
        this.jump_limit = jump_limit;
    } //если объявлен конструктор в абстрактном Animal, или

   // public Cat(String name, String color, int age, int run_limit, int swim_limit, int jump_limit){
   //     this.name = name;
   //     this.color = color;
   //     this.age = age;
   //     this.run_limit = run_limit;
   //     this.swim_limit = swim_limit;
   //     this.jump_limit = jump_limit;
   // } //если не объявлен конструктор в абстрактном Animal

    @Override
    public String voice(){
        return "Meow!";
    }

    @Override
    public boolean run (int distance){
        return run_limit >= distance;
    }

    @Override
    public boolean swim (int swim_distance){
        return swim_limit >= swim_distance;
    }

    @Override
    public boolean jump (int height){
        return jump_limit >= height;
    }
}