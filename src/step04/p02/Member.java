package step04.p02;

class Member extends User {
    public Member(String userId, String name) {
        super(userId, name);
    }

    @Override
    public String getName() {
        return "이용자 '" + super.getName() + "'";
    }
}
