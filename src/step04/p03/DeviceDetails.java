package step04.p03;

abstract class DeviceDetails implements Device {
    static final String BRAND = "DOMETech";
    private String model;
    private boolean power;

    DeviceDetails(String model) {
        this.model = model;
        this.power = false;
    }

    public String getModel() {
        return model;
    }

    public Boolean isPoweredOn() {
        return power;
    }

    @Override
    public void powerOn() {
        power = true;
        System.out.println(model + " 전원을 켰습니다.");
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println(model + " 전원을 껐습니다.");
    }
}
