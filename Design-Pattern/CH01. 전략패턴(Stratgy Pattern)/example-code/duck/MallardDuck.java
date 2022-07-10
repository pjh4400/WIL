package CH1.duck;

import CH1.flybehavior.FlyWithWings;
import CH1.quackbehavior.Quack;

public class MallardDuck extends Duck {

    /**
     * performQuack()과 performFly() 호출 시 행동을
     * Quack 객체와 FlyWithWings 에 위임한다.
     */
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
