package CH1.duck;

import CH1.flybehavior.FlyNoWay;
import CH1.quackbehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay(); // 날 수 없는 오리
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("저는 모형 오리 입니다.");
    }
}
