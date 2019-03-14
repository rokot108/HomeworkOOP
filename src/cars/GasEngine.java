package cars;

public class GasEngine implements IEngine {

    boolean active = false;

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void startStop() {
        if (!isActive()) {
            active = true;
            System.out.println("Engine started");
        } else {
            active = false;
            System.out.println("Engine stopped");
        }
    }
}
