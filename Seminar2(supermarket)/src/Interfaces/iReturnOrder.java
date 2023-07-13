package Interfaces;

/**
 * Интерфейс описывающий поведение при возврате заказа
 */

public interface iReturnOrder {
    public void cancelOrder(iActorBehaviuor actor);
    public void returnOrder();
}
