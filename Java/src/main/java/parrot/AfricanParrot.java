package parrot;

public class AfricanParrot extends Parrot {

    protected final int numberOfCoconuts;

    private AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public static AfricanParrot createAfricanParrot(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }

    protected double getLoadFactor() {
        return 9.0;
    }
}
