package step04.p03;

public class RuleOfBiodome03 {
    public static void main(String[] args) {
        DeviceController dc = new DeviceController();

        GeneralDevice gd = new GeneralDevice("도어 오프너");
        SmartDevice sd = new SmartDevice("자동 거울", "기분을 인식해 옷을 추천하는 기능");

        dc.connectDevice(gd);
        dc.connectDevice(sd);

        dc.controlDevice(sd);
        dc.activateDevice(sd);

        gd.powerOn();

        dc.powerOffAllDevices();
    }
}
