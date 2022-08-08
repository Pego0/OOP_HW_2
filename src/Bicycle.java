public class Bicycle extends Vehicle implements Service{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Changing the tire");
    }

    @Override
    public void check() {
            System.out.println("Serve " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
        }
    }
}