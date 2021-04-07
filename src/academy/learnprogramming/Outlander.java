package academy.learnprogramming;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate; // +rate = accelerate -rate = decelerate

        if(newVelocity == 0) {
            stop();
            setCurrentGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10){
            setCurrentGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20){
            setCurrentGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30){
            setCurrentGear(3);
        } else {
            setCurrentGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
