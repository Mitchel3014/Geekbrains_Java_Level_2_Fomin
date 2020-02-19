
public class Java_2_FirstHomework {

    public static void main(String[] args){
        Animal[] zoo = {new Cat("Барсик","Черный",5,150,50,100), new Hen("Кокоша","Белая",2,200,100), new Hippo("Гиппо","Серый",3,50,200)};
        Obstacle [] obstacle = {new Track(100), new Wall(50), new Water(150)};
    /**
    * Препятствия отдельными объектами
    */
    //    Track track1 = new Track(100);
    //    Wall wall1 = new Wall(50);
    //    Water water1 = new Water(150);

    /**
    * Код для пробежки по препятствиям, созданным отдельными объектами
    */
	//for (int i = 0; i < zoo.length; i++) {
    //    System.out.println (zoo[i] + ". Say: " + zoo[i].voice() +
    //    "\n Run: " + track1.doIt(zoo[i]) +
    //    "\n Jump: " + wall1.doIt(zoo[i]) + "\n Swim: " + water1.doIt(zoo[i]));
    //  }

    /**
    * Код для пробежки по препятствиям, созданным массивом (т.е. проход массива животных по массиву препятствий
    */
    //    for (int i = 0; i < zoo.length; i++) {
    //        System.out.println (zoo[i] + ". Say: " + zoo[i].voice() +
    //        "\n Run: " + obstacle[i].doIt(zoo[i]) +
    //        "\n Jump: " + obstacle[i].doIt(zoo[i]) +
    //        "\n Swim: " + obstacle[i].doIt(zoo[i]));
    //      }

        for (int i = 0; i < zoo.length; i++) {
            System.out.println("Член команды: " + zoo[i]);
        }
        for (int i = 0; i < zoo.length; i++) {
            //System.out.println (zoo[i] + ". Say: " + zoo[i].voice());
	    for (int z = 0; z < obstacle.length; z++){
            System.out.println ("Член команды: " + zoo[i].name + ". " + obstacle[z] + ". Результат преодоления: " +obstacle[z].doIt(zoo[i]));

            //System.out.println ("Run: " + obstacle[z].doIt(zoo[i]));

	        //System.out.println ("Run: " + k);
 	        //System.out.println (zoo[i] + ". Say: " + zoo[i].voice() +
            //            "\n Run: " + obstacle[z].doIt(zoo[i]) +
            //            "\n Jump: " + obstacle[z].doIt(zoo[i]) +
            //            "\n Swim: " + obstacle[z].doIt(zoo[i]));
	        }
	    }

        //for (Animal animal : zoo)
        //    System.out.println(animal + " say: " + animal.voice() +
        //            "\n run: " + track1.doIt(animal) +
        //            "\n jump: " + wall1.doIt(animal) +
        //            "\n swim: " + water1.doIt(animal));
    }
}