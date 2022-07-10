package CH1.duck;

import CH1.flybehavior.FlyBehavior;
import CH1.quackbehavior.QuackBehavior;

public abstract class Duck {

    /**
     * 행동 인터페이스 형식의 레퍼런스 변수를 선언하여,
     * 같은 패키지에 속하는 모든 서브클래스에서 이 변수를 상속받는다.
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * 행동 클래스에 위임한다.
     */
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 모든 오리의 행동
     */
    public void swim(){
        System.out.println("오리는 모두 수영할 수 있습니다.");
    }

    public void display(){
        System.out.println("저는 오리입니다.");
    }

    /**
     * 동적으로 런타임에 행동을 변경할 수 있는 세터 메소드
     */
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
