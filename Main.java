public class Main {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep = registry.createSheep("Fluffy");
        sheep.clone();

        Animal cow = registry.createCow();
        cow.makeSound();

        Animal horse = registry.createHorse();
        horse.makeSound();

    }
}
