package step04.p03;

class SmartDevice extends DeviceDetails implements SmartFeature {
    String feature;

    SmartDevice(String model, String feature) {
        super(model);
        this.feature = feature;
        System.out.print("스마트 기기가 생성되었습니다 : ");
        printInfo();
    }


    @Override
    public void printInfo() {
        System.out.println(getModel() + ", " + BRAND + ", " + feature);
    }

    @Override
    public void activateFeature() {
        if (isPoweredOn())
            System.out.println(getModel() + " 고급 기능을 활성화 시켰습니다.");
        else
            System.out.println("스마트 기기가 꺼져 있습니다.");
    }
}
