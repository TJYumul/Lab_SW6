public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Horse(int legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }

    @Override
    public Animal clone() {
        return new Horse(legs, sound, food);
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}
