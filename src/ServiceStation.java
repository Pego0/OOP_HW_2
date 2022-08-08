public class ServiceStation implements Service {
    public void check(Service service){
        service.check();
    }

    @Override
    public void check() {

    }
}