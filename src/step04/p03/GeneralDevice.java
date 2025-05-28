package step04.p03;

class GeneralDevice extends DeviceDetails {
    GeneralDevice(String model) {
        super(model);
        System.out.print("일반 기기가 생성되었습니다 : ");
        printInfo();
    }

    @Override
    public void printInfo() {
        System.out.println(getModel() + ", " + BRAND);
    }
}
