package Interfaces;

import Classes.Actor;

/**
 * Интерфейс для описания поведения клиентов в очереди
 */

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviuor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}