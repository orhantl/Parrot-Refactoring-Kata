package parrot;

public class EuropeanParrot extends Parrot {

    private EuropeanParrot() {
        super();
    }

    public static EuropeanParrot createEuropeanParrot() {
        return new EuropeanParrot();
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }
}
