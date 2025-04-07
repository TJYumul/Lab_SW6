public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baaaaaaa!!!", "Grass", "PrototypeSheep");
        cowPrototype = new Cow(4, "Moooooo!!!", "Barley");
        horsePrototype = new Horse(4, "Neigh!!!!!!", "Grains");
    }

    public Animal createSheep(String name) {
        Sheep cloned = (Sheep) sheepPrototype.clone();
        cloned.setName(name);
        return cloned;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
