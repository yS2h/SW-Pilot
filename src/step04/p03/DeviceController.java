package step04.p03;

import java.util.ArrayList;
import java.util.List;

class DeviceController {
    List<Device> devices = new ArrayList<>();

    public void connectDevice(Device device) {
        System.out.println("컨트롤러에 기기가 등록되었습니다 : " + device.getModel());
        devices.add(device);
    }

    public void controlDevice(Device device) {
        if (device.isPoweredOn())
            device.powerOff();
        else
            device.powerOn();
    }

    public void activateDevice(Device device) {
        if (device instanceof SmartFeature smart) {
            smart.activateFeature();
        } else {
            System.out.println(device.getModel() + " 기기는 스마트 기능이 없습니다.");
        }
    }

    public void powerOffAllDevices() {
        System.out.println("모든 기기 전원을 종료합니다 : ");
        for (Device device : devices) {
            device.powerOff();
        }
    }
}
