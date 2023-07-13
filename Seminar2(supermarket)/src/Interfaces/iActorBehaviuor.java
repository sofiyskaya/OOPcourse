package Interfaces;

import Classes.Actor;

/**
 * интерфейс клиента - набор обязательных требований (методов) к клиенту, чтобы пользоваться маркетом
 */


public interface iActorBehaviuor {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean takeOrder);
    public void setMakeOrder(boolean makeOrder);
    public boolean isCancel();
    public void setCancelOrder(boolean cancel);
    
    Actor getActor();
}
