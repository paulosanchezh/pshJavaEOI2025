public class PoliformismoTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Wolf();
        animals[3] = new Leon();
        animals[4] = new Tiger();

//        for (Animal animal : animals) {
//            animal.eat();
//            animal.makeNoise();
//        }

        mostrarAnimalsNois(new Hippo());
    }

    private static void mostrarAnimalsNois(Animal animal) { animal.makeNoise(); }
}
