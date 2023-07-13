package Classes;

import Interfaces.iActorBehaviuor;

/**
 * абстрактый класс клиента
 */

public abstract class Actor implements iActorBehaviuor {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isCancelOrder;

    public Actor(String name) {
        this.name = name;
    }

    /**
 * Абстрактный методот возвращающий имя клиента
 * @return
 */

    abstract public String getName();

}
