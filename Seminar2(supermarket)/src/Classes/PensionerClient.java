package Classes;

import Interfaces.iActorBehaviuor;

/**
 * описывает поведение пенсионера
 */

public class PensionerClient extends Actor {
    private int pensID;

/**
 * Класс пенсионера
 * @param name Имя
 * @param pensId id 
 */

    public PensionerClient(String name, int pensID) {
        super(name+" - пенсионер");
        this.pensID = pensID;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }
    
    // @Override
    // public void cancelOrder(iActorBehaviuor actor) {
    //     super.isMakeOrder = isMakeOrder;
    // }

    // @Override
    // public void returnOrder() {
    //     super.isMakeOrder = isMakeOrder;
    // }

    @Override
    public void setCancelOrder(boolean cancel) {
        // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'setCancelOrder'");
    }

  @Override
    public boolean isCancel() {
      return super.isCancelOrder;
    }
}