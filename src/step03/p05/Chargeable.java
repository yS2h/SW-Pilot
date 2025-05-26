package step03.p05;

public interface Chargeable {
    static void showChargingTips() {
        System.out.println("에너지를 효율적으로 충전하려면 마법사의 기분이 좋아야합니다.");
    }

    default void charge(int amount) {

    }

    default int getChargeLevel() {
        return 0;
    }
}
