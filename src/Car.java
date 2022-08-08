public class Car extends Vehicle implements Service{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Changing the tire");
    }
    public void checkEngine() {
        System.out.println("Checking the engine");
    }

    @Override
    public void check() {
        System.out.println("Serve " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();

    }
}