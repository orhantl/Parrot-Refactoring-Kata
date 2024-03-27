package parrot;

public class EuropeanParrot extends Parrot {

    private EuropeanParrot() {
        super();
    }

    public static EuropeanParrot createEuropeanParrot() {
        return new EuropeanParrot();
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }

}
