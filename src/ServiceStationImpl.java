// ServiceStationImpl.java
public class ServiceStationImpl implements ServiceStation {
    @Override
    public void service(Serviceable transport) {
        transport.service();
    }
}