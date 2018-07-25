public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate (int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 30) {
            changeGear(1);
        } else if (newVelocity > 30 && newVelocity <= 60) {
            changeGear(2);
        } else if (newVelocity > 60 && newVelocity <= 90) {
            changeGear(3);
        } else if (newVelocity > 90 && newVelocity <= 120) {
            changeGear(4);
        } else if (newVelocity > 120 && newVelocity <= 150) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
