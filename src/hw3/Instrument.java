package hw3;

public abstract class Instrument {
    public abstract String makeSound();
}

class Erhu extends Instrument{
    @Override
    public String makeSound() {
        return "Erhu sound";
    }
}

class Piano extends Instrument{
    @Override
    public String makeSound() {
        return "Piano sound";
    }
}

class Violin extends Instrument{
    @Override
    public String makeSound() {
        return "Violin sound";
    }
}
