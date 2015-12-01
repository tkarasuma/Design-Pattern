public class Deputy extends Leader {
    private  Person person;
    public Deputy() {
        this.person = new Person("永田一郎");
    }
    @Override
    public void doLeaderJob_1() {
        person.doOwnJob_1();
    }
    @Override
    public void doLeaderJob_2() {
        person.doOwnJob_2();
    }
}
