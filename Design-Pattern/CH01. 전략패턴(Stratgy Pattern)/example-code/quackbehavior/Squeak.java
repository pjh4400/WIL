package CH1.quackbehavior;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("고무 오리의 꽥꽥");
    }
}
